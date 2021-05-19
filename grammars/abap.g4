grammar abap;
//import abap_op_key;
OP_ADD: '+';
OP_SUB: '-';
OP_MUL: '*';
OP_DIV: '/';

ASSIGNMENT_OP: EQ_OP | '?=';
ARITHMETIC_OP: OP_ADD | OP_SUB | OP_MUL | OP_DIV | DIV | MOD | '**';
BIT_OP: BITAND | BITOR | BITXOR | BITNOT;
STRING_OP: '&&';
RELATIONAL_OP: EQ_OP | '<>' | LT_OP | GT_OP | '<=' | '>=' | BETWEEN;
BOOLEAN_OP: AND | OR | XOR | NOT;
LITERAL_OP: '&';

ATSIGN: '@';
DDOT: ':';
APO: '\'';

EQ_OP: '=';
LT_OP: '<';
GT_OP: '>';
DOT: '.';
COMMA: ',';
LPAREN: '(';
RPAREN: ')';
SQLPAREN: '[';
SQRPAREN: ']';
ARROW: '->';
NEWLINE_CHAR: ('\r\n'|'\n'|'\r') -> channel(HIDDEN);


ABAP_SYSTEM_TIMEZONE : [aA][bB][aA][pP][_][sS][yY][sS][tT][eE][mM][_][tT][iI][mM][eE][zZ][oO][nN][eE] ;
ABAP_USER_TIMEZONE : [aA][bB][aA][pP][_][uU][sS][eE][rR][_][tT][iI][mM][eE][zZ][oO][nN][eE] ;
ABAPSOURCE : [aA][bB][aA][pP][-][sS][oO][uU][rR][cC][eE] ;
ABBREVIATED : [aA][bB][bB][rR][eE][vV][iI][aA][tT][eE][dD] ;
ABS : [aA][bB][sS] ;
ABSTRACT : [aA][bB][sS][tT][rR][aA][cC][tT] ;
ACCEPT : [aA][cC][cC][eE][pP][tT] ;
ACCEPTING : [aA][cC][cC][eE][pP][tT][iI][nN][gG] ;
ACCORDING : [aA][cC][cC][oO][rR][dD][iI][nN][gG] ;
ACTIVATION : [aA][cC][tT][iI][vV][aA][tT][iI][oO][nN] ;
ACTUAL : [aA][cC][tT][uU][aA][lL] ;
ADABAS : [aA][dD][aA][bB][aA][sS] ;
ADD : [aA][dD][dD] ;
ADDCORRESPONDING : [aA][dD][dD][-][cC][oO][rR][rR][eE][sS][pP][oO][nN][dD][iI][nN][gG] ;
ADJACENT : [aA][dD][jJ][aA][cC][eE][nN][tT] ;
AFTER : [aA][fF][tT][eE][rR] ;
ALIAS : [aA][lL][iI][aA][sS] ;
ALIASES : [aA][lL][iI][aA][sS][eE][sS] ;
ALIGN : [aA][lL][iI][gG][nN] ;
ALL : [aA][lL][lL] ;
ALLOCATE : [aA][lL][lL][oO][cC][aA][tT][eE] ;
ALPHA : [aA][lL][pP][hH][aA] ;
ANALYSIS : [aA][nN][aA][lL][yY][sS][iI][sS] ;
ANALYZER : [aA][nN][aA][lL][yY][zZ][eE][rR] ;
AND : [aA][nN][dD] ;
ANNOTATE : [aA][nN][nN][oO][tT][aA][tT][eE] ;
ANY : [aA][nN][yY] ;
APPEND : [aA][pP][pP][eE][nN][dD] ;
APPENDAGE : [aA][pP][pP][eE][nN][dD][aA][gG][eE] ;
APPENDING : [aA][pP][pP][eE][nN][dD][iI][nN][gG] ;
APPLICATION : [aA][pP][pP][lL][iI][cC][aA][tT][iI][oO][nN] ;
ARCHIVE : [aA][rR][cC][hH][iI][vV][eE] ;
AREA : [aA][rR][eE][aA] ;
ARITHMETIC : [aA][rR][iI][tT][hH][mM][eE][tT][iI][cC] ;
AS : [aA][sS] ;
AS400 : [aA][sS]'400' ;
ASCENDING : [aA][sS][cC][eE][nN][dD][iI][nN][gG] ;
ASPECT : [aA][sS][pP][eE][cC][tT] ;
ASSERT : [aA][sS][sS][eE][rR][tT] ;
ASSIGN : [aA][sS][sS][iI][gG][nN] ;
ASSIGNED : [aA][sS][sS][iI][gG][nN][eE][dD] ;
ASSIGNING : [aA][sS][sS][iI][gG][nN][iI][nN][gG] ;
ASSOCIATION : [aA][sS][sS][oO][cC][iI][aA][tT][iI][oO][nN] ;
ASYNCHRONOUS : [aA][sS][yY][nN][cC][hH][rR][oO][nN][oO][uU][sS] ;
AT : [aA][tT] ;
ATTRIBUTES : [aA][tT][tT][rR][iI][bB][uU][tT][eE][sS] ;
AUTHORITY : [aA][uU][tT][hH][oO][rR][iI][tT][yY] ;
AUTHORITYCHECK : [aA][uU][tT][hH][oO][rR][iI][tT][yY][-][cC][hH][eE][cC][kK] ;
AVG : [aA][vV][gG] ;
BACK : [bB][aA][cC][kK] ;
BACKGROUND : [bB][aA][cC][kK][gG][rR][oO][uU][nN][dD] ;
BACKUP : [bB][aA][cC][kK][uU][pP] ;
BACKWARD : [bB][aA][cC][kK][wW][aA][rR][dD] ;
BADI : [bB][aA][dD][iI] ;
BASE : [bB][aA][sS][eE] ;
BEFORE : [bB][eE][fF][oO][rR][eE] ;
BEGIN : [bB][eE][gG][iI][nN] ;
BETWEEN : [bB][eE][tT][wW][eE][eE][nN] ;
BIG : [bB][iI][gG] ;
BINARY : [bB][iI][nN][aA][rR][yY] ;
BINTOHEX : [bB][iI][nN][tT][oO][hH][eE][xX] ;
BIT : [bB][iI][tT] ;
BITAND : [bB][iI][tT][-][aA][nN][dD] ;
BITNOT : [bB][iI][tT][-][nN][oO][tT] ;
BITOR : [bB][iI][tT][-][oO][rR] ;
BITXOR : [bB][iI][tT][-][xX][oO][rR] ;
BLACK : [bB][lL][aA][cC][kK] ;
BLANK : [bB][lL][aA][nN][kK] ;
BLANKS : [bB][lL][aA][nN][kK][sS] ;
BLOB : [bB][lL][oO][bB] ;
BLOCK : [bB][lL][oO][cC][kK] ;
BLOCKS : [bB][lL][oO][cC][kK][sS] ;
BLUE : [bB][lL][uU][eE] ;
BOUND : [bB][oO][uU][nN][dD] ;
BOUNDARIES : [bB][oO][uU][nN][dD][aA][rR][iI][eE][sS] ;
BOUNDS : [bB][oO][uU][nN][dD][sS] ;
BOXED : [bB][oO][xX][eE][dD] ;
BREAKPOINT : [bB][rR][eE][aA][kK][-][pP][oO][iI][nN][tT] ;
BT : [bB][tT] ;
BUFFER : [bB][uU][fF][fF][eE][rR] ;
BY : [bB][yY] ;
BYPASSING : [bB][yY][pP][aA][sS][sS][iI][nN][gG] ;
BYTE : [bB][yY][tT][eE] ;
BYTECA : [bB][yY][tT][eE][-][cC][aA] ;
BYTECN : [bB][yY][tT][eE][-][cC][nN] ;
BYTECO : [bB][yY][tT][eE][-][cC][oO] ;
BYTECS : [bB][yY][tT][eE][-][cC][sS] ;
BYTENA : [bB][yY][tT][eE][-][nN][aA] ;
BYTENS : [bB][yY][tT][eE][-][nN][sS] ;
BYTEORDER : [bB][yY][tT][eE][-][oO][rR][dD][eE][rR] ;
CA : [cC][aA] ;
CALL : [cC][aA][lL][lL] ;
CALLING : [cC][aA][lL][lL][iI][nN][gG] ;
CASE : [cC][aA][sS][eE] ;
CAST : [cC][aA][sS][tT] ;
CASTING : [cC][aA][sS][tT][iI][nN][gG] ;
CATCH : [cC][aA][tT][cC][hH] ;
CEIL : [cC][eE][iI][lL] ;
CENTER : [cC][eE][nN][tT][eE][rR] ;
CENTERED : [cC][eE][nN][tT][eE][rR][eE][dD] ;
CHAIN : [cC][hH][aA][iI][nN] ;
CHAININPUT : [cC][hH][aA][iI][nN][-][iI][nN][pP][uU][tT] ;
CHAINREQUEST : [cC][hH][aA][iI][nN][-][rR][eE][qQ][uU][eE][sS][tT] ;
CHANGE : [cC][hH][aA][nN][gG][eE] ;
CHANGING : [cC][hH][aA][nN][gG][iI][nN][gG] ;
CHANNELS : [cC][hH][aA][nN][nN][eE][lL][sS] ;
CHAR : [cC][hH][aA][rR] ;
CHARTOHEX : [cC][hH][aA][rR][-][tT][oO][-][hH][eE][xX] ;
CHARACTER : [cC][hH][aA][rR][aA][cC][tT][eE][rR] ;
CHECK : [cC][hH][eE][cC][kK] ;
CHECKBOX : [cC][hH][eE][cC][kK][bB][oO][xX] ;
CI_ : [cC][iI][_] ;
CIRCULAR : [cC][iI][rR][cC][uU][lL][aA][rR] ;
CLASS : [cC][lL][aA][sS][sS] ;
CLASSCODING : [cC][lL][aA][sS][sS][-][cC][oO][dD][iI][nN][gG] ;
CLASSDATA : [cC][lL][aA][sS][sS][-][dD][aA][tT][aA] ;
CLASSEVENTS : [cC][lL][aA][sS][sS][-][eE][vV][eE][nN][tT][sS] ;
CLASSMETHODS : [cC][lL][aA][sS][sS][-][mM][eE][tT][hH][oO][dD][sS] ;
CLASSPOOL : [cC][lL][aA][sS][sS][-][pP][oO][oO][lL] ;
CLEANUP : [cC][lL][eE][aA][nN][uU][pP] ;
CLEAR : [cC][lL][eE][aA][rR] ;
CLIENT : [cC][lL][iI][eE][nN][tT] ;
CLNT : [cC][lL][nN][tT] ;
CLOB : [cC][lL][oO][bB] ;
CLOCK : [cC][lL][oO][cC][kK] ;
CLOSE : [cC][lL][oO][sS][eE] ;
CN : [cC][nN] ;
CO : [cC][oO] ;
COALESCE : [cC][oO][aA][lL][eE][sS][cC][eE] ;
CODE : [cC][oO][dD][eE] ;
CODING : [cC][oO][dD][iI][nN][gG] ;
COL_BACKGROUND : [cC][oO][lL][_][bB][aA][cC][kK][gG][rR][oO][uU][nN][dD] ;
COL_GROUP : [cC][oO][lL][_][gG][rR][oO][uU][pP] ;
COL_HEADING : [cC][oO][lL][_][hH][eE][aA][dD][iI][nN][gG] ;
COL_KEY : [cC][oO][lL][_][kK][eE][yY] ;
COL_NEGATIVE : [cC][oO][lL][_][nN][eE][gG][aA][tT][iI][vV][eE] ;
COL_NORMAL : [cC][oO][lL][_][nN][oO][rR][mM][aA][lL] ;
COL_POSITIVE : [cC][oO][lL][_][pP][oO][sS][iI][tT][iI][vV][eE] ;
COL_TOTAL : [cC][oO][lL][_][tT][oO][tT][aA][lL] ;
COLLECT : [cC][oO][lL][lL][eE][cC][tT] ;
COLOR : [cC][oO][lL][oO][rR] ;
COLUMN : [cC][oO][lL][uU][mM][nN] ;
COLUMNS : [cC][oO][lL][uU][mM][nN][sS] ;
COMMENT : [cC][oO][mM][mM][eE][nN][tT] ;
COMMENTS : [cC][oO][mM][mM][eE][nN][tT][sS] ;
COMMIT : [cC][oO][mM][mM][iI][tT] ;
COMMON : [cC][oO][mM][mM][oO][nN] ;
COMMUNICATION : [cC][oO][mM][mM][uU][nN][iI][cC][aA][tT][iI][oO][nN] ;
COMPARING : [cC][oO][mM][pP][aA][rR][iI][nN][gG] ;
COMPONENT : [cC][oO][mM][pP][oO][nN][eE][nN][tT] ;
COMPONENTS : [cC][oO][mM][pP][oO][nN][eE][nN][tT][sS] ;
COMPRESSION : [cC][oO][mM][pP][rR][eE][sS][sS][iI][oO][nN] ;
COMPUTE : [cC][oO][mM][pP][uU][tT][eE] ;
CONCAT : [cC][oO][nN][cC][aA][tT] ;
CONCAT_WITH_SPACE : [cC][oO][nN][cC][aA][tT][_][wW][iI][tT][hH][_][sS][pP][aA][cC][eE] ;
CONCATENATE : [cC][oO][nN][cC][aA][tT][eE][nN][aA][tT][eE] ;
COND : [cC][oO][nN][dD] ;
CONDENSE : [cC][oO][nN][dD][eE][nN][sS][eE] ;
CONDITION : [cC][oO][nN][dD][iI][tT][iI][oO][nN] ;
CONNECT : [cC][oO][nN][nN][eE][cC][tT] ;
CONNECTION : [cC][oO][nN][nN][eE][cC][tT][iI][oO][nN] ;
CONSTANTS : [cC][oO][nN][sS][tT][aA][nN][tT][sS] ;
CONTEXT : [cC][oO][nN][tT][eE][xX][tT] ;
CONTEXTS : [cC][oO][nN][tT][eE][xX][tT][sS] ;
CONTINUE : [cC][oO][nN][tT][iI][nN][uU][eE] ;
CONTROL : [cC][oO][nN][tT][rR][oO][lL] ;
CONTROLS : [cC][oO][nN][tT][rR][oO][lL][sS] ;
CONV : [cC][oO][nN][vV] ;
CONVERSION : [cC][oO][nN][vV][eE][rR][sS][iI][oO][nN] ;
CONVERT : [cC][oO][nN][vV][eE][rR][tT] ;
COPIES : [cC][oO][pP][iI][eE][sS] ;
COPY : [cC][oO][pP][yY] ;
CORRESPONDING : [cC][oO][rR][rR][eE][sS][pP][oO][nN][dD][iI][nN][gG] ;
COUNT : [cC][oO][uU][nN][tT] ;
COUNTRY : [cC][oO][uU][nN][tT][rR][yY] ;
COVER : [cC][oO][vV][eE][rR] ;
CP : [cC][pP] ;
CPI : [cC][pP][iI] ;
CREATE : [cC][rR][eE][aA][tT][eE] ;
CREATING : [cC][rR][eE][aA][tT][iI][nN][gG] ;
CRITICAL : [cC][rR][iI][tT][iI][cC][aA][lL] ;
CROSS : [cC][rR][oO][sS][sS] ;
CS : [cC][sS] ;
CUKY : [cC][uU][kK][yY] ;
CURR : [cC][uU][rR][rR] ;
CURRENCY : [cC][uU][rR][rR][eE][nN][cC][yY] ;
CURRENCY_CONVERSION : [cC][uU][rR][rR][eE][nN][cC][yY][_][cC][oO][nN][vV][eE][rR][sS][iI][oO][nN] ;
CURRENT : [cC][uU][rR][rR][eE][nN][tT] ;
CURSOR : [cC][uU][rR][sS][oO][rR] ;
CURSORSELECTION : [cC][uU][rR][sS][oO][rR][-][sS][eE][lL][eE][cC][tT][iI][oO][nN] ;
CUSTOMER : [cC][uU][sS][tT][oO][mM][eE][rR] ;
CUSTOMERFUNCTION : [cC][uU][sS][tT][oO][mM][eE][rR][-][fF][uU][nN][cC][tT][iI][oO][nN] ;
DANGEROUS : [dD][aA][nN][gG][eE][rR][oO][uU][sS] ;
DATA : [dD][aA][tT][aA] ;
DATABASE : [dD][aA][tT][aA][bB][aA][sS][eE] ;
DATAINFO : [dD][aA][tT][aA][iI][nN][fF][oO] ;
DATASET : [dD][aA][tT][aA][sS][eE][tT] ;
DATE : [dD][aA][tT][eE] ;
DATS : [dD][aA][tT][sS] ;
DATS_ADD_DAYS : [dD][aA][tT][sS][_][aA][dD][dD][_][dD][aA][yY][sS] ;
DATS_ADD_MONTHS : [dD][aA][tT][sS][_][aA][dD][dD][_][mM][oO][nN][tT][hH][sS] ;
DATS_DAYS_BETWEEN : [dD][aA][tT][sS][_][dD][aA][yY][sS][_][bB][eE][tT][wW][eE][eE][nN] ;
DATS_IS_VALID : [dD][aA][tT][sS][_][iI][sS][_][vV][aA][lL][iI][dD] ;
DATS_TIMS_TO_TSTMP : [dD][aA][tT][sS][_][tT][iI][mM][sS][_][tT][oO][_][tT][sS][tT][mM][pP] ;
DAYLIGHT : [dD][aA][yY][lL][iI][gG][hH][tT] ;
DB2 : [dD][bB]'2' ;
DB6 : [dD][bB]'6' ;
DDMMYY : [dD][dD]'/'[mM][mM]'/'[yY][yY] ;
DDMMYYYY : [dD][dD]'/'[mM][mM]'/'[yY][yY][yY][yY] ;
DEALLOCATE : [dD][eE][aA][lL][lL][oO][cC][aA][tT][eE] ;
DEC : [dD][eE][cC] ;
DECIMAL_SHIFT : [dD][eE][cC][iI][mM][aA][lL][_][sS][hH][iI][fF][tT] ;
DECIMALS : [dD][eE][cC][iI][mM][aA][lL][sS] ;
DECLARATIONS : [dD][eE][cC][lL][aA][rR][aA][tT][iI][oO][nN][sS] ;
DEEP : [dD][eE][eE][pP] ;
DEFAULT : [dD][eE][fF][aA][uU][lL][tT] ;
DEFERRED : [dD][eE][fF][eE][rR][rR][eE][dD] ;
DEFINE : [dD][eE][fF][iI][nN][eE] ;
DEFINING : [dD][eE][fF][iI][nN][iI][nN][gG] ;
DEFINITION : [dD][eE][fF][iI][nN][iI][tT][iI][oO][nN] ;
DELETE : [dD][eE][lL][eE][tT][eE] ;
DELETING : [dD][eE][lL][eE][tT][iI][nN][gG] ;
DEMAND : [dD][eE][mM][aA][nN][dD] ;
DEPARTMENT : [dD][eE][pP][aA][rR][tT][mM][eE][nN][tT] ;
DESCENDING : [dD][eE][sS][cC][eE][nN][dD][iI][nN][gG] ;
DESCRIBE : [dD][eE][sS][cC][rR][iI][bB][eE] ;
DESTINATION : [dD][eE][sS][tT][iI][nN][aA][tT][iI][oO][nN] ;
DETAIL : [dD][eE][tT][aA][iI][lL] ;
DIALOG : [dD][iI][aA][lL][oO][gG] ;
DIRECTORY : [dD][iI][rR][eE][cC][tT][oO][rR][yY] ;
DISCARDING : [dD][iI][sS][cC][aA][rR][dD][iI][nN][gG] ;
DISCONNECT : [dD][iI][sS][cC][oO][nN][nN][eE][cC][tT] ;
DISPLAY : [dD][iI][sS][pP][lL][aA][yY] ;
DISPLAYMODE : [dD][iI][sS][pP][lL][aA][yY][-][mM][oO][dD][eE] ;
DISTANCE : [dD][iI][sS][tT][aA][nN][cC][eE] ;
DISTINCT : [dD][iI][sS][tT][iI][nN][cC][tT] ;
DIV : [dD][iI][vV] ;
DIVIDE : [dD][iI][vV][iI][dD][eE] ;
DIVIDECORRESPONDING : [dD][iI][vV][iI][dD][eE][-][cC][oO][rR][rR][eE][sS][pP][oO][nN][dD][iI][nN][gG] ;
DIVISION : [dD][iI][vV][iI][sS][iI][oO][nN] ;
DO : [dD][oO] ;
DUMMY : [dD][uU][mM][mM][yY] ;
DUPLICATE : [dD][uU][pP][lL][iI][cC][aA][tT][eE] ;
DUPLICATES : [dD][uU][pP][lL][iI][cC][aA][tT][eE][sS] ;
DURATION : [dD][uU][rR][aA][tT][iI][oO][nN] ;
DURING : [dD][uU][rR][iI][nN][gG] ;
DYNAMIC : [dD][yY][nN][aA][mM][iI][cC] ;
DYNPRO : [dD][yY][nN][pP][rR][oO] ;
EDIT : [eE][dD][iI][tT] ;
EDITORCALL : [eE][dD][iI][tT][oO][rR][-][cC][aA][lL][lL] ;
ELSE : [eE][lL][sS][eE] ;
ELSEIF : [eE][lL][sS][eE][iI][fF] ;
EMPTY : [eE][mM][pP][tT][yY] ;
ENABLED : [eE][nN][aA][bB][lL][eE][dD] ;
ENABLING : [eE][nN][aA][bB][lL][iI][nN][gG] ;
ENCODING : [eE][nN][cC][oO][dD][iI][nN][gG] ;
END : [eE][nN][dD] ;
ENDENHANCEMENTSECTION : [eE][nN][dD][-][eE][nN][hH][aA][nN][cC][eE][mM][eE][nN][tT][-][sS][eE][cC][tT][iI][oO][nN] ;
ENDLINES : [eE][nN][dD][-][lL][iI][nN][eE][sS] ;
ENDOFDEFINITION : [eE][nN][dD][-][oO][fF][-][dD][eE][fF][iI][nN][iI][tT][iI][oO][nN] ;
ENDOFFILE : [eE][nN][dD][-][oO][fF][-][fF][iI][lL][eE] ;
ENDOFPAGE : [eE][nN][dD][-][oO][fF][-][pP][aA][gG][eE] ;
ENDOFSELECTION : [eE][nN][dD][-][oO][fF][-][sS][eE][lL][eE][cC][tT][iI][oO][nN] ;
ENDTESTINJECTION : [eE][nN][dD][-][tT][eE][sS][tT][-][iI][nN][jJ][eE][cC][tT][iI][oO][nN] ;
ENDTESTSEAM : [eE][nN][dD][-][tT][eE][sS][tT][-][sS][eE][aA][mM] ;
ENDAT : [eE][nN][dD][aA][tT] ;
ENDCASE : [eE][nN][dD][cC][aA][sS][eE] ;
ENDCATCH : [eE][nN][dD][cC][aA][tT][cC][hH] ;
ENDCHAIN : [eE][nN][dD][cC][hH][aA][iI][nN] ;
ENDCLASS : [eE][nN][dD][cC][lL][aA][sS][sS] ;
ENDDO : [eE][nN][dD][dD][oO] ;
ENDENHANCEMENT : [eE][nN][dD][eE][nN][hH][aA][nN][cC][eE][mM][eE][nN][tT] ;
ENDEXEC : [eE][nN][dD][eE][xX][eE][cC] ;
ENDFORM : [eE][nN][dD][fF][oO][rR][mM] ;
ENDFUNCTION : [eE][nN][dD][fF][uU][nN][cC][tT][iI][oO][nN] ;
ENDIAN : [eE][nN][dD][iI][aA][nN] ;
ENDIF : [eE][nN][dD][iI][fF] ;
ENDING : [eE][nN][dD][iI][nN][gG] ;
ENDINTERFACE : [eE][nN][dD][iI][nN][tT][eE][rR][fF][aA][cC][eE] ;
ENDLOOP : [eE][nN][dD][lL][oO][oO][pP] ;
ENDMETHOD : [eE][nN][dD][mM][eE][tT][hH][oO][dD] ;
ENDMODULE : [eE][nN][dD][mM][oO][dD][uU][lL][eE] ;
ENDON : [eE][nN][dD][oO][nN] ;
ENDPROVIDE : [eE][nN][dD][pP][rR][oO][vV][iI][dD][eE] ;
ENDSELECT : [eE][nN][dD][sS][eE][lL][eE][cC][tT] ;
ENDTRY : [eE][nN][dD][tT][rR][yY] ;
ENDWHILE : [eE][nN][dD][wW][hH][iI][lL][eE] ;
ENDWITH : [eE][nN][dD][wW][iI][tT][hH] ;
ENGINEERING : [eE][nN][gG][iI][nN][eE][eE][rR][iI][nN][gG] ;
ENHANCEMENT : [eE][nN][hH][aA][nN][cC][eE][mM][eE][nN][tT] ;
ENHANCEMENTPOINT : [eE][nN][hH][aA][nN][cC][eE][mM][eE][nN][tT][-][pP][oO][iI][nN][tT] ;
ENHANCEMENTSECTION : [eE][nN][hH][aA][nN][cC][eE][mM][eE][nN][tT][-][sS][eE][cC][tT][iI][oO][nN] ;
ENHANCEMENTS : [eE][nN][hH][aA][nN][cC][eE][mM][eE][nN][tT][sS] ;
ENTRIES : [eE][nN][tT][rR][iI][eE][sS] ;
ENTRY : [eE][nN][tT][rR][yY] ;
ENUM : [eE][nN][uU][mM] ;
ENVIRONMENT : [eE][nN][vV][iI][rR][oO][nN][mM][eE][nN][tT] ;
EQ : [eE][qQ] ;
EQUIV : [eE][qQ][uU][iI][vV] ;
ERRORMESSAGE : [eE][rR][rR][oO][rR][mM][eE][sS][sS][aA][gG][eE] ;
ERRORS : [eE][rR][rR][oO][rR][sS] ;
ESCAPE : [eE][sS][cC][aA][pP][eE] ;
ESCAPING : [eE][sS][cC][aA][pP][iI][nN][gG] ;
EVENT : [eE][vV][eE][nN][tT] ;
EVENTS : [eE][vV][eE][nN][tT][sS] ;
EXACT : [eE][xX][aA][cC][tT] ;
EXCEPT : [eE][xX][cC][eE][pP][tT] ;
EXCEPTION : [eE][xX][cC][eE][pP][tT][iI][oO][nN] ;
EXCEPTIONTABLE : [eE][xX][cC][eE][pP][tT][iI][oO][nN][-][tT][aA][bB][lL][eE] ;
EXCEPTIONS : [eE][xX][cC][eE][pP][tT][iI][oO][nN][sS] ;
EXCLUDE : [eE][xX][cC][lL][uU][dD][eE] ;
EXCLUDING : [eE][xX][cC][lL][uU][dD][iI][nN][gG] ;
EXEC : [eE][xX][eE][cC] ;
EXECUTE : [eE][xX][eE][cC][uU][tT][eE] ;
EXISTS : [eE][xX][iI][sS][tT][sS] ;
EXIT : [eE][xX][iI][tT] ;
EXITCOMMAND : [eE][xX][iI][tT][-][cC][oO][mM][mM][aA][nN][dD] ;
EXPAND : [eE][xX][pP][aA][nN][dD] ;
EXPANDING : [eE][xX][pP][aA][nN][dD][iI][nN][gG] ;
EXPIRATION : [eE][xX][pP][iI][rR][aA][tT][iI][oO][nN] ;
EXPLICIT : [eE][xX][pP][lL][iI][cC][iI][tT] ;
EXPONENT : [eE][xX][pP][oO][nN][eE][nN][tT] ;
EXPORT : [eE][xX][pP][oO][rR][tT] ;
EXPORTING : [eE][xX][pP][oO][rR][tT][iI][nN][gG] ;
EXTEND : [eE][xX][tT][eE][nN][dD] ;
EXTENDED : [eE][xX][tT][eE][nN][dD][eE][dD] ;
EXTENSION : [eE][xX][tT][eE][nN][sS][iI][oO][nN] ;
EXTRACT : [eE][xX][tT][rR][aA][cC][tT] ;
FAIL : [fF][aA][iI][lL] ;
FETCH : [fF][eE][tT][cC][hH] ;
FIELD : [fF][iI][eE][lL][dD] ;
FIELDGROUPS : [fF][iI][eE][lL][dD][-][gG][rR][oO][uU][pP][sS] ;
FIELDSYMBOL : [fF][iI][eE][lL][dD][-][sS][yY][mM][bB][oO][lL] ;
FIELDSYMBOLS : [fF][iI][eE][lL][dD][-][sS][yY][mM][bB][oO][lL][sS] ;
FIELDS : [fF][iI][eE][lL][dD][sS] ;
FILE : [fF][iI][lL][eE] ;
FILTER : [fF][iI][lL][tT][eE][rR] ;
FILTERTABLE : [fF][iI][lL][tT][eE][rR][-][tT][aA][bB][lL][eE] ;
FILTERS : [fF][iI][lL][tT][eE][rR][sS] ;
FINAL : [fF][iI][nN][aA][lL] ;
FIND : [fF][iI][nN][dD] ;
FIRST : [fF][iI][rR][sS][tT] ;
FIRSTLINE : [fF][iI][rR][sS][tT][-][lL][iI][nN][eE] ;
FIXEDPOINT : [fF][iI][xX][eE][dD][-][pP][oO][iI][nN][tT] ;
FKEQ : [fF][kK][eE][qQ] ;
FKGE : [fF][kK][gG][eE] ;
FLOOR : [fF][lL][oO][oO][rR] ;
FLTP : [fF][lL][tT][pP] ;
FLTP_TO_DEC : [fF][lL][tT][pP][_][tT][oO][_][dD][eE][cC] ;
FLUSH : [fF][lL][uU][sS][hH] ;
FONT : [fF][oO][nN][tT] ;
FOR : [fF][oO][rR] ;
FORM : [fF][oO][rR][mM] ;
FORMAT : [fF][oO][rR][mM][aA][tT] ;
FORWARD : [fF][oO][rR][wW][aA][rR][dD] ;
FOUND : [fF][oO][uU][nN][dD] ;
FRAME : [fF][rR][aA][mM][eE] ;
FRAMES : [fF][rR][aA][mM][eE][sS] ;
FREE : [fF][rR][eE][eE] ;
FRIENDS : [fF][rR][iI][eE][nN][dD][sS] ;
FROM : [fF][rR][oO][mM] ;
FUNCTION : [fF][uU][nN][cC][tT][iI][oO][nN] ;
FUNCTIONPOOL : [fF][uU][nN][cC][tT][iI][oO][nN][-][pP][oO][oO][lL] ;
FUNCTIONALITY : [fF][uU][nN][cC][tT][iI][oO][nN][aA][lL][iI][tT][yY] ;
FURTHER : [fF][uU][rR][tT][hH][eE][rR] ;
GAPS : [gG][aA][pP][sS] ;
GE : [gG][eE] ;
GENERATE : [gG][eE][nN][eE][rR][aA][tT][eE] ;
GET : [gG][eE][tT] ;
GIVING : [gG][iI][vV][iI][nN][gG] ;
GKEQ : [gG][kK][eE][qQ] ;
GKGE : [gG][kK][gG][eE] ;
GLOBAL : [gG][lL][oO][bB][aA][lL] ;
GRANT : [gG][rR][aA][nN][tT] ;
GREEN : [gG][rR][eE][eE][nN] ;
GROUP : [gG][rR][oO][uU][pP] ;
GROUPS : [gG][rR][oO][uU][pP][sS] ;
GT : [gG][tT] ;
HANDLE : [hH][aA][nN][dD][lL][eE] ;
HANDLER : [hH][aA][nN][dD][lL][eE][rR] ;
HARMLESS : [hH][aA][rR][mM][lL][eE][sS][sS] ;
HASHED : [hH][aA][sS][hH][eE][dD] ;
HAVING : [hH][aA][vV][iI][nN][gG] ;
HDB : [hH][dD][bB] ;
HEADLINES : [hH][eE][aA][dD][-][lL][iI][nN][eE][sS] ;
HEADER : [hH][eE][aA][dD][eE][rR] ;
HEADERS : [hH][eE][aA][dD][eE][rR][sS] ;
HEADING : [hH][eE][aA][dD][iI][nN][gG] ;
HELPID : [hH][eE][lL][pP][-][iI][dD] ;
HELPREQUEST : [hH][eE][lL][pP][-][rR][eE][qQ][uU][eE][sS][tT] ;
HEXTOBIN : [hH][eE][xX][tT][oO][bB][iI][nN] ;
HIDE : [hH][iI][dD][eE] ;
HIGH : [hH][iI][gG][hH] ;
HINT : [hH][iI][nN][tT] ;
HOLD : [hH][oO][lL][dD] ;
HOTSPOT : [hH][oO][tT][sS][pP][oO][tT] ;
ICON : [iI][cC][oO][nN] ;
IDENTIFICATION : [iI][dD][eE][nN][tT][iI][fF][iI][cC][aA][tT][iI][oO][nN] ;
IDENTIFIER : [iI][dD][eE][nN][tT][iI][fF][iI][eE][rR] ;
IDS : [iI][dD][sS] ;
IF : [iI][fF];
IGNORE : [iI][gG][nN][oO][rR][eE] ;
IGNORING : [iI][gG][nN][oO][rR][iI][nN][gG] ;
IMMEDIATELY : [iI][mM][mM][eE][dD][iI][aA][tT][eE][lL][yY] ;
IMPLEMENTATION : [iI][mM][pP][lL][eE][mM][eE][nN][tT][aA][tT][iI][oO][nN] ;
IMPLEMENTATIONS : [iI][mM][pP][lL][eE][mM][eE][nN][tT][aA][tT][iI][oO][nN][sS] ;
IMPLEMENTED : [iI][mM][pP][lL][eE][mM][eE][nN][tT][eE][dD] ;
IMPLICIT : [iI][mM][pP][lL][iI][cC][iI][tT] ;
IMPORT : [iI][mM][pP][oO][rR][tT] ;
IMPORTING : [iI][mM][pP][oO][rR][tT][iI][nN][gG] ;
IN : [iI][nN] ;
INACTIVE : [iI][nN][aA][cC][tT][iI][vV][eE] ;
INCL : [iI][nN][cC][lL] ;
INCLUDE : [iI][nN][cC][lL][uU][dD][eE] ;
INCLUDES : [iI][nN][cC][lL][uU][dD][eE][sS] ;
INCLUDING : [iI][nN][cC][lL][uU][dD][iI][nN][gG] ;
INCREMENT : [iI][nN][cC][rR][eE][mM][eE][nN][tT] ;
INDEX : [iI][nN][dD][eE][xX] ;
INDEXLINE : [iI][nN][dD][eE][xX][-][lL][iI][nN][eE] ;
INFOTYPES : [iI][nN][fF][oO][tT][yY][pP][eE][sS] ;
INHERIT : [iI][nN][hH][eE][rR][iI][tT] ;
INHERITING : [iI][nN][hH][eE][rR][iI][tT][iI][nN][gG] ;
INIT : [iI][nN][iI][tT] ;
INITIAL : [iI][nN][iI][tT][iI][aA][lL] ;
INITIALIZATION : [iI][nN][iI][tT][iI][aA][lL][iI][zZ][aA][tT][iI][oO][nN] ;
INNER : [iI][nN][nN][eE][rR] ;
INOUT : [iI][nN][oO][uU][tT] ;
INPUT : [iI][nN][pP][uU][tT] ;
INSERT : [iI][nN][sS][eE][rR][tT] ;
INSTANCE : [iI][nN][sS][tT][aA][nN][cC][eE] ;
INSTANCES : [iI][nN][sS][tT][aA][nN][cC][eE][sS] ;
INSTR : [iI][nN][sS][tT][rR] ;
INTENSIFIED : [iI][nN][tT][eE][nN][sS][iI][fF][iI][eE][dD] ;
INTERFACE : [iI][nN][tT][eE][rR][fF][aA][cC][eE] ;
INTERFACEPOOL : [iI][nN][tT][eE][rR][fF][aA][cC][eE][-][pP][oO][oO][lL] ;
INTERFACES : [iI][nN][tT][eE][rR][fF][aA][cC][eE][sS] ;
INTERNAL : [iI][nN][tT][eE][rR][nN][aA][lL] ;
INTERVALS : [iI][nN][tT][eE][rR][vV][aA][lL][sS] ;
INTO : [iI][nN][tT][oO] ;
INVERSE : [iI][nN][vV][eE][rR][sS][eE] ;
INVERTEDDATE : [iI][nN][vV][eE][rR][tT][eE][dD][-][dD][aA][tT][eE] ;
IS : [iI][sS] ;
ISO : [iI][sS][oO] ;
ITNO : [iI][tT][nN][oO] ;
JOB : [jJ][oO][bB] ;
JOIN : [jJ][oO][iI][nN] ;
KEEP : [kK][eE][eE][pP] ;
KEEPING : [kK][eE][eE][pP][iI][nN][gG] ;
KERNEL : [kK][eE][rR][nN][eE][lL] ;
KEY : [kK][eE][yY] ;
KEYS : [kK][eE][yY][sS] ;
KEYWORDS : [kK][eE][yY][wW][oO][rR][dD][sS] ;
KIND : [kK][iI][nN][dD] ;
LANG : [lL][aA][nN][gG] ;
LANGUAGE : [lL][aA][nN][gG][uU][aA][gG][eE] ;
LAST : [lL][aA][sS][tT] ;
LATE : [lL][aA][tT][eE] ;
LAYOUT : [lL][aA][yY][oO][uU][tT] ;
LE : [lL][eE] ;
LEADING : [lL][eE][aA][dD][iI][nN][gG] ;
LEAVE : [lL][eE][aA][vV][eE] ;
LEFT : [lL][eE][fF][tT] ;
LEFTJUSTIFIED : [lL][eE][fF][tT][-][jJ][uU][sS][tT][iI][fF][iI][eE][dD] ;
LEFTPLUS : [lL][eE][fF][tT][pP][lL][uU][sS] ;
LEFTSPACE : [lL][eE][fF][tT][sS][pP][aA][cC][eE] ;
LEGACY : [lL][eE][gG][aA][cC][yY] ;
LENGTH : [lL][eE][nN][gG][tT][hH] ;
LET : [lL][eE][tT] ;
LEVEL : [lL][eE][vV][eE][lL] ;
LEVELS : [lL][eE][vV][eE][lL][sS] ;
LIKE : [lL][iI][kK][eE] ;
LINE : [lL][iI][nN][eE] ;
LINECOUNT : [lL][iI][nN][eE][-][cC][oO][uU][nN][tT] ;
LINESELECTION : [lL][iI][nN][eE][-][sS][eE][lL][eE][cC][tT][iI][oO][nN] ;
LINESIZE : [lL][iI][nN][eE][-][sS][iI][zZ][eE] ;
LINEFEED : [lL][iI][nN][eE][fF][eE][eE][dD] ;
LINES : [lL][iI][nN][eE][sS] ;
LIST : [lL][iI][sS][tT] ;
LISTPROCESSING : [lL][iI][sS][tT][-][pP][rR][oO][cC][eE][sS][sS][iI][nN][gG] ;
LISTBOX : [lL][iI][sS][tT][bB][oO][xX] ;
LITTLE : [lL][iI][tT][tT][lL][eE] ;
LLANG : [lL][lL][aA][nN][gG] ;
LOAD : [lL][oO][aA][dD] ;
LOADOFPROGRAM : [lL][oO][aA][dD][-][oO][fF][-][pP][rR][oO][gG][rR][aA][mM] ;
LOB : [lL][oO][bB] ;
LOCAL : [lL][oO][cC][aA][lL] ;
LOCALE : [lL][oO][cC][aA][lL][eE] ;
LOCATOR : [lL][oO][cC][aA][tT][oO][rR] ;
LOGPOINT : [lL][oO][gG][-][pP][oO][iI][nN][tT] ;
LOGFILE : [lL][oO][gG][fF][iI][lL][eE] ;
LOGICAL : [lL][oO][gG][iI][cC][aA][lL] ;
LONG : [lL][oO][nN][gG] ;
LOOP : [lL][oO][oO][pP] ;
LOW : [lL][oO][wW] ;
LOWER : [lL][oO][wW][eE][rR] ;
LPAD : [lL][pP][aA][dD] ;
LPI : [lL][pP][iI] ;
LT : [lL][tT] ;
LTRIM : [lL][tT][rR][iI][mM] ;
MAIL : [mM][aA][iI][lL] ;
MAIN : [mM][aA][iI][nN] ;
MAJORID : [mM][aA][jJ][oO][rR][-][iI][dD] ;
MAPPING : [mM][aA][pP][pP][iI][nN][gG] ;
MARGIN : [mM][aA][rR][gG][iI][nN] ;
MARK : [mM][aA][rR][kK] ;
MASK : [mM][aA][sS][kK] ;
MATCH : [mM][aA][tT][cC][hH] ;
MATCHCODE : [mM][aA][tT][cC][hH][cC][oO][dD][eE] ;
MAX : [mM][aA][xX] ;
MAXIMUM : [mM][aA][xX][iI][mM][uU][mM] ;
MEDIUM : [mM][eE][dD][iI][uU][mM] ;
MEMBERS : [mM][eE][mM][bB][eE][rR][sS] ;
MEMORY : [mM][eE][mM][oO][rR][yY] ;
MESH : [mM][eE][sS][hH] ;
MESSAGE : [mM][eE][sS][sS][aA][gG][eE] ;
MESSAGEID : [mM][eE][sS][sS][aA][gG][eE][-][iI][dD] ;
MESSAGES : [mM][eE][sS][sS][aA][gG][eE][sS] ;
MESSAGING : [mM][eE][sS][sS][aA][gG][iI][nN][gG] ;
METHOD : [mM][eE][tT][hH][oO][dD] ;
METHODS : [mM][eE][tT][hH][oO][dD][sS] ;
MIN : [mM][iI][nN] ;
MINIMUM : [mM][iI][nN][iI][mM][uU][mM] ;
MINORID : [mM][iI][nN][oO][rR][-][iI][dD] ;
MMDDYY : [mM][mM]'/'[dD][dD]'/'[yY][yY] ;
MMDDYYYY : [mM][mM]'/'[dD][dD]'/'[yY][yY][yY][yY] ;
MOD : [mM][oO][dD] ;
MODE : [mM][oO][dD][eE] ;
MODIF : [mM][oO][dD][iI][fF] ;
MODIFIER : [mM][oO][dD][iI][fF][iI][eE][rR] ;
MODIFY : [mM][oO][dD][iI][fF][yY] ;
MODULE : [mM][oO][dD][uU][lL][eE] ;
MOVE : [mM][oO][vV][eE] ;
MOVECORRESPONDING : [mM][oO][vV][eE][-][cC][oO][rR][rR][eE][sS][pP][oO][nN][dD][iI][nN][gG] ;
MSSQLNT : [mM][sS][sS][qQ][lL][nN][tT] ;
MULTIPLY : [mM][uU][lL][tT][iI][pP][lL][yY] ;
MULTIPLYCORRESPONDING : [mM][uU][lL][tT][iI][pP][lL][yY][-][cC][oO][rR][rR][eE][sS][pP][oO][nN][dD][iI][nN][gG] ;
NA : [nN][aA] ;
NAME : [nN][aA][mM][eE] ;
NAMETAB : [nN][aA][mM][eE][tT][aA][bB] ;
NATIVE : [nN][aA][tT][iI][vV][eE] ;
NB : [nN][bB] ;
NE : [nN][eE] ;
NESTED : [nN][eE][sS][tT][eE][dD] ;
NESTING : [nN][eE][sS][tT][iI][nN][gG] ;
NEW : [nN][eE][wW] ;
NEWLINE : [nN][eE][wW][-][lL][iI][nN][eE] ;
NEWPAGE : [nN][eE][wW][-][pP][aA][gG][eE] ;
NEWSECTION : [nN][eE][wW][-][sS][eE][cC][tT][iI][oO][nN] ;
NEXT : [nN][eE][xX][tT] ;
NO : [nN][oO] ;
NODISPLAY : [nN][oO][-][dD][iI][sS][pP][lL][aA][yY] ;
NOEXTENSION : [nN][oO][-][eE][xX][tT][eE][nN][sS][iI][oO][nN] ;
NOGAP : [nN][oO][-][gG][aA][pP] ;
NOGAPS : [nN][oO][-][gG][aA][pP][sS] ;
NOGROUPING : [nN][oO][-][gG][rR][oO][uU][pP][iI][nN][gG] ;
NOHEADING : [nN][oO][-][hH][eE][aA][dD][iI][nN][gG] ;
NOSCROLLING : [nN][oO][-][sS][cC][rR][oO][lL][lL][iI][nN][gG] ;
NOSIGN : [nN][oO][-][sS][iI][gG][nN] ;
NOTITLE : [nN][oO][-][tT][iI][tT][lL][eE] ;
NOTOPOFPAGE : [nN][oO][-][tT][oO][pP][oO][fF][pP][aA][gG][eE] ;
NOZERO : [nN][oO][-][zZ][eE][rR][oO] ;
NODE : [nN][oO][dD][eE] ;
NODES : [nN][oO][dD][eE][sS] ;
NONUNICODE : [nN][oO][nN][-][uU][nN][iI][cC][oO][dD][eE] ;
NONUNIQUE : [nN][oO][nN][-][uU][nN][iI][qQ][uU][eE] ;
NOT : [nN][oO][tT] ;
NP : [nN][pP] ;
NS : [nN][sS] ;
NULL : [nN][uU][lL][lL] ;
NUMBER : [nN][uU][mM][bB][eE][rR] ;
NUMC : [nN][uU][mM][cC] ;
OBJECT : [oO][bB][jJ][eE][cC][tT] ;
OBJECTS : [oO][bB][jJ][eE][cC][tT][sS] ;
OBLIGATORY : [oO][bB][lL][iI][gG][aA][tT][oO][rR][yY] ;
OCCURRENCE : [oO][cC][cC][uU][rR][rR][eE][nN][cC][eE] ;
OCCURRENCES : [oO][cC][cC][uU][rR][rR][eE][nN][cC][eE][sS] ;
OCCURS : [oO][cC][cC][uU][rR][sS] ;
OF : [oO][fF] ;
OFF : [oO][fF][fF] ;
OFFSET : [oO][fF][fF][sS][eE][tT] ;
OLE : [oO][lL][eE] ;
ON : [oO][nN] ;
ONLY : [oO][nN][lL][yY] ;
OPEN : [oO][pP][eE][nN] ;
OPTION : [oO][pP][tT][iI][oO][nN] ;
OPTIONAL : [oO][pP][tT][iI][oO][nN][aA][lL] ;
OPTIONS : [oO][pP][tT][iI][oO][nN][sS] ;
OR : [oO][rR] ;
ORACLE : [oO][rR][aA][cC][lL][eE] ;
ORDER : [oO][rR][dD][eE][rR] ;
OTHER : [oO][tT][hH][eE][rR] ;
OTHERS : [oO][tT][hH][eE][rR][sS] ;
OUT : [oO][uU][tT] ;
OUTER : [oO][uU][tT][eE][rR] ;
OUTPUT : [oO][uU][tT][pP][uU][tT] ;
OUTPUTLENGTH : [oO][uU][tT][pP][uU][tT][-][lL][eE][nN][gG][tT][hH] ;
OVERFLOW : [oO][vV][eE][rR][fF][lL][oO][wW] ;
OVERLAY : [oO][vV][eE][rR][lL][aA][yY] ;
PACK : [pP][aA][cC][kK] ;
PACKAGE : [pP][aA][cC][kK][aA][gG][eE] ;
PAD : [pP][aA][dD] ;
PADDING : [pP][aA][dD][dD][iI][nN][gG] ;
PAGE : [pP][aA][gG][eE] ;
PAGES : [pP][aA][gG][eE][sS] ;
PARAMETER : [pP][aA][rR][aA][mM][eE][tT][eE][rR] ;
PARAMETERTABLE : [pP][aA][rR][aA][mM][eE][tT][eE][rR][-][tT][aA][bB][lL][eE] ;
PARAMETERS : [pP][aA][rR][aA][mM][eE][tT][eE][rR][sS] ;
PART : [pP][aA][rR][tT] ;
PARTIALLY : [pP][aA][rR][tT][iI][aA][lL][lL][yY] ;
PATTERN : [pP][aA][tT][tT][eE][rR][nN] ;
PERCENTAGE : [pP][eE][rR][cC][eE][nN][tT][aA][gG][eE] ;
PERFORM : [pP][eE][rR][fF][oO][rR][mM] ;
PERFORMING : [pP][eE][rR][fF][oO][rR][mM][iI][nN][gG] ;
PERSON : [pP][eE][rR][sS][oO][nN] ;
PF : [pP][fF] ;
PFSTATUS : [pP][fF][-][sS][tT][aA][tT][uU][sS] ;
PINK : [pP][iI][nN][kK] ;
PLACES : [pP][lL][aA][cC][eE][sS] ;
POOL : [pP][oO][oO][lL] ;
POS_HIGH : [pP][oO][sS][_][hH][iI][gG][hH] ;
POS_LOW : [pP][oO][sS][_][lL][oO][wW] ;
POSITION : [pP][oO][sS][iI][tT][iI][oO][nN] ;
PRAGMAS : [pP][rR][aA][gG][mM][aA][sS] ;
PRECOMPILED : [pP][rR][eE][cC][oO][mM][pP][iI][lL][eE][dD] ;
PREFERRED : [pP][rR][eE][fF][eE][rR][rR][eE][dD] ;
PRESERVING : [pP][rR][eE][sS][eE][rR][vV][iI][nN][gG] ;
PRIMARY : [pP][rR][iI][mM][aA][rR][yY] ;
PRINT : [pP][rR][iI][nN][tT] ;
PRINTCONTROL : [pP][rR][iI][nN][tT][-][cC][oO][nN][tT][rR][oO][lL] ;
PRIORITY : [pP][rR][iI][oO][rR][iI][tT][yY] ;
PRIVATE : [pP][rR][iI][vV][aA][tT][eE] ;
PROCEDURE : [pP][rR][oO][cC][eE][dD][uU][rR][eE] ;
PROCESS : [pP][rR][oO][cC][eE][sS][sS] ;
PROGRAM : [pP][rR][oO][gG][rR][aA][mM] ;
PROPERTY : [pP][rR][oO][pP][eE][rR][tT][yY] ;
PROTECTED : [pP][rR][oO][tT][eE][cC][tT][eE][dD] ;
PROVIDE : [pP][rR][oO][vV][iI][dD][eE] ;
PUBLIC : [pP][uU][bB][lL][iI][cC] ;
PUSH : [pP][uU][sS][hH] ;
PUSHBUTTON : [pP][uU][sS][hH][bB][uU][tT][tT][oO][nN] ;
PUT : [pP][uU][tT] ;
QUAN : [qQ][uU][aA][nN] ;
QUEUEONLY : [qQ][uU][eE][uU][eE][-][oO][nN][lL][yY] ;
QUICKINFO : [qQ][uU][iI][cC][kK][iI][nN][fF][oO] ;
RADIOBUTTON : [rR][aA][dD][iI][oO][bB][uU][tT][tT][oO][nN] ;
RAISE : [rR][aA][iI][sS][eE] ;
RAISING : [rR][aA][iI][sS][iI][nN][gG] ;
RANGE : [rR][aA][nN][gG][eE] ;
RANGES : [rR][aA][nN][gG][eE][sS] ;
RAW : [rR][aA][wW] ;
READ : [rR][eE][aA][dD] ;
READONLY : [rR][eE][aA][dD][-][oO][nN][lL][yY] ;
READER : [rR][eE][aA][dD][eE][rR] ;
RECEIVE : [rR][eE][cC][eE][iI][vV][eE] ;
RECEIVED : [rR][eE][cC][eE][iI][vV][eE][dD] ;
RECEIVER : [rR][eE][cC][eE][iI][vV][eE][rR] ;
RECEIVING : [rR][eE][cC][eE][iI][vV][iI][nN][gG] ;
RED : [rR][eE][dD] ;
REDEFINITION : [rR][eE][dD][eE][fF][iI][nN][iI][tT][iI][oO][nN] ;
REDUCE : [rR][eE][dD][uU][cC][eE] ;
REDUCED : [rR][eE][dD][uU][cC][eE][dD] ;
REF : [rR][eE][fF] ;
REFERENCE : [rR][eE][fF][eE][rR][eE][nN][cC][eE] ;
REFRESH : [rR][eE][fF][rR][eE][sS][hH] ;
REGEX : [rR][eE][gG][eE][xX] ;
REJECT : [rR][eE][jJ][eE][cC][tT] ;
REMOTE : [rR][eE][mM][oO][tT][eE] ;
RENAMING : [rR][eE][nN][aA][mM][iI][nN][gG] ;
REPLACE : [rR][eE][pP][lL][aA][cC][eE] ;
REPLACEMENT : [rR][eE][pP][lL][aA][cC][eE][mM][eE][nN][tT] ;
REPLACING : [rR][eE][pP][lL][aA][cC][iI][nN][gG] ;
REPORT : [rR][eE][pP][oO][rR][tT] ;
REQUEST : [rR][eE][qQ][uU][eE][sS][tT] ;
REQUESTED : [rR][eE][qQ][uU][eE][sS][tT][eE][dD] ;
RESERVE : [rR][eE][sS][eE][rR][vV][eE] ;
RESET : [rR][eE][sS][eE][tT] ;
RESOLUTION : [rR][eE][sS][oO][lL][uU][tT][iI][oO][nN] ;
RESPECTING : [rR][eE][sS][pP][eE][cC][tT][iI][nN][gG] ;
RESPONSIBLE : [rR][eE][sS][pP][oO][nN][sS][iI][bB][lL][eE] ;
RESULT : [rR][eE][sS][uU][lL][tT] ;
RESULTS : [rR][eE][sS][uU][lL][tT][sS] ;
RESUMABLE : [rR][eE][sS][uU][mM][aA][bB][lL][eE] ;
RESUME : [rR][eE][sS][uU][mM][eE] ;
RETRY : [rR][eE][tT][rR][yY] ;
RETURN : [rR][eE][tT][uU][rR][nN] ;
RETURNCODE : [rR][eE][tT][uU][rR][nN][cC][oO][dD][eE] ;
RETURNING : [rR][eE][tT][uU][rR][nN][iI][nN][gG] ;
RETURNS : [rR][eE][tT][uU][rR][nN][sS] ;
RIGHT : [rR][iI][gG][hH][tT] ;
RIGHTJUSTIFIED : [rR][iI][gG][hH][tT][-][jJ][uU][sS][tT][iI][fF][iI][eE][dD] ;
RIGHTPLUS : [rR][iI][gG][hH][tT][pP][lL][uU][sS] ;
RIGHTSPACE : [rR][iI][gG][hH][tT][sS][pP][aA][cC][eE] ;
RISK : [rR][iI][sS][kK] ;
RMC_COMMUNICATION_FAILURE : [rR][mM][cC][_][cC][oO][mM][mM][uU][nN][iI][cC][aA][tT][iI][oO][nN][_][fF][aA][iI][lL][uU][rR][eE] ;
RMC_INVALID_STATUS : [rR][mM][cC][_][iI][nN][vV][aA][lL][iI][dD][_][sS][tT][aA][tT][uU][sS] ;
RMC_SYSTEM_FAILURE : [rR][mM][cC][_][sS][yY][sS][tT][eE][mM][_][fF][aA][iI][lL][uU][rR][eE] ;
ROLE : [rR][oO][lL][eE] ;
ROLLBACK : [rR][oO][lL][lL][bB][aA][cC][kK] ;
ROUND : [rR][oO][uU][nN][dD] ;
ROWS : [rR][oO][wW][sS] ;
RPAD : [rR][pP][aA][dD] ;
RTRIM : [rR][tT][rR][iI][mM] ;
RUN : [rR][uU][nN] ;
SAP : [sS][aA][pP] ;
SAPSPOOL : [sS][aA][pP][-][sS][pP][oO][oO][lL] ;
SAVING : [sS][aA][vV][iI][nN][gG] ;
SCALE_PRESERVING : [sS][cC][aA][lL][eE][_][pP][rR][eE][sS][eE][rR][vV][iI][nN][gG] ;
SCALE_PRESERVING_SCIENTIFIC : [sS][cC][aA][lL][eE][_][pP][rR][eE][sS][eE][rR][vV][iI][nN][gG][_][sS][cC][iI][eE][nN][tT][iI][fF][iI][cC] ;
SCAN : [sS][cC][aA][nN] ;
SCIENTIFIC : [sS][cC][iI][eE][nN][tT][iI][fF][iI][cC] ;
SCIENTIFIC_WITH_LEADING_ZERO : [sS][cC][iI][eE][nN][tT][iI][fF][iI][cC][_][wW][iI][tT][hH][_][lL][eE][aA][dD][iI][nN][gG][_][zZ][eE][rR][oO] ;
SCREEN : [sS][cC][rR][eE][eE][nN] ;
SCROLL : [sS][cC][rR][oO][lL][lL] ;
SCROLLBOUNDARY : [sS][cC][rR][oO][lL][lL][-][bB][oO][uU][nN][dD][aA][rR][yY] ;
SCROLLING : [sS][cC][rR][oO][lL][lL][iI][nN][gG] ;
SEARCH : [sS][eE][aA][rR][cC][hH] ;
SECONDARY : [sS][eE][cC][oO][nN][dD][aA][rR][yY] ;
SECONDS : [sS][eE][cC][oO][nN][dD][sS] ;
SECTION : [sS][eE][cC][tT][iI][oO][nN] ;
SELECT : [sS][eE][lL][eE][cC][tT] ;
SELECTOPTIONS : [sS][eE][lL][eE][cC][tT][-][oO][pP][tT][iI][oO][nN][sS] ;
SELECTION : [sS][eE][lL][eE][cC][tT][iI][oO][nN] ;
SELECTIONSCREEN : [sS][eE][lL][eE][cC][tT][iI][oO][nN][-][sS][cC][rR][eE][eE][nN] ;
SELECTIONSET : [sS][eE][lL][eE][cC][tT][iI][oO][nN][-][sS][eE][tT] ;
SELECTIONSETS : [sS][eE][lL][eE][cC][tT][iI][oO][nN][-][sS][eE][tT][sS] ;
SELECTIONTABLE : [sS][eE][lL][eE][cC][tT][iI][oO][nN][-][tT][aA][bB][lL][eE] ;
SELECTIONS : [sS][eE][lL][eE][cC][tT][iI][oO][nN][sS] ;
SEND : [sS][eE][nN][dD] ;
SEPARATE : [sS][eE][pP][aA][rR][aA][tT][eE] ;
SEPARATED : [sS][eE][pP][aA][rR][aA][tT][eE][dD] ;
SET : [sS][eE][tT] ;
SHARED : [sS][hH][aA][rR][eE][dD] ;
SHIFT : [sS][hH][iI][fF][tT] ;
SHORT : [sS][hH][oO][rR][tT] ;
SHORTDUMPID : [sS][hH][oO][rR][tT][dD][uU][mM][pP][-][iI][dD] ;
SIGN : [sS][iI][gG][nN] ;
SIGN_AS_POSTFIX : [sS][iI][gG][nN][_][aA][sS][_][pP][oO][sS][tT][fF][iI][xX] ;
SIMPLE : [sS][iI][mM][pP][lL][eE] ;
SINGLE : [sS][iI][nN][gG][lL][eE] ;
SIZE : [sS][iI][zZ][eE] ;
SSKIP : [sS][kK][iI][pP] ;
SKIPPING : [sS][kK][iI][pP][pP][iI][nN][gG] ;
SMART : [sS][mM][aA][rR][tT] ;
SOME : [sS][oO][mM][eE] ;
SORT : [sS][oO][rR][tT] ;
SORTABLE : [sS][oO][rR][tT][aA][bB][lL][eE] ;
SORTED : [sS][oO][rR][tT][eE][dD] ;
SOURCE : [sS][oO][uU][rR][cC][eE] ;
SPACE : [sS][pP][aA][cC][eE] ;
SPECIFIED : [sS][pP][eE][cC][iI][fF][iI][eE][dD] ;
SPLIT : [sS][pP][lL][iI][tT] ;
SPOOL : [sS][pP][oO][oO][lL] ;
SPOTS : [sS][pP][oO][tT][sS] ;
SQL : [sS][qQ][lL] ;
SQLSCRIPT : [sS][qQ][lL][sS][cC][rR][iI][pP][tT] ;
SSTRING : [sS][sS][tT][rR][iI][nN][gG] ;
STABLE : [sS][tT][aA][bB][lL][eE] ;
STAMP : [sS][tT][aA][mM][pP] ;
STANDARD : [sS][tT][aA][nN][dD][aA][rR][dD] ;
STARTOFSELECTION : [sS][tT][aA][rR][tT][-][oO][fF][-][sS][eE][lL][eE][cC][tT][iI][oO][nN] ;
STARTING : [sS][tT][aA][rR][tT][iI][nN][gG] ;
STATE : [sS][tT][aA][tT][eE] ;
STATEMENT : [sS][tT][aA][tT][eE][mM][eE][nN][tT] ;
STATEMENTS : [sS][tT][aA][tT][eE][mM][eE][nN][tT][sS] ;
STATIC : [sS][tT][aA][tT][iI][cC] ;
STATICS : [sS][tT][aA][tT][iI][cC][sS] ;
STATUSINFO : [sS][tT][aA][tT][uU][sS][iI][nN][fF][oO] ;
STEPLOOP : [sS][tT][eE][pP][-][lL][oO][oO][pP] ;
STOP : [sS][tT][oO][pP] ;
STRUCTURE : [sS][tT][rR][uU][cC][tT][uU][rR][eE] ;
STRUCTURES : [sS][tT][rR][uU][cC][tT][uU][rR][eE][sS] ;
STYLE : [sS][tT][yY][lL][eE] ;
SUBKEY : [sS][uU][bB][kK][eE][yY] ;
SUBMATCHES : [sS][uU][bB][mM][aA][tT][cC][hH][eE][sS] ;
SUBMIT : [sS][uU][bB][mM][iI][tT] ;
SUBROUTINE : [sS][uU][bB][rR][oO][uU][tT][iI][nN][eE] ;
SUBSCREEN : [sS][uU][bB][sS][cC][rR][eE][eE][nN] ;
SUBSTRING : [sS][uU][bB][sS][tT][rR][iI][nN][gG] ;
SUBTRACT : [sS][uU][bB][tT][rR][aA][cC][tT] ;
SUBTRACTCORRESPONDING : [sS][uU][bB][tT][rR][aA][cC][tT][-][cC][oO][rR][rR][eE][sS][pP][oO][nN][dD][iI][nN][gG] ;
SUFFIX : [sS][uU][fF][fF][iI][xX] ;
SUM : [sS][uU][mM] ;
SUMMARY : [sS][uU][mM][mM][aA][rR][yY] ;
SUMMING : [sS][uU][mM][mM][iI][nN][gG] ;
SUPPLIED : [sS][uU][pP][pP][lL][iI][eE][dD] ;
SUPPLY : [sS][uU][pP][pP][lL][yY] ;
SUPPRESS : [sS][uU][pP][pP][rR][eE][sS][sS] ;
SWITCH : [sS][wW][iI][tT][cC][hH] ;
SWITCHSTATES : [sS][wW][iI][tT][cC][hH][sS][tT][aA][tT][eE][sS] ;
SYBASE : [sS][yY][bB][aA][sS][eE] ;
SYMBOL : [sS][yY][mM][bB][oO][lL] ;
SYNCPOINTS : [sS][yY][nN][cC][pP][oO][iI][nN][tT][sS] ;
SYNTAX : [sS][yY][nN][tT][aA][xX] ;
SYNTAXCHECK : [sS][yY][nN][tT][aA][xX][-][cC][hH][eE][cC][kK] ;
SYNTAXTRACE : [sS][yY][nN][tT][aA][xX][-][tT][rR][aA][cC][eE] ;
SYSTEMCALL : [sS][yY][sS][tT][eE][mM][-][cC][aA][lL][lL] ;
SYSTEMEXCEPTIONS : [sS][yY][sS][tT][eE][mM][-][eE][xX][cC][eE][pP][tT][iI][oO][nN][sS] ;
SYSTEMEXIT : [sS][yY][sS][tT][eE][mM][-][eE][xX][iI][tT] ;
TAB : [tT][aA][bB] ;
TABBED : [tT][aA][bB][bB][eE][dD] ;
TABLE : [tT][aA][bB][lL][eE] ;
TABLES : [tT][aA][bB][lL][eE][sS] ;
TABLEVIEW : [tT][aA][bB][lL][eE][vV][iI][eE][wW] ;
TABSTRIP : [tT][aA][bB][sS][tT][rR][iI][pP] ;
TARGET : [tT][aA][rR][gG][eE][tT] ;
TASK : [tT][aA][sS][kK] ;
TASKS : [tT][aA][sS][kK][sS] ;
TEST : [tT][eE][sS][tT] ;
TESTINJECTION : [tT][eE][sS][tT][-][iI][nN][jJ][eE][cC][tT][iI][oO][nN] ;
TESTSEAM : [tT][eE][sS][tT][-][sS][eE][aA][mM] ;
TESTING : [tT][eE][sS][tT][iI][nN][gG] ;
TEXT : [tT][eE][xX][tT] ;
TEXTPOOL : [tT][eE][xX][tT][pP][oO][oO][lL] ;
THEN : [tT][hH][eE][nN] ;
THROW : [tT][hH][rR][oO][wW] ;
TIME : [tT][iI][mM][eE] ;
TIMES : [tT][iI][mM][eE][sS] ;
TIMESTAMP : [tT][iI][mM][eE][sS][tT][aA][mM][pP] ;
TIMEZONE : [tT][iI][mM][eE][zZ][oO][nN][eE] ;
TIMS : [tT][iI][mM][sS] ;
TIMS_IS_VALID : [tT][iI][mM][sS][_][iI][sS][_][vV][aA][lL][iI][dD] ;
TITLE : [tT][iI][tT][lL][eE] ;
TITLELINES : [tT][iI][tT][lL][eE][-][lL][iI][nN][eE][sS] ;
TITLEBAR : [tT][iI][tT][lL][eE][bB][aA][rR] ;
TO : [tT][oO] ;
TOKENIZATION : [tT][oO][kK][eE][nN][iI][zZ][aA][tT][iI][oO][nN] ;
TOKENS : [tT][oO][kK][eE][nN][sS] ;
TOPLINES : [tT][oO][pP][-][lL][iI][nN][eE][sS] ;
TOPOFPAGE : [tT][oO][pP][-][oO][fF][-][pP][aA][gG][eE] ;
TRACEFILE : [tT][rR][aA][cC][eE][-][fF][iI][lL][eE] ;
TRACETABLE : [tT][rR][aA][cC][eE][-][tT][aA][bB][lL][eE] ;
TRAILING : [tT][rR][aA][iI][lL][iI][nN][gG] ;
TRANSACTION : [tT][rR][aA][nN][sS][aA][cC][tT][iI][oO][nN] ;
TRANSFER : [tT][rR][aA][nN][sS][fF][eE][rR] ;
TRANSFORMATION : [tT][rR][aA][nN][sS][fF][oO][rR][mM][aA][tT][iI][oO][nN] ;
TRANSLATE : [tT][rR][aA][nN][sS][lL][aA][tT][eE] ;
TRANSPORTING : [tT][rR][aA][nN][sS][pP][oO][rR][tT][iI][nN][gG] ;
TRMAC : [tT][rR][mM][aA][cC] ;
TRUNCATE : [tT][rR][uU][nN][cC][aA][tT][eE] ;
TRUNCATION : [tT][rR][uU][nN][cC][aA][tT][iI][oO][nN] ;
TRY : [tT][rR][yY] ;
TSTMP_ADD_SECONDS : [tT][sS][tT][mM][pP][_][aA][dD][dD][_][sS][eE][cC][oO][nN][dD][sS] ;
TSTMP_CURRENT_UTCTIMESTAMP : [tT][sS][tT][mM][pP][_][cC][uU][rR][rR][eE][nN][tT][_][uU][tT][cC][tT][iI][mM][eE][sS][tT][aA][mM][pP] ;
TSTMP_IS_VALID : [tT][sS][tT][mM][pP][_][iI][sS][_][vV][aA][lL][iI][dD] ;
TSTMP_SECONDS_BETWEEN : [tT][sS][tT][mM][pP][_][sS][eE][cC][oO][nN][dD][sS][_][bB][eE][tT][wW][eE][eE][nN] ;
TSTMP_TO_DATS : [tT][sS][tT][mM][pP][_][tT][oO][_][dD][aA][tT][sS] ;
TSTMP_TO_DST : [tT][sS][tT][mM][pP][_][tT][oO][_][dD][sS][tT] ;
TSTMP_TO_TIMS : [tT][sS][tT][mM][pP][_][tT][oO][_][tT][iI][mM][sS] ;
TYPE : [tT][yY][pP][eE] ;
TYPEPOOL : [tT][yY][pP][eE][-][pP][oO][oO][lL] ;
TYPEPOOLS : [tT][yY][pP][eE][-][pP][oO][oO][lL][sS] ;
TYPES : [tT][yY][pP][eE][sS] ;
ULINE : [uU][lL][iI][nN][eE] ;
UNASSIGN : [uU][nN][aA][sS][sS][iI][gG][nN] ;
UNDER : [uU][nN][dD][eE][rR] ;
UNICODE : [uU][nN][iI][cC][oO][dD][eE] ;
UNION : [uU][nN][iI][oO][nN] ;
UNIQUE : [uU][nN][iI][qQ][uU][eE] ;
UNIT : [uU][nN][iI][tT] ;
UNIT_CONVERSION : [uU][nN][iI][tT][_][cC][oO][nN][vV][eE][rR][sS][iI][oO][nN] ;
UNIX : [uU][nN][iI][xX] ;
UNPACK : [uU][nN][pP][aA][cC][kK] ;
UNTIL : [uU][nN][tT][iI][lL] ;
UNWIND : [uU][nN][wW][iI][nN][dD] ;
UP : [uU][pP] ;
UPDATE : [uU][pP][dD][aA][tT][eE] ;
UPPER : [uU][pP][pP][eE][rR] ;
USER : [uU][sS][eE][rR] ;
USERCOMMAND : [uU][sS][eE][rR][-][cC][oO][mM][mM][aA][nN][dD] ;
USING : [uU][sS][iI][nN][gG] ;
UTF8 : [uU][tT][fF][-]'8' ;
VALID : [vV][aA][lL][iI][dD] ;
VALUE : [vV][aA][lL][uU][eE] ;
VALUEREQUEST : [vV][aA][lL][uU][eE][-][rR][eE][qQ][uU][eE][sS][tT] ;
VALUES : [vV][aA][lL][uU][eE][sS] ;
VARIANT : [vV][aA][rR][iI][aA][nN][tT] ;
VARY : [vV][aA][rR][yY] ;
VARYING : [vV][aA][rR][yY][iI][nN][gG] ;
VERIFICATIONMESSAGE : [vV][eE][rR][iI][fF][iI][cC][aA][tT][iI][oO][nN][-][mM][eE][sS][sS][aA][gG][eE] ;
VERSION : [vV][eE][rR][sS][iI][oO][nN] ;
VIA : [vV][iI][aA] ;
VIEW : [vV][iI][eE][wW] ;
VISIBLE : [vV][iI][sS][iI][bB][lL][eE] ;
WAIT : [wW][aA][iI][tT] ;
WARNING : [wW][aA][rR][nN][iI][nN][gG] ;
WHEN : [wW][hH][eE][nN] ;
WHENEVER : [wW][hH][eE][nN][eE][vV][eE][rR] ;
WHERE : [wW][hH][eE][rR][eE] ;
WHILE : [wW][hH][iI][lL][eE] ;
WIDTH : [wW][iI][dD][tT][hH] ;
WINDOW : [wW][iI][nN][dD][oO][wW] ;
WINDOWS : [wW][iI][nN][dD][oO][wW][sS] ;
WITH : [wW][iI][tT][hH] ;
WITHHEADING : [wW][iI][tT][hH][-][hH][eE][aA][dD][iI][nN][gG] ;
WITHTITLE : [wW][iI][tT][hH][-][tT][iI][tT][lL][eE] ;
WITHOUT : [wW][iI][tT][hH][oO][uU][tT] ;
WORD : [wW][oO][rR][dD] ;
WORK : [wW][oO][rR][kK] ;
WRITE : [wW][rR][iI][tT][eE] ;
WRITER : [wW][rR][iI][tT][eE][rR] ;
XML : [xX][mM][lL] ;
XOR: [xX][oO][rR] ;
XSD : [xX][sS][dD] ;
YELLOW : [yY][eE][lL][lL][oO][wW] ;
YES : [yY][eE][sS] ;
YYMMDD : [yY][yY][mM][mM][dD][dD] ;
ZERO : [zZ][eE][rR][oO] ;
ZONE : [zZ][oO][nN][eE] ;

