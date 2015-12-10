package com.beebell.datespecs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.misc.NotNull;

public class DateSpecifier extends DateRangeBaseListener {

    private DateSpecs startDate;
    private DateSpecs endDate;
    private final Deque<ParseState> states = new ArrayDeque<>();

    public java.util.Date getStartDate() {
        if (startDate == null) {
            return null;
        }

        java.util.Date retStartDate = startDate.normalize(endDate);
        return retStartDate;
    }

    public java.util.Date getEndDate() {
        if (endDate == null) {
            return null;
        }

        java.util.Date retEndDate = endDate.normalize(startDate);
        return retEndDate;
    }

    @Override
    public void enterRange(@NotNull DateRangeParser.RangeContext ctx) {
        states.push(ParseState.RANGE);
    }

    @Override
    public void exitRange(@NotNull DateRangeParser.RangeContext ctx) {
        states.pop();

        if (this.startDate != null && this.endDate != null) {
            // Align years.  XXX assume same year.
            if (this.startDate.year == null && this.endDate.year != null) {
                this.startDate.year = this.endDate.year;
            }
        }
    }

    @Override
    public void enterStartDate(@NotNull DateRangeParser.StartDateContext ctx) {
        states.push(ParseState.START_DATE);
        this.startDate = new DateSpecs();
    }

    @Override
    public void exitStartDate(@NotNull DateRangeParser.StartDateContext ctx) {
        states.pop();
    }

    @Override
    public void enterEndDate(@NotNull DateRangeParser.EndDateContext ctx) {
        states.push(ParseState.END_DATE);
        this.endDate = new DateSpecs();
    }

    @Override
    public void exitEndDate(@NotNull DateRangeParser.EndDateContext ctx) {
        states.pop();
    }

    @Override
    public void enterUtc(@NotNull DateRangeParser.UtcContext ctx) {
        states.push(ParseState.UTC);
    }

    @Override
    public void exitUtc(@NotNull DateRangeParser.UtcContext ctx) {
        states.pop();

        Deque<ParseState> savePeeks = popToStartOrEndDate(states);
        if (states.size() > 0) {
            switch (states.peek()) {
                case START_DATE:
                    this.startDate.utc = ctx.getText();
                    break;
                case END_DATE:
                    this.endDate.utc = ctx.getText();
                    break;
            }
        }
        pushToRestore(states, savePeeks);
    }

    @Override
    public void enterYear(DateRangeParser.YearContext ctx) {
        states.push(ParseState.YEAR);
    }

    @Override
    public void exitYear(DateRangeParser.YearContext ctx) {
        states.pop();

        Deque<ParseState> savePeeks = popToStartOrEndDate(states);
        if (states.size() > 0) {
            switch (states.peek()) {
                case START_DATE:
                    this.startDate.year = ctx.getText();
                    break;
                case END_DATE:
                    this.endDate.year = ctx.getText();
                    break;
            }
        }
        pushToRestore(states, savePeeks);
    }

    @Override
    public void enterMoy(DateRangeParser.MoyContext ctx) {
        states.push(ParseState.MONTH_OF_YEAR);
    }

    @Override
    public void exitMoy(DateRangeParser.MoyContext ctx) {
        states.pop();

        Deque<ParseState> savePeeks = popToStartOrEndDate(states);
        if (states.size() > 0) {
            switch (states.peek()) {
                case START_DATE:
                    this.startDate.monthOfYear = ctx.getText();
                    break;
                case END_DATE:
                    this.endDate.monthOfYear = ctx.getText();
                    break;
            }
        }
        pushToRestore(states, savePeeks);
    }

    @Override
    public void enterDom(DateRangeParser.DomContext ctx) {
        states.push(ParseState.DAY_OF_MONTH);
    }

    @Override
    public void exitDom(DateRangeParser.DomContext ctx) {
        states.pop();

        Deque<ParseState> savePeeks = popToStartOrEndDate(states);
        if (states.size() > 0) {
            switch (states.peek()) {
                case START_DATE:
                    this.startDate.dayOfMonth = ctx.getText();
                    break;
                case END_DATE:
                    this.endDate.dayOfMonth = ctx.getText();
                    break;
            }
        }
        pushToRestore(states, savePeeks);
    }

    @Override
    public void enterTimespan(DateRangeParser.TimespanContext ctx) {
        states.push(ParseState.TIMESPAN);

        // Populate ending date if it does not exist.
        if (this.endDate == null) {
            this.endDate = new DateSpecs();
            if (this.startDate != null) {
                this.endDate.year = this.startDate.year;
                this.endDate.monthOfYear = this.startDate.monthOfYear;
                this.endDate.dayOfMonth = this.startDate.dayOfMonth;
            }
        }
    }

    @Override
    public void exitTimespan(DateRangeParser.TimespanContext ctx) {
        states.pop();
    }

