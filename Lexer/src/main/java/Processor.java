/**
 * Created by airvan21 on 27.03.16.
 */

import antlr.TaskGrammarLexer;
import antlr.TaskGrammarParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

public class Processor {
    public static TaskGrammarParser process(String inputString) {
        ANTLRInputStream input = new ANTLRInputStream(inputString);
        TaskGrammarLexer lexer = new TaskGrammarLexer(input);
        TokenStream tokens = new CommonTokenStream(lexer);
        TaskGrammarParser parser = new TaskGrammarParser(tokens);

        parser.addParseListener(new Logger());

        return parser;
    }
}
