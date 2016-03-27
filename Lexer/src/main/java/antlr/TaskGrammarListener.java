package antlr;// Generated from TaskGrammar.g4 by ANTLR 4.3
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TaskGrammarParser}.
 */
public interface TaskGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TaskGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull TaskGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull TaskGrammarParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TaskGrammarParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void enterComparison_op(@NotNull TaskGrammarParser.Comparison_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskGrammarParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void exitComparison_op(@NotNull TaskGrammarParser.Comparison_opContext ctx);

	/**
	 * Enter a parse tree produced by {@link TaskGrammarParser#arithmetic_op}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_op(@NotNull TaskGrammarParser.Arithmetic_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskGrammarParser#arithmetic_op}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_op(@NotNull TaskGrammarParser.Arithmetic_opContext ctx);

	/**
	 * Enter a parse tree produced by {@link TaskGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull TaskGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull TaskGrammarParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link TaskGrammarParser#read_operator}.
	 * @param ctx the parse tree
	 */
	void enterRead_operator(@NotNull TaskGrammarParser.Read_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskGrammarParser#read_operator}.
	 * @param ctx the parse tree
	 */
	void exitRead_operator(@NotNull TaskGrammarParser.Read_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link TaskGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull TaskGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull TaskGrammarParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link TaskGrammarParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(@NotNull TaskGrammarParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskGrammarParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(@NotNull TaskGrammarParser.Assignment_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link TaskGrammarParser#write_operator}.
	 * @param ctx the parse tree
	 */
	void enterWrite_operator(@NotNull TaskGrammarParser.Write_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskGrammarParser#write_operator}.
	 * @param ctx the parse tree
	 */
	void exitWrite_operator(@NotNull TaskGrammarParser.Write_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link TaskGrammarParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(@NotNull TaskGrammarParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskGrammarParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(@NotNull TaskGrammarParser.OperationContext ctx);
}