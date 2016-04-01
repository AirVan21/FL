/**
 * Created by airvan21 on 27.03.16.
 */
public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            TaskGrammarParser parser = Processor.process(args[0]);
            parser.program();
            System.out.println();
        } else {
            System.out.println("Please, enter a string as a command line argument!");
        }
    }
}
