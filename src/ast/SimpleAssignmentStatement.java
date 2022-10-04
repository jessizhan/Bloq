package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;

public class SimpleAssignmentStatement extends Node {
    private final Variable name;
    private final Expression value;

    public SimpleAssignmentStatement(Variable name, Expression value){
        this.name = name;
        this.value = value;
    }

    public Variable getName() {
        return name;
    }

    public Expression getValue() {
        return value;
    }

    @Override
    public <T, U> U accept(BloqVisitor<T, U> visitor, T t) {
        return visitor.visit(this, t);
    }

    @Override
    public int getType(){
        return 23;
    }
}
