import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;

/**
 * Created by airvan21 on 02.04.16.
 */
public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Enter expression as a first parameter!");
            return;
        }

        TaskGrammarLexer lexer = new TaskGrammarLexer(new ANTLRInputStream(args[0]));
        lexer.addErrorListener(ThrowingErrorListener.INSTANCE);

        CommonTokenStream tokens = null;

        try {
            tokens = new CommonTokenStream(lexer);
        } catch (ParseCancellationException e) {
            System.out.println("Lexer problem: " + e.getMessage());
        }

        TaskGrammarParser parser = new TaskGrammarParser(tokens);
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);

        Printer printer = new Printer(args[0], parser);

        try {
            printer.print();
        } catch (ParseCancellationException e) {
            System.out.println("Parser problem: " + e.getMessage());
        }
    }
}