NUM :   [0-9]+ ('.' [0-9]+)? ([eE] [+-]? [0-9]+)?;
ID  :   [a-zA-Z]+([a-zA-Z0-9_~]|'-' )* ;
WS  :   [' '\t\r\n] -> channel(HIDDEN);


/**
prog - starter rule
*/
//OK
prog
    :   statement*
    ;

/**
block - general block of code
*/
//OK
block:
        statement*
    ;

/**
statement - general unit of code, must contains all rules
*/
statement:                  //grammar       //AST
        empty               //OK            //OK
    |   declaration         //OK            //need rebuild
    |   report              //OK            //OK
    |   clear               //OK            //OK
    |   condition           //OK            //OK
    |   select              //OK            //missing
    |   readtable           //OK            //OK
    |   loop                //OK            //OK
    |   assignment          //OK            //OK
    |   comment
;

/**
empty - empty row in code ended with point
*/
//OK
empty: DOT;

/**
report - report statement
*/
//OK
report: REPORT rep=ID DOT;

/**
clear - clear statement
*/
//OK
clear: CLEAR DDOT? co=lidcommas DOT;

/**
condition - condition block
*/
condition:
    IF LPAREN? con=expr RPAREN? DOT if_body=block
      (else_if=elseif)
     (ELSE DOT else_body=block )? ENDIF DOT
    ;

