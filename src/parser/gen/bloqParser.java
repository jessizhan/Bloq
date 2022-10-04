// Generated from /Users/jessicazhan/Projects/cpsc410_project1_team9/src/parser/bloqParser.g4 by ANTLR 4.10.1

package parser.gen;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class bloqParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CANVAS=1, BLOCK=2, START=3, FOR=4, SHAPE=5, IF=6, TO=7, DEFINE=8, CALL=9, 
		ELSE=10, EQUAL=11, GREATER=12, GREATEREQ=13, LESS=14, LESSRQ=15, NOTEQ=16, 
		AND=17, OR=18, NOT=19, PLUS=20, MINUS=21, MULTIPLY=22, DIVIDE=23, MODULO=24, 
		NUMBER=25, TEXT=26, COLON=27, SEMICOLON=28, COMMA=29, OPENCURLY=30, CLOSECURLY=31, 
		OPENBRACKET=32, CLOSEBRACKET=33, NEWLINE=34, WS=35;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_canvas_statement = 2, RULE_simple_assignment_statement = 3, 
		RULE_shape_assignment_statement = 4, RULE_call_statement = 5, RULE_define_statement = 6, 
		RULE_in_function_statement = 7, RULE_block_statement = 8, RULE_block_start_statement = 9, 
		RULE_block_shape_statement = 10, RULE_loop_statement = 11, RULE_in_loop_statement = 12, 
		RULE_if_statement = 13, RULE_else_statement = 14, RULE_in_if_statement = 15, 
		RULE_linked_condition = 16, RULE_condition = 17, RULE_expression = 18, 
		RULE_args = 19, RULE_shape_row = 20, RULE_variable = 21, RULE_value = 22, 
		RULE_comparator = 23, RULE_operator = 24, RULE_logic_operator = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "canvas_statement", "simple_assignment_statement", 
			"shape_assignment_statement", "call_statement", "define_statement", "in_function_statement", 
			"block_statement", "block_start_statement", "block_shape_statement", 
			"loop_statement", "in_loop_statement", "if_statement", "else_statement", 
			"in_if_statement", "linked_condition", "condition", "expression", "args", 
			"shape_row", "variable", "value", "comparator", "operator", "logic_operator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'canvas'", "'block'", "'start'", "'for'", "'shape'", "'if'", "'to'", 
			"'define'", "'call'", "'else'", "'=='", "'>'", "'>='", "'<'", "'<='", 
			"'!='", "'&&'", "'||'", "'!'", "'+'", "'-'", "'*'", "'/'", "'%'", null, 
			null, "':'", "';'", "','", "'{'", "'}'", "'('", "')'", "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CANVAS", "BLOCK", "START", "FOR", "SHAPE", "IF", "TO", "DEFINE", 
			"CALL", "ELSE", "EQUAL", "GREATER", "GREATEREQ", "LESS", "LESSRQ", "NOTEQ", 
			"AND", "OR", "NOT", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MODULO", 
			"NUMBER", "TEXT", "COLON", "SEMICOLON", "COMMA", "OPENCURLY", "CLOSECURLY", 
			"OPENBRACKET", "CLOSEBRACKET", "NEWLINE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "bloqParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public bloqParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				statement();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CANVAS) | (1L << BLOCK) | (1L << FOR) | (1L << IF) | (1L << DEFINE) | (1L << CALL) | (1L << TEXT))) != 0) );
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
		public Canvas_statementContext canvas_statement() {
			return getRuleContext(Canvas_statementContext.class,0);
		}
		public Simple_assignment_statementContext simple_assignment_statement() {
			return getRuleContext(Simple_assignment_statementContext.class,0);
		}
		public Shape_assignment_statementContext shape_assignment_statement() {
			return getRuleContext(Shape_assignment_statementContext.class,0);
		}
		public Define_statementContext define_statement() {
			return getRuleContext(Define_statementContext.class,0);
		}
		public Call_statementContext call_statement() {
			return getRuleContext(Call_statementContext.class,0);
		}
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(bloqParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(bloqParser.NEWLINE, i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(57);
				canvas_statement();
				}
				break;
			case 2:
				{
				setState(58);
				simple_assignment_statement();
				}
				break;
			case 3:
				{
				setState(59);
				shape_assignment_statement();
				}
				break;
			case 4:
				{
				setState(60);
				define_statement();
				}
				break;
			case 5:
				{
				setState(61);
				call_statement();
				}
				break;
			case 6:
				{
				setState(62);
				block_statement();
				}
				break;
			case 7:
				{
				setState(63);
				loop_statement();
				}
				break;
			case 8:
				{
				setState(64);
				if_statement();
				}
				break;
			}
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				{
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(67);
					match(NEWLINE);
					}
					}
					setState(70); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case EOF:
			case CANVAS:
			case BLOCK:
			case FOR:
			case IF:
			case DEFINE:
			case CALL:
			case TEXT:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Canvas_statementContext extends ParserRuleContext {
		public TerminalNode CANVAS() { return getToken(bloqParser.CANVAS, 0); }
		public TerminalNode COLON() { return getToken(bloqParser.COLON, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(bloqParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(bloqParser.NUMBER, i);
		}
		public TerminalNode COMMA() { return getToken(bloqParser.COMMA, 0); }
		public Canvas_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_canvas_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterCanvas_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitCanvas_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitCanvas_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Canvas_statementContext canvas_statement() throws RecognitionException {
		Canvas_statementContext _localctx = new Canvas_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_canvas_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(CANVAS);
			setState(76);
			match(COLON);
			setState(77);
			match(NUMBER);
			setState(78);
			match(COMMA);
			setState(79);
			match(NUMBER);
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

	public static class Simple_assignment_statementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode COLON() { return getToken(bloqParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Simple_assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterSimple_assignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitSimple_assignment_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitSimple_assignment_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_assignment_statementContext simple_assignment_statement() throws RecognitionException {
		Simple_assignment_statementContext _localctx = new Simple_assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simple_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			variable();
			setState(82);
			match(COLON);
			setState(83);
			expression();
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

	public static class Shape_assignment_statementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode COLON() { return getToken(bloqParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(bloqParser.NEWLINE, 0); }
		public List<Shape_rowContext> shape_row() {
			return getRuleContexts(Shape_rowContext.class);
		}
		public Shape_rowContext shape_row(int i) {
			return getRuleContext(Shape_rowContext.class,i);
		}
		public Shape_assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterShape_assignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitShape_assignment_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitShape_assignment_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shape_assignment_statementContext shape_assignment_statement() throws RecognitionException {
		Shape_assignment_statementContext _localctx = new Shape_assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_shape_assignment_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			variable();
			setState(86);
			match(COLON);
			setState(87);
			match(NEWLINE);
			setState(89); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(88);
					shape_row();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(91); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
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

	public static class Call_statementContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(bloqParser.CALL, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode OPENBRACKET() { return getToken(bloqParser.OPENBRACKET, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(bloqParser.CLOSEBRACKET, 0); }
		public Call_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterCall_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitCall_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitCall_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_statementContext call_statement() throws RecognitionException {
		Call_statementContext _localctx = new Call_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_call_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(CALL);
			setState(94);
			variable();
			setState(95);
			match(OPENBRACKET);
			setState(96);
			args();
			setState(97);
			match(CLOSEBRACKET);
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

	public static class Define_statementContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(bloqParser.DEFINE, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode OPENBRACKET() { return getToken(bloqParser.OPENBRACKET, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(bloqParser.CLOSEBRACKET, 0); }
		public TerminalNode OPENCURLY() { return getToken(bloqParser.OPENCURLY, 0); }
		public TerminalNode CLOSECURLY() { return getToken(bloqParser.CLOSECURLY, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(bloqParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(bloqParser.NEWLINE, i);
		}
		public List<In_function_statementContext> in_function_statement() {
			return getRuleContexts(In_function_statementContext.class);
		}
		public In_function_statementContext in_function_statement(int i) {
			return getRuleContext(In_function_statementContext.class,i);
		}
		public Define_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterDefine_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitDefine_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitDefine_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_statementContext define_statement() throws RecognitionException {
		Define_statementContext _localctx = new Define_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_define_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(DEFINE);
			setState(100);
			variable();
			setState(101);
			match(OPENBRACKET);
			setState(102);
			args();
			setState(103);
			match(CLOSEBRACKET);
			setState(104);
			match(OPENCURLY);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(105);
				match(NEWLINE);
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111);
				in_function_statement();
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(112);
					match(NEWLINE);
					}
					}
					setState(115); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				}
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BLOCK) | (1L << FOR) | (1L << IF) | (1L << CALL) | (1L << TEXT))) != 0) );
			setState(121);
			match(CLOSECURLY);
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

	public static class In_function_statementContext extends ParserRuleContext {
		public Simple_assignment_statementContext simple_assignment_statement() {
			return getRuleContext(Simple_assignment_statementContext.class,0);
		}
		public Shape_assignment_statementContext shape_assignment_statement() {
			return getRuleContext(Shape_assignment_statementContext.class,0);
		}
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public Call_statementContext call_statement() {
			return getRuleContext(Call_statementContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public In_function_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_function_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterIn_function_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitIn_function_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitIn_function_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_function_statementContext in_function_statement() throws RecognitionException {
		In_function_statementContext _localctx = new In_function_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_in_function_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(123);
				simple_assignment_statement();
				}
				break;
			case 2:
				{
				setState(124);
				shape_assignment_statement();
				}
				break;
			case 3:
				{
				setState(125);
				block_statement();
				}
				break;
			case 4:
				{
				setState(126);
				call_statement();
				}
				break;
			case 5:
				{
				setState(127);
				loop_statement();
				}
				break;
			case 6:
				{
				setState(128);
				if_statement();
				}
				break;
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

	public static class Block_statementContext extends ParserRuleContext {
		public TerminalNode BLOCK() { return getToken(bloqParser.BLOCK, 0); }
		public TerminalNode COLON() { return getToken(bloqParser.COLON, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(bloqParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(bloqParser.NEWLINE, i);
		}
		public List<Block_start_statementContext> block_start_statement() {
			return getRuleContexts(Block_start_statementContext.class);
		}
		public Block_start_statementContext block_start_statement(int i) {
			return getRuleContext(Block_start_statementContext.class,i);
		}
		public List<Block_shape_statementContext> block_shape_statement() {
			return getRuleContexts(Block_shape_statementContext.class);
		}
		public Block_shape_statementContext block_shape_statement(int i) {
			return getRuleContext(Block_shape_statementContext.class,i);
		}
		public Block_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterBlock_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitBlock_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitBlock_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_statementContext block_statement() throws RecognitionException {
		Block_statementContext _localctx = new Block_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(BLOCK);
			setState(132);
			match(COLON);
			setState(133);
			args();
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(134);
					match(NEWLINE);
					setState(137);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case START:
						{
						setState(135);
						block_start_statement();
						}
						break;
					case SHAPE:
						{
						setState(136);
						block_shape_statement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class Block_start_statementContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(bloqParser.START, 0); }
		public TerminalNode COLON() { return getToken(bloqParser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(bloqParser.COMMA, 0); }
		public Block_start_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_start_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterBlock_start_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitBlock_start_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitBlock_start_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_start_statementContext block_start_statement() throws RecognitionException {
		Block_start_statementContext _localctx = new Block_start_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block_start_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(START);
			setState(145);
			match(COLON);
			setState(146);
			expression();
			setState(147);
			match(COMMA);
			setState(148);
			expression();
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

	public static class Block_shape_statementContext extends ParserRuleContext {
		public TerminalNode SHAPE() { return getToken(bloqParser.SHAPE, 0); }
		public TerminalNode COLON() { return getToken(bloqParser.COLON, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(bloqParser.NEWLINE, 0); }
		public List<Shape_rowContext> shape_row() {
			return getRuleContexts(Shape_rowContext.class);
		}
		public Shape_rowContext shape_row(int i) {
			return getRuleContext(Shape_rowContext.class,i);
		}
		public Block_shape_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_shape_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterBlock_shape_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitBlock_shape_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitBlock_shape_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_shape_statementContext block_shape_statement() throws RecognitionException {
		Block_shape_statementContext _localctx = new Block_shape_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block_shape_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(SHAPE);
			setState(151);
			match(COLON);
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(152);
				match(NEWLINE);
				}
				break;
			}
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case NEWLINE:
				{
				setState(156); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(155);
						shape_row();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(158); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				}
				break;
			case TEXT:
				{
				setState(160);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Loop_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(bloqParser.FOR, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode COLON() { return getToken(bloqParser.COLON, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode TO() { return getToken(bloqParser.TO, 0); }
		public TerminalNode OPENCURLY() { return getToken(bloqParser.OPENCURLY, 0); }
		public TerminalNode CLOSECURLY() { return getToken(bloqParser.CLOSECURLY, 0); }
		public TerminalNode OPENBRACKET() { return getToken(bloqParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(bloqParser.CLOSEBRACKET, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(bloqParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(bloqParser.NEWLINE, i);
		}
		public List<In_loop_statementContext> in_loop_statement() {
			return getRuleContexts(In_loop_statementContext.class);
		}
		public In_loop_statementContext in_loop_statement(int i) {
			return getRuleContext(In_loop_statementContext.class,i);
		}
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterLoop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitLoop_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitLoop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_loop_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(FOR);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPENBRACKET) {
				{
				setState(164);
				match(OPENBRACKET);
				}
			}

			setState(167);
			variable();
			setState(168);
			match(COLON);
			setState(169);
			value();
			setState(170);
			match(TO);
			setState(171);
			value();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSEBRACKET) {
				{
				setState(172);
				match(CLOSEBRACKET);
				}
			}

			setState(175);
			match(OPENCURLY);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(176);
				match(NEWLINE);
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(182);
				in_loop_statement();
				setState(184); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(183);
					match(NEWLINE);
					}
					}
					setState(186); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				}
				setState(190); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BLOCK) | (1L << FOR) | (1L << IF) | (1L << CALL) | (1L << TEXT))) != 0) );
			setState(192);
			match(CLOSECURLY);
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

	public static class In_loop_statementContext extends ParserRuleContext {
		public Simple_assignment_statementContext simple_assignment_statement() {
			return getRuleContext(Simple_assignment_statementContext.class,0);
		}
		public Shape_assignment_statementContext shape_assignment_statement() {
			return getRuleContext(Shape_assignment_statementContext.class,0);
		}
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public Call_statementContext call_statement() {
			return getRuleContext(Call_statementContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public In_loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterIn_loop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitIn_loop_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitIn_loop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_loop_statementContext in_loop_statement() throws RecognitionException {
		In_loop_statementContext _localctx = new In_loop_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_in_loop_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(194);
				simple_assignment_statement();
				}
				break;
			case 2:
				{
				setState(195);
				shape_assignment_statement();
				}
				break;
			case 3:
				{
				setState(196);
				block_statement();
				}
				break;
			case 4:
				{
				setState(197);
				call_statement();
				}
				break;
			case 5:
				{
				setState(198);
				loop_statement();
				}
				break;
			case 6:
				{
				setState(199);
				if_statement();
				}
				break;
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(bloqParser.IF, 0); }
		public TerminalNode OPENCURLY() { return getToken(bloqParser.OPENCURLY, 0); }
		public TerminalNode CLOSECURLY() { return getToken(bloqParser.CLOSECURLY, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Linked_conditionContext linked_condition() {
			return getRuleContext(Linked_conditionContext.class,0);
		}
		public TerminalNode OPENBRACKET() { return getToken(bloqParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(bloqParser.CLOSEBRACKET, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(bloqParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(bloqParser.NEWLINE, i);
		}
		public List<In_if_statementContext> in_if_statement() {
			return getRuleContexts(In_if_statementContext.class);
		}
		public In_if_statementContext in_if_statement(int i) {
			return getRuleContext(In_if_statementContext.class,i);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(IF);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPENBRACKET) {
				{
				setState(203);
				match(OPENBRACKET);
				}
			}

			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(206);
				condition();
				}
				break;
			case 2:
				{
				setState(207);
				linked_condition();
				}
				break;
			}
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSEBRACKET) {
				{
				setState(210);
				match(CLOSEBRACKET);
				}
			}

			setState(213);
			match(OPENCURLY);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(214);
				match(NEWLINE);
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(226); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(220);
				in_if_statement();
				setState(222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(221);
					match(NEWLINE);
					}
					}
					setState(224); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				}
				setState(228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BLOCK) | (1L << FOR) | (1L << IF) | (1L << CALL) | (1L << TEXT))) != 0) );
			setState(230);
			match(CLOSECURLY);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(231);
				else_statement();
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

	public static class Else_statementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(bloqParser.ELSE, 0); }
		public TerminalNode OPENCURLY() { return getToken(bloqParser.OPENCURLY, 0); }
		public TerminalNode CLOSECURLY() { return getToken(bloqParser.CLOSECURLY, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(bloqParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(bloqParser.NEWLINE, i);
		}
		public List<In_if_statementContext> in_if_statement() {
			return getRuleContexts(In_if_statementContext.class);
		}
		public In_if_statementContext in_if_statement(int i) {
			return getRuleContext(In_if_statementContext.class,i);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitElse_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitElse_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_else_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(ELSE);
			setState(235);
			match(OPENCURLY);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(236);
				match(NEWLINE);
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(242);
				in_if_statement();
				setState(244); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(243);
					match(NEWLINE);
					}
					}
					setState(246); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				}
				setState(250); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BLOCK) | (1L << FOR) | (1L << IF) | (1L << CALL) | (1L << TEXT))) != 0) );
			setState(252);
			match(CLOSECURLY);
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

	public static class In_if_statementContext extends ParserRuleContext {
		public Simple_assignment_statementContext simple_assignment_statement() {
			return getRuleContext(Simple_assignment_statementContext.class,0);
		}
		public Shape_assignment_statementContext shape_assignment_statement() {
			return getRuleContext(Shape_assignment_statementContext.class,0);
		}
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public Call_statementContext call_statement() {
			return getRuleContext(Call_statementContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public In_if_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterIn_if_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitIn_if_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitIn_if_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_if_statementContext in_if_statement() throws RecognitionException {
		In_if_statementContext _localctx = new In_if_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_in_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(254);
				simple_assignment_statement();
				}
				break;
			case 2:
				{
				setState(255);
				shape_assignment_statement();
				}
				break;
			case 3:
				{
				setState(256);
				block_statement();
				}
				break;
			case 4:
				{
				setState(257);
				call_statement();
				}
				break;
			case 5:
				{
				setState(258);
				loop_statement();
				}
				break;
			case 6:
				{
				setState(259);
				if_statement();
				}
				break;
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

	public static class Linked_conditionContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<Logic_operatorContext> logic_operator() {
			return getRuleContexts(Logic_operatorContext.class);
		}
		public Logic_operatorContext logic_operator(int i) {
			return getRuleContext(Logic_operatorContext.class,i);
		}
		public Linked_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linked_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterLinked_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitLinked_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitLinked_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Linked_conditionContext linked_condition() throws RecognitionException {
		Linked_conditionContext _localctx = new Linked_conditionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_linked_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(262);
			condition();
			setState(266); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(263);
				logic_operator();
				setState(264);
				condition();
				}
				}
				setState(268); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AND || _la==OR );
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

	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public TerminalNode NOT() { return getToken(bloqParser.NOT, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(270);
				match(NOT);
				}
			}

			setState(273);
			expression();
			setState(274);
			comparator();
			setState(275);
			expression();
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
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(277);
			value();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULO))) != 0)) {
				{
				{
				setState(278);
				operator();
				setState(279);
				value();
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(bloqParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(bloqParser.COMMA, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(286);
			value();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(287);
				match(COMMA);
				setState(288);
				value();
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Shape_rowContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(bloqParser.NUMBER, 0); }
		public TerminalNode SEMICOLON() { return getToken(bloqParser.SEMICOLON, 0); }
		public TerminalNode NEWLINE() { return getToken(bloqParser.NEWLINE, 0); }
		public Shape_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterShape_row(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitShape_row(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitShape_row(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shape_rowContext shape_row() throws RecognitionException {
		Shape_rowContext _localctx = new Shape_rowContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_shape_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(294);
				match(NEWLINE);
				}
			}

			setState(297);
			match(NUMBER);
			setState(298);
			match(SEMICOLON);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(bloqParser.TEXT, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(TEXT);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(bloqParser.NUMBER, 0); }
		public TerminalNode TEXT() { return getToken(bloqParser.TEXT, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class ComparatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(bloqParser.EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(bloqParser.GREATER, 0); }
		public TerminalNode GREATEREQ() { return getToken(bloqParser.GREATEREQ, 0); }
		public TerminalNode LESS() { return getToken(bloqParser.LESS, 0); }
		public TerminalNode LESSRQ() { return getToken(bloqParser.LESSRQ, 0); }
		public TerminalNode NOTEQ() { return getToken(bloqParser.NOTEQ, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitComparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << GREATER) | (1L << GREATEREQ) | (1L << LESS) | (1L << LESSRQ) | (1L << NOTEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(bloqParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(bloqParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(bloqParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(bloqParser.DIVIDE, 0); }
		public TerminalNode MODULO() { return getToken(bloqParser.MODULO, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class Logic_operatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(bloqParser.AND, 0); }
		public TerminalNode OR() { return getToken(bloqParser.OR, 0); }
		public Logic_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterLogic_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitLogic_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitLogic_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_operatorContext logic_operator() throws RecognitionException {
		Logic_operatorContext _localctx = new Logic_operatorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_logic_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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
		"\u0004\u0001#\u0137\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0004\u00006\b\u0000\u000b\u0000"+
		"\f\u00007\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001B\b\u0001\u0001\u0001"+
		"\u0004\u0001E\b\u0001\u000b\u0001\f\u0001F\u0001\u0001\u0003\u0001J\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0004\u0004Z\b\u0004\u000b\u0004\f\u0004"+
		"[\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006k\b\u0006\n\u0006\f\u0006n\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0004\u0006r\b\u0006\u000b\u0006\f\u0006s\u0004\u0006v\b"+
		"\u0006\u000b\u0006\f\u0006w\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0082"+
		"\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u008a"+
		"\b\b\u0005\b\u008c\b\b\n\b\f\b\u008f\t\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0003\n\u009a\b\n\u0001\n\u0004"+
		"\n\u009d\b\n\u000b\n\f\n\u009e\u0001\n\u0003\n\u00a2\b\n\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00a6\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00ae\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00b2\b\u000b\n\u000b\f\u000b\u00b5\t\u000b\u0001\u000b"+
		"\u0001\u000b\u0004\u000b\u00b9\b\u000b\u000b\u000b\f\u000b\u00ba\u0004"+
		"\u000b\u00bd\b\u000b\u000b\u000b\f\u000b\u00be\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00c9\b\f\u0001"+
		"\r\u0001\r\u0003\r\u00cd\b\r\u0001\r\u0001\r\u0003\r\u00d1\b\r\u0001\r"+
		"\u0003\r\u00d4\b\r\u0001\r\u0001\r\u0005\r\u00d8\b\r\n\r\f\r\u00db\t\r"+
		"\u0001\r\u0001\r\u0004\r\u00df\b\r\u000b\r\f\r\u00e0\u0004\r\u00e3\b\r"+
		"\u000b\r\f\r\u00e4\u0001\r\u0001\r\u0003\r\u00e9\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u00ee\b\u000e\n\u000e\f\u000e\u00f1\t\u000e"+
		"\u0001\u000e\u0001\u000e\u0004\u000e\u00f5\b\u000e\u000b\u000e\f\u000e"+
		"\u00f6\u0004\u000e\u00f9\b\u000e\u000b\u000e\f\u000e\u00fa\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u0105\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0004\u0010\u010b\b\u0010\u000b\u0010\f\u0010\u010c\u0001"+
		"\u0011\u0003\u0011\u0110\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u011a"+
		"\b\u0012\n\u0012\f\u0012\u011d\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u0122\b\u0013\n\u0013\f\u0013\u0125\t\u0013\u0001\u0014\u0003"+
		"\u0014\u0128\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0000\u0000\u001a\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02\u0000\u0004\u0001\u0000\u0019\u001a\u0001\u0000\u000b\u0010"+
		"\u0001\u0000\u0014\u0018\u0001\u0000\u0011\u0012\u0152\u00005\u0001\u0000"+
		"\u0000\u0000\u0002A\u0001\u0000\u0000\u0000\u0004K\u0001\u0000\u0000\u0000"+
		"\u0006Q\u0001\u0000\u0000\u0000\bU\u0001\u0000\u0000\u0000\n]\u0001\u0000"+
		"\u0000\u0000\fc\u0001\u0000\u0000\u0000\u000e\u0081\u0001\u0000\u0000"+
		"\u0000\u0010\u0083\u0001\u0000\u0000\u0000\u0012\u0090\u0001\u0000\u0000"+
		"\u0000\u0014\u0096\u0001\u0000\u0000\u0000\u0016\u00a3\u0001\u0000\u0000"+
		"\u0000\u0018\u00c8\u0001\u0000\u0000\u0000\u001a\u00ca\u0001\u0000\u0000"+
		"\u0000\u001c\u00ea\u0001\u0000\u0000\u0000\u001e\u0104\u0001\u0000\u0000"+
		"\u0000 \u0106\u0001\u0000\u0000\u0000\"\u010f\u0001\u0000\u0000\u0000"+
		"$\u0115\u0001\u0000\u0000\u0000&\u011e\u0001\u0000\u0000\u0000(\u0127"+
		"\u0001\u0000\u0000\u0000*\u012c\u0001\u0000\u0000\u0000,\u012e\u0001\u0000"+
		"\u0000\u0000.\u0130\u0001\u0000\u0000\u00000\u0132\u0001\u0000\u0000\u0000"+
		"2\u0134\u0001\u0000\u0000\u000046\u0003\u0002\u0001\u000054\u0001\u0000"+
		"\u0000\u000067\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001"+
		"\u0000\u0000\u00008\u0001\u0001\u0000\u0000\u00009B\u0003\u0004\u0002"+
		"\u0000:B\u0003\u0006\u0003\u0000;B\u0003\b\u0004\u0000<B\u0003\f\u0006"+
		"\u0000=B\u0003\n\u0005\u0000>B\u0003\u0010\b\u0000?B\u0003\u0016\u000b"+
		"\u0000@B\u0003\u001a\r\u0000A9\u0001\u0000\u0000\u0000A:\u0001\u0000\u0000"+
		"\u0000A;\u0001\u0000\u0000\u0000A<\u0001\u0000\u0000\u0000A=\u0001\u0000"+
		"\u0000\u0000A>\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000A@\u0001"+
		"\u0000\u0000\u0000BI\u0001\u0000\u0000\u0000CE\u0005\"\u0000\u0000DC\u0001"+
		"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000"+
		"FG\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000"+
		"\u0000ID\u0001\u0000\u0000\u0000IH\u0001\u0000\u0000\u0000J\u0003\u0001"+
		"\u0000\u0000\u0000KL\u0005\u0001\u0000\u0000LM\u0005\u001b\u0000\u0000"+
		"MN\u0005\u0019\u0000\u0000NO\u0005\u001d\u0000\u0000OP\u0005\u0019\u0000"+
		"\u0000P\u0005\u0001\u0000\u0000\u0000QR\u0003*\u0015\u0000RS\u0005\u001b"+
		"\u0000\u0000ST\u0003$\u0012\u0000T\u0007\u0001\u0000\u0000\u0000UV\u0003"+
		"*\u0015\u0000VW\u0005\u001b\u0000\u0000WY\u0005\"\u0000\u0000XZ\u0003"+
		"(\u0014\u0000YX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\t\u0001\u0000\u0000\u0000"+
		"]^\u0005\t\u0000\u0000^_\u0003*\u0015\u0000_`\u0005 \u0000\u0000`a\u0003"+
		"&\u0013\u0000ab\u0005!\u0000\u0000b\u000b\u0001\u0000\u0000\u0000cd\u0005"+
		"\b\u0000\u0000de\u0003*\u0015\u0000ef\u0005 \u0000\u0000fg\u0003&\u0013"+
		"\u0000gh\u0005!\u0000\u0000hl\u0005\u001e\u0000\u0000ik\u0005\"\u0000"+
		"\u0000ji\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000mu\u0001\u0000\u0000\u0000nl\u0001"+
		"\u0000\u0000\u0000oq\u0003\u000e\u0007\u0000pr\u0005\"\u0000\u0000qp\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000"+
		"st\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000\u0000uo\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0005\u001f\u0000\u0000z\r\u0001"+
		"\u0000\u0000\u0000{\u0082\u0003\u0006\u0003\u0000|\u0082\u0003\b\u0004"+
		"\u0000}\u0082\u0003\u0010\b\u0000~\u0082\u0003\n\u0005\u0000\u007f\u0082"+
		"\u0003\u0016\u000b\u0000\u0080\u0082\u0003\u001a\r\u0000\u0081{\u0001"+
		"\u0000\u0000\u0000\u0081|\u0001\u0000\u0000\u0000\u0081}\u0001\u0000\u0000"+
		"\u0000\u0081~\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000"+
		"\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u000f\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0005\u0002\u0000\u0000\u0084\u0085\u0005\u001b\u0000\u0000"+
		"\u0085\u008d\u0003&\u0013\u0000\u0086\u0089\u0005\"\u0000\u0000\u0087"+
		"\u008a\u0003\u0012\t\u0000\u0088\u008a\u0003\u0014\n\u0000\u0089\u0087"+
		"\u0001\u0000\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u008c"+
		"\u0001\u0000\u0000\u0000\u008b\u0086\u0001\u0000\u0000\u0000\u008c\u008f"+
		"\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0001\u0000\u0000\u0000\u008e\u0011\u0001\u0000\u0000\u0000\u008f\u008d"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u0003\u0000\u0000\u0091\u0092"+
		"\u0005\u001b\u0000\u0000\u0092\u0093\u0003$\u0012\u0000\u0093\u0094\u0005"+
		"\u001d\u0000\u0000\u0094\u0095\u0003$\u0012\u0000\u0095\u0013\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0005\u0005\u0000\u0000\u0097\u0099\u0005\u001b"+
		"\u0000\u0000\u0098\u009a\u0005\"\u0000\u0000\u0099\u0098\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u00a1\u0001\u0000\u0000"+
		"\u0000\u009b\u009d\u0003(\u0014\u0000\u009c\u009b\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a2\u0003*\u0015\u0000\u00a1\u009c\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a2\u0015\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a5\u0005\u0004\u0000\u0000\u00a4\u00a6\u0005 \u0000\u0000\u00a5\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0003*\u0015\u0000\u00a8\u00a9\u0005"+
		"\u001b\u0000\u0000\u00a9\u00aa\u0003,\u0016\u0000\u00aa\u00ab\u0005\u0007"+
		"\u0000\u0000\u00ab\u00ad\u0003,\u0016\u0000\u00ac\u00ae\u0005!\u0000\u0000"+
		"\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b3\u0005\u001e\u0000\u0000"+
		"\u00b0\u00b2\u0005\"\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b4\u00bc\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b8\u0003\u0018\f\u0000\u00b7\u00b9"+
		"\u0005\"\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001"+
		"\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00b6\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bc\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0005\u001f\u0000\u0000\u00c1\u0017\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c9\u0003\u0006\u0003\u0000\u00c3\u00c9\u0003"+
		"\b\u0004\u0000\u00c4\u00c9\u0003\u0010\b\u0000\u00c5\u00c9\u0003\n\u0005"+
		"\u0000\u00c6\u00c9\u0003\u0016\u000b\u0000\u00c7\u00c9\u0003\u001a\r\u0000"+
		"\u00c8\u00c2\u0001\u0000\u0000\u0000\u00c8\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c4\u0001\u0000\u0000\u0000\u00c8\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c9\u0019\u0001\u0000\u0000\u0000\u00ca\u00cc\u0005\u0006\u0000\u0000"+
		"\u00cb\u00cd\u0005 \u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce"+
		"\u00d1\u0003\"\u0011\u0000\u00cf\u00d1\u0003 \u0010\u0000\u00d0\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d4\u0005!\u0000\u0000\u00d3\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d9\u0005\u001e\u0000\u0000\u00d6\u00d8\u0005"+
		"\"\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8\u00db\u0001\u0000"+
		"\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000"+
		"\u0000\u0000\u00da\u00e2\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000"+
		"\u0000\u0000\u00dc\u00de\u0003\u001e\u000f\u0000\u00dd\u00df\u0005\"\u0000"+
		"\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e3\u0001\u0000\u0000\u0000\u00e2\u00dc\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e8\u0005\u001f\u0000\u0000\u00e7\u00e9\u0003\u001c\u000e"+
		"\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e9\u001b\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005\n\u0000\u0000"+
		"\u00eb\u00ef\u0005\u001e\u0000\u0000\u00ec\u00ee\u0005\"\u0000\u0000\u00ed"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f8\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f4\u0003\u001e\u000f\u0000\u00f3\u00f5\u0005\"\u0000\u0000\u00f4\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f9"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f2\u0001\u0000\u0000\u0000\u00f9\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd"+
		"\u0005\u001f\u0000\u0000\u00fd\u001d\u0001\u0000\u0000\u0000\u00fe\u0105"+
		"\u0003\u0006\u0003\u0000\u00ff\u0105\u0003\b\u0004\u0000\u0100\u0105\u0003"+
		"\u0010\b\u0000\u0101\u0105\u0003\n\u0005\u0000\u0102\u0105\u0003\u0016"+
		"\u000b\u0000\u0103\u0105\u0003\u001a\r\u0000\u0104\u00fe\u0001\u0000\u0000"+
		"\u0000\u0104\u00ff\u0001\u0000\u0000\u0000\u0104\u0100\u0001\u0000\u0000"+
		"\u0000\u0104\u0101\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000"+
		"\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0105\u001f\u0001\u0000\u0000"+
		"\u0000\u0106\u010a\u0003\"\u0011\u0000\u0107\u0108\u00032\u0019\u0000"+
		"\u0108\u0109\u0003\"\u0011\u0000\u0109\u010b\u0001\u0000\u0000\u0000\u010a"+
		"\u0107\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c"+
		"\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d"+
		"!\u0001\u0000\u0000\u0000\u010e\u0110\u0005\u0013\u0000\u0000\u010f\u010e"+
		"\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0111"+
		"\u0001\u0000\u0000\u0000\u0111\u0112\u0003$\u0012\u0000\u0112\u0113\u0003"+
		".\u0017\u0000\u0113\u0114\u0003$\u0012\u0000\u0114#\u0001\u0000\u0000"+
		"\u0000\u0115\u011b\u0003,\u0016\u0000\u0116\u0117\u00030\u0018\u0000\u0117"+
		"\u0118\u0003,\u0016\u0000\u0118\u011a\u0001\u0000\u0000\u0000\u0119\u0116"+
		"\u0001\u0000\u0000\u0000\u011a\u011d\u0001\u0000\u0000\u0000\u011b\u0119"+
		"\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c%\u0001"+
		"\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011e\u0123\u0003"+
		",\u0016\u0000\u011f\u0120\u0005\u001d\u0000\u0000\u0120\u0122\u0003,\u0016"+
		"\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0122\u0125\u0001\u0000\u0000"+
		"\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000"+
		"\u0000\u0124\'\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000"+
		"\u0126\u0128\u0005\"\u0000\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0127"+
		"\u0128\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129"+
		"\u012a\u0005\u0019\u0000\u0000\u012a\u012b\u0005\u001c\u0000\u0000\u012b"+
		")\u0001\u0000\u0000\u0000\u012c\u012d\u0005\u001a\u0000\u0000\u012d+\u0001"+
		"\u0000\u0000\u0000\u012e\u012f\u0007\u0000\u0000\u0000\u012f-\u0001\u0000"+
		"\u0000\u0000\u0130\u0131\u0007\u0001\u0000\u0000\u0131/\u0001\u0000\u0000"+
		"\u0000\u0132\u0133\u0007\u0002\u0000\u0000\u01331\u0001\u0000\u0000\u0000"+
		"\u0134\u0135\u0007\u0003\u0000\u0000\u01353\u0001\u0000\u0000\u0000$7"+
		"AFI[lsw\u0081\u0089\u008d\u0099\u009e\u00a1\u00a5\u00ad\u00b3\u00ba\u00be"+
		"\u00c8\u00cc\u00d0\u00d3\u00d9\u00e0\u00e4\u00e8\u00ef\u00f6\u00fa\u0104"+
		"\u010c\u010f\u011b\u0123\u0127";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}