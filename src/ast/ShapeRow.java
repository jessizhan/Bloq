package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;

public class ShapeRow extends Node {
    private final String shaperow;

    public ShapeRow(String shaperow){
        this.shaperow = shaperow;
    }

    public String getShaperow() {
        return shaperow;
    } // string because we need to preserve the zeros

    @Override
    public <T, U> U accept(BloqVisitor<T, U> visitor, T t) {
        return visitor.visit(this, t);
    }

    @Override
    public int getType(){
        return 22;
    }
}
