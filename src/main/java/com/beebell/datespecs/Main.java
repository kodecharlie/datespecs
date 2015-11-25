package com.beebell.datespecs;

import java.io.StringReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {

    private static final List<TestDate> testDates = new ArrayList<>();

    static {
        /*
         // Starting date only, with single and double month-digits.
        testDates.add(new TestDate("10/10/2015", "10/10/2015", "MM/dd/yyyy"));
        testDates.add(new TestDate("8/27/2015", "8/27/2015", "M/dd/yyyy"));

        // Starting and ending dates, with single and double month-digits.
        testDates.add(new TestDate("1/13/2016 – 1/15/2016", "1/13/2016", "M/dd/yyyy", "1/15/2016", "M/dd/yyyy"));
        testDates.add(new TestDate("10/12/2015 – 11/20/2015", "10/12/2015", "MM/dd/yyyy", "11/20/2015", "MM/dd/yyyy"));

        // Starting date only, in UTC.
        testDates.add(new TestDate("2015-10-19T10:00:00-07:00", "2015-10-19T10:00:00-07:00", "yyyy-MM-dd'T'HH:mm:ssX"));

        // Starting date only, year first.
        testDates.add(new TestDate("2015-11-12", "2015-11-12", "yyyy-MM-dd"));
        */
        // Starting date only, American style.
        testDates.add(new TestDate("December 1, 2015", "December 1, 2015", "MMMMM d, yyyy"));
        /*
         // Starting date only, with day of week (which is ignored in parsing).
         testDates.add(new TestDate("Friday, Nov. 13, 2015", "Nov. 13, 2015", "MMM. d, yyyy"));
        testDates.add(new TestDate("Fri Nov 13 2015", "Nov 13 2015", "MMM d yyyy"));
        testDates.add(new TestDate("Friday, November 20, 2015", "November 20, 2015", "MMMMM d, yyyy"));

        // Starting date only, with starting time.
        testDates.add(new TestDate("Tuesday, November 17, 2015 11:00 am", "November 20, 2015 11:00 am", "MMMMM d, yyyy hh:mm a"));
        testDates.add(new TestDate("Tuesday, November 17, 2015 11:00 AM", "November 20, 2015 11:00 AM", "MMMMM d, yyyy hh:mm a"));
        testDates.add(new TestDate("Friday, December 18, 2015, 6am", "December 18, 2015, 6am", "MMMMM d, yyyy, hha"));
        testDates.add(new TestDate("Friday, November 13, 2015 noon", "November 13, 2015 12pm", "MMMMM d, yyyy hha"));

        // Starting date only, with starting and ending times.
        testDates.add(new TestDate("Friday, December 4, 2015, 12 – 1pm", "December 4, 2015, 12pm", "MMMMM d, yyyy, hha", "December 4, 2015, 1pm", "MMMMM d, yyyy, hha"));
        testDates.add(new TestDate("Friday, December 11, 2015, 7:30am – 4pm", "December 11, 2015, 7:30am", "MMMMM d, yyyy, hh:mma", "December 11, 2015, 4pm", "MMMMM d, yyyy, hha"));
        testDates.add(new TestDate("Monday, January 11, 2016, 4:10 – 5:10pm", "January 11, 2016, 4:10pm", "MMMMM d, yyyy, hh:mma", "January 11, 2016, 5:10pm", "MMMMM d, yyyy, hh:mma"));

        // Starting and ending dates.
        testDates.add(new TestDate("Friday, December 4 – Tuesday, December 8, 2015", "December 4, 2015", "MMMMM d, yyyy", "December 8, 2015", "MMMMM d, yyyy"));
        testDates.add(new TestDate("Friday, November 13, 8AM – Saturday, November 14, 2015, 4PM", "November 13, 2015, 8AM", "MMMMM d, yyyy, hha", "November 14, 2015, 4PM", "MMMMM d, yyyy, hha"));

        // Periodic with starting and ending dates.
        // XXX we do not yet support periodicity in our date spans.
        testDates.add(new TestDate("Every Wednesday from September 9, 2015 to November 18, 2015", "September 9, 2015", "MMMMM d, yyyy", "November 18, 2015", "MMMMM d, yyyy"));
         */
    }

    private static void runTests() {
        for (TestDate td : testDates) {
            try {
                System.out.println("TESTING: " + td.dateSpec);
                ANTLRInputStream inStream = new ANTLRInputStream(new StringReader(td.dateSpec));
                DateRangeLexer lexer = new DateRangeLexer(inStream);
                /*
                 for (Token tkn : lexer.getAllTokens()) {
                    System.out.println("TOKEN: " + tkn.getText());
                }
                */
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                DateRangeParser parser = new DateRangeParser(tokens);
                ParserRuleContext tree = parser.range();

                ParseTreeWalker walker = new ParseTreeWalker();
                DateSpecifier extractor = new DateSpecifier();
                walker.walk(extractor, tree);

                boolean startDatePassed = false;
                if (extractor.getStartDate() != null && td.expectedStartDate != null) {
                    startDatePassed = extractor.getStartDate().equals(td.expectedStartDate);
                    if (startDatePassed) {
                        System.out.println("startDate PASSED: " + td.expectedStartDate + " was matched");
                    }
                }

                boolean endDatePassed = true;
                if (extractor.getEndDate() != null && td.expectedEndDate != null) {
                    endDatePassed = extractor.getEndDate().equals(td.expectedEndDate);
                    if (endDatePassed) {
                        System.out.println("endDate PASSED: " + td.expectedEndDate + " was matched");
                    }
                }

                if (!startDatePassed || !endDatePassed) {
                    System.out.println("FAILED: " + td.dateSpec);
                }
            } catch (Exception ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, "Could not create test with date specs " + td.dateSpec, ex);
            }
        }
    }

    public static void main(String[] args) {
        runTests();
        System.exit(0);
    }

    private static class TestDate {

        String dateSpec;
        java.util.Date expectedStartDate;
        java.util.Date expectedEndDate;

        public TestDate(
                String dateSpec,
                String startDate,
                String startDateFormat
        ) {
            this(dateSpec, startDate, startDateFormat, null, null);
        }

        public TestDate(
                String dateSpec,
                String startDate,
                String startDateFormat,
                String endDate,
                String endDateFormat
        ) {
            this.dateSpec = dateSpec;
            try {
                SimpleDateFormat sdf = new SimpleDateFormat(startDateFormat);
                this.expectedStartDate = sdf.parse(startDate);
            } catch (ParseException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, "Could not create test data for date " + startDate + " with format " + startDateFormat, ex);
            }

            if (endDate != null && endDateFormat != null) {
                try {
                    SimpleDateFormat sdf = new SimpleDateFormat(endDateFormat);
                    this.expectedEndDate = sdf.parse(endDate);
                } catch (ParseException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, "Could not create test data for date " + endDate + " with format " + endDateFormat, ex);
                }
            }
        }
    }
}
