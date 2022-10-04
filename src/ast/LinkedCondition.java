package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;
import java.util.List;

public class LinkedCondition extends Node {
    private final List<Condition> conditions;
    private final List<LogicOperator> operators;

    public LinkedCondition(List<Condition> conditions, List<LogicOperator> operators){
        this.conditions = conditions;
        this.operators = operators;
    }

    public List<Condition> getConditions() {
        return conditions;
    }

    public List<LogicOperator> getOperators() {
        return operators;
    }

    @Override
    public <T, U> U accept(BloqVisitor<T, U> visitor, T t) {
        return visitor.visit(this, t);
    }

    @Override
    public int getType(){
        return 16;
    }
}
