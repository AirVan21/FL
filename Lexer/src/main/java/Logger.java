import antlr.TaskGrammarBaseListener;
import antlr.TaskGrammarLexer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Created by airvan21 on 27.03.16.
 */
public class Logger extends TaskGrammarBaseListener {

    @Override
    public void visitTerminal(@NotNull TerminalNode node) {
        super.visitTerminal(node);
        Token symbol = node.getSymbol();
        if (symbol.getType() > 0) {
            System.out.print(
                    TaskGrammarLexer.ruleNames[symbol.getType() - 1] +
                            "(" +
                            node.getText() +
                            ", " +
                            symbol.getStartIndex() +
                            ", " +
                            symbol.getStopIndex() +
                            "); ");
        }
    }
}
