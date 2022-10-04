package ast.evaluator;

import ast.*;

import java.io.PrintWriter;

public interface BloqVisitor<T, U> {
    U visit(Program p, T param);

    U visit(Statement s, T param);

    U visit(CanvasStatement c, T param);

    U visit(SimpleAssignmentStatement s, T param);

    U visit(ShapeAssignmentStatement s, T param);

    U visit(CallStatement c, T param);

    U visit(DefineStatement d, T param);

    U visit(InFunctionStatement s, T param);

    U visit(BlockStatement b, T param);

    U visit(BlockStartStatement b, T param);

    U visit(BlockShapeStatement b, T param);

    U visit(LoopStatement l, T param);

    U visit(InLoopStatement s, T param);

    U visit(IfStatement i, T param);

    U visit(ElseStatement s, T param);

    U visit(InIfStatement s, T param);

    U visit(LinkedCondition c, T param);

    U visit(Condition c, T param);

    U visit(Expression e, T param);

    U visit(Args a, T param);

    U visit(ShapeRow s, T param);

    U visit(Variable v, T param);

    U visit(Value v, T param);

    U visit(Comparator c, T param);

    U visit(Operator o, T param);

    U visit(LogicOperator o, T param);
}
