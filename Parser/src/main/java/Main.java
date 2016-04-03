import org.antlr.v4.runtime.*;

import javax.print.PrintException;
import java.io.IOException;

/**
 * Created by airvan21 on 02.04.16.
 */
public class Main {

    public static void main(String[] args) throws IOException, PrintException {
        if (args.length != 1) {
            System.out.println("Enter expression as a first parameter!");
            return;
        }

        TaskGrammarLexer lexer = new TaskGrammarLexer(new ANTLRInputStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TaskGrammarParser parser = new TaskGrammarParser(tokens);

        Printer printer = new Printer(args[0], parser);
        printer.print();
    }
}
