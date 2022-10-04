package parser;
import ast.*;
import libs.*;

import java.util.ArrayList;
import java.util.List;

import parser.gen.bloqParser;
import parser.gen.bloqParserBaseVisitor;

public class ParseToASTVisitor extends bloqParserBaseVisitor<Node> {
    @Override public Program visitProgram(bloqParser.ProgramContext ctx) {
        List<Statement> statements = new ArrayList<>();

        for (bloqParser.StatementContext c: ctx.statement()) {
            statements.add(visitStatement(c));
        }

        return new Program(statements);
    }

    @Override public Statement visitStatement(bloqParser.StatementContext ctx) {
        Node statement;

        if (ctx.canvas_statement() != null) {
            statement = visitCanvas_statement(ctx.canvas_statement());
        } else if (ctx.simple_assignment_statement() != null) {
            statement = visitSimple_assignment_statement(ctx.simple_assignment_statement());
        } else if (ctx.shape_assignment_statement() != null) {
            statement = visitShape_assignment_statement(ctx.shape_assignment_statement());
        } else if (ctx.define_statement() != null) {
            statement = visitDefine_statement(ctx.define_statement());
        } else if (ctx.call_statement() != null) {
            statement = visitCall_statement(ctx.call_statement());
        } else if (ctx.block_statement() != null) {
            statement = visitBlock_statement(ctx.block_statement());
        } else if (ctx.loop_statement() != null) {
            statement = visitLoop_statement(ctx.loop_statement());
        } else if (ctx.if_statement() != null) {
            statement = visitIf_statement(ctx.if_statement());
        } else {
            return null;
        }
        return new Statement(statement);
    }

    @Override public CanvasStatement visitCanvas_statement(bloqParser.Canvas_statementContext ctx) {
        int width = Integer.parseInt(ctx.NUMBER(0).getText());
        int height = Integer.parseInt(ctx.NUMBER(1).getText());

        return new CanvasStatement(width, height);
    }

    @Override public SimpleAssignmentStatement visitSimple_assignment_statement(bloqParser.Simple_assignment_statementContext ctx) {
        Variable name = visitVariable(ctx.variable()); //TODO: not sure how to correctly fix
        Expression value = visitExpression(ctx.expression());

        return new SimpleAssignmentStatement(name, value);
    }

    @Override public ShapeAssignmentStatement visitShape_assignment_statement(bloqParser.Shape_assignment_statementContext ctx) {
        List<ShapeRow> rows = new ArrayList<>();
        Variable name = visitVariable(ctx.variable());

        for (bloqParser.Shape_rowContext c: ctx.shape_row()) {
            rows.add(visitShape_row(c));
        }

        return new ShapeAssignmentStatement(name, rows);
    }

    @Override public CallStatement visitCall_statement(bloqParser.Call_statementContext ctx) {
        Variable name = visitVariable(ctx.variable());
        Args args = visitArgs(ctx.args());

        return new CallStatement(name, args);
    }

    @Override public DefineStatement visitDefine_statement(bloqParser.Define_statementContext ctx) {
        Variable name = visitVariable(ctx.variable());
        Args args = visitArgs(ctx.args());
        List<InFunctionStatement> statements = new ArrayList<>();

        for (bloqParser.In_function_statementContext c: ctx.in_function_statement()) {
            statements.add(visitIn_function_statement(c));
        }

//        for (bloqParser.Simple_assignment_statementContext c: ctx.simple_assignment_statement()) {
//            statements.add(visitSimple_assignment_statement(c));
//        }
//        for (bloqParser.Shape_assignment_statementContext c: ctx.shape_assignment_statement()) {
//            statements.add(visitShape_assignment_statement(c));
//        }
//        for (bloqParser.Block_statementContext c: ctx.block_statement()) {
//            statements.add(visitBlock_statement(c));
//        }
//        for (bloqParser.Loop_statementContext c: ctx.loop_statement()) {
//            statements.add(visitLoop_statement(c));
//        }
//        for (bloqParser.Call_statementContext c: ctx.call_statement()) {
//            statements.add(visitCall_statement(c));
//        }
//        for (bloqParser.If_statementContext c: ctx.if_statement()) {
//            statements.add(visitIf_statement(c));
//        }

        return new DefineStatement(name, args, statements);
    }

    @Override public InFunctionStatement visitIn_function_statement(bloqParser.In_function_statementContext ctx) {
        Node statement;

        if (ctx.simple_assignment_statement() != null) {
            statement = visitSimple_assignment_statement(ctx.simple_assignment_statement());
        } else if (ctx.shape_assignment_statement() != null) {
            statement = visitShape_assignment_statement(ctx.shape_assignment_statement());
        } else if (ctx.call_statement() != null) {
            statement = visitCall_statement(ctx.call_statement());
        } else if (ctx.block_statement() != null) {
            statement = visitBlock_statement(ctx.block_statement());
        } else if (ctx.loop_statement() != null) {
            statement = visitLoop_statement(ctx.loop_statement());
        } else if (ctx.if_statement() != null) {
            statement = visitIf_statement(ctx.if_statement());
        } else {
            return null;
        }

        return new InFunctionStatement(statement);
    }

