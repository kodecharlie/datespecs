grammar DateRange;

range     : 'Every' LONG_DAY 'from' startDate THRU endDate
          | startDate THRU endDate
          | startDate
          ;

startDate : dateTime ;
endDate   : dateTime ;
dateTime  : utc
          | shrtMdy
          | yyyymmdd
          | (WEEK_DAY ','? WS)? longMdy ;

// Dates.
utc       : yyyymmdd 'T' hour ':' minute ':' second ('-'|'+') hour ':' minute ;
yyyymmdd  : year '-' moy '-' dom ;
shrtMdy   : moy ('/' | '-') dom ('/' | '-') year ;
longMdy   : (shrtMonth '.'? | longMonth) WS dom ','? optYearAndOrTime? ;

optYearAndOrTime : (WS year (','? WS timespan)?) | (WS timespan) ;

fragment DIGIT : [0-9] ;
ONE_DIGIT    : DIGIT ;
TWO_DIGITS   : DIGIT ONE_DIGIT ;
THREE_DIGITS : DIGIT TWO_DIGITS ;
FOUR_DIGITS  : DIGIT THREE_DIGITS ;

year      : FOUR_DIGITS ;   // year
moy       : ONE_DIGIT | TWO_DIGITS ;        // month of year.
dom       : ONE_DIGIT | TWO_DIGITS ;        // day of month.
timespan  : (tod THRU tod) | tod ;

// Time-of-day.
tod       : noon | (hour2 (':' minute)? WS? meridian) ;
noon      : 'noon' ;
hour2     : ONE_DIGIT | TWO_DIGITS ;
meridian  : ('AM' | 'am' | 'PM' | 'pm' | 'a.m.' | 'p.m.') ;

// 24-hour clock.  Sanity-check range in listener.
hour      : TWO_DIGITS ;
minute    : TWO_DIGITS ;
second    : TWO_DIGITS ;   // we do not use seconds.

// Range verb.
THRU      : ((WS? ('-'|'–'|'to') WS?) | ~[a-zA-Z0-9]+) ;

// Weekdays.
WEEK_DAY  : (SHRT_DAY | LONG_DAY) -> skip ;
SHRT_DAY  : ('Sun' | 'Mon' | 'Tue' | 'Wed' | 'Thu' | 'Fri' | 'Sat') -> skip ;
LONG_DAY  : ('Sunday' | 'Monday' | 'Tuesday' | 'Wednesday' | 'Thursday' | 'Friday' | 'Saturday') -> skip ;

// Months.
shrtMonth : 'Jan' | 'Feb' | 'Mar' | 'Apr' | 'May' | 'Jun' | 'Jul' | 'Aug' | 'Sep' | 'Oct' | 'Nov' | 'Dec' ;
longMonth : 'January' | 'February' | 'March' | 'April' | 'May' | 'June' | 'July' | 'August' | 'September' | 'October' | 'November' | 'December' ;

WS        : [ \t\r\n]+ -> skip ;
