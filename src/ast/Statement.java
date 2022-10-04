package ast;
import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;

public class Statement extends Node {
    private final Node statement;

    public Statement(Node statement) {
        this.statement = statement;
    }

    public Node getStatement() {
        return statement;
    }

    @Override
    public <T, U> U accept(BloqVisitor<T, U> visitor, T t) {
        return visitor.visit(this, t);
    }

    @Override
    public int getType(){
        return 24;
    }
}
