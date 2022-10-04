package ast;

import ast.evaluator.BloqVisitor;
import libs.Node;

import java.io.PrintWriter;
import java.util.List;

public class Condition extends Node {
    private final List<Expression> expressions;
    private final Comparator comp;
    private final boolean not;

    public Condition(List<Expression> expressions, Comparator comp, boolean not){
        this.expressions = expressions;
        this.comp = comp;
        this.not = not;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    public Comparator getComp() {
        return comp;
    }

    public Boolean isNegated() { return not; }

    @Override
    public <T, U> U accept(BloqVisitor<T, U> visitor, T t) {
        return visitor.visit(this, t);
    }

    @Override
    public int getType(){
        return 8;
    }
}