    @Override
    public void enterNoon(DateRangeParser.NoonContext ctx) {
        states.push(ParseState.HOUR);
    }

    @Override
    public void exitNoon(DateRangeParser.NoonContext ctx) {
        states.pop();

        Deque<ParseState> savePeeks = popToStartOrEndDate(states);
        if (states.size() > 0) {
            switch (states.peek()) {
                case START_DATE:
                    this.startDate.hour = "12";
                    this.startDate.minute = "00";
                    this.startDate.meridian = "pm";
                    break;
                case END_DATE:
                    this.endDate.hour = "12";
                    this.endDate.minute = "00";
                    this.endDate.meridian = "pm";
                    break;
            }
        }
        pushToRestore(states, savePeeks);
    }

    @Override
    public void enterHour2(DateRangeParser.Hour2Context ctx) {
        states.push(ParseState.HOUR);
    }

    @Override
    public void exitHour2(DateRangeParser.Hour2Context ctx) {
        states.pop();

        Deque<ParseState> savePeeks = popToStartOrEndDate(states);
        if (states.size() > 0) {
            switch (states.peek()) {
                case START_DATE:
                    // Only set startDate if not already set.  Eg: 12 - 1pm.
                    if (this.startDate.hour == null) {
                        this.startDate.hour = ctx.getText();
                    } else if (this.endDate != null && this.endDate.hour == null) {
                        this.endDate.hour = ctx.getText();
                    }
                    break;
                case END_DATE:
                    this.endDate.hour = ctx.getText();
                    break;
            }
        }
        pushToRestore(states, savePeeks);
    }

    @Override
    public void enterHour(DateRangeParser.HourContext ctx) {
        states.push(ParseState.HOUR);
    }

    @Override
    public void exitHour(DateRangeParser.HourContext ctx) {
        states.pop();

        Deque<ParseState> savePeeks = popToStartOrEndDate(states);
        if (states.size() > 0) {
            switch (states.peek()) {
                case START_DATE:
                    this.startDate.hour = ctx.getText();
                    break;
                case END_DATE:
                    this.endDate.hour = ctx.getText();
                    break;
            }
        }
        pushToRestore(states, savePeeks);
    }

    @Override
    public void enterMinute(DateRangeParser.MinuteContext ctx) {
        states.push(ParseState.MINUTE);
    }

    @Override
    public void exitMinute(DateRangeParser.MinuteContext ctx) {
        states.pop();

        Deque<ParseState> savePeeks = popToStartOrEndDate(states);
        if (states.size() > 0) {
            switch (states.peek()) {
                case START_DATE:
                    if (this.startDate.minute == null) {
                        this.startDate.minute = ctx.getText();
                    } else if (this.endDate != null && this.endDate.minute == null) {
                        this.endDate.minute = ctx.getText();
                    }
                    break;
                case END_DATE:
                    this.endDate.minute = ctx.getText();
                    break;
            }
        }
        pushToRestore(states, savePeeks);
    }

    @Override
    public void enterMeridian(DateRangeParser.MeridianContext ctx) {
        states.push(ParseState.MERIDIAN);
    }

    @Override
    public void exitMeridian(DateRangeParser.MeridianContext ctx) {
        states.pop();

        Deque<ParseState> savePeeks = popToStartOrEndDate(states);
        if (states.size() > 0) {
            switch (states.peek()) {
                case START_DATE:
                    // XXX This logic could be improved.  Possibly we should use TOD listeners.
                    if (this.startDate.meridian == null) {
                        this.startDate.meridian = ctx.getText();
                    }
                    if (this.endDate != null) {
                        this.endDate.meridian = ctx.getText();
                    }
                    break;
                case END_DATE:
                    this.endDate.meridian = ctx.getText();
                    break;
            }
        }
        pushToRestore(states, savePeeks);
    }

    @Override
    public void enterShrtMonth(DateRangeParser.ShrtMonthContext ctx) {
        states.push(ParseState.MONTH_OF_YEAR);
    }

    @Override
    public void exitShrtMonth(DateRangeParser.ShrtMonthContext ctx) {
        states.pop();

        Deque<ParseState> savePeeks = popToStartOrEndDate(states);
        if (states.size() > 0) {
            switch (states.peek()) {
                case START_DATE:
                    this.startDate.monthOfYear = shortMonthToDigits.get(ctx.getText());
                    break;
                case END_DATE:
                    this.endDate.monthOfYear = shortMonthToDigits.get(ctx.getText());
                    break;
            }
        }
        pushToRestore(states, savePeeks);
    }

    @Override
    public void enterLongMonth(DateRangeParser.LongMonthContext ctx) {
        states.push(ParseState.MONTH_OF_YEAR);
    }

