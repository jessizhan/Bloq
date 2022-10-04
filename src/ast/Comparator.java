package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;

public class Comparator extends Node {
    public final String comp;

    public Comparator(String comp){
        this.comp = comp;
    }

    public String getComp() {
        return comp;
    }

    @Override
    public <T, U> U accept(BloqVisitor<T, U> visitor, T t) {
        return visitor.visit(this, t);
    }

    @Override
    public int getType(){
        return 7;
    }
}
