package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;

public class Value extends Node {
    // TODO should we combine these two?
    private final int valueInt;
    private final String valueStr;

    public Value(int valueInt){
        this.valueInt = valueInt;
        this.valueStr = Integer.toString(valueInt);
    }

    public Value(String valueStr){
        this.valueInt = -1; // placeholder
        this.valueStr = valueStr;
    }

    public int getValueInt() {
        return valueInt;
    }

    public String getValueStr() {
        return valueStr;
    }

    @Override
    public <T, U> U accept(BloqVisitor<T, U> visitor, T t) {
        return visitor.visit(this, t);
    }
    @Override
    public int getType(){
        return 25;
    }
}
