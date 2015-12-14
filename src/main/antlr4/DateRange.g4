grammar DateRange;

range     : 'Every' WS longDay WS 'from' WS startDate THRU endDate
          | startDate THRU endDate
          | startDate
          ;

startDate : dateTime ;
endDate   : dateTime ;
dateTime  : utc
          | shrtMdy
          | yyyymmdd
          | longMdy
          | weekDay ','? WS longMdy
          ;

// Dates.
utc       : yyyymmdd 'T' hour ':' minute ':' second ('-'|'+') hour ':' minute ;
yyyymmdd  : year '-' moy '-' dom ;
shrtMdy   : moy ('/' | '-') dom ('/' | '-') year ;
longMdy   : longMonth WS dom ','? optYearAndOrTime?
          | shrtMonth '.'? WS dom ','? optYearAndOrTime?
          ;

optYearAndOrTime : WS year ','? WS timespan
                 | WS year
                 | WS timespan
                 ;

fragment DIGIT : [0-9] ;
ONE_DIGIT    : DIGIT ;
TWO_DIGITS   : DIGIT ONE_DIGIT ;
THREE_DIGITS : DIGIT TWO_DIGITS ;
FOUR_DIGITS  : DIGIT THREE_DIGITS ;

year      : FOUR_DIGITS ;                   // year
moy       : ONE_DIGIT | TWO_DIGITS ;        // month of year.
dom       : ONE_DIGIT | TWO_DIGITS ;        // day of month.
timespan  : (tod THRU tod) | tod ;

// Time-of-day.
tod       : noon | (hour2 (':' minute)? WS? meridian?) ;
noon      : 'noon' ;
hour2     : ONE_DIGIT | TWO_DIGITS ;
meridian  : ('AM' | 'am' | 'PM' | 'pm' | 'a.m.' | 'p.m.') ;

// 24-hour clock.  Sanity-check range in listener.
hour      : TWO_DIGITS ;
minute    : TWO_DIGITS ;
second    : TWO_DIGITS ;   // we do not use seconds.

// Range verb.
THRU      : WS? ('-'|'–'|'to') WS? ;

// Weekdays.
weekDay   : shrtDay | longDay ;
shrtDay   : 'Sun' | 'Mon' | 'Tue' | 'Wed' | 'Thu' | 'Fri' | 'Sat' ;
longDay   : 'Sunday' | 'Monday' | 'Tuesday' | 'Wednesday' | 'Thursday' | 'Friday' | 'Saturday' ;

// Months.
shrtMonth : 'Jan' | 'Feb' | 'Mar' | 'Apr' | 'May' | 'Jun' | 'Jul' | 'Aug' | 'Sep' | 'Oct' | 'Nov' | 'Dec' ;
longMonth : 'January' | 'February' | 'March' | 'April' | 'May' | 'June' | 'July' | 'August' | 'September' | 'October' | 'November' | 'December' ;

WS        : ~[a-zA-Z0-9,.:]+ ;
