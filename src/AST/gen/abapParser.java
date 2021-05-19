package AST.gen;// Generated from C:/Users/Honza/Desktop/Skola/DP/DP_ABAP_compiler/DP_ABAP_compiler/grammars\abap.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class abapParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, OP_ADD=2, OP_SUB=3, OP_MUL=4, OP_DIV=5, ASSIGNMENT_OP=6, ARITHMETIC_OP=7, 
		BIT_OP=8, STRING_OP=9, RELATIONAL_OP=10, BOOLEAN_OP=11, LITERAL_OP=12, 
		ATSIGN=13, DDOT=14, APO=15, EQ_OP=16, LT_OP=17, GT_OP=18, DOT=19, COMMA=20, 
		LPAREN=21, RPAREN=22, SQLPAREN=23, SQRPAREN=24, ARROW=25, NEWLINE_CHAR=26, 
		ABAP_SYSTEM_TIMEZONE=27, ABAP_USER_TIMEZONE=28, ABAPSOURCE=29, ABBREVIATED=30, 
		ABS=31, ABSTRACT=32, ACCEPT=33, ACCEPTING=34, ACCORDING=35, ACTIVATION=36, 
		ACTUAL=37, ADABAS=38, ADD=39, ADDCORRESPONDING=40, ADJACENT=41, AFTER=42, 
		ALIAS=43, ALIASES=44, ALIGN=45, ALL=46, ALLOCATE=47, ALPHA=48, ANALYSIS=49, 
		ANALYZER=50, AND=51, ANNOTATE=52, ANY=53, APPEND=54, APPENDAGE=55, APPENDING=56, 
		APPLICATION=57, ARCHIVE=58, AREA=59, ARITHMETIC=60, AS=61, AS400=62, ASCENDING=63, 
		ASPECT=64, ASSERT=65, ASSIGN=66, ASSIGNED=67, ASSIGNING=68, ASSOCIATION=69, 
		ASYNCHRONOUS=70, AT=71, ATTRIBUTES=72, AUTHORITY=73, AUTHORITYCHECK=74, 
		AVG=75, BACK=76, BACKGROUND=77, BACKUP=78, BACKWARD=79, BADI=80, BASE=81, 
		BEFORE=82, BEGIN=83, BETWEEN=84, BIG=85, BINARY=86, BINTOHEX=87, BIT=88, 
		BITAND=89, BITNOT=90, BITOR=91, BITXOR=92, BLACK=93, BLANK=94, BLANKS=95, 
		BLOB=96, BLOCK=97, BLOCKS=98, BLUE=99, BOUND=100, BOUNDARIES=101, BOUNDS=102, 
		BOXED=103, BREAKPOINT=104, BT=105, BUFFER=106, BY=107, BYPASSING=108, 
		BYTE=109, BYTECA=110, BYTECN=111, BYTECO=112, BYTECS=113, BYTENA=114, 
		BYTENS=115, BYTEORDER=116, CA=117, CALL=118, CALLING=119, CASE=120, CAST=121, 
		CASTING=122, CATCH=123, CEIL=124, CENTER=125, CENTERED=126, CHAIN=127, 
		CHAININPUT=128, CHAINREQUEST=129, CHANGE=130, CHANGING=131, CHANNELS=132, 
		CHAR=133, CHARTOHEX=134, CHARACTER=135, CHECK=136, CHECKBOX=137, CI_=138, 
		CIRCULAR=139, CLASS=140, CLASSCODING=141, CLASSDATA=142, CLASSEVENTS=143, 
		CLASSMETHODS=144, CLASSPOOL=145, CLEANUP=146, CLEAR=147, CLIENT=148, CLNT=149, 
		CLOB=150, CLOCK=151, CLOSE=152, CN=153, CO=154, COALESCE=155, CODE=156, 
		CODING=157, COL_BACKGROUND=158, COL_GROUP=159, COL_HEADING=160, COL_KEY=161, 
		COL_NEGATIVE=162, COL_NORMAL=163, COL_POSITIVE=164, COL_TOTAL=165, COLLECT=166, 
		COLOR=167, COLUMN=168, COLUMNS=169, COMMENT=170, COMMENTS=171, COMMIT=172, 
		COMMON=173, COMMUNICATION=174, COMPARING=175, COMPONENT=176, COMPONENTS=177, 
		COMPRESSION=178, COMPUTE=179, CONCAT=180, CONCAT_WITH_SPACE=181, CONCATENATE=182, 
		COND=183, CONDENSE=184, CONDITION=185, CONNECT=186, CONNECTION=187, CONSTANTS=188, 
		CONTEXT=189, CONTEXTS=190, CONTINUE=191, CONTROL=192, CONTROLS=193, CONV=194, 
		CONVERSION=195, CONVERT=196, COPIES=197, COPY=198, CORRESPONDING=199, 
		COUNT=200, COUNTRY=201, COVER=202, CP=203, CPI=204, CREATE=205, CREATING=206, 
		CRITICAL=207, CROSS=208, CS=209, CUKY=210, CURR=211, CURRENCY=212, CURRENCY_CONVERSION=213, 
		CURRENT=214, CURSOR=215, CURSORSELECTION=216, CUSTOMER=217, CUSTOMERFUNCTION=218, 
		DANGEROUS=219, DATA=220, DATABASE=221, DATAINFO=222, DATASET=223, DATE=224, 
		DATS=225, DATS_ADD_DAYS=226, DATS_ADD_MONTHS=227, DATS_DAYS_BETWEEN=228, 
		DATS_IS_VALID=229, DATS_TIMS_TO_TSTMP=230, DAYLIGHT=231, DB2=232, DB6=233, 
		DDMMYY=234, DDMMYYYY=235, DEALLOCATE=236, DEC=237, DECIMAL_SHIFT=238, 
		DECIMALS=239, DECLARATIONS=240, DEEP=241, DEFAULT=242, DEFERRED=243, DEFINE=244, 
		DEFINING=245, DEFINITION=246, DELETE=247, DELETING=248, DEMAND=249, DEPARTMENT=250, 
		DESCENDING=251, DESCRIBE=252, DESTINATION=253, DETAIL=254, DIALOG=255, 
		DIRECTORY=256, DISCARDING=257, DISCONNECT=258, DISPLAY=259, DISPLAYMODE=260, 
		DISTANCE=261, DISTINCT=262, DIV=263, DIVIDE=264, DIVIDECORRESPONDING=265, 
		DIVISION=266, DO=267, DUMMY=268, DUPLICATE=269, DUPLICATES=270, DURATION=271, 
		DURING=272, DYNAMIC=273, DYNPRO=274, EDIT=275, EDITORCALL=276, ELSE=277, 
		ELSEIF=278, EMPTY=279, ENABLED=280, ENABLING=281, ENCODING=282, END=283, 
		ENDENHANCEMENTSECTION=284, ENDLINES=285, ENDOFDEFINITION=286, ENDOFFILE=287, 
		ENDOFPAGE=288, ENDOFSELECTION=289, ENDTESTINJECTION=290, ENDTESTSEAM=291, 
		ENDAT=292, ENDCASE=293, ENDCATCH=294, ENDCHAIN=295, ENDCLASS=296, ENDDO=297, 
		ENDENHANCEMENT=298, ENDEXEC=299, ENDFORM=300, ENDFUNCTION=301, ENDIAN=302, 
		ENDIF=303, ENDING=304, ENDINTERFACE=305, ENDLOOP=306, ENDMETHOD=307, ENDMODULE=308, 
		ENDON=309, ENDPROVIDE=310, ENDSELECT=311, ENDTRY=312, ENDWHILE=313, ENDWITH=314, 
		ENGINEERING=315, ENHANCEMENT=316, ENHANCEMENTPOINT=317, ENHANCEMENTSECTION=318, 
		ENHANCEMENTS=319, ENTRIES=320, ENTRY=321, ENUM=322, ENVIRONMENT=323, EQ=324, 
		EQUIV=325, ERRORMESSAGE=326, ERRORS=327, ESCAPE=328, ESCAPING=329, EVENT=330, 
		EVENTS=331, EXACT=332, EXCEPT=333, EXCEPTION=334, EXCEPTIONTABLE=335, 
		EXCEPTIONS=336, EXCLUDE=337, EXCLUDING=338, EXEC=339, EXECUTE=340, EXISTS=341, 
		EXIT=342, EXITCOMMAND=343, EXPAND=344, EXPANDING=345, EXPIRATION=346, 
		EXPLICIT=347, EXPONENT=348, EXPORT=349, EXPORTING=350, EXTEND=351, EXTENDED=352, 
		EXTENSION=353, EXTRACT=354, FAIL=355, FETCH=356, FIELD=357, FIELDGROUPS=358, 
		FIELDSYMBOL=359, FIELDSYMBOLS=360, FIELDS=361, FILE=362, FILTER=363, FILTERTABLE=364, 
		FILTERS=365, FINAL=366, FIND=367, FIRST=368, FIRSTLINE=369, FIXEDPOINT=370, 
		FKEQ=371, FKGE=372, FLOOR=373, FLTP=374, FLTP_TO_DEC=375, FLUSH=376, FONT=377, 
		FOR=378, FORM=379, FORMAT=380, FORWARD=381, FOUND=382, FRAME=383, FRAMES=384, 
		FREE=385, FRIENDS=386, FROM=387, FUNCTION=388, FUNCTIONPOOL=389, FUNCTIONALITY=390, 
		FURTHER=391, GAPS=392, GE=393, GENERATE=394, GET=395, GIVING=396, GKEQ=397, 
		GKGE=398, GLOBAL=399, GRANT=400, GREEN=401, GROUP=402, GROUPS=403, GT=404, 
		HANDLE=405, HANDLER=406, HARMLESS=407, HASHED=408, HAVING=409, HDB=410, 
		HEADLINES=411, HEADER=412, HEADERS=413, HEADING=414, HELPID=415, HELPREQUEST=416, 
		HEXTOBIN=417, HIDE=418, HIGH=419, HINT=420, HOLD=421, HOTSPOT=422, ICON=423, 
		IDENTIFICATION=424, IDENTIFIER=425, IDS=426, IF=427, IGNORE=428, IGNORING=429, 
		IMMEDIATELY=430, IMPLEMENTATION=431, IMPLEMENTATIONS=432, IMPLEMENTED=433, 
		IMPLICIT=434, IMPORT=435, IMPORTING=436, IN=437, INACTIVE=438, INCL=439, 
		INCLUDE=440, INCLUDES=441, INCLUDING=442, INCREMENT=443, INDEX=444, INDEXLINE=445, 
		INFOTYPES=446, INHERIT=447, INHERITING=448, INIT=449, INITIAL=450, INITIALIZATION=451, 
		INNER=452, INOUT=453, INPUT=454, INSERT=455, INSTANCE=456, INSTANCES=457, 
		INSTR=458, INTENSIFIED=459, INTERFACE=460, INTERFACEPOOL=461, INTERFACES=462, 
		INTERNAL=463, INTERVALS=464, INTO=465, INVERSE=466, INVERTEDDATE=467, 
		IS=468, ISO=469, ITNO=470, JOB=471, JOIN=472, KEEP=473, KEEPING=474, KERNEL=475, 
		KEY=476, KEYS=477, KEYWORDS=478, KIND=479, LANG=480, LANGUAGE=481, LAST=482, 
		LATE=483, LAYOUT=484, LE=485, LEADING=486, LEAVE=487, LEFT=488, LEFTJUSTIFIED=489, 
		LEFTPLUS=490, LEFTSPACE=491, LEGACY=492, LENGTH=493, LET=494, LEVEL=495, 
		LEVELS=496, LIKE=497, LINE=498, LINECOUNT=499, LINESELECTION=500, LINESIZE=501, 
		LINEFEED=502, LINES=503, LIST=504, LISTPROCESSING=505, LISTBOX=506, LITTLE=507, 
		LLANG=508, LOAD=509, LOADOFPROGRAM=510, LOB=511, LOCAL=512, LOCALE=513, 
		LOCATOR=514, LOGPOINT=515, LOGFILE=516, LOGICAL=517, LONG=518, LOOP=519, 
		LOW=520, LOWER=521, LPAD=522, LPI=523, LT=524, LTRIM=525, MAIL=526, MAIN=527, 
		MAJORID=528, MAPPING=529, MARGIN=530, MARK=531, MASK=532, MATCH=533, MATCHCODE=534, 
		MAX=535, MAXIMUM=536, MEDIUM=537, MEMBERS=538, MEMORY=539, MESH=540, MESSAGE=541, 
		MESSAGEID=542, MESSAGES=543, MESSAGING=544, METHOD=545, METHODS=546, MIN=547, 
		MINIMUM=548, MINORID=549, MMDDYY=550, MMDDYYYY=551, MOD=552, MODE=553, 
		MODIF=554, MODIFIER=555, MODIFY=556, MODULE=557, MOVE=558, MOVECORRESPONDING=559, 
		MSSQLNT=560, MULTIPLY=561, MULTIPLYCORRESPONDING=562, NA=563, NAME=564, 
		NAMETAB=565, NATIVE=566, NB=567, NE=568, NESTED=569, NESTING=570, NEW=571, 
		NEWLINE=572, NEWPAGE=573, NEWSECTION=574, NEXT=575, NO=576, NODISPLAY=577, 
		NOEXTENSION=578, NOGAP=579, NOGAPS=580, NOGROUPING=581, NOHEADING=582, 
		NOSCROLLING=583, NOSIGN=584, NOTITLE=585, NOTOPOFPAGE=586, NOZERO=587, 
		NODE=588, NODES=589, NONUNICODE=590, NONUNIQUE=591, NOT=592, NP=593, NS=594, 
		NULL=595, NUMBER=596, NUMC=597, OBJECT=598, OBJECTS=599, OBLIGATORY=600, 
		OCCURRENCE=601, OCCURRENCES=602, OCCURS=603, OF=604, OFF=605, OFFSET=606, 
		OLE=607, ON=608, ONLY=609, OPEN=610, OPTION=611, OPTIONAL=612, OPTIONS=613, 
		OR=614, ORACLE=615, ORDER=616, OTHER=617, OTHERS=618, OUT=619, OUTER=620, 
		OUTPUT=621, OUTPUTLENGTH=622, OVERFLOW=623, OVERLAY=624, PACK=625, PACKAGE=626, 
		PAD=627, PADDING=628, PAGE=629, PAGES=630, PARAMETER=631, PARAMETERTABLE=632, 
		PARAMETERS=633, PART=634, PARTIALLY=635, PATTERN=636, PERCENTAGE=637, 
		PERFORM=638, PERFORMING=639, PERSON=640, PF=641, PFSTATUS=642, PINK=643, 
		PLACES=644, POOL=645, POS_HIGH=646, POS_LOW=647, POSITION=648, PRAGMAS=649, 
		PRECOMPILED=650, PREFERRED=651, PRESERVING=652, PRIMARY=653, PRINT=654, 
		PRINTCONTROL=655, PRIORITY=656, PRIVATE=657, PROCEDURE=658, PROCESS=659, 
		PROGRAM=660, PROPERTY=661, PROTECTED=662, PROVIDE=663, PUBLIC=664, PUSH=665, 
		PUSHBUTTON=666, PUT=667, QUAN=668, QUEUEONLY=669, QUICKINFO=670, RADIOBUTTON=671, 
		RAISE=672, RAISING=673, RANGE=674, RANGES=675, RAW=676, READ=677, READONLY=678, 
		READER=679, RECEIVE=680, RECEIVED=681, RECEIVER=682, RECEIVING=683, RED=684, 
		REDEFINITION=685, REDUCE=686, REDUCED=687, REF=688, REFERENCE=689, REFRESH=690, 
		REGEX=691, REJECT=692, REMOTE=693, RENAMING=694, REPLACE=695, REPLACEMENT=696, 
		REPLACING=697, REPORT=698, REQUEST=699, REQUESTED=700, RESERVE=701, RESET=702, 
		RESOLUTION=703, RESPECTING=704, RESPONSIBLE=705, RESULT=706, RESULTS=707, 
		RESUMABLE=708, RESUME=709, RETRY=710, RETURN=711, RETURNCODE=712, RETURNING=713, 
		RETURNS=714, RIGHT=715, RIGHTJUSTIFIED=716, RIGHTPLUS=717, RIGHTSPACE=718, 
		RISK=719, RMC_COMMUNICATION_FAILURE=720, RMC_INVALID_STATUS=721, RMC_SYSTEM_FAILURE=722, 
		ROLE=723, ROLLBACK=724, ROUND=725, ROWS=726, RPAD=727, RTRIM=728, RUN=729, 
		SAP=730, SAPSPOOL=731, SAVING=732, SCALE_PRESERVING=733, SCALE_PRESERVING_SCIENTIFIC=734, 
		SCAN=735, SCIENTIFIC=736, SCIENTIFIC_WITH_LEADING_ZERO=737, SCREEN=738, 
		SCROLL=739, SCROLLBOUNDARY=740, SCROLLING=741, SEARCH=742, SECONDARY=743, 
		SECONDS=744, SECTION=745, SELECT=746, SELECTOPTIONS=747, SELECTION=748, 
		SELECTIONSCREEN=749, SELECTIONSET=750, SELECTIONSETS=751, SELECTIONTABLE=752, 
		SELECTIONS=753, SEND=754, SEPARATE=755, SEPARATED=756, SET=757, SHARED=758, 
		SHIFT=759, SHORT=760, SHORTDUMPID=761, SIGN=762, SIGN_AS_POSTFIX=763, 
		SIMPLE=764, SINGLE=765, SIZE=766, SSKIP=767, SKIPPING=768, SMART=769, 
		SOME=770, SORT=771, SORTABLE=772, SORTED=773, SOURCE=774, SPACE=775, SPECIFIED=776, 
		SPLIT=777, SPOOL=778, SPOTS=779, SQL=780, SQLSCRIPT=781, SSTRING=782, 
		STABLE=783, STAMP=784, STANDARD=785, STARTOFSELECTION=786, STARTING=787, 
		STATE=788, STATEMENT=789, STATEMENTS=790, STATIC=791, STATICS=792, STATUSINFO=793, 
		STEPLOOP=794, STOP=795, STRUCTURE=796, STRUCTURES=797, STYLE=798, SUBKEY=799, 
		SUBMATCHES=800, SUBMIT=801, SUBROUTINE=802, SUBSCREEN=803, SUBSTRING=804, 
		SUBTRACT=805, SUBTRACTCORRESPONDING=806, SUFFIX=807, SUM=808, SUMMARY=809, 
		SUMMING=810, SUPPLIED=811, SUPPLY=812, SUPPRESS=813, SWITCH=814, SWITCHSTATES=815, 
		SYBASE=816, SYMBOL=817, SYNCPOINTS=818, SYNTAX=819, SYNTAXCHECK=820, SYNTAXTRACE=821, 
		SYSTEMCALL=822, SYSTEMEXCEPTIONS=823, SYSTEMEXIT=824, TAB=825, TABBED=826, 
		TABLE=827, TABLES=828, TABLEVIEW=829, TABSTRIP=830, TARGET=831, TASK=832, 
		TASKS=833, TEST=834, TESTINJECTION=835, TESTSEAM=836, TESTING=837, TEXT=838, 
		TEXTPOOL=839, THEN=840, THROW=841, TIME=842, TIMES=843, TIMESTAMP=844, 
		TIMEZONE=845, TIMS=846, TIMS_IS_VALID=847, TITLE=848, TITLELINES=849, 
		TITLEBAR=850, TO=851, TOKENIZATION=852, TOKENS=853, TOPLINES=854, TOPOFPAGE=855, 
		TRACEFILE=856, TRACETABLE=857, TRAILING=858, TRANSACTION=859, TRANSFER=860, 
		TRANSFORMATION=861, TRANSLATE=862, TRANSPORTING=863, TRMAC=864, TRUNCATE=865, 
		TRUNCATION=866, TRY=867, TSTMP_ADD_SECONDS=868, TSTMP_CURRENT_UTCTIMESTAMP=869, 
		TSTMP_IS_VALID=870, TSTMP_SECONDS_BETWEEN=871, TSTMP_TO_DATS=872, TSTMP_TO_DST=873, 
		TSTMP_TO_TIMS=874, TYPE=875, TYPEPOOL=876, TYPEPOOLS=877, TYPES=878, ULINE=879, 
		UNASSIGN=880, UNDER=881, UNICODE=882, UNION=883, UNIQUE=884, UNIT=885, 
		UNIT_CONVERSION=886, UNIX=887, UNPACK=888, UNTIL=889, UNWIND=890, UP=891, 
		UPDATE=892, UPPER=893, USER=894, USERCOMMAND=895, USING=896, UTF8=897, 
		VALID=898, VALUE=899, VALUEREQUEST=900, VALUES=901, VARIANT=902, VARY=903, 
		VARYING=904, VERIFICATIONMESSAGE=905, VERSION=906, VIA=907, VIEW=908, 
		VISIBLE=909, WAIT=910, WARNING=911, WHEN=912, WHENEVER=913, WHERE=914, 
		WHILE=915, WIDTH=916, WINDOW=917, WINDOWS=918, WITH=919, WITHHEADING=920, 
		WITHTITLE=921, WITHOUT=922, WORD=923, WORK=924, WRITE=925, WRITER=926, 
		XML=927, XOR=928, XSD=929, YELLOW=930, YES=931, YYMMDD=932, ZERO=933, 
		ZONE=934, NUM=935, ID=936, WS=937, COMM=938;
	public static final int
		RULE_prog = 0, RULE_block = 1, RULE_statement = 2, RULE_empty = 3, RULE_report = 4, 
		RULE_clear = 5, RULE_condition = 6, RULE_elseif = 7, RULE_elseifloop = 8, 
		RULE_assignment = 9, RULE_comment = 10, RULE_loop = 11, RULE_op = 12, 
		RULE_expr = 13, RULE_select = 14, RULE_swordf = 15, RULE_sword = 16, RULE_sort_key = 17, 
		RULE_readtable = 18, RULE_rtable_key = 19, RULE_transport_options = 20, 
		RULE_casting = 21, RULE_inline_fields_declaration = 22, RULE_cols = 23, 
		RULE_col = 24, RULE_index = 25, RULE_s_cond = 26, RULE_lidcommas = 27, 
		RULE_lidcomma = 28, RULE_var = 29, RULE_variable = 30, RULE_fieldsymbol = 31, 
		RULE_inline_data_declaration = 32, RULE_value = 33, RULE_declaration = 34, 
		RULE_decl_eachloop = 35, RULE_decl_each = 36, RULE_lid = 37, RULE_tabkeys = 38, 
		RULE_join_cond = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "block", "statement", "empty", "report", "clear", "condition", 
			"elseif", "elseifloop", "assignment", "comment", "loop", "op", "expr", 
			"select", "swordf", "sword", "sort_key", "readtable", "rtable_key", "transport_options", 
			"casting", "inline_fields_declaration", "cols", "col", "index", "s_cond", 
			"lidcommas", "lidcomma", "var", "variable", "fieldsymbol", "inline_data_declaration", 
			"value", "declaration", "decl_eachloop", "decl_each", "lid", "tabkeys", 
			"join_cond"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'**'", "'+'", "'-'", "'*'", "'/'", null, null, null, "'&&'", null, 
			null, "'&'", "'@'", "':'", "'''", "'='", "'<'", "'>'", "'.'", "','", 
			"'('", "')'", "'['", "']'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "OP_ADD", "OP_SUB", "OP_MUL", "OP_DIV", "ASSIGNMENT_OP", 
			"ARITHMETIC_OP", "BIT_OP", "STRING_OP", "RELATIONAL_OP", "BOOLEAN_OP", 
			"LITERAL_OP", "ATSIGN", "DDOT", "APO", "EQ_OP", "LT_OP", "GT_OP", "DOT", 
			"COMMA", "LPAREN", "RPAREN", "SQLPAREN", "SQRPAREN", "ARROW", "NEWLINE_CHAR", 
			"ABAP_SYSTEM_TIMEZONE", "ABAP_USER_TIMEZONE", "ABAPSOURCE", "ABBREVIATED", 
			"ABS", "ABSTRACT", "ACCEPT", "ACCEPTING", "ACCORDING", "ACTIVATION", 
			"ACTUAL", "ADABAS", "ADD", "ADDCORRESPONDING", "ADJACENT", "AFTER", "ALIAS", 
			"ALIASES", "ALIGN", "ALL", "ALLOCATE", "ALPHA", "ANALYSIS", "ANALYZER", 
			"AND", "ANNOTATE", "ANY", "APPEND", "APPENDAGE", "APPENDING", "APPLICATION", 
			"ARCHIVE", "AREA", "ARITHMETIC", "AS", "AS400", "ASCENDING", "ASPECT", 
			"ASSERT", "ASSIGN", "ASSIGNED", "ASSIGNING", "ASSOCIATION", "ASYNCHRONOUS", 
			"AT", "ATTRIBUTES", "AUTHORITY", "AUTHORITYCHECK", "AVG", "BACK", "BACKGROUND", 
			"BACKUP", "BACKWARD", "BADI", "BASE", "BEFORE", "BEGIN", "BETWEEN", "BIG", 
			"BINARY", "BINTOHEX", "BIT", "BITAND", "BITNOT", "BITOR", "BITXOR", "BLACK", 
			"BLANK", "BLANKS", "BLOB", "BLOCK", "BLOCKS", "BLUE", "BOUND", "BOUNDARIES", 
			"BOUNDS", "BOXED", "BREAKPOINT", "BT", "BUFFER", "BY", "BYPASSING", "BYTE", 
			"BYTECA", "BYTECN", "BYTECO", "BYTECS", "BYTENA", "BYTENS", "BYTEORDER", 
			"CA", "CALL", "CALLING", "CASE", "CAST", "CASTING", "CATCH", "CEIL", 
			"CENTER", "CENTERED", "CHAIN", "CHAININPUT", "CHAINREQUEST", "CHANGE", 
			"CHANGING", "CHANNELS", "CHAR", "CHARTOHEX", "CHARACTER", "CHECK", "CHECKBOX", 
			"CI_", "CIRCULAR", "CLASS", "CLASSCODING", "CLASSDATA", "CLASSEVENTS", 
			"CLASSMETHODS", "CLASSPOOL", "CLEANUP", "CLEAR", "CLIENT", "CLNT", "CLOB", 
			"CLOCK", "CLOSE", "CN", "CO", "COALESCE", "CODE", "CODING", "COL_BACKGROUND", 
			"COL_GROUP", "COL_HEADING", "COL_KEY", "COL_NEGATIVE", "COL_NORMAL", 
			"COL_POSITIVE", "COL_TOTAL", "COLLECT", "COLOR", "COLUMN", "COLUMNS", 
			"COMMENT", "COMMENTS", "COMMIT", "COMMON", "COMMUNICATION", "COMPARING", 
			"COMPONENT", "COMPONENTS", "COMPRESSION", "COMPUTE", "CONCAT", "CONCAT_WITH_SPACE", 
			"CONCATENATE", "COND", "CONDENSE", "CONDITION", "CONNECT", "CONNECTION", 
			"CONSTANTS", "CONTEXT", "CONTEXTS", "CONTINUE", "CONTROL", "CONTROLS", 
			"CONV", "CONVERSION", "CONVERT", "COPIES", "COPY", "CORRESPONDING", "COUNT", 
			"COUNTRY", "COVER", "CP", "CPI", "CREATE", "CREATING", "CRITICAL", "CROSS", 
			"CS", "CUKY", "CURR", "CURRENCY", "CURRENCY_CONVERSION", "CURRENT", "CURSOR", 
			"CURSORSELECTION", "CUSTOMER", "CUSTOMERFUNCTION", "DANGEROUS", "DATA", 
			"DATABASE", "DATAINFO", "DATASET", "DATE", "DATS", "DATS_ADD_DAYS", "DATS_ADD_MONTHS", 
			"DATS_DAYS_BETWEEN", "DATS_IS_VALID", "DATS_TIMS_TO_TSTMP", "DAYLIGHT", 
			"DB2", "DB6", "DDMMYY", "DDMMYYYY", "DEALLOCATE", "DEC", "DECIMAL_SHIFT", 
			"DECIMALS", "DECLARATIONS", "DEEP", "DEFAULT", "DEFERRED", "DEFINE", 
			"DEFINING", "DEFINITION", "DELETE", "DELETING", "DEMAND", "DEPARTMENT", 
			"DESCENDING", "DESCRIBE", "DESTINATION", "DETAIL", "DIALOG", "DIRECTORY", 
			"DISCARDING", "DISCONNECT", "DISPLAY", "DISPLAYMODE", "DISTANCE", "DISTINCT", 
			"DIV", "DIVIDE", "DIVIDECORRESPONDING", "DIVISION", "DO", "DUMMY", "DUPLICATE", 
			"DUPLICATES", "DURATION", "DURING", "DYNAMIC", "DYNPRO", "EDIT", "EDITORCALL", 
			"ELSE", "ELSEIF", "EMPTY", "ENABLED", "ENABLING", "ENCODING", "END", 
			"ENDENHANCEMENTSECTION", "ENDLINES", "ENDOFDEFINITION", "ENDOFFILE", 
			"ENDOFPAGE", "ENDOFSELECTION", "ENDTESTINJECTION", "ENDTESTSEAM", "ENDAT", 
			"ENDCASE", "ENDCATCH", "ENDCHAIN", "ENDCLASS", "ENDDO", "ENDENHANCEMENT", 
			"ENDEXEC", "ENDFORM", "ENDFUNCTION", "ENDIAN", "ENDIF", "ENDING", "ENDINTERFACE", 
			"ENDLOOP", "ENDMETHOD", "ENDMODULE", "ENDON", "ENDPROVIDE", "ENDSELECT", 
			"ENDTRY", "ENDWHILE", "ENDWITH", "ENGINEERING", "ENHANCEMENT", "ENHANCEMENTPOINT", 
			"ENHANCEMENTSECTION", "ENHANCEMENTS", "ENTRIES", "ENTRY", "ENUM", "ENVIRONMENT", 
			"EQ", "EQUIV", "ERRORMESSAGE", "ERRORS", "ESCAPE", "ESCAPING", "EVENT", 
			"EVENTS", "EXACT", "EXCEPT", "EXCEPTION", "EXCEPTIONTABLE", "EXCEPTIONS", 
			"EXCLUDE", "EXCLUDING", "EXEC", "EXECUTE", "EXISTS", "EXIT", "EXITCOMMAND", 
			"EXPAND", "EXPANDING", "EXPIRATION", "EXPLICIT", "EXPONENT", "EXPORT", 
			"EXPORTING", "EXTEND", "EXTENDED", "EXTENSION", "EXTRACT", "FAIL", "FETCH", 
			"FIELD", "FIELDGROUPS", "FIELDSYMBOL", "FIELDSYMBOLS", "FIELDS", "FILE", 
			"FILTER", "FILTERTABLE", "FILTERS", "FINAL", "FIND", "FIRST", "FIRSTLINE", 
			"FIXEDPOINT", "FKEQ", "FKGE", "FLOOR", "FLTP", "FLTP_TO_DEC", "FLUSH", 
			"FONT", "FOR", "FORM", "FORMAT", "FORWARD", "FOUND", "FRAME", "FRAMES", 
			"FREE", "FRIENDS", "FROM", "FUNCTION", "FUNCTIONPOOL", "FUNCTIONALITY", 
			"FURTHER", "GAPS", "GE", "GENERATE", "GET", "GIVING", "GKEQ", "GKGE", 
			"GLOBAL", "GRANT", "GREEN", "GROUP", "GROUPS", "GT", "HANDLE", "HANDLER", 
			"HARMLESS", "HASHED", "HAVING", "HDB", "HEADLINES", "HEADER", "HEADERS", 
			"HEADING", "HELPID", "HELPREQUEST", "HEXTOBIN", "HIDE", "HIGH", "HINT", 
			"HOLD", "HOTSPOT", "ICON", "IDENTIFICATION", "IDENTIFIER", "IDS", "IF", 
			"IGNORE", "IGNORING", "IMMEDIATELY", "IMPLEMENTATION", "IMPLEMENTATIONS", 
			"IMPLEMENTED", "IMPLICIT", "IMPORT", "IMPORTING", "IN", "INACTIVE", "INCL", 
			"INCLUDE", "INCLUDES", "INCLUDING", "INCREMENT", "INDEX", "INDEXLINE", 
			"INFOTYPES", "INHERIT", "INHERITING", "INIT", "INITIAL", "INITIALIZATION", 
			"INNER", "INOUT", "INPUT", "INSERT", "INSTANCE", "INSTANCES", "INSTR", 
			"INTENSIFIED", "INTERFACE", "INTERFACEPOOL", "INTERFACES", "INTERNAL", 
			"INTERVALS", "INTO", "INVERSE", "INVERTEDDATE", "IS", "ISO", "ITNO", 
			"JOB", "JOIN", "KEEP", "KEEPING", "KERNEL", "KEY", "KEYS", "KEYWORDS", 
			"KIND", "LANG", "LANGUAGE", "LAST", "LATE", "LAYOUT", "LE", "LEADING", 
			"LEAVE", "LEFT", "LEFTJUSTIFIED", "LEFTPLUS", "LEFTSPACE", "LEGACY", 
			"LENGTH", "LET", "LEVEL", "LEVELS", "LIKE", "LINE", "LINECOUNT", "LINESELECTION", 
			"LINESIZE", "LINEFEED", "LINES", "LIST", "LISTPROCESSING", "LISTBOX", 
			"LITTLE", "LLANG", "LOAD", "LOADOFPROGRAM", "LOB", "LOCAL", "LOCALE", 
			"LOCATOR", "LOGPOINT", "LOGFILE", "LOGICAL", "LONG", "LOOP", "LOW", "LOWER", 
			"LPAD", "LPI", "LT", "LTRIM", "MAIL", "MAIN", "MAJORID", "MAPPING", "MARGIN", 
			"MARK", "MASK", "MATCH", "MATCHCODE", "MAX", "MAXIMUM", "MEDIUM", "MEMBERS", 
			"MEMORY", "MESH", "MESSAGE", "MESSAGEID", "MESSAGES", "MESSAGING", "METHOD", 
			"METHODS", "MIN", "MINIMUM", "MINORID", "MMDDYY", "MMDDYYYY", "MOD", 
			"MODE", "MODIF", "MODIFIER", "MODIFY", "MODULE", "MOVE", "MOVECORRESPONDING", 
			"MSSQLNT", "MULTIPLY", "MULTIPLYCORRESPONDING", "NA", "NAME", "NAMETAB", 
			"NATIVE", "NB", "NE", "NESTED", "NESTING", "NEW", "NEWLINE", "NEWPAGE", 
			"NEWSECTION", "NEXT", "NO", "NODISPLAY", "NOEXTENSION", "NOGAP", "NOGAPS", 
			"NOGROUPING", "NOHEADING", "NOSCROLLING", "NOSIGN", "NOTITLE", "NOTOPOFPAGE", 
			"NOZERO", "NODE", "NODES", "NONUNICODE", "NONUNIQUE", "NOT", "NP", "NS", 
			"NULL", "NUMBER", "NUMC", "OBJECT", "OBJECTS", "OBLIGATORY", "OCCURRENCE", 
			"OCCURRENCES", "OCCURS", "OF", "OFF", "OFFSET", "OLE", "ON", "ONLY", 
			"OPEN", "OPTION", "OPTIONAL", "OPTIONS", "OR", "ORACLE", "ORDER", "OTHER", 
			"OTHERS", "OUT", "OUTER", "OUTPUT", "OUTPUTLENGTH", "OVERFLOW", "OVERLAY", 
			"PACK", "PACKAGE", "PAD", "PADDING", "PAGE", "PAGES", "PARAMETER", "PARAMETERTABLE", 
			"PARAMETERS", "PART", "PARTIALLY", "PATTERN", "PERCENTAGE", "PERFORM", 
			"PERFORMING", "PERSON", "PF", "PFSTATUS", "PINK", "PLACES", "POOL", "POS_HIGH", 
			"POS_LOW", "POSITION", "PRAGMAS", "PRECOMPILED", "PREFERRED", "PRESERVING", 
			"PRIMARY", "PRINT", "PRINTCONTROL", "PRIORITY", "PRIVATE", "PROCEDURE", 
			"PROCESS", "PROGRAM", "PROPERTY", "PROTECTED", "PROVIDE", "PUBLIC", "PUSH", 
			"PUSHBUTTON", "PUT", "QUAN", "QUEUEONLY", "QUICKINFO", "RADIOBUTTON", 
			"RAISE", "RAISING", "RANGE", "RANGES", "RAW", "READ", "READONLY", "READER", 
			"RECEIVE", "RECEIVED", "RECEIVER", "RECEIVING", "RED", "REDEFINITION", 
			"REDUCE", "REDUCED", "REF", "REFERENCE", "REFRESH", "REGEX", "REJECT", 
			"REMOTE", "RENAMING", "REPLACE", "REPLACEMENT", "REPLACING", "REPORT", 
			"REQUEST", "REQUESTED", "RESERVE", "RESET", "RESOLUTION", "RESPECTING", 
			"RESPONSIBLE", "RESULT", "RESULTS", "RESUMABLE", "RESUME", "RETRY", "RETURN", 
			"RETURNCODE", "RETURNING", "RETURNS", "RIGHT", "RIGHTJUSTIFIED", "RIGHTPLUS", 
			"RIGHTSPACE", "RISK", "RMC_COMMUNICATION_FAILURE", "RMC_INVALID_STATUS", 
			"RMC_SYSTEM_FAILURE", "ROLE", "ROLLBACK", "ROUND", "ROWS", "RPAD", "RTRIM", 
			"RUN", "SAP", "SAPSPOOL", "SAVING", "SCALE_PRESERVING", "SCALE_PRESERVING_SCIENTIFIC", 
			"SCAN", "SCIENTIFIC", "SCIENTIFIC_WITH_LEADING_ZERO", "SCREEN", "SCROLL", 
			"SCROLLBOUNDARY", "SCROLLING", "SEARCH", "SECONDARY", "SECONDS", "SECTION", 
			"SELECT", "SELECTOPTIONS", "SELECTION", "SELECTIONSCREEN", "SELECTIONSET", 
			"SELECTIONSETS", "SELECTIONTABLE", "SELECTIONS", "SEND", "SEPARATE", 
			"SEPARATED", "SET", "SHARED", "SHIFT", "SHORT", "SHORTDUMPID", "SIGN", 
			"SIGN_AS_POSTFIX", "SIMPLE", "SINGLE", "SIZE", "SSKIP", "SKIPPING", "SMART", 
			"SOME", "SORT", "SORTABLE", "SORTED", "SOURCE", "SPACE", "SPECIFIED", 
			"SPLIT", "SPOOL", "SPOTS", "SQL", "SQLSCRIPT", "SSTRING", "STABLE", "STAMP", 
			"STANDARD", "STARTOFSELECTION", "STARTING", "STATE", "STATEMENT", "STATEMENTS", 
			"STATIC", "STATICS", "STATUSINFO", "STEPLOOP", "STOP", "STRUCTURE", "STRUCTURES", 
			"STYLE", "SUBKEY", "SUBMATCHES", "SUBMIT", "SUBROUTINE", "SUBSCREEN", 
			"SUBSTRING", "SUBTRACT", "SUBTRACTCORRESPONDING", "SUFFIX", "SUM", "SUMMARY", 
			"SUMMING", "SUPPLIED", "SUPPLY", "SUPPRESS", "SWITCH", "SWITCHSTATES", 
			"SYBASE", "SYMBOL", "SYNCPOINTS", "SYNTAX", "SYNTAXCHECK", "SYNTAXTRACE", 
			"SYSTEMCALL", "SYSTEMEXCEPTIONS", "SYSTEMEXIT", "TAB", "TABBED", "TABLE", 
			"TABLES", "TABLEVIEW", "TABSTRIP", "TARGET", "TASK", "TASKS", "TEST", 
			"TESTINJECTION", "TESTSEAM", "TESTING", "TEXT", "TEXTPOOL", "THEN", "THROW", 
			"TIME", "TIMES", "TIMESTAMP", "TIMEZONE", "TIMS", "TIMS_IS_VALID", "TITLE", 
			"TITLELINES", "TITLEBAR", "TO", "TOKENIZATION", "TOKENS", "TOPLINES", 
			"TOPOFPAGE", "TRACEFILE", "TRACETABLE", "TRAILING", "TRANSACTION", "TRANSFER", 
			"TRANSFORMATION", "TRANSLATE", "TRANSPORTING", "TRMAC", "TRUNCATE", "TRUNCATION", 
			"TRY", "TSTMP_ADD_SECONDS", "TSTMP_CURRENT_UTCTIMESTAMP", "TSTMP_IS_VALID", 
			"TSTMP_SECONDS_BETWEEN", "TSTMP_TO_DATS", "TSTMP_TO_DST", "TSTMP_TO_TIMS", 
			"TYPE", "TYPEPOOL", "TYPEPOOLS", "TYPES", "ULINE", "UNASSIGN", "UNDER", 
			"UNICODE", "UNION", "UNIQUE", "UNIT", "UNIT_CONVERSION", "UNIX", "UNPACK", 
			"UNTIL", "UNWIND", "UP", "UPDATE", "UPPER", "USER", "USERCOMMAND", "USING", 
			"UTF8", "VALID", "VALUE", "VALUEREQUEST", "VALUES", "VARIANT", "VARY", 
			"VARYING", "VERIFICATIONMESSAGE", "VERSION", "VIA", "VIEW", "VISIBLE", 
			"WAIT", "WARNING", "WHEN", "WHENEVER", "WHERE", "WHILE", "WIDTH", "WINDOW", 
			"WINDOWS", "WITH", "WITHHEADING", "WITHTITLE", "WITHOUT", "WORD", "WORK", 
			"WRITE", "WRITER", "XML", "XOR", "XSD", "YELLOW", "YES", "YYMMDD", "ZERO", 
			"ZONE", "NUM", "ID", "WS", "COMM"
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
	public String getGrammarFileName() { return "abap.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public abapParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RELATIONAL_OP) | (1L << ATSIGN) | (1L << DOT))) != 0) || _la==CLEAR || _la==DATA || _la==FIELDSYMBOL || _la==IF || _la==LOOP || _la==READ || _la==REPORT || _la==SELECT || ((((_la - 878)) & ~0x3f) == 0 && ((1L << (_la - 878)) & ((1L << (TYPES - 878)) | (1L << (ID - 878)) | (1L << (COMM - 878)))) != 0)) {
				{
				{
				setState(80);
				statement();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RELATIONAL_OP) | (1L << ATSIGN) | (1L << DOT))) != 0) || _la==CLEAR || _la==DATA || _la==FIELDSYMBOL || _la==IF || _la==LOOP || _la==READ || _la==REPORT || _la==SELECT || ((((_la - 878)) & ~0x3f) == 0 && ((1L << (_la - 878)) & ((1L << (TYPES - 878)) | (1L << (ID - 878)) | (1L << (COMM - 878)))) != 0)) {
				{
				{
				setState(86);
				statement();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StatementContext extends ParserRuleContext {
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ReportContext report() {
			return getRuleContext(ReportContext.class,0);
		}
		public ClearContext clear() {
			return getRuleContext(ClearContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public ReadtableContext readtable() {
			return getRuleContext(ReadtableContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				empty();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				report();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				clear();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				condition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(97);
				select();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(98);
				readtable();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(99);
				loop();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(100);
				assignment();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(101);
				comment();
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

	public static class EmptyContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(abapParser.DOT, 0); }
		public EmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyContext empty() throws RecognitionException {
		EmptyContext _localctx = new EmptyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_empty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(DOT);
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

	public static class ReportContext extends ParserRuleContext {
		public Token rep;
		public TerminalNode REPORT() { return getToken(abapParser.REPORT, 0); }
		public TerminalNode DOT() { return getToken(abapParser.DOT, 0); }
		public TerminalNode ID() { return getToken(abapParser.ID, 0); }
		public ReportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_report; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterReport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitReport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitReport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReportContext report() throws RecognitionException {
		ReportContext _localctx = new ReportContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_report);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(REPORT);
			setState(107);
			((ReportContext)_localctx).rep = match(ID);
			setState(108);
			match(DOT);
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

	public static class ClearContext extends ParserRuleContext {
		public LidcommasContext co;
		public TerminalNode CLEAR() { return getToken(abapParser.CLEAR, 0); }
		public TerminalNode DOT() { return getToken(abapParser.DOT, 0); }
		public LidcommasContext lidcommas() {
			return getRuleContext(LidcommasContext.class,0);
		}
		public TerminalNode DDOT() { return getToken(abapParser.DDOT, 0); }
		public ClearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clear; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterClear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitClear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitClear(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClearContext clear() throws RecognitionException {
		ClearContext _localctx = new ClearContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_clear);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(CLEAR);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DDOT) {
				{
				setState(111);
				match(DDOT);
				}
			}

			setState(114);
			((ClearContext)_localctx).co = lidcommas();
			setState(115);
			match(DOT);
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
		public ExprContext con;
		public BlockContext if_body;
		public ElseifContext else_if;
		public BlockContext else_body;
		public TerminalNode IF() { return getToken(abapParser.IF, 0); }
		public List<TerminalNode> DOT() { return getTokens(abapParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(abapParser.DOT, i);
		}
		public TerminalNode ENDIF() { return getToken(abapParser.ENDIF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(abapParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(abapParser.RPAREN, 0); }
		public ElseifContext elseif() {
			return getRuleContext(ElseifContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(abapParser.ELSE, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(IF);
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(118);
				match(LPAREN);
				}
				break;
			}
			setState(121);
			((ConditionContext)_localctx).con = expr(0);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(122);
				match(RPAREN);
				}
			}

			setState(125);
			match(DOT);
			setState(126);
			((ConditionContext)_localctx).if_body = block();
			{
			setState(127);
			((ConditionContext)_localctx).else_if = elseif();
			}
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(128);
				match(ELSE);
				setState(129);
				match(DOT);
				setState(130);
				((ConditionContext)_localctx).else_body = block();
				}
			}

			setState(133);
			match(ENDIF);
			setState(134);
			match(DOT);
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

	public static class ElseifContext extends ParserRuleContext {
		public List<ElseifloopContext> elseifloop() {
			return getRuleContexts(ElseifloopContext.class);
		}
		public ElseifloopContext elseifloop(int i) {
			return getRuleContext(ElseifloopContext.class,i);
		}
		public ElseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterElseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitElseif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitElseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifContext elseif() throws RecognitionException {
		ElseifContext _localctx = new ElseifContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elseif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(136);
				elseifloop();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ElseifloopContext extends ParserRuleContext {
		public ExprContext con;
		public BlockContext if_body;
		public TerminalNode ELSEIF() { return getToken(abapParser.ELSEIF, 0); }
		public TerminalNode DOT() { return getToken(abapParser.DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(abapParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(abapParser.RPAREN, 0); }
		public ElseifloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterElseifloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitElseifloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitElseifloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifloopContext elseifloop() throws RecognitionException {
		ElseifloopContext _localctx = new ElseifloopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elseifloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(ELSEIF);
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(143);
				match(LPAREN);
				}
				break;
			}
			setState(146);
			((ElseifloopContext)_localctx).con = expr(0);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(147);
				match(RPAREN);
				}
			}

			setState(150);
			match(DOT);
			setState(151);
			((ElseifloopContext)_localctx).if_body = block();
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

	public static class AssignmentContext extends ParserRuleContext {
		public VarContext where;
		public ExprContext what;
		public TerminalNode ASSIGNMENT_OP() { return getToken(abapParser.ASSIGNMENT_OP, 0); }
		public TerminalNode DOT() { return getToken(abapParser.DOT, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			((AssignmentContext)_localctx).where = var();
			setState(154);
			match(ASSIGNMENT_OP);
			setState(155);
			((AssignmentContext)_localctx).what = expr(0);
			setState(156);
			match(DOT);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMM() { return getToken(abapParser.COMM, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(COMM);
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

	public static class LoopContext extends ParserRuleContext {
		public VarContext lfrom;
		public VarContext lto;
		public BlockContext lblock;
		public TerminalNode LOOP() { return getToken(abapParser.LOOP, 0); }
		public TerminalNode AT() { return getToken(abapParser.AT, 0); }
		public List<TerminalNode> DOT() { return getTokens(abapParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(abapParser.DOT, i);
		}
		public TerminalNode ENDLOOP() { return getToken(abapParser.ENDLOOP, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode INTO() { return getToken(abapParser.INTO, 0); }
		public TerminalNode ASSIGNING() { return getToken(abapParser.ASSIGNING, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(LOOP);
			setState(161);
			match(AT);
			setState(162);
			((LoopContext)_localctx).lfrom = var();
			setState(163);
			_la = _input.LA(1);
			if ( !(_la==ASSIGNING || _la==INTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(164);
			((LoopContext)_localctx).lto = var();
			setState(165);
			match(DOT);
			setState(166);
			((LoopContext)_localctx).lblock = block();
			setState(167);
			match(ENDLOOP);
			setState(168);
			match(DOT);
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

	public static class OpContext extends ParserRuleContext {
		public Token rel;
		public TerminalNode BOOLEAN_OP() { return getToken(abapParser.BOOLEAN_OP, 0); }
		public TerminalNode ASSIGNMENT_OP() { return getToken(abapParser.ASSIGNMENT_OP, 0); }
		public TerminalNode RELATIONAL_OP() { return getToken(abapParser.RELATIONAL_OP, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_op);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				((OpContext)_localctx).rel = match(BOOLEAN_OP);
				}
				break;
			case ASSIGNMENT_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				((OpContext)_localctx).rel = match(ASSIGNMENT_OP);
				}
				break;
			case RELATIONAL_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				((OpContext)_localctx).rel = match(RELATIONAL_OP);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RparenNodeContext extends ExprContext {
		public ExprContext p1;
		public TerminalNode LPAREN() { return getToken(abapParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(abapParser.RPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RparenNodeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterRparenNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitRparenNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitRparenNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparationNodeContext extends ExprContext {
		public ExprContext p1;
		public OpContext rel;
		public ExprContext p2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ComparationNodeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterComparationNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitComparationNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitComparationNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarNodeContext extends ExprContext {
		public VarContext p1;
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VarNodeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterVarNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitVarNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitVarNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SparenNodeContext extends ExprContext {
		public ExprContext p1;
		public TerminalNode SQLPAREN() { return getToken(abapParser.SQLPAREN, 0); }
		public TerminalNode SQRPAREN() { return getToken(abapParser.SQRPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SparenNodeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterSparenNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitSparenNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitSparenNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueNodeContext extends ExprContext {
		public ValueContext p1;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueNodeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterValueNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitValueNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitValueNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticNodeContext extends ExprContext {
		public ExprContext p1;
		public Token rel;
		public ExprContext p2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OP_SUB() { return getToken(abapParser.OP_SUB, 0); }
		public TerminalNode OP_ADD() { return getToken(abapParser.OP_ADD, 0); }
		public TerminalNode OP_MUL() { return getToken(abapParser.OP_MUL, 0); }
		public TerminalNode OP_DIV() { return getToken(abapParser.OP_DIV, 0); }
		public TerminalNode DIV() { return getToken(abapParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(abapParser.MOD, 0); }
		public ArithmeticNodeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterArithmeticNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitArithmeticNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitArithmeticNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQLPAREN:
				{
				_localctx = new SparenNodeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(176);
				match(SQLPAREN);
				setState(177);
				((SparenNodeContext)_localctx).p1 = expr(0);
				setState(178);
				match(SQRPAREN);
				}
				break;
			case LPAREN:
				{
				_localctx = new RparenNodeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				match(LPAREN);
				setState(181);
				((RparenNodeContext)_localctx).p1 = expr(0);
				setState(182);
				match(RPAREN);
				}
				break;
			case RELATIONAL_OP:
			case ATSIGN:
			case DATA:
			case FIELDSYMBOL:
			case ID:
				{
				_localctx = new VarNodeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				((VarNodeContext)_localctx).p1 = var();
				}
				break;
			case APO:
			case NUM:
				{
				_localctx = new ValueNodeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				((ValueNodeContext)_localctx).p1 = value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(203);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ComparationNodeContext(new ExprContext(_parentctx, _parentState));
						((ComparationNodeContext)_localctx).p1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(188);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(189);
						((ComparationNodeContext)_localctx).rel = op();
						setState(190);
						((ComparationNodeContext)_localctx).p2 = expr(5);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticNodeContext(new ExprContext(_parentctx, _parentState));
						((ArithmeticNodeContext)_localctx).p1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(200);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case OP_SUB:
							{
							setState(193);
							((ArithmeticNodeContext)_localctx).rel = match(OP_SUB);
							}
							break;
						case OP_ADD:
							{
							setState(194);
							((ArithmeticNodeContext)_localctx).rel = match(OP_ADD);
							}
							break;
						case OP_MUL:
							{
							setState(195);
							((ArithmeticNodeContext)_localctx).rel = match(OP_MUL);
							}
							break;
						case OP_DIV:
							{
							setState(196);
							((ArithmeticNodeContext)_localctx).rel = match(OP_DIV);
							}
							break;
						case DIV:
							{
							setState(197);
							((ArithmeticNodeContext)_localctx).rel = match(DIV);
							}
							break;
						case MOD:
							{
							setState(198);
							((ArithmeticNodeContext)_localctx).rel = match(MOD);
							}
							break;
						case T__0:
							{
							setState(199);
							((ArithmeticNodeContext)_localctx).rel = match(T__0);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(202);
						((ArithmeticNodeContext)_localctx).p2 = expr(4);
						}
						break;
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class SelectContext extends ParserRuleContext {
		public Token single;
		public LidcommasContext what;
		public Token par;
		public Token data_source;
		public Token tabalias;
		public Token in;
		public Token join;
		public Token dir;
		public Token out;
		public Token cross;
		public Join_condContext pjoin;
		public SwordfContext pswrodf;
		public TerminalNode SELECT() { return getToken(abapParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(abapParser.FROM, 0); }
		public TerminalNode DOT() { return getToken(abapParser.DOT, 0); }
		public List<TerminalNode> ID() { return getTokens(abapParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(abapParser.ID, i);
		}
		public SwordfContext swordf() {
			return getRuleContext(SwordfContext.class,0);
		}
		public TerminalNode OP_MUL() { return getToken(abapParser.OP_MUL, 0); }
		public TerminalNode SINGLE() { return getToken(abapParser.SINGLE, 0); }
		public TerminalNode FOR() { return getToken(abapParser.FOR, 0); }
		public LidcommasContext lidcommas() {
			return getRuleContext(LidcommasContext.class,0);
		}
		public TerminalNode AS() { return getToken(abapParser.AS, 0); }
		public TerminalNode RPAREN() { return getToken(abapParser.RPAREN, 0); }
		public TerminalNode UPDATE() { return getToken(abapParser.UPDATE, 0); }
		public TerminalNode LPAREN() { return getToken(abapParser.LPAREN, 0); }
		public TerminalNode ON() { return getToken(abapParser.ON, 0); }
		public Join_condContext join_cond() {
			return getRuleContext(Join_condContext.class,0);
		}
		public TerminalNode JOIN() { return getToken(abapParser.JOIN, 0); }
		public TerminalNode LEFT() { return getToken(abapParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(abapParser.RIGHT, 0); }
		public TerminalNode CROSS() { return getToken(abapParser.CROSS, 0); }
		public TerminalNode INNER() { return getToken(abapParser.INNER, 0); }
		public TerminalNode OUTER() { return getToken(abapParser.OUTER, 0); }
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(SELECT);
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(209);
				((SelectContext)_localctx).single = match(SINGLE);
				}
				break;
			case 2:
				{
				setState(210);
				match(SINGLE);
				setState(211);
				match(FOR);
				setState(212);
				((SelectContext)_localctx).single = match(UPDATE);
				}
				break;
			}
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONAL_OP:
			case ATSIGN:
			case DATA:
			case FIELDSYMBOL:
			case FROM:
			case ID:
				{
				setState(215);
				((SelectContext)_localctx).what = lidcommas();
				}
				break;
			case OP_MUL:
				{
				setState(216);
				match(OP_MUL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(219);
			match(FROM);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(220);
				((SelectContext)_localctx).par = match(LPAREN);
				}
			}

			setState(223);
			((SelectContext)_localctx).data_source = match(ID);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(224);
				match(AS);
				setState(225);
				((SelectContext)_localctx).tabalias = match(ID);
				}
			}

			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CROSS || ((((_la - 452)) & ~0x3f) == 0 && ((1L << (_la - 452)) & ((1L << (INNER - 452)) | (1L << (JOIN - 452)) | (1L << (LEFT - 452)))) != 0) || _la==RIGHT) {
				{
				setState(242);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INNER:
				case JOIN:
					{
					{
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==INNER) {
						{
						setState(228);
						((SelectContext)_localctx).in = match(INNER);
						}
					}

					setState(231);
					((SelectContext)_localctx).join = match(JOIN);
					}
					}
					break;
				case LEFT:
				case RIGHT:
					{
					setState(238);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LEFT:
						{
						setState(232);
						((SelectContext)_localctx).dir = match(LEFT);
						}
						break;
					case RIGHT:
						{
						setState(233);
						((SelectContext)_localctx).dir = match(RIGHT);
						setState(235);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==OUTER) {
							{
							setState(234);
							((SelectContext)_localctx).out = match(OUTER);
							}
						}

						setState(237);
						((SelectContext)_localctx).join = match(JOIN);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case CROSS:
					{
					{
					setState(240);
					((SelectContext)_localctx).cross = match(CROSS);
					setState(241);
					((SelectContext)_localctx).join = match(JOIN);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(244);
					match(ON);
					setState(245);
					((SelectContext)_localctx).pjoin = join_cond();
					}
				}

				}
			}

			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(250);
				match(RPAREN);
				}
			}

			setState(253);
			((SelectContext)_localctx).pswrodf = swordf();
			setState(254);
			match(DOT);
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

	public static class SwordfContext extends ParserRuleContext {
		public List<SwordContext> sword() {
			return getRuleContexts(SwordContext.class);
		}
		public SwordContext sword(int i) {
			return getRuleContext(SwordContext.class,i);
		}
		public SwordfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_swordf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterSwordf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitSwordf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitSwordf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwordfContext swordf() throws RecognitionException {
		SwordfContext _localctx = new SwordfContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_swordf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==APPENDING || ((((_la - 378)) & ~0x3f) == 0 && ((1L << (_la - 378)) & ((1L << (FOR - 378)) | (1L << (GROUP - 378)) | (1L << (HAVING - 378)))) != 0) || _la==INTO || _la==ORDER || ((((_la - 883)) & ~0x3f) == 0 && ((1L << (_la - 883)) & ((1L << (UNION - 883)) | (1L << (UP - 883)) | (1L << (WHERE - 883)))) != 0)) {
				{
				{
				setState(256);
				sword();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class SwordContext extends ParserRuleContext {
		public Token prows;
		public Token mod;
		public Token cor;
		public Token table;
		public Token atsign;
		public VarContext trgt;
		public VarContext itab;
		public S_condContext conditions;
		public LidcommasContext s_group;
		public S_condContext s_group_cond;
		public Token wt;
		public SelectContext s_select;
		public Sort_keyContext s_sort_key;
		public TerminalNode UP() { return getToken(abapParser.UP, 0); }
		public TerminalNode TO() { return getToken(abapParser.TO, 0); }
		public TerminalNode ROWS() { return getToken(abapParser.ROWS, 0); }
		public TerminalNode NUM() { return getToken(abapParser.NUM, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode INTO() { return getToken(abapParser.INTO, 0); }
		public TerminalNode APPENDING() { return getToken(abapParser.APPENDING, 0); }
		public TerminalNode FIELDS() { return getToken(abapParser.FIELDS, 0); }
		public TerminalNode OF() { return getToken(abapParser.OF, 0); }
		public TerminalNode CORRESPONDING() { return getToken(abapParser.CORRESPONDING, 0); }
		public TerminalNode TABLE() { return getToken(abapParser.TABLE, 0); }
		public TerminalNode ATSIGN() { return getToken(abapParser.ATSIGN, 0); }
		public TerminalNode FOR() { return getToken(abapParser.FOR, 0); }
		public TerminalNode ALL() { return getToken(abapParser.ALL, 0); }
		public TerminalNode ENTRIES() { return getToken(abapParser.ENTRIES, 0); }
		public TerminalNode IN() { return getToken(abapParser.IN, 0); }
		public TerminalNode WHERE() { return getToken(abapParser.WHERE, 0); }
		public S_condContext s_cond() {
			return getRuleContext(S_condContext.class,0);
		}
		public TerminalNode GROUP() { return getToken(abapParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(abapParser.BY, 0); }
		public LidcommasContext lidcommas() {
			return getRuleContext(LidcommasContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(abapParser.HAVING, 0); }
		public TerminalNode UNION() { return getToken(abapParser.UNION, 0); }
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(abapParser.DISTINCT, 0); }
		public TerminalNode ORDER() { return getToken(abapParser.ORDER, 0); }
		public Sort_keyContext sort_key() {
			return getRuleContext(Sort_keyContext.class,0);
		}
		public SwordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterSword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitSword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitSword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwordContext sword() throws RecognitionException {
		SwordContext _localctx = new SwordContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sword);
		int _la;
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UP:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(262);
				match(UP);
				setState(263);
				match(TO);
				setState(264);
				((SwordContext)_localctx).prows = match(NUM);
				setState(265);
				match(ROWS);
				}
				}
				break;
			case APPENDING:
			case INTO:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(268);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTO:
					{
					setState(266);
					((SwordContext)_localctx).mod = match(INTO);
					}
					break;
				case APPENDING:
					{
					setState(267);
					((SwordContext)_localctx).mod = match(APPENDING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CORRESPONDING) {
					{
					setState(270);
					((SwordContext)_localctx).cor = match(CORRESPONDING);
					setState(271);
					match(FIELDS);
					setState(272);
					match(OF);
					}
				}

				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(275);
					((SwordContext)_localctx).table = match(TABLE);
					}
				}

				setState(279);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(278);
					((SwordContext)_localctx).atsign = match(ATSIGN);
					}
					break;
				}
				setState(281);
				((SwordContext)_localctx).trgt = var();
				}
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(282);
				match(FOR);
				setState(283);
				match(ALL);
				setState(284);
				match(ENTRIES);
				setState(285);
				match(IN);
				setState(286);
				((SwordContext)_localctx).itab = var();
				}
				}
				break;
			case WHERE:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(287);
				match(WHERE);
				setState(288);
				((SwordContext)_localctx).conditions = s_cond();
				}
				}
				break;
			case GROUP:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(289);
				match(GROUP);
				setState(290);
				match(BY);
				setState(291);
				((SwordContext)_localctx).s_group = lidcommas();
				}
				}
				break;
			case HAVING:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(292);
				match(HAVING);
				setState(293);
				((SwordContext)_localctx).s_group_cond = s_cond();
				}
				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(294);
				match(UNION);
				setState(297);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALL:
					{
					setState(295);
					((SwordContext)_localctx).wt = match(ALL);
					}
					break;
				case DISTINCT:
					{
					setState(296);
					((SwordContext)_localctx).wt = match(DISTINCT);
					}
					break;
				case SELECT:
					break;
				default:
					break;
				}
				setState(299);
				((SwordContext)_localctx).s_select = select();
				}
				}
				break;
			case ORDER:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(300);
				match(ORDER);
				setState(301);
				match(BY);
				setState(302);
				((SwordContext)_localctx).s_sort_key = sort_key();
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

	public static class Sort_keyContext extends ParserRuleContext {
		public Token skey;
		public LidcommasContext sk_cols;
		public TerminalNode KEY() { return getToken(abapParser.KEY, 0); }
		public TerminalNode PRIMARY() { return getToken(abapParser.PRIMARY, 0); }
		public LidcommasContext lidcommas() {
			return getRuleContext(LidcommasContext.class,0);
		}
		public Sort_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterSort_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitSort_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitSort_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sort_keyContext sort_key() throws RecognitionException {
		Sort_keyContext _localctx = new Sort_keyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sort_key);
		try {
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				((Sort_keyContext)_localctx).skey = match(PRIMARY);
				setState(306);
				match(KEY);
				}
				break;
			case RELATIONAL_OP:
			case ATSIGN:
			case DOT:
			case APPENDING:
			case DATA:
			case FIELDSYMBOL:
			case FOR:
			case GROUP:
			case HAVING:
			case INTO:
			case ORDER:
			case UNION:
			case UP:
			case WHERE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				((Sort_keyContext)_localctx).sk_cols = lidcommas();
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

	public static class ReadtableContext extends ParserRuleContext {
		public VarContext table;
		public Rtable_keyContext rtabk;
		public IndexContext idx;
		public Token ptype;
		public VarContext result;
		public Transport_optionsContext topt;
		public CastingContext cast;
		public TerminalNode READ() { return getToken(abapParser.READ, 0); }
		public TerminalNode TABLE() { return getToken(abapParser.TABLE, 0); }
		public TerminalNode DOT() { return getToken(abapParser.DOT, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode INTO() { return getToken(abapParser.INTO, 0); }
		public TerminalNode NO() { return getToken(abapParser.NO, 0); }
		public TerminalNode FIELDS() { return getToken(abapParser.FIELDS, 0); }
		public TerminalNode ASSIGNING() { return getToken(abapParser.ASSIGNING, 0); }
		public TerminalNode REFERENCE() { return getToken(abapParser.REFERENCE, 0); }
		public TerminalNode TRANSPORTING() { return getToken(abapParser.TRANSPORTING, 0); }
		public Rtable_keyContext rtable_key() {
			return getRuleContext(Rtable_keyContext.class,0);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public Transport_optionsContext transport_options() {
			return getRuleContext(Transport_optionsContext.class,0);
		}
		public CastingContext casting() {
			return getRuleContext(CastingContext.class,0);
		}
		public ReadtableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readtable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterReadtable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitReadtable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitReadtable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadtableContext readtable() throws RecognitionException {
		ReadtableContext _localctx = new ReadtableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_readtable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(READ);
			setState(311);
			match(TABLE);
			setState(312);
			((ReadtableContext)_localctx).table = var();
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WITH:
				{
				setState(313);
				((ReadtableContext)_localctx).rtabk = rtable_key();
				}
				break;
			case INDEX:
				{
				setState(314);
				((ReadtableContext)_localctx).idx = index();
				}
				break;
			case ASSIGNING:
			case INTO:
			case REFERENCE:
			case TRANSPORTING:
				break;
			default:
				break;
			}
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTO:
				{
				setState(317);
				((ReadtableContext)_localctx).ptype = match(INTO);
				}
				break;
			case ASSIGNING:
				{
				setState(318);
				((ReadtableContext)_localctx).ptype = match(ASSIGNING);
				}
				break;
			case REFERENCE:
				{
				setState(319);
				((ReadtableContext)_localctx).ptype = match(REFERENCE);
				setState(320);
				match(INTO);
				}
				break;
			case TRANSPORTING:
				{
				setState(321);
				((ReadtableContext)_localctx).ptype = match(TRANSPORTING);
				setState(322);
				match(NO);
				setState(323);
				match(FIELDS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(326);
			((ReadtableContext)_localctx).result = var();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMPARING || _la==TRANSPORTING) {
				{
				setState(327);
				((ReadtableContext)_localctx).topt = transport_options();
				}
			}

			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASTING) {
				{
				setState(330);
				((ReadtableContext)_localctx).cast = casting();
				}
			}

			setState(333);
			match(DOT);
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

	public static class Rtable_keyContext extends ParserRuleContext {
		public Token tab;
		public ColsContext cls;
		public TerminalNode WITH() { return getToken(abapParser.WITH, 0); }
		public TerminalNode KEY() { return getToken(abapParser.KEY, 0); }
		public ColsContext cols() {
			return getRuleContext(ColsContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(abapParser.TABLE, 0); }
		public Rtable_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rtable_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterRtable_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitRtable_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitRtable_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rtable_keyContext rtable_key() throws RecognitionException {
		Rtable_keyContext _localctx = new Rtable_keyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_rtable_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(WITH);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(336);
				((Rtable_keyContext)_localctx).tab = match(TABLE);
				}
			}

			setState(339);
			match(KEY);
			setState(340);
			((Rtable_keyContext)_localctx).cls = cols();
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

	public static class Transport_optionsContext extends ParserRuleContext {
		public Token ptype;
		public LidContext pclms;
		public Token pcnt;
		public TerminalNode COMPARING() { return getToken(abapParser.COMPARING, 0); }
		public LidContext lid() {
			return getRuleContext(LidContext.class,0);
		}
		public TerminalNode FIELDS() { return getToken(abapParser.FIELDS, 0); }
		public TerminalNode ALL() { return getToken(abapParser.ALL, 0); }
		public TerminalNode NO() { return getToken(abapParser.NO, 0); }
		public TerminalNode TRANSPORTING() { return getToken(abapParser.TRANSPORTING, 0); }
		public Transport_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transport_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterTransport_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitTransport_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitTransport_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transport_optionsContext transport_options() throws RecognitionException {
		Transport_optionsContext _localctx = new Transport_optionsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_transport_options);
		try {
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMPARING:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				((Transport_optionsContext)_localctx).ptype = match(COMPARING);
				setState(348);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT:
				case CASTING:
				case ID:
					{
					setState(343);
					((Transport_optionsContext)_localctx).pclms = lid();
					}
					break;
				case ALL:
					{
					{
					setState(344);
					((Transport_optionsContext)_localctx).pcnt = match(ALL);
					setState(345);
					match(FIELDS);
					}
					}
					break;
				case NO:
					{
					{
					setState(346);
					((Transport_optionsContext)_localctx).pcnt = match(NO);
					setState(347);
					match(FIELDS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case TRANSPORTING:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				((Transport_optionsContext)_localctx).ptype = match(TRANSPORTING);
				setState(354);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT:
				case CASTING:
				case ID:
					{
					setState(351);
					((Transport_optionsContext)_localctx).pclms = lid();
					}
					break;
				case ALL:
					{
					{
					setState(352);
					((Transport_optionsContext)_localctx).pcnt = match(ALL);
					setState(353);
					match(FIELDS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class CastingContext extends ParserRuleContext {
		public Token pcast;
		public TerminalNode CASTING() { return getToken(abapParser.CASTING, 0); }
		public TerminalNode TYPE() { return getToken(abapParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(abapParser.ID, 0); }
		public CastingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterCasting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitCasting(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitCasting(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastingContext casting() throws RecognitionException {
		CastingContext _localctx = new CastingContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_casting);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			((CastingContext)_localctx).pcast = match(CASTING);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(359);
				match(TYPE);
				setState(360);
				((CastingContext)_localctx).pcast = match(ID);
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

	public static class Inline_fields_declarationContext extends ParserRuleContext {
		public TerminalNode FIELDSYMBOL() { return getToken(abapParser.FIELDSYMBOL, 0); }
		public TerminalNode LPAREN() { return getToken(abapParser.LPAREN, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(abapParser.RPAREN, 0); }
		public Inline_fields_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inline_fields_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterInline_fields_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitInline_fields_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitInline_fields_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inline_fields_declarationContext inline_fields_declaration() throws RecognitionException {
		Inline_fields_declarationContext _localctx = new Inline_fields_declarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_inline_fields_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(FIELDSYMBOL);
			setState(364);
			match(LPAREN);
			setState(365);
			var();
			setState(366);
			match(RPAREN);
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

	public static class ColsContext extends ParserRuleContext {
		public List<ColContext> col() {
			return getRuleContexts(ColContext.class);
		}
		public ColContext col(int i) {
			return getRuleContext(ColContext.class,i);
		}
		public ColsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterCols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitCols(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitCols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColsContext cols() throws RecognitionException {
		ColsContext _localctx = new ColsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(368);
				col();
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ColContext extends ParserRuleContext {
		public Token p1;
		public Token pop;
		public VarContext p2;
		public ValueContext p3;
		public TerminalNode ID() { return getToken(abapParser.ID, 0); }
		public TerminalNode ASSIGNMENT_OP() { return getToken(abapParser.ASSIGNMENT_OP, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ColContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterCol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitCol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitCol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColContext col() throws RecognitionException {
		ColContext _localctx = new ColContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_col);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			((ColContext)_localctx).p1 = match(ID);
			setState(375);
			((ColContext)_localctx).pop = match(ASSIGNMENT_OP);
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONAL_OP:
			case ATSIGN:
			case DATA:
			case FIELDSYMBOL:
			case ID:
				{
				setState(376);
				((ColContext)_localctx).p2 = var();
				}
				break;
			case APO:
			case NUM:
				{
				setState(377);
				((ColContext)_localctx).p3 = value();
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

	public static class IndexContext extends ParserRuleContext {
		public VarContext pvar;
		public VarContext pkey;
		public TerminalNode INDEX() { return getToken(abapParser.INDEX, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode USING() { return getToken(abapParser.USING, 0); }
		public TerminalNode KEY() { return getToken(abapParser.KEY, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(INDEX);
			setState(381);
			((IndexContext)_localctx).pvar = var();
			{
			setState(382);
			match(USING);
			setState(383);
			match(KEY);
			setState(384);
			((IndexContext)_localctx).pkey = var();
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

	public static class S_condContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public S_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterS_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitS_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitS_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final S_condContext s_cond() throws RecognitionException {
		S_condContext _localctx = new S_condContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_s_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			expr(0);
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

	public static class LidcommasContext extends ParserRuleContext {
		public List<LidcommaContext> lidcomma() {
			return getRuleContexts(LidcommaContext.class);
		}
		public LidcommaContext lidcomma(int i) {
			return getRuleContext(LidcommaContext.class,i);
		}
		public LidcommasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lidcommas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterLidcommas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitLidcommas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitLidcommas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LidcommasContext lidcommas() throws RecognitionException {
		LidcommasContext _localctx = new LidcommasContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_lidcommas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RELATIONAL_OP || _la==ATSIGN || _la==DATA || _la==FIELDSYMBOL || _la==ID) {
				{
				{
				setState(388);
				lidcomma();
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class LidcommaContext extends ParserRuleContext {
		public VarContext lcol;
		public Token ldir;
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(abapParser.COMMA, 0); }
		public TerminalNode DESCENDING() { return getToken(abapParser.DESCENDING, 0); }
		public TerminalNode ASCENDING() { return getToken(abapParser.ASCENDING, 0); }
		public LidcommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lidcomma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterLidcomma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitLidcomma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitLidcomma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LidcommaContext lidcomma() throws RecognitionException {
		LidcommaContext _localctx = new LidcommaContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_lidcomma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			((LidcommaContext)_localctx).lcol = var();
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(395);
				match(COMMA);
				}
			}

			setState(400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DESCENDING:
				{
				setState(398);
				((LidcommaContext)_localctx).ldir = match(DESCENDING);
				}
				break;
			case ASCENDING:
				{
				setState(399);
				((LidcommaContext)_localctx).ldir = match(ASCENDING);
				}
				break;
			case RELATIONAL_OP:
			case ATSIGN:
			case DOT:
			case APPENDING:
			case DATA:
			case FIELDSYMBOL:
			case FOR:
			case FROM:
			case GROUP:
			case HAVING:
			case INTO:
			case ORDER:
			case UNION:
			case UP:
			case WHERE:
			case ID:
				break;
			default:
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

	public static class VarContext extends ParserRuleContext {
		public FieldsymbolContext fieldsymbol() {
			return getRuleContext(FieldsymbolContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Inline_data_declarationContext inline_data_declaration() {
			return getRuleContext(Inline_data_declarationContext.class,0);
		}
		public Inline_fields_declarationContext inline_fields_declaration() {
			return getRuleContext(Inline_fields_declarationContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_var);
		try {
			setState(406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONAL_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				fieldsymbol();
				}
				break;
			case ATSIGN:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				variable();
				}
				break;
			case DATA:
				enterOuterAlt(_localctx, 3);
				{
				setState(404);
				inline_data_declaration();
				}
				break;
			case FIELDSYMBOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(405);
				inline_fields_declaration();
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

	public static class VariableContext extends ParserRuleContext {
		public Token pvar;
		public TerminalNode ID() { return getToken(abapParser.ID, 0); }
		public TerminalNode ATSIGN() { return getToken(abapParser.ATSIGN, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATSIGN) {
				{
				setState(408);
				match(ATSIGN);
				}
			}

			setState(411);
			((VariableContext)_localctx).pvar = match(ID);
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

	public static class FieldsymbolContext extends ParserRuleContext {
		public Token fsym;
		public Token fscol;
		public List<TerminalNode> RELATIONAL_OP() { return getTokens(abapParser.RELATIONAL_OP); }
		public TerminalNode RELATIONAL_OP(int i) {
			return getToken(abapParser.RELATIONAL_OP, i);
		}
		public List<TerminalNode> ID() { return getTokens(abapParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(abapParser.ID, i);
		}
		public TerminalNode OP_SUB() { return getToken(abapParser.OP_SUB, 0); }
		public FieldsymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldsymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterFieldsymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitFieldsymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitFieldsymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldsymbolContext fieldsymbol() throws RecognitionException {
		FieldsymbolContext _localctx = new FieldsymbolContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_fieldsymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(RELATIONAL_OP);
			setState(414);
			((FieldsymbolContext)_localctx).fsym = match(ID);
			setState(415);
			match(RELATIONAL_OP);
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(416);
				match(OP_SUB);
				setState(417);
				((FieldsymbolContext)_localctx).fscol = match(ID);
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

	public static class Inline_data_declarationContext extends ParserRuleContext {
		public VarContext name;
		public TerminalNode DATA() { return getToken(abapParser.DATA, 0); }
		public TerminalNode LPAREN() { return getToken(abapParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(abapParser.RPAREN, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Inline_data_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inline_data_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterInline_data_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitInline_data_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitInline_data_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inline_data_declarationContext inline_data_declaration() throws RecognitionException {
		Inline_data_declarationContext _localctx = new Inline_data_declarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_inline_data_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(DATA);
			setState(421);
			match(LPAREN);
			setState(422);
			((Inline_data_declarationContext)_localctx).name = var();
			setState(423);
			match(RPAREN);
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
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumNodeContext extends ValueContext {
		public TerminalNode NUM() { return getToken(abapParser.NUM, 0); }
		public NumNodeContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterNumNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitNumNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitNumNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringNodeContext extends ValueContext {
		public List<TerminalNode> APO() { return getTokens(abapParser.APO); }
		public TerminalNode APO(int i) {
			return getToken(abapParser.APO, i);
		}
		public TerminalNode NUM() { return getToken(abapParser.NUM, 0); }
		public TerminalNode ID() { return getToken(abapParser.ID, 0); }
		public StringNodeContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterStringNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitStringNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitStringNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_value);
		int _la;
		try {
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				_localctx = new NumNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				match(NUM);
				}
				break;
			case APO:
				_localctx = new StringNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(426);
				match(APO);
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUM) {
					{
					setState(427);
					match(NUM);
					}
				}

				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(430);
					match(ID);
					}
				}

				setState(433);
				match(APO);
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

	public static class DeclarationContext extends ParserRuleContext {
		public Token pstruct;
		public Decl_eachloopContext pdecl;
		public TerminalNode DOT() { return getToken(abapParser.DOT, 0); }
		public TerminalNode DATA() { return getToken(abapParser.DATA, 0); }
		public TerminalNode TYPES() { return getToken(abapParser.TYPES, 0); }
		public Decl_eachloopContext decl_eachloop() {
			return getRuleContext(Decl_eachloopContext.class,0);
		}
		public TerminalNode DDOT() { return getToken(abapParser.DDOT, 0); }
		public TerminalNode BEGIN() { return getToken(abapParser.BEGIN, 0); }
		public List<TerminalNode> OF() { return getTokens(abapParser.OF); }
		public TerminalNode OF(int i) {
			return getToken(abapParser.OF, i);
		}
		public TerminalNode COMMA() { return getToken(abapParser.COMMA, 0); }
		public TerminalNode END() { return getToken(abapParser.END, 0); }
		public List<TerminalNode> ID() { return getTokens(abapParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(abapParser.ID, i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			_la = _input.LA(1);
			if ( !(_la==DATA || _la==TYPES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DDOT) {
				{
				setState(437);
				match(DDOT);
				}
			}

			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BEGIN) {
				{
				setState(440);
				match(BEGIN);
				setState(441);
				match(OF);
				setState(442);
				((DeclarationContext)_localctx).pstruct = match(ID);
				}
			}

			setState(445);
			((DeclarationContext)_localctx).pdecl = decl_eachloop();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(446);
				match(COMMA);
				setState(447);
				match(END);
				setState(448);
				match(OF);
				setState(449);
				match(ID);
				}
			}

			setState(452);
			match(DOT);
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

	public static class Decl_eachloopContext extends ParserRuleContext {
		public List<Decl_eachContext> decl_each() {
			return getRuleContexts(Decl_eachContext.class);
		}
		public Decl_eachContext decl_each(int i) {
			return getRuleContext(Decl_eachContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(abapParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(abapParser.COMMA, i);
		}
		public Decl_eachloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_eachloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterDecl_eachloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitDecl_eachloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitDecl_eachloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_eachloopContext decl_eachloop() throws RecognitionException {
		Decl_eachloopContext _localctx = new Decl_eachloopContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_decl_eachloop);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(455);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(454);
						match(COMMA);
						}
					}

					setState(457);
					decl_each();
					}
					} 
				}
				setState(462);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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

	public static class Decl_eachContext extends ParserRuleContext {
		public Token pvar;
		public Token pblen;
		public Token ptp;
		public Token ptbtp;
		public Token ptbl;
		public Token ptp2;
		public Token pof;
		public Token pref;
		public Token ptype;
		public Token palen;
		public LidContext pkeys;
		public Token pdec;
		public TabkeysContext ptabkeys;
		public Token pinitsize;
		public Token pheader;
		public Token ptval;
		public ValueContext pval;
		public Token pinit;
		public Token pread;
		public Token pbox;
		public List<TerminalNode> ID() { return getTokens(abapParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(abapParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(abapParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(abapParser.RPAREN, 0); }
		public TerminalNode TYPE() { return getToken(abapParser.TYPE, 0); }
		public TerminalNode LIKE() { return getToken(abapParser.LIKE, 0); }
		public TerminalNode TO() { return getToken(abapParser.TO, 0); }
		public TerminalNode LENGTH() { return getToken(abapParser.LENGTH, 0); }
		public List<TerminalNode> WITH() { return getTokens(abapParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(abapParser.WITH, i);
		}
		public TerminalNode UNIQUE() { return getToken(abapParser.UNIQUE, 0); }
		public TerminalNode KEY() { return getToken(abapParser.KEY, 0); }
		public TerminalNode DECIMALS() { return getToken(abapParser.DECIMALS, 0); }
		public List<TerminalNode> INITIAL() { return getTokens(abapParser.INITIAL); }
		public TerminalNode INITIAL(int i) {
			return getToken(abapParser.INITIAL, i);
		}
		public TerminalNode SIZE() { return getToken(abapParser.SIZE, 0); }
		public List<TerminalNode> LINE() { return getTokens(abapParser.LINE); }
		public TerminalNode LINE(int i) {
			return getToken(abapParser.LINE, i);
		}
		public TerminalNode IS() { return getToken(abapParser.IS, 0); }
		public List<TerminalNode> NUM() { return getTokens(abapParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(abapParser.NUM, i);
		}
		public TerminalNode STANDARD() { return getToken(abapParser.STANDARD, 0); }
		public TerminalNode SORTED() { return getToken(abapParser.SORTED, 0); }
		public TerminalNode HASHED() { return getToken(abapParser.HASHED, 0); }
		public TerminalNode TABLE() { return getToken(abapParser.TABLE, 0); }
		public TerminalNode RANGE() { return getToken(abapParser.RANGE, 0); }
		public TerminalNode OF() { return getToken(abapParser.OF, 0); }
		public TerminalNode REF() { return getToken(abapParser.REF, 0); }
		public LidContext lid() {
			return getRuleContext(LidContext.class,0);
		}
		public TabkeysContext tabkeys() {
			return getRuleContext(TabkeysContext.class,0);
		}
		public TerminalNode HEADER() { return getToken(abapParser.HEADER, 0); }
		public TerminalNode VALUE() { return getToken(abapParser.VALUE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode READONLY() { return getToken(abapParser.READONLY, 0); }
		public TerminalNode BOXED() { return getToken(abapParser.BOXED, 0); }
		public Decl_eachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_each; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterDecl_each(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitDecl_each(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitDecl_each(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_eachContext decl_each() throws RecognitionException {
		Decl_eachContext _localctx = new Decl_eachContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_decl_each);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			((Decl_eachContext)_localctx).pvar = match(ID);
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(464);
				match(LPAREN);
				setState(465);
				((Decl_eachContext)_localctx).pblen = match(NUM);
				setState(466);
				match(RPAREN);
				}
			}

			setState(471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				{
				setState(469);
				((Decl_eachContext)_localctx).ptp = match(TYPE);
				}
				break;
			case LIKE:
				{
				setState(470);
				((Decl_eachContext)_localctx).ptp = match(LIKE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STANDARD:
				{
				setState(473);
				((Decl_eachContext)_localctx).ptbtp = match(STANDARD);
				}
				break;
			case SORTED:
				{
				setState(474);
				((Decl_eachContext)_localctx).ptbtp = match(SORTED);
				}
				break;
			case HASHED:
				{
				setState(475);
				((Decl_eachContext)_localctx).ptbtp = match(HASHED);
				}
				break;
			case LINE:
			case OF:
			case RANGE:
			case REF:
			case TABLE:
			case ID:
				break;
			default:
				break;
			}
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(478);
				((Decl_eachContext)_localctx).ptbl = match(TABLE);
				}
			}

			setState(483);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LINE:
				{
				setState(481);
				((Decl_eachContext)_localctx).ptp2 = match(LINE);
				}
				break;
			case RANGE:
				{
				setState(482);
				((Decl_eachContext)_localctx).ptp2 = match(RANGE);
				}
				break;
			case OF:
			case REF:
			case ID:
				break;
			default:
				break;
			}
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OF) {
				{
				setState(485);
				((Decl_eachContext)_localctx).pof = match(OF);
				}
			}

			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REF) {
				{
				setState(488);
				((Decl_eachContext)_localctx).pref = match(REF);
				setState(489);
				match(TO);
				}
			}

			setState(492);
			((Decl_eachContext)_localctx).ptype = match(ID);
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LENGTH) {
				{
				setState(493);
				match(LENGTH);
				setState(494);
				((Decl_eachContext)_localctx).palen = match(NUM);
				}
			}

			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(497);
				match(WITH);
				setState(498);
				match(UNIQUE);
				setState(499);
				match(KEY);
				setState(500);
				((Decl_eachContext)_localctx).pkeys = lid();
				}
				break;
			}
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECIMALS) {
				{
				setState(503);
				match(DECIMALS);
				setState(504);
				((Decl_eachContext)_localctx).pdec = match(NUM);
				}
			}

			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(507);
				((Decl_eachContext)_localctx).ptabkeys = tabkeys();
				}
				break;
			}
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INITIAL) {
				{
				setState(510);
				match(INITIAL);
				setState(511);
				match(SIZE);
				setState(512);
				((Decl_eachContext)_localctx).pinitsize = match(NUM);
				}
			}

			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(515);
				match(WITH);
				setState(516);
				((Decl_eachContext)_localctx).pheader = match(HEADER);
				setState(517);
				match(LINE);
				}
			}

			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUE) {
				{
				setState(520);
				((Decl_eachContext)_localctx).ptval = match(VALUE);
				}
			}

			setState(526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case APO:
			case NUM:
				{
				setState(523);
				((Decl_eachContext)_localctx).pval = value();
				}
				break;
			case IS:
				{
				setState(524);
				match(IS);
				setState(525);
				((Decl_eachContext)_localctx).pinit = match(INITIAL);
				}
				break;
			case DOT:
			case COMMA:
			case BOXED:
			case READONLY:
			case ID:
				break;
			default:
				break;
			}
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==READONLY) {
				{
				setState(528);
				((Decl_eachContext)_localctx).pread = match(READONLY);
				}
			}

			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOXED) {
				{
				setState(531);
				((Decl_eachContext)_localctx).pbox = match(BOXED);
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

	public static class LidContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(abapParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(abapParser.ID, i);
		}
		public LidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterLid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitLid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitLid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LidContext lid() throws RecognitionException {
		LidContext _localctx = new LidContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_lid);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(534);
					match(ID);
					}
					} 
				}
				setState(539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
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

	public static class TabkeysContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(abapParser.ID, 0); }
		public TabkeysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabkeys; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterTabkeys(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitTabkeys(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitTabkeys(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabkeysContext tabkeys() throws RecognitionException {
		TabkeysContext _localctx = new TabkeysContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_tabkeys);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(ID);
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

	public static class Join_condContext extends ParserRuleContext {
		public Token oper;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(abapParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(abapParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(abapParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(abapParser.OR, i);
		}
		public Join_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).enterJoin_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof abapListener ) ((abapListener)listener).exitJoin_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof abapVisitor ) return (T)((abapVisitor<? extends T>)visitor).visitJoin_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_condContext join_cond() throws RecognitionException {
		Join_condContext _localctx = new Join_condContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_join_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			expr(0);
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(545);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AND:
					{
					setState(543);
					((Join_condContext)_localctx).oper = match(AND);
					}
					break;
				case OR:
					{
					setState(544);
					((Join_condContext)_localctx).oper = match(OR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(547);
				expr(0);
				}
				}
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u03ac\u022c\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\7\2T\n\2\f"+
		"\2\16\2W\13\2\3\3\7\3Z\n\3\f\3\16\3]\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4i\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\5\7s\n\7\3\7\3\7"+
		"\3\7\3\b\3\b\5\bz\n\b\3\b\3\b\5\b~\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0086"+
		"\n\b\3\b\3\b\3\b\3\t\7\t\u008c\n\t\f\t\16\t\u008f\13\t\3\n\3\n\5\n\u0093"+
		"\n\n\3\n\3\n\5\n\u0097\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u00b0\n"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00bd"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00cb\n\17\3\17\7\17\u00ce\n\17\f\17\16\17\u00d1\13\17\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00d8\n\20\3\20\3\20\5\20\u00dc\n\20\3\20\3\20\5\20\u00e0"+
		"\n\20\3\20\3\20\3\20\5\20\u00e5\n\20\3\20\5\20\u00e8\n\20\3\20\3\20\3"+
		"\20\3\20\5\20\u00ee\n\20\3\20\5\20\u00f1\n\20\3\20\3\20\5\20\u00f5\n\20"+
		"\3\20\3\20\5\20\u00f9\n\20\5\20\u00fb\n\20\3\20\5\20\u00fe\n\20\3\20\3"+
		"\20\3\20\3\21\7\21\u0104\n\21\f\21\16\21\u0107\13\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\5\22\u010f\n\22\3\22\3\22\3\22\5\22\u0114\n\22\3\22\5\22"+
		"\u0117\n\22\3\22\5\22\u011a\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u012c\n\22\3\22\3\22"+
		"\3\22\3\22\5\22\u0132\n\22\3\23\3\23\3\23\5\23\u0137\n\23\3\24\3\24\3"+
		"\24\3\24\3\24\5\24\u013e\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u0147\n\24\3\24\3\24\5\24\u014b\n\24\3\24\5\24\u014e\n\24\3\24\3\24\3"+
		"\25\3\25\5\25\u0154\n\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u015f\n\26\3\26\3\26\3\26\3\26\5\26\u0165\n\26\5\26\u0167\n\26\3"+
		"\27\3\27\3\27\5\27\u016c\n\27\3\30\3\30\3\30\3\30\3\30\3\31\7\31\u0174"+
		"\n\31\f\31\16\31\u0177\13\31\3\32\3\32\3\32\3\32\5\32\u017d\n\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\7\35\u0188\n\35\f\35\16\35\u018b"+
		"\13\35\3\36\3\36\5\36\u018f\n\36\3\36\3\36\5\36\u0193\n\36\3\37\3\37\3"+
		"\37\3\37\5\37\u0199\n\37\3 \5 \u019c\n \3 \3 \3!\3!\3!\3!\3!\5!\u01a5"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\5#\u01af\n#\3#\5#\u01b2\n#\3#\5#\u01b5"+
		"\n#\3$\3$\5$\u01b9\n$\3$\3$\3$\5$\u01be\n$\3$\3$\3$\3$\3$\5$\u01c5\n$"+
		"\3$\3$\3%\5%\u01ca\n%\3%\7%\u01cd\n%\f%\16%\u01d0\13%\3&\3&\3&\3&\5&\u01d6"+
		"\n&\3&\3&\5&\u01da\n&\3&\3&\3&\5&\u01df\n&\3&\5&\u01e2\n&\3&\3&\5&\u01e6"+
		"\n&\3&\5&\u01e9\n&\3&\3&\5&\u01ed\n&\3&\3&\3&\5&\u01f2\n&\3&\3&\3&\3&"+
		"\5&\u01f8\n&\3&\3&\5&\u01fc\n&\3&\5&\u01ff\n&\3&\3&\3&\5&\u0204\n&\3&"+
		"\3&\3&\5&\u0209\n&\3&\5&\u020c\n&\3&\3&\3&\5&\u0211\n&\3&\5&\u0214\n&"+
		"\3&\5&\u0217\n&\3\'\7\'\u021a\n\'\f\'\16\'\u021d\13\'\3(\3(\3)\3)\3)\5"+
		")\u0224\n)\3)\7)\u0227\n)\f)\16)\u022a\13)\3)\2\3\34*\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP\2\4\4\2FF\u01d3"+
		"\u01d3\4\2\u00de\u00de\u0370\u0370\2\u0276\2U\3\2\2\2\4[\3\2\2\2\6h\3"+
		"\2\2\2\bj\3\2\2\2\nl\3\2\2\2\fp\3\2\2\2\16w\3\2\2\2\20\u008d\3\2\2\2\22"+
		"\u0090\3\2\2\2\24\u009b\3\2\2\2\26\u00a0\3\2\2\2\30\u00a2\3\2\2\2\32\u00af"+
		"\3\2\2\2\34\u00bc\3\2\2\2\36\u00d2\3\2\2\2 \u0105\3\2\2\2\"\u0131\3\2"+
		"\2\2$\u0136\3\2\2\2&\u0138\3\2\2\2(\u0151\3\2\2\2*\u0166\3\2\2\2,\u0168"+
		"\3\2\2\2.\u016d\3\2\2\2\60\u0175\3\2\2\2\62\u0178\3\2\2\2\64\u017e\3\2"+
		"\2\2\66\u0184\3\2\2\28\u0189\3\2\2\2:\u018c\3\2\2\2<\u0198\3\2\2\2>\u019b"+
		"\3\2\2\2@\u019f\3\2\2\2B\u01a6\3\2\2\2D\u01b4\3\2\2\2F\u01b6\3\2\2\2H"+
		"\u01ce\3\2\2\2J\u01d1\3\2\2\2L\u021b\3\2\2\2N\u021e\3\2\2\2P\u0220\3\2"+
		"\2\2RT\5\6\4\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\3\3\2\2\2WU\3"+
		"\2\2\2XZ\5\6\4\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\5\3\2\2\2"+
		"][\3\2\2\2^i\5\b\5\2_i\5F$\2`i\5\n\6\2ai\5\f\7\2bi\5\16\b\2ci\5\36\20"+
		"\2di\5&\24\2ei\5\30\r\2fi\5\24\13\2gi\5\26\f\2h^\3\2\2\2h_\3\2\2\2h`\3"+
		"\2\2\2ha\3\2\2\2hb\3\2\2\2hc\3\2\2\2hd\3\2\2\2he\3\2\2\2hf\3\2\2\2hg\3"+
		"\2\2\2i\7\3\2\2\2jk\7\25\2\2k\t\3\2\2\2lm\7\u02bc\2\2mn\7\u03aa\2\2no"+
		"\7\25\2\2o\13\3\2\2\2pr\7\u0095\2\2qs\7\20\2\2rq\3\2\2\2rs\3\2\2\2st\3"+
		"\2\2\2tu\58\35\2uv\7\25\2\2v\r\3\2\2\2wy\7\u01ad\2\2xz\7\27\2\2yx\3\2"+
		"\2\2yz\3\2\2\2z{\3\2\2\2{}\5\34\17\2|~\7\30\2\2}|\3\2\2\2}~\3\2\2\2~\177"+
		"\3\2\2\2\177\u0080\7\25\2\2\u0080\u0081\5\4\3\2\u0081\u0085\5\20\t\2\u0082"+
		"\u0083\7\u0117\2\2\u0083\u0084\7\25\2\2\u0084\u0086\5\4\3\2\u0085\u0082"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7\u0131\2"+
		"\2\u0088\u0089\7\25\2\2\u0089\17\3\2\2\2\u008a\u008c\5\22\n\2\u008b\u008a"+
		"\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\21\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0092\7\u0118\2\2\u0091\u0093\7"+
		"\27\2\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0096\5\34\17\2\u0095\u0097\7\30\2\2\u0096\u0095\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7\25\2\2\u0099\u009a\5\4\3\2"+
		"\u009a\23\3\2\2\2\u009b\u009c\5<\37\2\u009c\u009d\7\b\2\2\u009d\u009e"+
		"\5\34\17\2\u009e\u009f\7\25\2\2\u009f\25\3\2\2\2\u00a0\u00a1\7\u03ac\2"+
		"\2\u00a1\27\3\2\2\2\u00a2\u00a3\7\u0209\2\2\u00a3\u00a4\7I\2\2\u00a4\u00a5"+
		"\5<\37\2\u00a5\u00a6\t\2\2\2\u00a6\u00a7\5<\37\2\u00a7\u00a8\7\25\2\2"+
		"\u00a8\u00a9\5\4\3\2\u00a9\u00aa\7\u0134\2\2\u00aa\u00ab\7\25\2\2\u00ab"+
		"\31\3\2\2\2\u00ac\u00b0\7\r\2\2\u00ad\u00b0\7\b\2\2\u00ae\u00b0\7\f\2"+
		"\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\33"+
		"\3\2\2\2\u00b1\u00b2\b\17\1\2\u00b2\u00b3\7\31\2\2\u00b3\u00b4\5\34\17"+
		"\2\u00b4\u00b5\7\32\2\2\u00b5\u00bd\3\2\2\2\u00b6\u00b7\7\27\2\2\u00b7"+
		"\u00b8\5\34\17\2\u00b8\u00b9\7\30\2\2\u00b9\u00bd\3\2\2\2\u00ba\u00bd"+
		"\5<\37\2\u00bb\u00bd\5D#\2\u00bc\u00b1\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00cf\3\2\2\2\u00be\u00bf\f\6"+
		"\2\2\u00bf\u00c0\5\32\16\2\u00c0\u00c1\5\34\17\7\u00c1\u00ce\3\2\2\2\u00c2"+
		"\u00ca\f\5\2\2\u00c3\u00cb\7\5\2\2\u00c4\u00cb\7\4\2\2\u00c5\u00cb\7\6"+
		"\2\2\u00c6\u00cb\7\7\2\2\u00c7\u00cb\7\u0109\2\2\u00c8\u00cb\7\u022a\2"+
		"\2\u00c9\u00cb\7\3\2\2\u00ca\u00c3\3\2\2\2\u00ca\u00c4\3\2\2\2\u00ca\u00c5"+
		"\3\2\2\2\u00ca\u00c6\3\2\2\2\u00ca\u00c7\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\5\34\17\6\u00cd\u00be\3"+
		"\2\2\2\u00cd\u00c2\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\35\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d7\7\u02ec"+
		"\2\2\u00d3\u00d8\7\u02ff\2\2\u00d4\u00d5\7\u02ff\2\2\u00d5\u00d6\7\u017c"+
		"\2\2\u00d6\u00d8\7\u037e\2\2\u00d7\u00d3\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00dc\58\35\2\u00da\u00dc\7\6"+
		"\2\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00df\7\u0185\2\2\u00de\u00e0\7\27\2\2\u00df\u00de\3\2\2\2\u00df\u00e0"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e4\7\u03aa\2\2\u00e2\u00e3\7?\2"+
		"\2\u00e3\u00e5\7\u03aa\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00fa\3\2\2\2\u00e6\u00e8\7\u01c6\2\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8"+
		"\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00f5\7\u01da\2\2\u00ea\u00f1\7\u01ea"+
		"\2\2\u00eb\u00ed\7\u02cd\2\2\u00ec\u00ee\7\u026e\2\2\u00ed\u00ec\3\2\2"+
		"\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\7\u01da\2\2\u00f0"+
		"\u00ea\3\2\2\2\u00f0\u00eb\3\2\2\2\u00f1\u00f5\3\2\2\2\u00f2\u00f3\7\u00d2"+
		"\2\2\u00f3\u00f5\7\u01da\2\2\u00f4\u00e7\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f7\7\u0262\2\2\u00f7\u00f9"+
		"\5P)\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa"+
		"\u00f4\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fe\7\30"+
		"\2\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0100\5 \21\2\u0100\u0101\7\25\2\2\u0101\37\3\2\2\2\u0102\u0104\5\"\22"+
		"\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106!\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7\u037d\2\2\u0109"+
		"\u010a\7\u0355\2\2\u010a\u010b\7\u03a9\2\2\u010b\u0132\7\u02d8\2\2\u010c"+
		"\u010f\7\u01d3\2\2\u010d\u010f\7:\2\2\u010e\u010c\3\2\2\2\u010e\u010d"+
		"\3\2\2\2\u010f\u0113\3\2\2\2\u0110\u0111\7\u00c9\2\2\u0111\u0112\7\u016b"+
		"\2\2\u0112\u0114\7\u025e\2\2\u0113\u0110\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0116\3\2\2\2\u0115\u0117\7\u033d\2\2\u0116\u0115\3\2\2\2\u0116\u0117"+
		"\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u011a\7\17\2\2\u0119\u0118\3\2\2\2"+
		"\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0132\5<\37\2\u011c\u011d"+
		"\7\u017c\2\2\u011d\u011e\7\60\2\2\u011e\u011f\7\u0142\2\2\u011f\u0120"+
		"\7\u01b7\2\2\u0120\u0132\5<\37\2\u0121\u0122\7\u0394\2\2\u0122\u0132\5"+
		"\66\34\2\u0123\u0124\7\u0194\2\2\u0124\u0125\7m\2\2\u0125\u0132\58\35"+
		"\2\u0126\u0127\7\u019b\2\2\u0127\u0132\5\66\34\2\u0128\u012b\7\u0375\2"+
		"\2\u0129\u012c\7\60\2\2\u012a\u012c\7\u0108\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0132\5\36"+
		"\20\2\u012e\u012f\7\u026a\2\2\u012f\u0130\7m\2\2\u0130\u0132\5$\23\2\u0131"+
		"\u0108\3\2\2\2\u0131\u010e\3\2\2\2\u0131\u011c\3\2\2\2\u0131\u0121\3\2"+
		"\2\2\u0131\u0123\3\2\2\2\u0131\u0126\3\2\2\2\u0131\u0128\3\2\2\2\u0131"+
		"\u012e\3\2\2\2\u0132#\3\2\2\2\u0133\u0134\7\u028f\2\2\u0134\u0137\7\u01de"+
		"\2\2\u0135\u0137\58\35\2\u0136\u0133\3\2\2\2\u0136\u0135\3\2\2\2\u0137"+
		"%\3\2\2\2\u0138\u0139\7\u02a7\2\2\u0139\u013a\7\u033d\2\2\u013a\u013d"+
		"\5<\37\2\u013b\u013e\5(\25\2\u013c\u013e\5\64\33\2\u013d\u013b\3\2\2\2"+
		"\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0146\3\2\2\2\u013f\u0147"+
		"\7\u01d3\2\2\u0140\u0147\7F\2\2\u0141\u0142\7\u02b3\2\2\u0142\u0147\7"+
		"\u01d3\2\2\u0143\u0144\7\u0361\2\2\u0144\u0145\7\u0242\2\2\u0145\u0147"+
		"\7\u016b\2\2\u0146\u013f\3\2\2\2\u0146\u0140\3\2\2\2\u0146\u0141\3\2\2"+
		"\2\u0146\u0143\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\5<\37\2\u0149\u014b"+
		"\5*\26\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c"+
		"\u014e\5,\27\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\u0150\7\25\2\2\u0150\'\3\2\2\2\u0151\u0153\7\u0399\2\2\u0152"+
		"\u0154\7\u033d\2\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155"+
		"\3\2\2\2\u0155\u0156\7\u01de\2\2\u0156\u0157\5\60\31\2\u0157)\3\2\2\2"+
		"\u0158\u015e\7\u00b1\2\2\u0159\u015f\5L\'\2\u015a\u015b\7\60\2\2\u015b"+
		"\u015f\7\u016b\2\2\u015c\u015d\7\u0242\2\2\u015d\u015f\7\u016b\2\2\u015e"+
		"\u0159\3\2\2\2\u015e\u015a\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0167\3\2"+
		"\2\2\u0160\u0164\7\u0361\2\2\u0161\u0165\5L\'\2\u0162\u0163\7\60\2\2\u0163"+
		"\u0165\7\u016b\2\2\u0164\u0161\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0167"+
		"\3\2\2\2\u0166\u0158\3\2\2\2\u0166\u0160\3\2\2\2\u0167+\3\2\2\2\u0168"+
		"\u016b\7|\2\2\u0169\u016a\7\u036d\2\2\u016a\u016c\7\u03aa\2\2\u016b\u0169"+
		"\3\2\2\2\u016b\u016c\3\2\2\2\u016c-\3\2\2\2\u016d\u016e\7\u0169\2\2\u016e"+
		"\u016f\7\27\2\2\u016f\u0170\5<\37\2\u0170\u0171\7\30\2\2\u0171/\3\2\2"+
		"\2\u0172\u0174\5\62\32\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\61\3\2\2\2\u0177\u0175\3\2\2"+
		"\2\u0178\u0179\7\u03aa\2\2\u0179\u017c\7\b\2\2\u017a\u017d\5<\37\2\u017b"+
		"\u017d\5D#\2\u017c\u017a\3\2\2\2\u017c\u017b\3\2\2\2\u017d\63\3\2\2\2"+
		"\u017e\u017f\7\u01be\2\2\u017f\u0180\5<\37\2\u0180\u0181\7\u0382\2\2\u0181"+
		"\u0182\7\u01de\2\2\u0182\u0183\5<\37\2\u0183\65\3\2\2\2\u0184\u0185\5"+
		"\34\17\2\u0185\67\3\2\2\2\u0186\u0188\5:\36\2\u0187\u0186\3\2\2\2\u0188"+
		"\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a9\3\2\2\2"+
		"\u018b\u0189\3\2\2\2\u018c\u018e\5<\37\2\u018d\u018f\7\26\2\2\u018e\u018d"+
		"\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u0193\7\u00fd\2"+
		"\2\u0191\u0193\7A\2\2\u0192\u0190\3\2\2\2\u0192\u0191\3\2\2\2\u0192\u0193"+
		"\3\2\2\2\u0193;\3\2\2\2\u0194\u0199\5@!\2\u0195\u0199\5> \2\u0196\u0199"+
		"\5B\"\2\u0197\u0199\5.\30\2\u0198\u0194\3\2\2\2\u0198\u0195\3\2\2\2\u0198"+
		"\u0196\3\2\2\2\u0198\u0197\3\2\2\2\u0199=\3\2\2\2\u019a\u019c\7\17\2\2"+
		"\u019b\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e"+
		"\7\u03aa\2\2\u019e?\3\2\2\2\u019f\u01a0\7\f\2\2\u01a0\u01a1\7\u03aa\2"+
		"\2\u01a1\u01a4\7\f\2\2\u01a2\u01a3\7\5\2\2\u01a3\u01a5\7\u03aa\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5A\3\2\2\2\u01a6\u01a7\7\u00de"+
		"\2\2\u01a7\u01a8\7\27\2\2\u01a8\u01a9\5<\37\2\u01a9\u01aa\7\30\2\2\u01aa"+
		"C\3\2\2\2\u01ab\u01b5\7\u03a9\2\2\u01ac\u01ae\7\21\2\2\u01ad\u01af\7\u03a9"+
		"\2\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0"+
		"\u01b2\7\u03aa\2\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3"+
		"\3\2\2\2\u01b3\u01b5\7\21\2\2\u01b4\u01ab\3\2\2\2\u01b4\u01ac\3\2\2\2"+
		"\u01b5E\3\2\2\2\u01b6\u01b8\t\3\2\2\u01b7\u01b9\7\20\2\2\u01b8\u01b7\3"+
		"\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bd\3\2\2\2\u01ba\u01bb\7U\2\2\u01bb"+
		"\u01bc\7\u025e\2\2\u01bc\u01be\7\u03aa\2\2\u01bd\u01ba\3\2\2\2\u01bd\u01be"+
		"\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c4\5H%\2\u01c0\u01c1\7\26\2\2\u01c1"+
		"\u01c2\7\u011d\2\2\u01c2\u01c3\7\u025e\2\2\u01c3\u01c5\7\u03aa\2\2\u01c4"+
		"\u01c0\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\7\25"+
		"\2\2\u01c7G\3\2\2\2\u01c8\u01ca\7\26\2\2\u01c9\u01c8\3\2\2\2\u01c9\u01ca"+
		"\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\5J&\2\u01cc\u01c9\3\2\2\2\u01cd"+
		"\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cfI\3\2\2\2"+
		"\u01d0\u01ce\3\2\2\2\u01d1\u01d5\7\u03aa\2\2\u01d2\u01d3\7\27\2\2\u01d3"+
		"\u01d4\7\u03a9\2\2\u01d4\u01d6\7\30\2\2\u01d5\u01d2\3\2\2\2\u01d5\u01d6"+
		"\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01da\7\u036d\2\2\u01d8\u01da\7\u01f3"+
		"\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01d8\3\2\2\2\u01da\u01de\3\2\2\2\u01db"+
		"\u01df\7\u0313\2\2\u01dc\u01df\7\u0307\2\2\u01dd\u01df\7\u019a\2\2\u01de"+
		"\u01db\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01dd\3\2\2\2\u01de\u01df\3\2"+
		"\2\2\u01df\u01e1\3\2\2\2\u01e0\u01e2\7\u033d\2\2\u01e1\u01e0\3\2\2\2\u01e1"+
		"\u01e2\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e6\7\u01f4\2\2\u01e4\u01e6"+
		"\7\u02a4\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6\3\2\2"+
		"\2\u01e6\u01e8\3\2\2\2\u01e7\u01e9\7\u025e\2\2\u01e8\u01e7\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01eb\7\u02b2\2\2\u01eb\u01ed"+
		"\7\u0355\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\3\2\2"+
		"\2\u01ee\u01f1\7\u03aa\2\2\u01ef\u01f0\7\u01ef\2\2\u01f0\u01f2\7\u03a9"+
		"\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f7\3\2\2\2\u01f3"+
		"\u01f4\7\u0399\2\2\u01f4\u01f5\7\u0376\2\2\u01f5\u01f6\7\u01de\2\2\u01f6"+
		"\u01f8\5L\'\2\u01f7\u01f3\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fb\3\2"+
		"\2\2\u01f9\u01fa\7\u00f1\2\2\u01fa\u01fc\7\u03a9\2\2\u01fb\u01f9\3\2\2"+
		"\2\u01fb\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01ff\5N(\2\u01fe\u01fd"+
		"\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0203\3\2\2\2\u0200\u0201\7\u01c4\2"+
		"\2\u0201\u0202\7\u0300\2\2\u0202\u0204\7\u03a9\2\2\u0203\u0200\3\2\2\2"+
		"\u0203\u0204\3\2\2\2\u0204\u0208\3\2\2\2\u0205\u0206\7\u0399\2\2\u0206"+
		"\u0207\7\u019e\2\2\u0207\u0209\7\u01f4\2\2\u0208\u0205\3\2\2\2\u0208\u0209"+
		"\3\2\2\2\u0209\u020b\3\2\2\2\u020a\u020c\7\u0385\2\2\u020b\u020a\3\2\2"+
		"\2\u020b\u020c\3\2\2\2\u020c\u0210\3\2\2\2\u020d\u0211\5D#\2\u020e\u020f"+
		"\7\u01d6\2\2\u020f\u0211\7\u01c4\2\2\u0210\u020d\3\2\2\2\u0210\u020e\3"+
		"\2\2\2\u0210\u0211\3\2\2\2\u0211\u0213\3\2\2\2\u0212\u0214\7\u02a8\2\2"+
		"\u0213\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0216\3\2\2\2\u0215\u0217"+
		"\7i\2\2\u0216\u0215\3\2\2\2\u0216\u0217\3\2\2\2\u0217K\3\2\2\2\u0218\u021a"+
		"\7\u03aa\2\2\u0219\u0218\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2\2"+
		"\2\u021b\u021c\3\2\2\2\u021cM\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u021f"+
		"\7\u03aa\2\2\u021fO\3\2\2\2\u0220\u0228\5\34\17\2\u0221\u0224\7\65\2\2"+
		"\u0222\u0224\7\u0268\2\2\u0223\u0221\3\2\2\2\u0223\u0222\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225\u0227\5\34\17\2\u0226\u0223\3\2\2\2\u0227\u022a\3"+
		"\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229Q\3\2\2\2\u022a\u0228"+
		"\3\2\2\2QU[hry}\u0085\u008d\u0092\u0096\u00af\u00bc\u00ca\u00cd\u00cf"+
		"\u00d7\u00db\u00df\u00e4\u00e7\u00ed\u00f0\u00f4\u00f8\u00fa\u00fd\u0105"+
		"\u010e\u0113\u0116\u0119\u012b\u0131\u0136\u013d\u0146\u014a\u014d\u0153"+
		"\u015e\u0164\u0166\u016b\u0175\u017c\u0189\u018e\u0192\u0198\u019b\u01a4"+
		"\u01ae\u01b1\u01b4\u01b8\u01bd\u01c4\u01c9\u01ce\u01d5\u01d9\u01de\u01e1"+
		"\u01e5\u01e8\u01ec\u01f1\u01f7\u01fb\u01fe\u0203\u0208\u020b\u0210\u0213"+
		"\u0216\u021b\u0223\u0228";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}