    @Override public BlockStatement visitBlock_statement(bloqParser.Block_statementContext ctx) {
        // updated so it only gets 1 start and 1 shape
        int start_size = ctx.block_start_statement().size();
        int shape_size = ctx.block_shape_statement().size();
        BlockStartStatement start;
        BlockShapeStatement shape;

        if (start_size > 0) {
            start = visitBlock_start_statement(ctx.block_start_statement(start_size-1));
        } else {
            start = null;
        }
        if (shape_size > 0) {
            shape = visitBlock_shape_statement(ctx.block_shape_statement(shape_size-1));
        } else {
            shape = null;
        }

        Args names = visitArgs(ctx.args());

        return new BlockStatement(names, start, shape);
    }

    @Override public BlockStartStatement visitBlock_start_statement(bloqParser.Block_start_statementContext ctx) {
        Expression x = visitExpression(ctx.expression(0));
        Expression y = visitExpression(ctx.expression(1)); // cannot be expressions

        return new BlockStartStatement(x, y);
    }

    @Override public BlockShapeStatement visitBlock_shape_statement(bloqParser.Block_shape_statementContext ctx) {
        List<ShapeRow> rows = new ArrayList<>();
        if (ctx.variable() != null) {
            return new BlockShapeStatement(visitVariable(ctx.variable()));    // two types of constructor (shaperow/variable)
        } else {
            for (bloqParser.Shape_rowContext c: ctx.shape_row()) {
                rows.add(visitShape_row(c));
            }

            return new BlockShapeStatement(rows);
        }

    }

    @Override public LoopStatement visitLoop_statement(bloqParser.Loop_statementContext ctx) {
        Variable var = visitVariable(ctx.variable());
        Value start = visitValue(ctx.value(0));
        Value end = visitValue(ctx.value(1));

        List<InLoopStatement> statements = new ArrayList<>();

        for (bloqParser.In_loop_statementContext c: ctx.in_loop_statement()) {
            statements.add(visitIn_loop_statement(c));
        }


        return new LoopStatement(var, start, end, statements);
    }

    @Override public InLoopStatement visitIn_loop_statement(bloqParser.In_loop_statementContext ctx) {
        Node statement;

        if (ctx.simple_assignment_statement() != null) {
            statement = visitSimple_assignment_statement(ctx.simple_assignment_statement());
        } else if (ctx.shape_assignment_statement() != null) {
            statement = visitShape_assignment_statement(ctx.shape_assignment_statement());
        } else if (ctx.call_statement() != null) {
            statement = visitCall_statement(ctx.call_statement());
        } else if (ctx.block_statement() != null) {
            statement = visitBlock_statement(ctx.block_statement());
        } else if (ctx.loop_statement() != null) {
            statement = visitLoop_statement(ctx.loop_statement());
        } else if (ctx.if_statement() != null) {
            statement = visitIf_statement(ctx.if_statement());
        } else {
            return null;
        }

        return new InLoopStatement(statement);
    }

    @Override public IfStatement visitIf_statement(bloqParser.If_statementContext ctx) {
        List<InIfStatement> statements = new ArrayList<>();

        Condition cond = null;
        LinkedCondition linked_cond = null;
        ElseStatement elseStatement = null;

        if (ctx.condition() != null) {
            cond = visitCondition(ctx.condition());
        }

        if (ctx.linked_condition() != null) {
            linked_cond = visitLinked_condition(ctx.linked_condition());
        }

        for (bloqParser.In_if_statementContext c: ctx.in_if_statement()) {
            statements.add(visitIn_if_statement(c));
        }

        if (ctx.else_statement() != null) {
            elseStatement = visitElse_statement(ctx.else_statement());
        }

        return new IfStatement(cond, linked_cond, statements, elseStatement);
    }

    @Override
    public ElseStatement visitElse_statement(bloqParser.Else_statementContext ctx) {
        List<InIfStatement> statements = new ArrayList<>();

        for (bloqParser.In_if_statementContext c: ctx.in_if_statement()) {
            statements.add(visitIn_if_statement(c));
        }

        return new ElseStatement(statements);
    }

