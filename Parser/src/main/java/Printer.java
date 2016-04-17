import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.gui.TreeViewer;
import javax.swing.*;
import java.util.Arrays;

/**
 * Created by airvan21 on 03.04.16.
 */
public class Printer {
    private final String title;
    private final TaskGrammarParser parser;
    private final int height   = 650;
    private final int width    = 500;
    private final double scale = 1.5;

    public Printer(String title, TaskGrammarParser parser) {
        this.title = title;
        this.parser = parser;
    }

    public void print() throws ParseCancellationException {

        ParseTree tree = parser.program();

        JFrame frame = new JFrame(title);
        JPanel panel = new JPanel();
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);

        viewer.setScale(scale);
        panel.add(viewer);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setVisible(true);
    }
}
