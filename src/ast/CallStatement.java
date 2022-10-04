package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;

public class CallStatement extends Node {
    private final Variable name;
    private final Args args;

    public CallStatement(Variable name, Args args){
        this.name = name;
        this.args = args;
    }

    public Variable getName() {
        return name;
    }

    public Args getArgs() {
        return args;
    }

    @Override
    public <T, U> U accept(BloqVisitor<T, U> visitor, T t) {
        return visitor.visit(this, t);
    }

    @Override
    public int getType(){
        return 5;
    }
}
