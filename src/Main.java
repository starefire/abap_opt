import AST.BuildAstVisitor;
import AST.gen.abapLexer;
import AST.gen.abapParser;
import AST.nodes.InfixNode;
import Optimalizator.Optimalizator;
import Optimalizator.SetOptimizer;
import Optimalizator.gen.optimalizatorLexer;
import Optimalizator.gen.optimalizatorParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.awt.*;
import java.io.*;
import java.net.URISyntaxException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static String out_file = "out.txt";
 //   public static String in_file = "C:\\Users\\Honza\\Desktop\\Skola\\DP\\DP_ABAP_compiler\\DP_ABAP_compiler\\test.txt";

   public static String in_file = ".\\test.txt";



    public static void main (String [] args) throws IOException, InterruptedException, URISyntaxException{
        Console console = System.console();
        if(console == null && !GraphicsEnvironment.isHeadless()){
            String filename = Main.class.getProtectionDomain().getCodeSource().getLocation().toString().substring(6);
            Runtime.getRuntime().exec(new String[]{"cmd","/c","start","cmd","/k","java -jar \"" + filename + "\""});
        }else{
            logic();
            System.out.println("Program finished.");
        }
    }

    public static void logic(){


        String file_path = in_file;
        File file = new File(file_path);
        try {
            CharStream opt = fromFileName(file_path);
            // SECTION INITIALIZE AND SET OPTIMALIZATOR

            optimalizatorLexer o_lexer = new optimalizatorLexer(opt);
            o_lexer.removeErrorListeners();
            TokenStream o_tokenStream = new CommonTokenStream(o_lexer);
            optimalizatorParser o_parser = new optimalizatorParser(o_tokenStream);
            optimalizatorParser.ProgContext o_cst = o_parser.prog();
            new SetOptimizer<>().visitProg(o_cst);

            //ENDSECTION
        }catch (Exception e){
            System.out.print("Chyba načtení souboru.");
        }

        file_path = in_file;
        file = new File(file_path);
        try {
            CharStream cs = fromFileName(file_path);
            // SECTION BUILD AST

            abapLexer abaplexer = new abapLexer(cs);
            TokenStream abaptokenStream = new CommonTokenStream(abaplexer);
            abapParser abapparser = new abapParser(abaptokenStream);
            abapParser.ProgContext abapcst = abapparser.prog();
            InfixNode ast = new BuildAstVisitor<>().visitProg(abapcst);

            // ENDSECTION


            // SECTION OPTIMALZATION

            Optimalizator optimalizator = Optimalizator.getINSTANCE();
            optimalizator.what_to_opt();
            optimalizator.set_ast(ast);
           // optimalizator.set_opt_select();
            optimalizator.optimize();

            // ENDSECTION


            // SECTION TO STRING

            //System.out.println(ast.toString());
            BufferedWriter writer = new BufferedWriter(new FileWriter(file_path.replace(".txt",out_file)));
            writer.write(ast.toString());
            writer.close();
            // ENDSECTION

        }catch (Exception e){
            System.out.print(e.toString());
        }




    }
}