    @Override
    public void exitLongMonth(DateRangeParser.LongMonthContext ctx) {
        states.pop();

        Deque<ParseState> savePeeks = popToStartOrEndDate(states);
        if (states.size() > 0) {
            switch (states.peek()) {
                case START_DATE:
                    this.startDate.monthOfYear = longMonthToDigits.get(ctx.getText());
                    break;
                case END_DATE:
                    this.endDate.monthOfYear = longMonthToDigits.get(ctx.getText());
                    break;
            }
        }
        pushToRestore(states, savePeeks);
    }

    private Deque<ParseState> popToStartOrEndDate(Deque<ParseState> curStates) {
        Deque<ParseState> savePeeks = new ArrayDeque<>();
        while (curStates.peek() != ParseState.START_DATE && curStates.peek() != ParseState.END_DATE) {
            savePeeks.push(curStates.pop());
            if (curStates.size() <= 0) {
                break;
            }
        }
        return savePeeks;
    }

    private void pushToRestore(
            Deque<ParseState> curStates,
            Deque<ParseState> savePeeks
    ) {
        while (savePeeks.size() > 0) {
            curStates.push(savePeeks.pop());
        }
    }

    private static final Map<String, String> shortMonthToDigits = new HashMap<>();
    static {
        shortMonthToDigits.put("Jan", "01");
        shortMonthToDigits.put("Feb", "02");
        shortMonthToDigits.put("Mar", "03");
        shortMonthToDigits.put("Apr", "04");
        shortMonthToDigits.put("May", "05");
        shortMonthToDigits.put("Jun", "06");
        shortMonthToDigits.put("Jul", "07");
        shortMonthToDigits.put("Aug", "08");
        shortMonthToDigits.put("Sep", "09");
        shortMonthToDigits.put("Oct", "10");
        shortMonthToDigits.put("Nov", "11");
        shortMonthToDigits.put("Dec", "12");
    }

    private static final Map<String, String> longMonthToDigits = new HashMap<>();
    static {
        longMonthToDigits.put("January", "01");
        longMonthToDigits.put("February", "02");
        longMonthToDigits.put("March", "03");
        longMonthToDigits.put("April", "04");
        longMonthToDigits.put("May", "05");
        longMonthToDigits.put("June", "06");
        longMonthToDigits.put("July", "07");
        longMonthToDigits.put("August", "08");
        longMonthToDigits.put("September", "09");
        longMonthToDigits.put("October", "10");
        longMonthToDigits.put("November", "11");
        longMonthToDigits.put("December", "12");
    }

    private static class DateSpecs {

        // When the UTC timestamp is set, none of the other fields matter.
        String utc;

        String year;
        String monthOfYear;
        String dayOfMonth;
        String hour;
        String minute;
        String meridian;

        /**
         * Call this method to get a <code>java.util.Date<code> for either the
         * startDate or endDate parsed from the string passed into the parser.
         *
         * @param other is an instance of <code>DateSpecs</code>; if the current
         * object describes the startDate, then <code>other</code> describes the
         * endDate; conversely, if the current object describes the endDate,
         * then <code>other</code> describes the startDate.
         *
         * @return instance of <code>java.util.Date</code> that contains the
         * date specified in the parsed tokens year, monthOfYear, etc.
         */
        public java.util.Date normalize(DateSpecs other) {
            String format = null, dateString = null;
            if (utc != null) {
                format = "yyyy-MM-dd'T'HH:mm:ssX";
                dateString = utc;
            } else {
                StringBuilder fmtBuilder = new StringBuilder();
                StringBuilder dateStringBuilder = new StringBuilder();

                if (year != null && monthOfYear != null && dayOfMonth != null) {
                    fmtBuilder.append("MM-dd-yyyy");
                    dateStringBuilder.append(monthOfYear).append("-").append(dayOfMonth).append("-").append(year);
                }
                if (hour != null) {
                    fmtBuilder.append(" hh");
                    dateStringBuilder.append(" ").append(hour);
                }
                if (minute != null) {
                    fmtBuilder.append(":mm");
                    dateStringBuilder.append(":").append(minute);
                }
                if (meridian != null) {
                    fmtBuilder.append(" a");
                    dateStringBuilder.append(" ").append(meridian);
                }

                format = fmtBuilder.toString();
                dateString = dateStringBuilder.toString();
            }

            SimpleDateFormat sdf = new SimpleDateFormat(format);
            java.util.Date retDate = null;
            try {
                System.out.println("dateString=" + dateString);
                retDate = sdf.parse(dateString);
            } catch (ParseException ex) {
                Logger.getLogger(DateSpecifier.class.getName()).log(Level.SEVERE, "Could not parse date string " + dateString, ex);
            }
            return retDate;
        }
    }

    private enum ParseState {

        RANGE,
        START_DATE,
        END_DATE,
        UTC,
        YEAR,
        MONTH_OF_YEAR,
        DAY_OF_MONTH,
        HOUR,
        MINUTE,
        MERIDIAN,
        TIMESPAN
    }
}