/**
elseif - elseif block
*/
elseif:
    elseifloop*
;

/**
elseifloop - else if block
*/
elseifloop:
    ELSEIF LPAREN? con=expr RPAREN? DOT if_body=block
    ;


/**
assignment - assignment statement
*/
//OK
assignment: where=var ASSIGNMENT_OP what=expr DOT
    ;



comment:
    COMM
;


/**
loop- loop block
*/
//OK
loop:
    LOOP AT lfrom=var ( INTO | ASSIGNING ) lto=var DOT // (inline_data_declaration | var) | (ASSIGNING (inline_fields_declaration | var))) DOT
      lblock=block
    ENDLOOP DOT
;

/**
op - operator
*/
op: rel=BOOLEAN_OP | rel=ASSIGNMENT_OP | rel=RELATIONAL_OP  ;

/**
expr - general expresion
*/
expr:
      SQLPAREN p1=expr SQRPAREN                                                                             #sparenNode
    | LPAREN p1=expr RPAREN                                                                                 #rparenNode
    | p1=expr rel=op p2=expr                                                                                #comparationNode
    | p1=expr (rel=OP_SUB |rel=OP_ADD | rel=OP_MUL | rel=OP_DIV | rel=DIV | rel=MOD | rel='**' ) p2=expr    #arithmeticNode
    | p1=var                                                                                                #varNode
    | p1=value                                                                                              #valueNode
    ;


