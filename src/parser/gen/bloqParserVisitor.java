// Generated from /Users/jessicazhan/Projects/cpsc410_project1_team9/src/parser/bloqParser.g4 by ANTLR 4.10.1

package parser.gen;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link bloqParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface bloqParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link bloqParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(bloqParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link bloqParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(bloqParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bloqParser#canvas_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCanvas_statement(bloqParser.Canvas_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bloqParser#simple_assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_assignment_statement(bloqParser.Simple_assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bloqParser#shape_assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShape_assignment_statement(bloqParser.Shape_assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bloqParser#call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_statement(bloqParser.Call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bloqParser#define_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_statement(bloqParser.Define_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bloqParser#in_function_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_function_statement(bloqParser.In_function_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bloqParser#block_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statement(bloqParser.Block_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bloqParser#block_start_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_start_statement(bloqParser.Block_start_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bloqParser#block_shape_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_shape_statement(bloqParser.Block_shape_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bloqParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(bloqParser.Loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bloqParser#in_loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_loop_statement(bloqParser.In_loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bloqParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(bloqParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bloqParser#else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_statement(bloqParser.Else_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bloqParser#in_if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_if_statement(bloqParser.In_if_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bloqParser#linked_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinked_condition(bloqParser.Linked_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link bloqParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(bloqParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link bloqParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(bloqParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link bloqParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(bloqParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link bloqParser#shape_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShape_row(bloqParser.Shape_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link bloqParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(bloqParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link bloqParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(bloqParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link bloqParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparator(bloqParser.ComparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link bloqParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(bloqParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link bloqParser#logic_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_operator(bloqParser.Logic_operatorContext ctx);
}