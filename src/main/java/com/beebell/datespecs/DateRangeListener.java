// Generated from DateRange.g4 by ANTLR 4.5.1
package com.beebell.datespecs;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DateRangeParser}.
 */
public interface DateRangeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DateRangeParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(DateRangeParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateRangeParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(DateRangeParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateRangeParser#startDate}.
	 * @param ctx the parse tree
	 */
	void enterStartDate(DateRangeParser.StartDateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateRangeParser#startDate}.
	 * @param ctx the parse tree
	 */
	void exitStartDate(DateRangeParser.StartDateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateRangeParser#endDate}.
	 * @param ctx the parse tree
	 */
	void enterEndDate(DateRangeParser.EndDateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateRangeParser#endDate}.
	 * @param ctx the parse tree
	 */
	void exitEndDate(DateRangeParser.EndDateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateRangeParser#dateTime}.
	 * @param ctx the parse tree
	 */
	void enterDateTime(DateRangeParser.DateTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateRangeParser#dateTime}.
	 * @param ctx the parse tree
	 */
	void exitDateTime(DateRangeParser.DateTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateRangeParser#utc}.
	 * @param ctx the parse tree
	 */
	void enterUtc(DateRangeParser.UtcContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateRangeParser#utc}.
	 * @param ctx the parse tree
	 */
	void exitUtc(DateRangeParser.UtcContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateRangeParser#yyyymmdd}.
	 * @param ctx the parse tree
	 */
	void enterYyyymmdd(DateRangeParser.YyyymmddContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateRangeParser#yyyymmdd}.
	 * @param ctx the parse tree
	 */
	void exitYyyymmdd(DateRangeParser.YyyymmddContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateRangeParser#shrtMdy}.
	 * @param ctx the parse tree
	 */
	void enterShrtMdy(DateRangeParser.ShrtMdyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateRangeParser#shrtMdy}.
	 * @param ctx the parse tree
	 */
	void exitShrtMdy(DateRangeParser.ShrtMdyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateRangeParser#longMdy}.
	 * @param ctx the parse tree
	 */
	void enterLongMdy(DateRangeParser.LongMdyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateRangeParser#longMdy}.
	 * @param ctx the parse tree
	 */
	void exitLongMdy(DateRangeParser.LongMdyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateRangeParser#optYearAndOrTime}.
	 * @param ctx the parse tree
	 */
	void enterOptYearAndOrTime(DateRangeParser.OptYearAndOrTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateRangeParser#optYearAndOrTime}.
	 * @param ctx the parse tree
	 */
	void exitOptYearAndOrTime(DateRangeParser.OptYearAndOrTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateRangeParser#year}.
	 * @param ctx the parse tree
	 */
	void enterYear(DateRangeParser.YearContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateRangeParser#year}.
	 * @param ctx the parse tree
	 */
	void exitYear(DateRangeParser.YearContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateRangeParser#moy}.
	 * @param ctx the parse tree
	 */
	void enterMoy(DateRangeParser.MoyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateRangeParser#moy}.
	 * @param ctx the parse tree
	 */
	void exitMoy(DateRangeParser.MoyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateRangeParser#dom}.
	 * @param ctx the parse tree
	 */
	void enterDom(DateRangeParser.DomContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateRangeParser#dom}.
	 * @param ctx the parse tree
	 */
	void exitDom(DateRangeParser.DomContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateRangeParser#timespan}.
	 * @param ctx the parse tree
	 */
	void enterTimespan(DateRangeParser.TimespanContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateRangeParser#timespan}.
	 * @param ctx the parse tree
	 */
	void exitTimespan(DateRangeParser.TimespanContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateRangeParser#tod}.
	 * @param ctx the parse tree
	 */
	void enterTod(DateRangeParser.TodContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateRangeParser#tod}.
	 * @param ctx the parse tree
	 */
	void exitTod(DateRangeParser.TodContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateRangeParser#noon}.
	 * @param ctx the parse tree
	 */
	void enterNoon(DateRangeParser.NoonContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateRangeParser#noon}.
	 * @param ctx the parse tree
	 */
	void exitNoon(DateRangeParser.NoonContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateRangeParser#hour2}.
	 * @param ctx the parse tree
	 */
	void enterHour2(DateRangeParser.Hour2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DateRangeParser#hour2}.
	 * @param ctx the parse tree
	 */
	void exitHour2(DateRangeParser.Hour2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DateRangeParser#meridian}.
	 * @param ctx the parse tree
	 */
	void enterMeridian(DateRangeParser.MeridianContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateRangeParser#meridian}.
	 * @param ctx the parse tree
	 */
	void exitMeridian(DateRangeParser.MeridianContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateRangeParser#hour}.
	 * @param ctx the parse tree
	 */
	void enterHour(DateRangeParser.HourContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateRangeParser#hour}.
	 * @param ctx the parse tree
	 */
	void exitHour(DateRangeParser.HourContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateRangeParser#minute}.
	 * @param ctx the parse tree
	 */
	void enterMinute(DateRangeParser.MinuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateRangeParser#minute}.
	 * @param ctx the parse tree
	 */
	void exitMinute(DateRangeParser.MinuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateRangeParser#second}.
	 * @param ctx the parse tree
	 */
	void enterSecond(DateRangeParser.SecondContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateRangeParser#second}.
	 * @param ctx the parse tree
	 */
	void exitSecond(DateRangeParser.SecondContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateRangeParser#shrtMonth}.
	 * @param ctx the parse tree
	 */
	void enterShrtMonth(DateRangeParser.ShrtMonthContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateRangeParser#shrtMonth}.
	 * @param ctx the parse tree
	 */
	void exitShrtMonth(DateRangeParser.ShrtMonthContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateRangeParser#longMonth}.
	 * @param ctx the parse tree
	 */
	void enterLongMonth(DateRangeParser.LongMonthContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateRangeParser#longMonth}.
	 * @param ctx the parse tree
	 */
	void exitLongMonth(DateRangeParser.LongMonthContext ctx);
}