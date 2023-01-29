// Generated from /home/samin/Desktop/week_1/sub/hyplc-st-to-hp/hyplc-st-to-hp/IECSTGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IECSTGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, Binary_literal=52, 
		Octal_literal=53, Decimal_literal=54, Pure_decimal_digits=55, Hexadecimal_literal=56, 
		Floating_point_literal=57, ID=58, WS=59, Block_comment=60, ANY=61;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
			"T__49", "T__50", "Binary_literal", "Binary_digit", "Binary_literal_character", 
			"Binary_literal_characters", "Octal_literal", "Octal_digit", "Octal_literal_character", 
			"Octal_literal_characters", "Decimal_literal", "Pure_decimal_digits", 
			"Decimal_digit", "Decimal_literal_character", "Decimal_literal_characters", 
			"Hexadecimal_literal", "Hexadecimal_digit", "Hexadecimal_literal_character", 
			"Hexadecimal_literal_characters", "Floating_point_literal", "Decimal_fraction", 
			"Decimal_exponent", "Floating_point_e", "Floating_point_p", "Sign", "ID", 
			"WS", "Block_comment", "ANY"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "'END_PROGRAM'", "'CONFIGURATION'", "'END_CONFIGURATION'", 
			"'RESOURCE'", "'ON'", "'END_RESOURCE'", "';'", "'TASK'", "'('", "'SINGLE'", 
			"':='", "','", "'INTERVAL'", "'PRIORITY'", "')'", "'T'", "'#'", "'s'", 
			"'ms'", "'us'", "'WITH'", "':'", "'VAR'", "'END_TYPE'", "'VAR_INPUT'", 
			"'VAR_OUTPUT'", "'END_VAR'", "'IF'", "'THEN'", "'ELSIF'", "'ELSE'", "'END_IF'", 
			"'OR'", "'XOR'", "'&'", "'AND'", "'='", "'<>'", "'<'", "'>'", "'<='", 
			"'>='", "'+'", "'-'", "'*'", "'/'", "'**'", "'NOT'", "'TRUE'", "'FALSE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "Binary_literal", "Octal_literal", "Decimal_literal", 
			"Pure_decimal_digits", "Hexadecimal_literal", "Floating_point_literal", 
			"ID", "WS", "Block_comment", "ANY"
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


	public IECSTGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IECSTGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2?\u0225\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3%\3%\3&\3&\3&\3"+
		"&\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3\60"+
		"\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\5\65\u01a8\n\65\3\66"+
		"\3\66\3\67\3\67\5\67\u01ae\n\67\38\68\u01b1\n8\r8\168\u01b2\39\39\39\3"+
		"9\39\59\u01ba\n9\3:\3:\3;\3;\5;\u01c0\n;\3<\6<\u01c3\n<\r<\16<\u01c4\3"+
		"=\3=\7=\u01c9\n=\f=\16=\u01cc\13=\3>\6>\u01cf\n>\r>\16>\u01d0\3?\3?\3"+
		"@\3@\5@\u01d7\n@\3A\6A\u01da\nA\rA\16A\u01db\3B\3B\3B\3B\3B\3B\5B\u01e4"+
		"\nB\3C\3C\3D\3D\5D\u01ea\nD\3E\6E\u01ed\nE\rE\16E\u01ee\3F\3F\5F\u01f3"+
		"\nF\3F\5F\u01f6\nF\3G\3G\3G\3H\3H\5H\u01fd\nH\3H\3H\3I\3I\3J\3J\3K\3K"+
		"\3L\3L\7L\u0209\nL\fL\16L\u020c\13L\3M\6M\u020f\nM\rM\16M\u0210\3M\3M"+
		"\3N\3N\3N\3N\3N\7N\u021a\nN\fN\16N\u021d\13N\3N\3N\3N\3N\3N\3O\3O\3\u021b"+
		"\2P\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\2"+
		"m\2o\2q\67s\2u\2w\2y8{9}\2\177\2\u0081\2\u0083:\u0085\2\u0087\2\u0089"+
		"\2\u008b;\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097<\u0099=\u009b"+
		">\u009d?\3\2\r\3\2\62\63\3\2\629\3\2\62;\4\2\62;aa\5\2\62;CHch\4\2GGg"+
		"g\4\2RRrr\4\2--//\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u0227\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2q\3\2\2\2\2y\3\2\2\2"+
		"\2{\3\2\2\2\2\u0083\3\2\2\2\2\u008b\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3"+
		"\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\3\u009f\3\2\2\2\5\u00a7\3\2\2\2"+
		"\7\u00b3\3\2\2\2\t\u00c1\3\2\2\2\13\u00d3\3\2\2\2\r\u00dc\3\2\2\2\17\u00df"+
		"\3\2\2\2\21\u00ec\3\2\2\2\23\u00ee\3\2\2\2\25\u00f3\3\2\2\2\27\u00f5\3"+
		"\2\2\2\31\u00fc\3\2\2\2\33\u00ff\3\2\2\2\35\u0101\3\2\2\2\37\u010a\3\2"+
		"\2\2!\u0113\3\2\2\2#\u0115\3\2\2\2%\u0117\3\2\2\2\'\u0119\3\2\2\2)\u011b"+
		"\3\2\2\2+\u011e\3\2\2\2-\u0121\3\2\2\2/\u0126\3\2\2\2\61\u0128\3\2\2\2"+
		"\63\u012c\3\2\2\2\65\u0135\3\2\2\2\67\u013f\3\2\2\29\u014a\3\2\2\2;\u0152"+
		"\3\2\2\2=\u0155\3\2\2\2?\u015a\3\2\2\2A\u0160\3\2\2\2C\u0165\3\2\2\2E"+
		"\u016c\3\2\2\2G\u016f\3\2\2\2I\u0173\3\2\2\2K\u0175\3\2\2\2M\u0179\3\2"+
		"\2\2O\u017b\3\2\2\2Q\u017e\3\2\2\2S\u0180\3\2\2\2U\u0182\3\2\2\2W\u0185"+
		"\3\2\2\2Y\u0188\3\2\2\2[\u018a\3\2\2\2]\u018c\3\2\2\2_\u018e\3\2\2\2a"+
		"\u0190\3\2\2\2c\u0193\3\2\2\2e\u0197\3\2\2\2g\u019c\3\2\2\2i\u01a2\3\2"+
		"\2\2k\u01a9\3\2\2\2m\u01ad\3\2\2\2o\u01b0\3\2\2\2q\u01b4\3\2\2\2s\u01bb"+
		"\3\2\2\2u\u01bf\3\2\2\2w\u01c2\3\2\2\2y\u01c6\3\2\2\2{\u01ce\3\2\2\2}"+
		"\u01d2\3\2\2\2\177\u01d6\3\2\2\2\u0081\u01d9\3\2\2\2\u0083\u01dd\3\2\2"+
		"\2\u0085\u01e5\3\2\2\2\u0087\u01e9\3\2\2\2\u0089\u01ec\3\2\2\2\u008b\u01f0"+
		"\3\2\2\2\u008d\u01f7\3\2\2\2\u008f\u01fa\3\2\2\2\u0091\u0200\3\2\2\2\u0093"+
		"\u0202\3\2\2\2\u0095\u0204\3\2\2\2\u0097\u0206\3\2\2\2\u0099\u020e\3\2"+
		"\2\2\u009b\u0214\3\2\2\2\u009d\u0223\3\2\2\2\u009f\u00a0\7R\2\2\u00a0"+
		"\u00a1\7T\2\2\u00a1\u00a2\7Q\2\2\u00a2\u00a3\7I\2\2\u00a3\u00a4\7T\2\2"+
		"\u00a4\u00a5\7C\2\2\u00a5\u00a6\7O\2\2\u00a6\4\3\2\2\2\u00a7\u00a8\7G"+
		"\2\2\u00a8\u00a9\7P\2\2\u00a9\u00aa\7F\2\2\u00aa\u00ab\7a\2\2\u00ab\u00ac"+
		"\7R\2\2\u00ac\u00ad\7T\2\2\u00ad\u00ae\7Q\2\2\u00ae\u00af\7I\2\2\u00af"+
		"\u00b0\7T\2\2\u00b0\u00b1\7C\2\2\u00b1\u00b2\7O\2\2\u00b2\6\3\2\2\2\u00b3"+
		"\u00b4\7E\2\2\u00b4\u00b5\7Q\2\2\u00b5\u00b6\7P\2\2\u00b6\u00b7\7H\2\2"+
		"\u00b7\u00b8\7K\2\2\u00b8\u00b9\7I\2\2\u00b9\u00ba\7W\2\2\u00ba\u00bb"+
		"\7T\2\2\u00bb\u00bc\7C\2\2\u00bc\u00bd\7V\2\2\u00bd\u00be\7K\2\2\u00be"+
		"\u00bf\7Q\2\2\u00bf\u00c0\7P\2\2\u00c0\b\3\2\2\2\u00c1\u00c2\7G\2\2\u00c2"+
		"\u00c3\7P\2\2\u00c3\u00c4\7F\2\2\u00c4\u00c5\7a\2\2\u00c5\u00c6\7E\2\2"+
		"\u00c6\u00c7\7Q\2\2\u00c7\u00c8\7P\2\2\u00c8\u00c9\7H\2\2\u00c9\u00ca"+
		"\7K\2\2\u00ca\u00cb\7I\2\2\u00cb\u00cc\7W\2\2\u00cc\u00cd\7T\2\2\u00cd"+
		"\u00ce\7C\2\2\u00ce\u00cf\7V\2\2\u00cf\u00d0\7K\2\2\u00d0\u00d1\7Q\2\2"+
		"\u00d1\u00d2\7P\2\2\u00d2\n\3\2\2\2\u00d3\u00d4\7T\2\2\u00d4\u00d5\7G"+
		"\2\2\u00d5\u00d6\7U\2\2\u00d6\u00d7\7Q\2\2\u00d7\u00d8\7W\2\2\u00d8\u00d9"+
		"\7T\2\2\u00d9\u00da\7E\2\2\u00da\u00db\7G\2\2\u00db\f\3\2\2\2\u00dc\u00dd"+
		"\7Q\2\2\u00dd\u00de\7P\2\2\u00de\16\3\2\2\2\u00df\u00e0\7G\2\2\u00e0\u00e1"+
		"\7P\2\2\u00e1\u00e2\7F\2\2\u00e2\u00e3\7a\2\2\u00e3\u00e4\7T\2\2\u00e4"+
		"\u00e5\7G\2\2\u00e5\u00e6\7U\2\2\u00e6\u00e7\7Q\2\2\u00e7\u00e8\7W\2\2"+
		"\u00e8\u00e9\7T\2\2\u00e9\u00ea\7E\2\2\u00ea\u00eb\7G\2\2\u00eb\20\3\2"+
		"\2\2\u00ec\u00ed\7=\2\2\u00ed\22\3\2\2\2\u00ee\u00ef\7V\2\2\u00ef\u00f0"+
		"\7C\2\2\u00f0\u00f1\7U\2\2\u00f1\u00f2\7M\2\2\u00f2\24\3\2\2\2\u00f3\u00f4"+
		"\7*\2\2\u00f4\26\3\2\2\2\u00f5\u00f6\7U\2\2\u00f6\u00f7\7K\2\2\u00f7\u00f8"+
		"\7P\2\2\u00f8\u00f9\7I\2\2\u00f9\u00fa\7N\2\2\u00fa\u00fb\7G\2\2\u00fb"+
		"\30\3\2\2\2\u00fc\u00fd\7<\2\2\u00fd\u00fe\7?\2\2\u00fe\32\3\2\2\2\u00ff"+
		"\u0100\7.\2\2\u0100\34\3\2\2\2\u0101\u0102\7K\2\2\u0102\u0103\7P\2\2\u0103"+
		"\u0104\7V\2\2\u0104\u0105\7G\2\2\u0105\u0106\7T\2\2\u0106\u0107\7X\2\2"+
		"\u0107\u0108\7C\2\2\u0108\u0109\7N\2\2\u0109\36\3\2\2\2\u010a\u010b\7"+
		"R\2\2\u010b\u010c\7T\2\2\u010c\u010d\7K\2\2\u010d\u010e\7Q\2\2\u010e\u010f"+
		"\7T\2\2\u010f\u0110\7K\2\2\u0110\u0111\7V\2\2\u0111\u0112\7[\2\2\u0112"+
		" \3\2\2\2\u0113\u0114\7+\2\2\u0114\"\3\2\2\2\u0115\u0116\7V\2\2\u0116"+
		"$\3\2\2\2\u0117\u0118\7%\2\2\u0118&\3\2\2\2\u0119\u011a\7u\2\2\u011a("+
		"\3\2\2\2\u011b\u011c\7o\2\2\u011c\u011d\7u\2\2\u011d*\3\2\2\2\u011e\u011f"+
		"\7w\2\2\u011f\u0120\7u\2\2\u0120,\3\2\2\2\u0121\u0122\7Y\2\2\u0122\u0123"+
		"\7K\2\2\u0123\u0124\7V\2\2\u0124\u0125\7J\2\2\u0125.\3\2\2\2\u0126\u0127"+
		"\7<\2\2\u0127\60\3\2\2\2\u0128\u0129\7X\2\2\u0129\u012a\7C\2\2\u012a\u012b"+
		"\7T\2\2\u012b\62\3\2\2\2\u012c\u012d\7G\2\2\u012d\u012e\7P\2\2\u012e\u012f"+
		"\7F\2\2\u012f\u0130\7a\2\2\u0130\u0131\7V\2\2\u0131\u0132\7[\2\2\u0132"+
		"\u0133\7R\2\2\u0133\u0134\7G\2\2\u0134\64\3\2\2\2\u0135\u0136\7X\2\2\u0136"+
		"\u0137\7C\2\2\u0137\u0138\7T\2\2\u0138\u0139\7a\2\2\u0139\u013a\7K\2\2"+
		"\u013a\u013b\7P\2\2\u013b\u013c\7R\2\2\u013c\u013d\7W\2\2\u013d\u013e"+
		"\7V\2\2\u013e\66\3\2\2\2\u013f\u0140\7X\2\2\u0140\u0141\7C\2\2\u0141\u0142"+
		"\7T\2\2\u0142\u0143\7a\2\2\u0143\u0144\7Q\2\2\u0144\u0145\7W\2\2\u0145"+
		"\u0146\7V\2\2\u0146\u0147\7R\2\2\u0147\u0148\7W\2\2\u0148\u0149\7V\2\2"+
		"\u01498\3\2\2\2\u014a\u014b\7G\2\2\u014b\u014c\7P\2\2\u014c\u014d\7F\2"+
		"\2\u014d\u014e\7a\2\2\u014e\u014f\7X\2\2\u014f\u0150\7C\2\2\u0150\u0151"+
		"\7T\2\2\u0151:\3\2\2\2\u0152\u0153\7K\2\2\u0153\u0154\7H\2\2\u0154<\3"+
		"\2\2\2\u0155\u0156\7V\2\2\u0156\u0157\7J\2\2\u0157\u0158\7G\2\2\u0158"+
		"\u0159\7P\2\2\u0159>\3\2\2\2\u015a\u015b\7G\2\2\u015b\u015c\7N\2\2\u015c"+
		"\u015d\7U\2\2\u015d\u015e\7K\2\2\u015e\u015f\7H\2\2\u015f@\3\2\2\2\u0160"+
		"\u0161\7G\2\2\u0161\u0162\7N\2\2\u0162\u0163\7U\2\2\u0163\u0164\7G\2\2"+
		"\u0164B\3\2\2\2\u0165\u0166\7G\2\2\u0166\u0167\7P\2\2\u0167\u0168\7F\2"+
		"\2\u0168\u0169\7a\2\2\u0169\u016a\7K\2\2\u016a\u016b\7H\2\2\u016bD\3\2"+
		"\2\2\u016c\u016d\7Q\2\2\u016d\u016e\7T\2\2\u016eF\3\2\2\2\u016f\u0170"+
		"\7Z\2\2\u0170\u0171\7Q\2\2\u0171\u0172\7T\2\2\u0172H\3\2\2\2\u0173\u0174"+
		"\7(\2\2\u0174J\3\2\2\2\u0175\u0176\7C\2\2\u0176\u0177\7P\2\2\u0177\u0178"+
		"\7F\2\2\u0178L\3\2\2\2\u0179\u017a\7?\2\2\u017aN\3\2\2\2\u017b\u017c\7"+
		">\2\2\u017c\u017d\7@\2\2\u017dP\3\2\2\2\u017e\u017f\7>\2\2\u017fR\3\2"+
		"\2\2\u0180\u0181\7@\2\2\u0181T\3\2\2\2\u0182\u0183\7>\2\2\u0183\u0184"+
		"\7?\2\2\u0184V\3\2\2\2\u0185\u0186\7@\2\2\u0186\u0187\7?\2\2\u0187X\3"+
		"\2\2\2\u0188\u0189\7-\2\2\u0189Z\3\2\2\2\u018a\u018b\7/\2\2\u018b\\\3"+
		"\2\2\2\u018c\u018d\7,\2\2\u018d^\3\2\2\2\u018e\u018f\7\61\2\2\u018f`\3"+
		"\2\2\2\u0190\u0191\7,\2\2\u0191\u0192\7,\2\2\u0192b\3\2\2\2\u0193\u0194"+
		"\7P\2\2\u0194\u0195\7Q\2\2\u0195\u0196\7V\2\2\u0196d\3\2\2\2\u0197\u0198"+
		"\7V\2\2\u0198\u0199\7T\2\2\u0199\u019a\7W\2\2\u019a\u019b\7G\2\2\u019b"+
		"f\3\2\2\2\u019c\u019d\7H\2\2\u019d\u019e\7C\2\2\u019e\u019f\7N\2\2\u019f"+
		"\u01a0\7U\2\2\u01a0\u01a1\7G\2\2\u01a1h\3\2\2\2\u01a2\u01a3\7\64\2\2\u01a3"+
		"\u01a4\7%\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\5k\66\2\u01a6\u01a8\5o8"+
		"\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8j\3\2\2\2\u01a9\u01aa"+
		"\t\2\2\2\u01aal\3\2\2\2\u01ab\u01ae\5k\66\2\u01ac\u01ae\7a\2\2\u01ad\u01ab"+
		"\3\2\2\2\u01ad\u01ac\3\2\2\2\u01aen\3\2\2\2\u01af\u01b1\5m\67\2\u01b0"+
		"\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2"+
		"\2\2\u01b3p\3\2\2\2\u01b4\u01b5\7:\2\2\u01b5\u01b6\7%\2\2\u01b6\u01b7"+
		"\3\2\2\2\u01b7\u01b9\5s:\2\u01b8\u01ba\5w<\2\u01b9\u01b8\3\2\2\2\u01b9"+
		"\u01ba\3\2\2\2\u01bar\3\2\2\2\u01bb\u01bc\t\3\2\2\u01bct\3\2\2\2\u01bd"+
		"\u01c0\5s:\2\u01be\u01c0\7a\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01be\3\2\2"+
		"\2\u01c0v\3\2\2\2\u01c1\u01c3\5u;\2\u01c2\u01c1\3\2\2\2\u01c3\u01c4\3"+
		"\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5x\3\2\2\2\u01c6\u01ca"+
		"\t\4\2\2\u01c7\u01c9\t\5\2\2\u01c8\u01c7\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca"+
		"\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cbz\3\2\2\2\u01cc\u01ca\3\2\2\2"+
		"\u01cd\u01cf\t\4\2\2\u01ce\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01ce"+
		"\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1|\3\2\2\2\u01d2\u01d3\t\4\2\2\u01d3"+
		"~\3\2\2\2\u01d4\u01d7\5}?\2\u01d5\u01d7\7a\2\2\u01d6\u01d4\3\2\2\2\u01d6"+
		"\u01d5\3\2\2\2\u01d7\u0080\3\2\2\2\u01d8\u01da\5\177@\2\u01d9\u01d8\3"+
		"\2\2\2\u01da\u01db\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc"+
		"\u0082\3\2\2\2\u01dd\u01de\7\63\2\2\u01de\u01df\78\2\2\u01df\u01e0\7%"+
		"\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\5\u0085C\2\u01e2\u01e4\5\u0089E\2"+
		"\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u0084\3\2\2\2\u01e5\u01e6"+
		"\t\6\2\2\u01e6\u0086\3\2\2\2\u01e7\u01ea\5\u0085C\2\u01e8\u01ea\7a\2\2"+
		"\u01e9\u01e7\3\2\2\2\u01e9\u01e8\3\2\2\2\u01ea\u0088\3\2\2\2\u01eb\u01ed"+
		"\5\u0087D\2\u01ec\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ec\3\2\2"+
		"\2\u01ee\u01ef\3\2\2\2\u01ef\u008a\3\2\2\2\u01f0\u01f2\5y=\2\u01f1\u01f3"+
		"\5\u008dG\2\u01f2\u01f1\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5\3\2\2"+
		"\2\u01f4\u01f6\5\u008fH\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6"+
		"\u008c\3\2\2\2\u01f7\u01f8\7\60\2\2\u01f8\u01f9\5y=\2\u01f9\u008e\3\2"+
		"\2\2\u01fa\u01fc\5\u0091I\2\u01fb\u01fd\5\u0095K\2\u01fc\u01fb\3\2\2\2"+
		"\u01fc\u01fd\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\5y=\2\u01ff\u0090"+
		"\3\2\2\2\u0200\u0201\t\7\2\2\u0201\u0092\3\2\2\2\u0202\u0203\t\b\2\2\u0203"+
		"\u0094\3\2\2\2\u0204\u0205\t\t\2\2\u0205\u0096\3\2\2\2\u0206\u020a\t\n"+
		"\2\2\u0207\u0209\t\13\2\2\u0208\u0207\3\2\2\2\u0209\u020c\3\2\2\2\u020a"+
		"\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u0098\3\2\2\2\u020c\u020a\3\2"+
		"\2\2\u020d\u020f\t\f\2\2\u020e\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210"+
		"\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\bM"+
		"\2\2\u0213\u009a\3\2\2\2\u0214\u0215\7*\2\2\u0215\u0216\7,\2\2\u0216\u021b"+
		"\3\2\2\2\u0217\u021a\5\u009bN\2\u0218\u021a\13\2\2\2\u0219\u0217\3\2\2"+
		"\2\u0219\u0218\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u021c\3\2\2\2\u021b\u0219"+
		"\3\2\2\2\u021c\u021e\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u021f\7,\2\2\u021f"+
		"\u0220\7+\2\2\u0220\u0221\3\2\2\2\u0221\u0222\bN\2\2\u0222\u009c\3\2\2"+
		"\2\u0223\u0224\13\2\2\2\u0224\u009e\3\2\2\2\27\2\u01a7\u01ad\u01b2\u01b9"+
		"\u01bf\u01c4\u01ca\u01d0\u01d6\u01db\u01e3\u01e9\u01ee\u01f2\u01f5\u01fc"+
		"\u020a\u0210\u0219\u021b\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}