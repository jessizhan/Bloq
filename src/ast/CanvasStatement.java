package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;
import java.io.PrintWriter;

public class CanvasStatement extends Node {
    private final int height;
    private final int width;

    public CanvasStatement(int w, int h) {
        this.height = h;
        this.width = w;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    @Override
    public <T, U> U accept(BloqVisitor<T, U> visitor, T t) {
        return visitor.visit(this, t);
    }

    @Override
    public int getType(){
        return 6;
    }
}
