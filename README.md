# ABAP optimalizátor
##### _diplomová práce, Jan Procházka_


Tento repositář obsahuje veškeré zdrojové soubory optimalizátoru a sady testovacích souborů. Soubory jsou rozděleny do složek grammars, src, tests, out. Textová zpráva je v hlavní složce.

## Návod na spuštění
Složka out obsahuje spustitelný soubor JAR. Po spuštění tento soubor načte obsah souboru *test.txt* a provede jeho optimalizaci. Výsledek je následě uložen v souboru *testout.txt*.



## Obsah složek
*grammars* – obsahuje původní gramatiku jazyka ABAP, novou gramatiku jazyka ABAP a gramatiku Optimalizátoru.
-	abap.g4 - nová gramatika
-	original_grammar.g4 - původní gramatika
-	optimalizator.g4 - gramatika optimalizátoru

*src* – obsahuje zdrojové soubory optimalizátoru. Tyto soubory jsou rozděleny do podsložek
-	AST - soubory pro tvorbu stromu programu
-	META-INF
-	Optimalizotor - soubory optimalizátoru
-	Main.java


*out* - obsahuje spustitelný soubor Optimalizátoru

*test* - obsahuje všechny testovací soubory
