// Generated from DateRange.g4 by ANTLR 4.5.1
package com.beebell.datespecs;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DateRangeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, ONE_DIGIT=40, TWO_DIGITS=41, THREE_DIGITS=42, FOUR_DIGITS=43, 
		THRU=44, WEEK_DAY=45, SHRT_DAY=46, LONG_DAY=47, WS=48;
	public static final int
		RULE_range = 0, RULE_startDate = 1, RULE_endDate = 2, RULE_dateTime = 3, 
		RULE_utc = 4, RULE_yyyymmdd = 5, RULE_shrtMdy = 6, RULE_longMdy = 7, RULE_optYearAndOrTime = 8, 
		RULE_year = 9, RULE_moy = 10, RULE_dom = 11, RULE_timespan = 12, RULE_tod = 13, 
		RULE_noon = 14, RULE_hour2 = 15, RULE_meridian = 16, RULE_hour = 17, RULE_minute = 18, 
		RULE_second = 19, RULE_shrtMonth = 20, RULE_longMonth = 21;
	public static final String[] ruleNames = {
		"range", "startDate", "endDate", "dateTime", "utc", "yyyymmdd", "shrtMdy", 
		"longMdy", "optYearAndOrTime", "year", "moy", "dom", "timespan", "tod", 
		"noon", "hour2", "meridian", "hour", "minute", "second", "shrtMonth", 
		"longMonth"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Every'", "'from'", "'T'", "':'", "'-'", "'+'", "'/'", "'.'", "','", 
		"'noon'", "'AM'", "'am'", "'PM'", "'pm'", "'a.m.'", "'p.m.'", "'Jan'", 
		"'Feb'", "'Mar'", "'Apr'", "'May'", "'Jun'", "'Jul'", "'Aug'", "'Sep'", 
		"'Oct'", "'Nov'", "'Dec'", "'January'", "'February'", "'March'", "'April'", 
		"'June'", "'July'", "'August'", "'September'", "'October'", "'November'", 
		"'December'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "ONE_DIGIT", "TWO_DIGITS", "THREE_DIGITS", "FOUR_DIGITS", 
		"THRU", "WEEK_DAY", "SHRT_DAY", "LONG_DAY", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DateRange.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DateRangeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RangeContext extends ParserRuleContext {
		public TerminalNode LONG_DAY() { return getToken(DateRangeParser.LONG_DAY, 0); }
		public StartDateContext startDate() {
			return getRuleContext(StartDateContext.class,0);
		}
		public TerminalNode THRU() { return getToken(DateRangeParser.THRU, 0); }
		public EndDateContext endDate() {
			return getRuleContext(EndDateContext.class,0);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).exitRange(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_range);
		try {
			setState(56);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(T__0);
				setState(45);
				match(LONG_DAY);
				setState(46);
				match(T__1);
				setState(47);
				startDate();
				setState(48);
				match(THRU);
				setState(49);
				endDate();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				startDate();
				setState(52);
				match(THRU);
				setState(53);
				endDate();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				startDate();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartDateContext extends ParserRuleContext {
		public DateTimeContext dateTime() {
			return getRuleContext(DateTimeContext.class,0);
		}
		public StartDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startDate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).enterStartDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).exitStartDate(this);
		}
	}

	public final StartDateContext startDate() throws RecognitionException {
		StartDateContext _localctx = new StartDateContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_startDate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			dateTime();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndDateContext extends ParserRuleContext {
		public DateTimeContext dateTime() {
			return getRuleContext(DateTimeContext.class,0);
		}
		public EndDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endDate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).enterEndDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).exitEndDate(this);
		}
	}

	public final EndDateContext endDate() throws RecognitionException {
		EndDateContext _localctx = new EndDateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_endDate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			dateTime();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateTimeContext extends ParserRuleContext {
		public UtcContext utc() {
			return getRuleContext(UtcContext.class,0);
		}
		public ShrtMdyContext shrtMdy() {
			return getRuleContext(ShrtMdyContext.class,0);
		}
		public YyyymmddContext yyyymmdd() {
			return getRuleContext(YyyymmddContext.class,0);
		}
		public LongMdyContext longMdy() {
			return getRuleContext(LongMdyContext.class,0);
		}
		public DateTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).enterDateTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).exitDateTime(this);
		}
	}

	public final DateTimeContext dateTime() throws RecognitionException {
		DateTimeContext _localctx = new DateTimeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dateTime);
		try {
			setState(66);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				utc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				shrtMdy();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				yyyymmdd();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				longMdy();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UtcContext extends ParserRuleContext {
		public YyyymmddContext yyyymmdd() {
			return getRuleContext(YyyymmddContext.class,0);
		}
		public List<HourContext> hour() {
			return getRuleContexts(HourContext.class);
		}
		public HourContext hour(int i) {
			return getRuleContext(HourContext.class,i);
		}
		public List<MinuteContext> minute() {
			return getRuleContexts(MinuteContext.class);
		}
		public MinuteContext minute(int i) {
			return getRuleContext(MinuteContext.class,i);
		}
		public SecondContext second() {
			return getRuleContext(SecondContext.class,0);
		}
		public UtcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_utc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).enterUtc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).exitUtc(this);
		}
	}

	public final UtcContext utc() throws RecognitionException {
		UtcContext _localctx = new UtcContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_utc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			yyyymmdd();
			setState(69);
			match(T__2);
			setState(70);
			hour();
			setState(71);
			match(T__3);
			setState(72);
			minute();
			setState(73);
			match(T__3);
			setState(74);
			second();
			setState(75);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__5) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(76);
			hour();
			setState(77);
			match(T__3);
			setState(78);
			minute();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YyyymmddContext extends ParserRuleContext {
		public YearContext year() {
			return getRuleContext(YearContext.class,0);
		}
		public MoyContext moy() {
			return getRuleContext(MoyContext.class,0);
		}
		public DomContext dom() {
			return getRuleContext(DomContext.class,0);
		}
		public YyyymmddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yyyymmdd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).enterYyyymmdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).exitYyyymmdd(this);
		}
	}

	public final YyyymmddContext yyyymmdd() throws RecognitionException {
		YyyymmddContext _localctx = new YyyymmddContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_yyyymmdd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			year();
			setState(81);
			match(T__4);
			setState(82);
			moy();
			setState(83);
			match(T__4);
			setState(84);
			dom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShrtMdyContext extends ParserRuleContext {
		public MoyContext moy() {
			return getRuleContext(MoyContext.class,0);
		}
		public DomContext dom() {
			return getRuleContext(DomContext.class,0);
		}
		public YearContext year() {
			return getRuleContext(YearContext.class,0);
		}
		public ShrtMdyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shrtMdy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).enterShrtMdy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).exitShrtMdy(this);
		}
	}

	public final ShrtMdyContext shrtMdy() throws RecognitionException {
		ShrtMdyContext _localctx = new ShrtMdyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_shrtMdy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			moy();
			setState(87);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__6) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(88);
			dom();
			setState(89);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__6) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(90);
			year();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LongMdyContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(DateRangeParser.WS, 0); }
		public DomContext dom() {
			return getRuleContext(DomContext.class,0);
		}
		public ShrtMonthContext shrtMonth() {
			return getRuleContext(ShrtMonthContext.class,0);
		}
		public LongMonthContext longMonth() {
			return getRuleContext(LongMonthContext.class,0);
		}
		public OptYearAndOrTimeContext optYearAndOrTime() {
			return getRuleContext(OptYearAndOrTimeContext.class,0);
		}
		public LongMdyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longMdy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).enterLongMdy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).exitLongMdy(this);
		}
	}

	public final LongMdyContext longMdy() throws RecognitionException {
		LongMdyContext _localctx = new LongMdyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_longMdy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(92);
				shrtMonth();
				setState(94);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(93);
					match(T__7);
					}
				}

				}
				break;
			case 2:
				{
				setState(96);
				longMonth();
				}
				break;
			}
			setState(99);
			match(WS);
			setState(100);
			dom();
			setState(102);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(101);
				match(T__8);
				}
			}

			setState(105);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(104);
				optYearAndOrTime();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptYearAndOrTimeContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(DateRangeParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(DateRangeParser.WS, i);
		}
		public YearContext year() {
			return getRuleContext(YearContext.class,0);
		}
		public TimespanContext timespan() {
			return getRuleContext(TimespanContext.class,0);
		}
		public OptYearAndOrTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optYearAndOrTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).enterOptYearAndOrTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).exitOptYearAndOrTime(this);
		}
	}

	public final OptYearAndOrTimeContext optYearAndOrTime() throws RecognitionException {
		OptYearAndOrTimeContext _localctx = new OptYearAndOrTimeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_optYearAndOrTime);
		int _la;
		try {
			setState(118);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(107);
				match(WS);
				setState(108);
				year();
				setState(114);
				_la = _input.LA(1);
				if (_la==T__8 || _la==WS) {
					{
					setState(110);
					_la = _input.LA(1);
					if (_la==T__8) {
						{
						setState(109);
						match(T__8);
						}
					}

					setState(112);
					match(WS);
					setState(113);
					timespan();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(116);
				match(WS);
				setState(117);
				timespan();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YearContext extends ParserRuleContext {
		public TerminalNode FOUR_DIGITS() { return getToken(DateRangeParser.FOUR_DIGITS, 0); }
		public YearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_year; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).enterYear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).exitYear(this);
		}
	}

	public final YearContext year() throws RecognitionException {
		YearContext _localctx = new YearContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_year);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(FOUR_DIGITS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MoyContext extends ParserRuleContext {
		public TerminalNode ONE_DIGIT() { return getToken(DateRangeParser.ONE_DIGIT, 0); }
		public TerminalNode TWO_DIGITS() { return getToken(DateRangeParser.TWO_DIGITS, 0); }
		public MoyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).enterMoy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).exitMoy(this);
		}
	}

	public final MoyContext moy() throws RecognitionException {
		MoyContext _localctx = new MoyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_moy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !(_la==ONE_DIGIT || _la==TWO_DIGITS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DomContext extends ParserRuleContext {
		public TerminalNode ONE_DIGIT() { return getToken(DateRangeParser.ONE_DIGIT, 0); }
		public TerminalNode TWO_DIGITS() { return getToken(DateRangeParser.TWO_DIGITS, 0); }
		public DomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).enterDom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).exitDom(this);
		}
	}

	public final DomContext dom() throws RecognitionException {
		DomContext _localctx = new DomContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !(_la==ONE_DIGIT || _la==TWO_DIGITS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimespanContext extends ParserRuleContext {
		public List<TodContext> tod() {
			return getRuleContexts(TodContext.class);
		}
		public TodContext tod(int i) {
			return getRuleContext(TodContext.class,i);
		}
		public TerminalNode THRU() { return getToken(DateRangeParser.THRU, 0); }
		public TimespanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timespan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).enterTimespan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).exitTimespan(this);
		}
	}

	public final TimespanContext timespan() throws RecognitionException {
		TimespanContext _localctx = new TimespanContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_timespan);
		try {
			setState(131);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(126);
				tod();
				setState(127);
				match(THRU);
				setState(128);
				tod();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				tod();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TodContext extends ParserRuleContext {
		public NoonContext noon() {
			return getRuleContext(NoonContext.class,0);
		}
		public Hour2Context hour2() {
			return getRuleContext(Hour2Context.class,0);
		}
		public MeridianContext meridian() {
			return getRuleContext(MeridianContext.class,0);
		}
		public MinuteContext minute() {
			return getRuleContext(MinuteContext.class,0);
		}
		public TerminalNode WS() { return getToken(DateRangeParser.WS, 0); }
		public TodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).enterTod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).exitTod(this);
		}
	}

	public final TodContext tod() throws RecognitionException {
		TodContext _localctx = new TodContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tod);
		int _la;
		try {
			setState(144);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				noon();
				}
				break;
			case ONE_DIGIT:
			case TWO_DIGITS:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(134);
				hour2();
				setState(137);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(135);
					match(T__3);
					setState(136);
					minute();
					}
				}

				setState(140);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(139);
					match(WS);
					}
				}

				setState(142);
				meridian();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoonContext extends ParserRuleContext {
		public NoonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).enterNoon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).exitNoon(this);
		}
	}

	public final NoonContext noon() throws RecognitionException {
		NoonContext _localctx = new NoonContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_noon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hour2Context extends ParserRuleContext {
		public TerminalNode ONE_DIGIT() { return getToken(DateRangeParser.ONE_DIGIT, 0); }
		public TerminalNode TWO_DIGITS() { return getToken(DateRangeParser.TWO_DIGITS, 0); }
		public Hour2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hour2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).enterHour2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).exitHour2(this);
		}
	}

	public final Hour2Context hour2() throws RecognitionException {
		Hour2Context _localctx = new Hour2Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_hour2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !(_la==ONE_DIGIT || _la==TWO_DIGITS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeridianContext extends ParserRuleContext {
		public MeridianContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meridian; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).enterMeridian(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).exitMeridian(this);
		}
	}

	public final MeridianContext meridian() throws RecognitionException {
		MeridianContext _localctx = new MeridianContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_meridian);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HourContext extends ParserRuleContext {
		public TerminalNode TWO_DIGITS() { return getToken(DateRangeParser.TWO_DIGITS, 0); }
		public HourContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hour; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).enterHour(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).exitHour(this);
		}
	}

	public final HourContext hour() throws RecognitionException {
		HourContext _localctx = new HourContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_hour);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(TWO_DIGITS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MinuteContext extends ParserRuleContext {
		public TerminalNode TWO_DIGITS() { return getToken(DateRangeParser.TWO_DIGITS, 0); }
		public MinuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).enterMinute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).exitMinute(this);
		}
	}

	public final MinuteContext minute() throws RecognitionException {
		MinuteContext _localctx = new MinuteContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_minute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(TWO_DIGITS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SecondContext extends ParserRuleContext {
		public TerminalNode TWO_DIGITS() { return getToken(DateRangeParser.TWO_DIGITS, 0); }
		public SecondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_second; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).enterSecond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).exitSecond(this);
		}
	}

	public final SecondContext second() throws RecognitionException {
		SecondContext _localctx = new SecondContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_second);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(TWO_DIGITS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShrtMonthContext extends ParserRuleContext {
		public ShrtMonthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shrtMonth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).enterShrtMonth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).exitShrtMonth(this);
		}
	}

	public final ShrtMonthContext shrtMonth() throws RecognitionException {
		ShrtMonthContext _localctx = new ShrtMonthContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_shrtMonth);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LongMonthContext extends ParserRuleContext {
		public LongMonthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longMonth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).enterLongMonth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateRangeListener ) ((DateRangeListener)listener).exitLongMonth(this);
		}
	}

	public final LongMonthContext longMonth() throws RecognitionException {
		LongMonthContext _localctx = new LongMonthContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_longMonth);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\62\u00a5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2;\n\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\5\5E\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\ta\n\t\3\t\5\td\n\t\3\t"+
		"\3\t\3\t\5\ti\n\t\3\t\5\tl\n\t\3\n\3\n\3\n\5\nq\n\n\3\n\3\n\5\nu\n\n\3"+
		"\n\3\n\5\ny\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u0086\n\16\3\17\3\17\3\17\3\17\5\17\u008c\n\17\3\17\5\17\u008f\n\17\3"+
		"\17\3\17\5\17\u0093\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,\2\b\3\2\7\b\4\2\7\7\t\t\3\2*+\3\2\r\22\3\2\23"+
		"\36\4\2\27\27\37)\u009e\2:\3\2\2\2\4<\3\2\2\2\6>\3\2\2\2\bD\3\2\2\2\n"+
		"F\3\2\2\2\fR\3\2\2\2\16X\3\2\2\2\20c\3\2\2\2\22x\3\2\2\2\24z\3\2\2\2\26"+
		"|\3\2\2\2\30~\3\2\2\2\32\u0085\3\2\2\2\34\u0092\3\2\2\2\36\u0094\3\2\2"+
		"\2 \u0096\3\2\2\2\"\u0098\3\2\2\2$\u009a\3\2\2\2&\u009c\3\2\2\2(\u009e"+
		"\3\2\2\2*\u00a0\3\2\2\2,\u00a2\3\2\2\2./\7\3\2\2/\60\7\61\2\2\60\61\7"+
		"\4\2\2\61\62\5\4\3\2\62\63\7.\2\2\63\64\5\6\4\2\64;\3\2\2\2\65\66\5\4"+
		"\3\2\66\67\7.\2\2\678\5\6\4\28;\3\2\2\29;\5\4\3\2:.\3\2\2\2:\65\3\2\2"+
		"\2:9\3\2\2\2;\3\3\2\2\2<=\5\b\5\2=\5\3\2\2\2>?\5\b\5\2?\7\3\2\2\2@E\5"+
		"\n\6\2AE\5\16\b\2BE\5\f\7\2CE\5\20\t\2D@\3\2\2\2DA\3\2\2\2DB\3\2\2\2D"+
		"C\3\2\2\2E\t\3\2\2\2FG\5\f\7\2GH\7\5\2\2HI\5$\23\2IJ\7\6\2\2JK\5&\24\2"+
		"KL\7\6\2\2LM\5(\25\2MN\t\2\2\2NO\5$\23\2OP\7\6\2\2PQ\5&\24\2Q\13\3\2\2"+
		"\2RS\5\24\13\2ST\7\7\2\2TU\5\26\f\2UV\7\7\2\2VW\5\30\r\2W\r\3\2\2\2XY"+
		"\5\26\f\2YZ\t\3\2\2Z[\5\30\r\2[\\\t\3\2\2\\]\5\24\13\2]\17\3\2\2\2^`\5"+
		"*\26\2_a\7\n\2\2`_\3\2\2\2`a\3\2\2\2ad\3\2\2\2bd\5,\27\2c^\3\2\2\2cb\3"+
		"\2\2\2de\3\2\2\2ef\7\62\2\2fh\5\30\r\2gi\7\13\2\2hg\3\2\2\2hi\3\2\2\2"+
		"ik\3\2\2\2jl\5\22\n\2kj\3\2\2\2kl\3\2\2\2l\21\3\2\2\2mn\7\62\2\2nt\5\24"+
		"\13\2oq\7\13\2\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\62\2\2su\5\32\16\2"+
		"tp\3\2\2\2tu\3\2\2\2uy\3\2\2\2vw\7\62\2\2wy\5\32\16\2xm\3\2\2\2xv\3\2"+
		"\2\2y\23\3\2\2\2z{\7-\2\2{\25\3\2\2\2|}\t\4\2\2}\27\3\2\2\2~\177\t\4\2"+
		"\2\177\31\3\2\2\2\u0080\u0081\5\34\17\2\u0081\u0082\7.\2\2\u0082\u0083"+
		"\5\34\17\2\u0083\u0086\3\2\2\2\u0084\u0086\5\34\17\2\u0085\u0080\3\2\2"+
		"\2\u0085\u0084\3\2\2\2\u0086\33\3\2\2\2\u0087\u0093\5\36\20\2\u0088\u008b"+
		"\5 \21\2\u0089\u008a\7\6\2\2\u008a\u008c\5&\24\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008f\7\62\2\2\u008e\u008d\3"+
		"\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\5\"\22\2\u0091"+
		"\u0093\3\2\2\2\u0092\u0087\3\2\2\2\u0092\u0088\3\2\2\2\u0093\35\3\2\2"+
		"\2\u0094\u0095\7\f\2\2\u0095\37\3\2\2\2\u0096\u0097\t\4\2\2\u0097!\3\2"+
		"\2\2\u0098\u0099\t\5\2\2\u0099#\3\2\2\2\u009a\u009b\7+\2\2\u009b%\3\2"+
		"\2\2\u009c\u009d\7+\2\2\u009d\'\3\2\2\2\u009e\u009f\7+\2\2\u009f)\3\2"+
		"\2\2\u00a0\u00a1\t\6\2\2\u00a1+\3\2\2\2\u00a2\u00a3\t\7\2\2\u00a3-\3\2"+
		"\2\2\17:D`chkptx\u0085\u008b\u008e\u0092";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}