/**
select - select statement
*/
select:
    SELECT  ( single=SINGLE  | SINGLE FOR single=UPDATE)? (what=lidcommas| OP_MUL)
    FROM
    par=LPAREN? data_source=ID (AS tabalias=ID)? (((in=INNER? join=JOIN)|(dir=LEFT|dir=RIGHT out=OUTER? join=JOIN)|(cross=CROSS join=JOIN))
                    //data_source=ID (AS tabalias=ID)?
                    (ON pjoin=join_cond)?)? RPAREN?
    pswrodf=swordf
    DOT
;

swordf:
    sword*
;

sword:
    (UP TO prows=NUM ROWS ) |
    ((mod=INTO | mod=APPENDING) (cor=CORRESPONDING FIELDS OF)? table=TABLE? atsign=ATSIGN? trgt=var) |
    (FOR ALL ENTRIES IN itab=var) |
    (WHERE conditions=s_cond) |
    (GROUP BY s_group=lidcommas) |
    (HAVING s_group_cond=s_cond) |
    (UNION (wt=ALL|wt=DISTINCT)?  s_select=select) |
    (ORDER BY s_sort_key=sort_key)
;

sort_key:
        skey=PRIMARY KEY | sk_cols=lidcommas
        ;

/**
readtable - readtable statement
*/

