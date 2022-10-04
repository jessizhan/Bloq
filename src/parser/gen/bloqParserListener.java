// Generated from /Users/jessicazhan/Projects/cpsc410_project1_team9/src/parser/bloqParser.g4 by ANTLR 4.10.1

package parser.gen;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link bloqParser}.
 */
public interface bloqParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link bloqParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(bloqParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link bloqParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(bloqParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link bloqParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(bloqParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bloqParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(bloqParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bloqParser#canvas_statement}.
	 * @param ctx the parse tree
	 */
	void enterCanvas_statement(bloqParser.Canvas_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bloqParser#canvas_statement}.
	 * @param ctx the parse tree
	 */
	void exitCanvas_statement(bloqParser.Canvas_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bloqParser#simple_assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_assignment_statement(bloqParser.Simple_assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bloqParser#simple_assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_assignment_statement(bloqParser.Simple_assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bloqParser#shape_assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterShape_assignment_statement(bloqParser.Shape_assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bloqParser#shape_assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitShape_assignment_statement(bloqParser.Shape_assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bloqParser#call_statement}.
	 * @param ctx the parse tree
	 */
	void enterCall_statement(bloqParser.Call_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bloqParser#call_statement}.
	 * @param ctx the parse tree
	 */
	void exitCall_statement(bloqParser.Call_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bloqParser#define_statement}.
	 * @param ctx the parse tree
	 */
	void enterDefine_statement(bloqParser.Define_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bloqParser#define_statement}.
	 * @param ctx the parse tree
	 */
	void exitDefine_statement(bloqParser.Define_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bloqParser#in_function_statement}.
	 * @param ctx the parse tree
	 */
	void enterIn_function_statement(bloqParser.In_function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bloqParser#in_function_statement}.
	 * @param ctx the parse tree
	 */
	void exitIn_function_statement(bloqParser.In_function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bloqParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(bloqParser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bloqParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(bloqParser.Block_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bloqParser#block_start_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_start_statement(bloqParser.Block_start_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bloqParser#block_start_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_start_statement(bloqParser.Block_start_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bloqParser#block_shape_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_shape_statement(bloqParser.Block_shape_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bloqParser#block_shape_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_shape_statement(bloqParser.Block_shape_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bloqParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(bloqParser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bloqParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(bloqParser.Loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bloqParser#in_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterIn_loop_statement(bloqParser.In_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bloqParser#in_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitIn_loop_statement(bloqParser.In_loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bloqParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(bloqParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bloqParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(bloqParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bloqParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(bloqParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bloqParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(bloqParser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bloqParser#in_if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIn_if_statement(bloqParser.In_if_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bloqParser#in_if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIn_if_statement(bloqParser.In_if_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bloqParser#linked_condition}.
	 * @param ctx the parse tree
	 */
	void enterLinked_condition(bloqParser.Linked_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link bloqParser#linked_condition}.
	 * @param ctx the parse tree
	 */
	void exitLinked_condition(bloqParser.Linked_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link bloqParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(bloqParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link bloqParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(bloqParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link bloqParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(bloqParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link bloqParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(bloqParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link bloqParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(bloqParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link bloqParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(bloqParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link bloqParser#shape_row}.
	 * @param ctx the parse tree
	 */
	void enterShape_row(bloqParser.Shape_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link bloqParser#shape_row}.
	 * @param ctx the parse tree
	 */
	void exitShape_row(bloqParser.Shape_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link bloqParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(bloqParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link bloqParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(bloqParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link bloqParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(bloqParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link bloqParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(bloqParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link bloqParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(bloqParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link bloqParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(bloqParser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link bloqParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(bloqParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link bloqParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(bloqParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link bloqParser#logic_operator}.
	 * @param ctx the parse tree
	 */
	void enterLogic_operator(bloqParser.Logic_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link bloqParser#logic_operator}.
	 * @param ctx the parse tree
	 */
	void exitLogic_operator(bloqParser.Logic_operatorContext ctx);
}