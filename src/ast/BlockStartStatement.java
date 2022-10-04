package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;

public class BlockStartStatement extends Node {
    public final Expression x;
    public final Expression y;

    public BlockStartStatement (Expression x, Expression y){
        this.x = x;
        this.y = y;
    }

    public Expression getX() {
        return x;
    }

    public Expression getY() {
        return y;
    }

    @Override
    public <T, U> U accept(BloqVisitor<T, U> visitor, T t) {
        return visitor.visit(this, t);
    }

    @Override
    public int getType(){
        return 3;
    }
}
