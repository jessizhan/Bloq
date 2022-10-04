package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;
import java.util.List;

public class ElseStatement extends Node {
    private final List<InIfStatement> statements;

    public ElseStatement(List<InIfStatement> statements){
        this.statements = statements;
    }

    public List<InIfStatement> getStatements() {
        return statements;
    }

    @Override
    public <T, U> U accept(BloqVisitor<T, U> visitor, T t) {
        return visitor.visit(this, t);
    }

    @Override
    public int getType(){
        return 10;
    }
}
