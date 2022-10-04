package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;
import java.util.List;

public class LoopStatement extends Node {
    private final Variable var;
    private final Value start;
    private final Value end;
    private final List<InLoopStatement> statements;

    public LoopStatement(Variable var, Value start, Value end, List<InLoopStatement> statements){
        this.var = var;
        this.start = start;
        this.end = end;
        this.statements = statements;
    }

    public List<InLoopStatement> getStatements() {
        return statements;
    }

    public Variable getVar() {
        return var;
    }

    public Value getEnd() {
        return end;
    }

    public Value getStart() {
        return start;
    }

    @Override
    public <T, U> U accept(BloqVisitor<T, U> visitor, T t) {
        return visitor.visit(this, t);
    }

    @Override
    public int getType(){
        return 18;
    }
}
