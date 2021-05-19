# ABAP optimalizátor
##### _diplomová práce, Jan Procházka_


Tento repositář obsahuje veškeré zdrojové soubory optimalizátoru a sady testovacích souborů. Soubory jsou rozděleny do složek grammars, src, tests, out. Textová zpráve je v hlavní složce.

## Návod na spuštění
Složka out obsahuje spustitelný soubor JAR. Po spuštění tento soubor načte obsah souboru *test.txt* a provede jeho optimalizaci. Výsledek je následěn v souboru *testout.txt*.



## Obsah složek
*grammars* – obsahuje původní gramatiku jazyka ABAP, novou gramatiku jazyka ABAP a gramatiku Optimalizátoru.
-	abap.g4
-	original_grammar.g4
-	optimalizator.g4

*src* – obsahuje zdrojové soubory optimalizátoru. Tyto soubory jsou rozděleny do po
-	AST
-	META-INF
-	Optimalizotor
-	Main.java
