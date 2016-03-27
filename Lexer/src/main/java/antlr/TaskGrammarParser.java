package antlr;// Generated from TaskGrammar.g4 by ANTLR 4.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TaskGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, THEN=2, ELSE=3, DO=4, WHILE=5, SKIP=6, WRITE=7, READ=8, AND=9, OR=10, 
		GT=11, GE=12, LT=13, LE=14, EQ=15, NEQ=16, PLUS=17, MINUS=18, MULT=19, 
		DIV=20, MOD=21, ASSIGN=22, SEMICOLON=23, VARIABLE=24, NUMBER=25, SPACE=26;
	public static final String[] tokenNames = {
		"<INVALID>", "'if'", "'then'", "'else'", "'do'", "'while'", "'skip'", 
		"'write'", "'read'", "'&&'", "'||'", "'>'", "'>='", "'<'", "'<='", "'=='", 
		"'!='", "'+'", "'-'", "'*'", "'/'", "'%'", "':='", "';'", "VARIABLE", 
		"NUMBER", "SPACE"
	};
	public static final int
		RULE_operation = 0, RULE_comparison_op = 1, RULE_arithmetic_op = 2, RULE_expression = 3, 
		RULE_assignment_operator = 4, RULE_write_operator = 5, RULE_read_operator = 6, 
		RULE_statement = 7, RULE_program = 8;
	public static final String[] ruleNames = {
		"operation", "comparison_op", "arithmetic_op", "expression", "assignment_operator", 
		"write_operator", "read_operator", "statement", "program"
	};

	@Override
	public String getGrammarFileName() { return "TaskGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TaskGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class OperationContext extends ParserRuleContext {
		public Comparison_opContext comparison_op() {
			return getRuleContext(Comparison_opContext.class,0);
		}
		public Arithmetic_opContext arithmetic_op() {
			return getRuleContext(Arithmetic_opContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskGrammarListener ) ((TaskGrammarListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskGrammarListener ) ((TaskGrammarListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_operation);
		try {
			setState(20);
			switch (_input.LA(1)) {
			case GT:
			case GE:
			case LT:
			case LE:
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(18); comparison_op();
				}
				break;
			case PLUS:
			case MINUS:
			case MULT:
			case DIV:
			case MOD:
				enterOuterAlt(_localctx, 2);
				{
				setState(19); arithmetic_op();
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

	public static class Comparison_opContext extends ParserRuleContext {
		public TerminalNode GE() { return getToken(TaskGrammarParser.GE, 0); }
		public TerminalNode LT() { return getToken(TaskGrammarParser.LT, 0); }
		public TerminalNode GT() { return getToken(TaskGrammarParser.GT, 0); }
		public TerminalNode LE() { return getToken(TaskGrammarParser.LE, 0); }
		public TerminalNode EQ() { return getToken(TaskGrammarParser.EQ, 0); }
		public Comparison_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskGrammarListener ) ((TaskGrammarListener)listener).enterComparison_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskGrammarListener ) ((TaskGrammarListener)listener).exitComparison_op(this);
		}
	}

	public final Comparison_opContext comparison_op() throws RecognitionException {
		Comparison_opContext _localctx = new Comparison_opContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comparison_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Arithmetic_opContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(TaskGrammarParser.MULT, 0); }
		public TerminalNode PLUS() { return getToken(TaskGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(TaskGrammarParser.MINUS, 0); }
		public TerminalNode MOD() { return getToken(TaskGrammarParser.MOD, 0); }
		public TerminalNode DIV() { return getToken(TaskGrammarParser.DIV, 0); }
		public Arithmetic_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskGrammarListener ) ((TaskGrammarListener)listener).enterArithmetic_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskGrammarListener ) ((TaskGrammarListener)listener).exitArithmetic_op(this);
		}
	}

	public final Arithmetic_opContext arithmetic_op() throws RecognitionException {
		Arithmetic_opContext _localctx = new Arithmetic_opContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_arithmetic_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(TaskGrammarParser.NUMBER, 0); }
		public TerminalNode VARIABLE() { return getToken(TaskGrammarParser.VARIABLE, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskGrammarListener ) ((TaskGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskGrammarListener ) ((TaskGrammarListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(27); match(NUMBER);
				}
				break;
			case VARIABLE:
				{
				setState(28); match(VARIABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(37);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(31);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(32); operation();
					setState(33); expression(2);
					}
					} 
				}
				setState(39);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Assignment_operatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(TaskGrammarParser.ASSIGN, 0); }
		public TerminalNode VARIABLE() { return getToken(TaskGrammarParser.VARIABLE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskGrammarListener ) ((TaskGrammarListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskGrammarListener ) ((TaskGrammarListener)listener).exitAssignment_operator(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); match(VARIABLE);
			setState(41); match(ASSIGN);
			setState(42); expression(0);
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

	public static class Write_operatorContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(TaskGrammarParser.WRITE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Write_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskGrammarListener ) ((TaskGrammarListener)listener).enterWrite_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskGrammarListener ) ((TaskGrammarListener)listener).exitWrite_operator(this);
		}
	}

	public final Write_operatorContext write_operator() throws RecognitionException {
		Write_operatorContext _localctx = new Write_operatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_write_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); match(WRITE);
			setState(45); expression(0);
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

	public static class Read_operatorContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(TaskGrammarParser.READ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Read_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskGrammarListener ) ((TaskGrammarListener)listener).enterRead_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskGrammarListener ) ((TaskGrammarListener)listener).exitRead_operator(this);
		}
	}

	public final Read_operatorContext read_operator() throws RecognitionException {
		Read_operatorContext _localctx = new Read_operatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_read_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); match(READ);
			setState(48); expression(0);
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(TaskGrammarParser.ELSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(TaskGrammarParser.SEMICOLON, 0); }
		public TerminalNode IF() { return getToken(TaskGrammarParser.IF, 0); }
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public TerminalNode THEN() { return getToken(TaskGrammarParser.THEN, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode WHILE() { return getToken(TaskGrammarParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(TaskGrammarParser.DO, 0); }
		public TerminalNode SKIP() { return getToken(TaskGrammarParser.SKIP, 0); }
		public Write_operatorContext write_operator() {
			return getRuleContext(Write_operatorContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Read_operatorContext read_operator() {
			return getRuleContext(Read_operatorContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskGrammarListener ) ((TaskGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskGrammarListener ) ((TaskGrammarListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		return statement(0);
	}

	private StatementContext statement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementContext _localctx = new StatementContext(_ctx, _parentState);
		StatementContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_statement, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			switch (_input.LA(1)) {
			case WHILE:
				{
				setState(51); match(WHILE);
				setState(52); expression(0);
				setState(53); match(DO);
				setState(54); statement(2);
				}
				break;
			case SKIP:
				{
				setState(56); match(SKIP);
				}
				break;
			case VARIABLE:
				{
				setState(57); assignment_operator();
				}
				break;
			case WRITE:
				{
				setState(58); write_operator();
				}
				break;
			case READ:
				{
				setState(59); read_operator();
				}
				break;
			case IF:
				{
				setState(60); match(IF);
				setState(61); expression(0);
				setState(62); match(THEN);
				setState(63); statement(0);
				setState(64); match(ELSE);
				setState(65); statement(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statement);
					setState(69);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(70); match(SEMICOLON);
					setState(71); statement(6);
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TaskGrammarParser.EOF, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskGrammarListener ) ((TaskGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskGrammarListener ) ((TaskGrammarListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); statement(0);
			setState(78); match(EOF);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3: return expression_sempred((ExpressionContext)_localctx, predIndex);

		case 7: return statement_sempred((StatementContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean statement_sempred(StatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34S\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\5\2"+
		"\27\n\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\5\5 \n\5\3\5\3\5\3\5\3\5\7\5&\n\5"+
		"\f\5\16\5)\13\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tF\n\t\3\t\3"+
		"\t\3\t\7\tK\n\t\f\t\16\tN\13\t\3\n\3\n\3\n\3\n\2\4\b\20\13\2\4\6\b\n\f"+
		"\16\20\22\2\4\3\2\r\21\3\2\23\27R\2\26\3\2\2\2\4\30\3\2\2\2\6\32\3\2\2"+
		"\2\b\37\3\2\2\2\n*\3\2\2\2\f.\3\2\2\2\16\61\3\2\2\2\20E\3\2\2\2\22O\3"+
		"\2\2\2\24\27\5\4\3\2\25\27\5\6\4\2\26\24\3\2\2\2\26\25\3\2\2\2\27\3\3"+
		"\2\2\2\30\31\t\2\2\2\31\5\3\2\2\2\32\33\t\3\2\2\33\7\3\2\2\2\34\35\b\5"+
		"\1\2\35 \7\33\2\2\36 \7\32\2\2\37\34\3\2\2\2\37\36\3\2\2\2 \'\3\2\2\2"+
		"!\"\f\3\2\2\"#\5\2\2\2#$\5\b\5\4$&\3\2\2\2%!\3\2\2\2&)\3\2\2\2\'%\3\2"+
		"\2\2\'(\3\2\2\2(\t\3\2\2\2)\'\3\2\2\2*+\7\32\2\2+,\7\30\2\2,-\5\b\5\2"+
		"-\13\3\2\2\2./\7\t\2\2/\60\5\b\5\2\60\r\3\2\2\2\61\62\7\n\2\2\62\63\5"+
		"\b\5\2\63\17\3\2\2\2\64\65\b\t\1\2\65\66\7\7\2\2\66\67\5\b\5\2\678\7\6"+
		"\2\289\5\20\t\49F\3\2\2\2:F\7\b\2\2;F\5\n\6\2<F\5\f\7\2=F\5\16\b\2>?\7"+
		"\3\2\2?@\5\b\5\2@A\7\4\2\2AB\5\20\t\2BC\7\5\2\2CD\5\20\t\2DF\3\2\2\2E"+
		"\64\3\2\2\2E:\3\2\2\2E;\3\2\2\2E<\3\2\2\2E=\3\2\2\2E>\3\2\2\2FL\3\2\2"+
		"\2GH\f\7\2\2HI\7\31\2\2IK\5\20\t\bJG\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2"+
		"\2\2M\21\3\2\2\2NL\3\2\2\2OP\5\20\t\2PQ\7\2\2\3Q\23\3\2\2\2\7\26\37\'"+
		"EL";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}