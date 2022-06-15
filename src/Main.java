import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main{

    public static void main(String[] args) throws IOException{

        CharStream input = CharStreams.fromStream(System.in);
        GramaticaLexer lexer = new GramaticaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GramaticaParser parser = new GramaticaParser(tokens);
        ParseTree tree = parser.init();

        Tradutor tradutor = new Tradutor();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(tradutor, tree);

    }
}