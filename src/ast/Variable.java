package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;

public class Variable extends Node {
    private final String varStr;

    public Variable(String varStr){
        this.varStr = varStr;
    }

    public String getVarStr() {
        return varStr;
    }

    @Override
    public <T, U> U accept(BloqVisitor<T, U> visitor, T t) {
        return visitor.visit(this, t);
    }

    @Override
    public int getType(){
        return 26;
    }
}
