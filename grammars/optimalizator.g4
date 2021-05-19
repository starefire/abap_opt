grammar optimalizator;

STAR: [*][#];

OPTIMIZE : [oO][pP][tT][iI][mM][iI][zZ][eE];

SELECT: [sS][eE][lL][eE][cC][tT];
PREFIX: [pP][rR][eE][fF][iI][xX];
READ: [rR][eE][Aa][dD][tT][aA][bB][lL][eE];

OPTIMALIZATION: [oO][pP][tT][iI][mM][aA][lL][iI][zZ][aA][tT][iI][oO][nN] ;
ENDOPTIMALIZATION: [eE][nN][dD][oO][pP][tT][iI][mM][aA][lL][iI][zZ][aA][tT][iI][oO][nN] ;

ID: [a-zA-Z_0-9]*;
WS  :   [' '\t\r\n] -> channel(HIDDEN);



prog:
    optimal
        body=block
    endoptimal
    ;


optimal : STAR OPTIMALIZATION;
endoptimal: STAR ENDOPTIMALIZATION;

block: (
    star
    | select
    | prefix
    | read
    )*
;

prefix:STAR OPTIMIZE PREFIX prf=ID;

star : STAR;

read: STAR OPTIMIZE READ;

select: STAR OPTIMIZE SELECT #selectOpt ;