readtable:
    READ TABLE table=var  ( rtabk=rtable_key | idx=index )?
    ( ptype=INTO | ptype=ASSIGNING | ptype=REFERENCE  INTO | ptype=TRANSPORTING NO FIELDS)
    result=var
    topt=transport_options? cast=casting?
    DOT
;

/**
rtable_key - table key
*/
//not ok
rtable_key:
    WITH tab=TABLE? KEY cls=cols
;

/**
transport_options - tranpsort options
*/
//OK
transport_options:
    ptype=COMPARING ( pclms=lid | (pcnt=ALL FIELDS) | (pcnt=NO FIELDS)) |
    ptype=TRANSPORTING ( pclms=lid | (pcnt=ALL FIELDS) )
;

/**
casting - casting field-symbol
*/
casting:
    pcast=CASTING (TYPE pcast=ID)?
;

/**
inline_fields_declaration - inline field-symbol decalration
*/
inline_fields_declaration:
    FIELDSYMBOL LPAREN var RPAREN
;
/**
cols - lsit of col
*/
//not ok
cols:
    col*
;

/**
col - (ID = ID)
*/
col:
    p1=ID pop=ASSIGNMENT_OP (p2=var | p3=value)
;

index:
    INDEX pvar=var (USING KEY pkey=var)
