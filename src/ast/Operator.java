package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;

public class Operator extends Node {
    private final String op;

    public Operator(String op){
        this.op = op;
    }

    public String getOp() {
        return op;
    }

    @Override
    public <T, U> U accept(BloqVisitor<T, U> visitor, T t) {
        return visitor.visit(this, t);
    }

    @Override
    public int getType(){
        return 19;
    }
}