    @Override public InIfStatement visitIn_if_statement(bloqParser.In_if_statementContext ctx) {
        Node statement;

        if (ctx.simple_assignment_statement() != null) {
            statement = visitSimple_assignment_statement(ctx.simple_assignment_statement());
        } else if (ctx.shape_assignment_statement() != null) {
            statement = visitShape_assignment_statement(ctx.shape_assignment_statement());
        } else if (ctx.call_statement() != null) {
            statement = visitCall_statement(ctx.call_statement());
        } else if (ctx.block_statement() != null) {
            statement = visitBlock_statement(ctx.block_statement());
        } else if (ctx.loop_statement() != null) {
            statement = visitLoop_statement(ctx.loop_statement());
        } else if (ctx.if_statement() != null) {
            statement = visitIf_statement(ctx.if_statement());
        } else {
            return null;
        }

        return new InIfStatement(statement);
    }

    @Override public LinkedCondition visitLinked_condition(bloqParser.Linked_conditionContext ctx) {
        List<Condition> conditions = new ArrayList<>();
        List<LogicOperator> operators = new ArrayList<>();

        for (bloqParser.ConditionContext c: ctx.condition()) {
            conditions.add(visitCondition(c));
        }
        for (bloqParser.Logic_operatorContext c: ctx.logic_operator()) {
            operators.add(visitLogic_operator(c));
        }

        return new LinkedCondition(conditions, operators);
    }

    @Override public Condition visitCondition(bloqParser.ConditionContext ctx) {
        List<Expression> expressions = new ArrayList<>();
        boolean not = false; // means there is not a not

        for (bloqParser.ExpressionContext c: ctx.expression()) {
            expressions.add(visitExpression(c));
        }

        if (ctx.NOT() != null) {
            not = true;
        }

        return new Condition(expressions, visitComparator(ctx.comparator()), not);
    }

    @Override public Expression visitExpression(bloqParser.ExpressionContext ctx) {
        List<Value> values = new ArrayList<>();
        List<Operator> operators = new ArrayList<>();

        for (bloqParser.ValueContext c: ctx.value()) {
            values.add(visitValue(c));
        }

        for (bloqParser.OperatorContext c: ctx.operator()) {
            operators.add(visitOperator(c));
        }

        return new Expression(values, operators);
    }

    @Override public Args visitArgs(bloqParser.ArgsContext ctx) {
        List<Value> args = new ArrayList<>();

        for (bloqParser.ValueContext c: ctx.value()) {
            args.add(visitValue(c));
        }
        return new Args(args);
    }

    @Override public ShapeRow visitShape_row(bloqParser.Shape_rowContext ctx) {
        return new ShapeRow(ctx.NUMBER().getText());
    }

    @Override public Variable visitVariable(bloqParser.VariableContext ctx) {
        return new Variable(ctx.TEXT().getText());
    }

    @Override public Value visitValue(bloqParser.ValueContext ctx) {
        if (ctx.NUMBER() != null) {
            return new Value(Integer.parseInt(ctx.NUMBER().getText())); // two constructors
        } else if (ctx.TEXT() != null) {
            return new Value(ctx.TEXT().getText());
        } else {
            return null;
        }
    }

    @Override public Comparator visitComparator(bloqParser.ComparatorContext ctx) {
        String comp;

        if (ctx.GREATER() != null) {
            comp = ctx.GREATER().getText();
        } else if (ctx.LESS() != null) {
            comp = ctx.LESS().getText();
        } else if (ctx.GREATEREQ() != null) {
            comp = ctx.GREATEREQ().getText();
        } else if (ctx.LESSRQ() != null) { //typo i know TODO fix
            comp = ctx.LESSRQ().getText();
        } else if (ctx.EQUAL() != null) {
            comp = ctx.EQUAL().getText();
        } else if (ctx.NOTEQ() != null) {
            comp = ctx.NOTEQ().getText();
        } else {
            return null; // default
        }

        return new Comparator(comp);
    }

    @Override public Operator visitOperator(bloqParser.OperatorContext ctx) {
        String op;

        if (ctx.PLUS() != null) {
            op = ctx.PLUS().getText();
        } else if (ctx.MINUS() != null) {
            op = ctx.MINUS().getText();
        } else if (ctx.MULTIPLY() != null) {
            op = ctx.MULTIPLY().getText();
        } else if (ctx.DIVIDE() != null) {
            op = ctx.DIVIDE().getText();
        } else if (ctx.MODULO() != null) {
            op = ctx.MODULO().getText();
        } else {
            return null; // default
        }

        return new Operator(op);
    }

    @Override public LogicOperator visitLogic_operator(bloqParser.Logic_operatorContext ctx) {
        String op;

        if (ctx.AND() != null) {
            op = ctx.AND().getText();
        } else if (ctx.OR() != null) {
            op = ctx.OR().getText();
        } else {
            return null;
        }

        return new LogicOperator(op);
    }

}
