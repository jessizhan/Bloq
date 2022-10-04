package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;
import java.util.List;

public class Expression extends Node {
    private final List<Value> values;
    private final List<Operator> operators;

    public Expression(List<Value> values, List<Operator> operators){
        this.values = values;
        this.operators = operators;
    }

    public List<Operator> getOperators() {
        return operators;
    }

    public List<Value> getValues() {
        return values;
    }

    @Override
    public <T, U> U accept(BloqVisitor<T, U> visitor, T t) {
        return visitor.visit(this, t);
    }

    @Override
    public int getType(){
        return 11;
    }
}
