package libs;

import ast.evaluator.BloqVisitor;

import java.io.PrintWriter;

public abstract class Node {
    public abstract <T, U> U accept(BloqVisitor<T,U> visitor, T t);
    public abstract int getType();
}