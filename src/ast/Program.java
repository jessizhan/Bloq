package ast;
import ast.evaluator.BloqVisitor;
import libs.Node;
import java.io.PrintWriter;
import java.util.List;

public class Program extends Node {
    private final List<Statement> statements;

    public Program(List<Statement> statements) {
        this.statements = statements;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    @Override
    public <T, U> U accept(BloqVisitor<T, U> visitor, T t) {
        return visitor.visit(this, t);
    }

    @Override
    public int getType(){
        return 20;
    }
}