;

s_cond: 
    expr
;

/**
columns - list of IDs separated by comma
*/
//OK
lidcommas:
    lidcomma*
;

lidcomma:
    lcol=var COMMA? (ldir=DESCENDING | ldir=ASCENDING)?
;

/**
var - variable, field symbol, inline data declaration or inline field-symol declaration
*/
//OK
var : fieldsymbol | variable | inline_data_declaration | inline_fields_declaration;

variable:
ATSIGN? pvar=ID
;

fieldsymbol:
    RELATIONAL_OP fsym=ID RELATIONAL_OP(OP_SUB fscol=ID)?
;

/**
inline_data_declaration - inline data declaration
*/
//OK
inline_data_declaration:
     DATA LPAREN name=var RPAREN
;

/**
value - number or value in apostrofs ('123', 'text')
*/
//OK
value:
            NUM                     #numNode
        |   (APO NUM? ID? APO)      #stringNode
;

/**
declaration - DATA declaraation
*/
//OK
declaration:
    (DATA | TYPES) DDOT? (BEGIN OF pstruct=ID)? pdecl=decl_eachloop
     (COMMA END OF ID)?
     DOT
;

decl_eachloop:
    (COMMA? decl_each)*
;

/**
decl - used in DATA declaration
*/
//OK
decl_each:
    pvar=ID (LPAREN pblen=NUM RPAREN)? (ptp=TYPE|ptp=LIKE)
    (ptbtp=STANDARD| ptbtp=SORTED | ptbtp=HASHED)? ptbl=TABLE? (ptp2=LINE | ptp2=RANGE )? pof=OF? (pref=REF TO)?
    ptype=ID (LENGTH palen=NUM)?
    (WITH UNIQUE KEY pkeys=lid)?
    (DECIMALS pdec=NUM)?
    ptabkeys=tabkeys? (INITIAL SIZE pinitsize=NUM)?
    (WITH pheader=HEADER LINE)?
    ptval=VALUE? (pval=value | IS pinit=INITIAL)?
    pread=READONLY? pbox=BOXED?

;

/**
lid - list of IDs without separator
*/
//OK
lid: ID*
;

/**
tabkeys - table keys
*/
tabkeys: ID;

/**
join_cond - condition join
*/
join_cond:
    expr ((oper=AND|oper=OR) expr)*
;

COMM:   '*#' ~[\r\n]*;