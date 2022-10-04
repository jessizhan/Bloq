package ast.evaluator;

import ast.*;
import ast.Comparator;
import libs.Node;

import java.util.*;

public class VariableValidator implements BloqVisitor<StringBuilder, String>{

    private final Map<String, Expression> assignmentTable = new HashMap<>();

    private final Map<String, List<InFunctionStatement>> functionTable = new HashMap<>();

    private final List<String> illegalNames = Arrays.asList("call", "canvas", "block", "start", "shape", "name", "for",
            "if", "define");

    @Override
    public String visit(Program p, StringBuilder param) {
        System.out.println("Visiting program validation.");
        StringBuilder totalErrors = new StringBuilder();
        for (Node statement: p.getStatements()) {
            if (statement != null) {
                String currError = statement.accept(this, param);
                if (!Objects.equals(currError, "")) {
                    totalErrors.append(currError);
                }
            }
        }
        return totalErrors.toString();
    }

    @Override
    public String visit(Statement s, StringBuilder param) {
        System.out.println("Visiting statement validation.");
        Node statement = s.getStatement();
        return statement.accept(this, param);
    }

    @Override
    public String visit(CanvasStatement c, StringBuilder param) {
        System.out.println("Visiting canvas statement validation.");
        if (c.getWidth() < 1) {
            return "Error: Cannot have canvas width less than 1. \n";
        } else if (c.getHeight() < 1) {
            return "Error: Cannot have canvas height less than 1. \n";
        }
        return "";
    }

    @Override
    public String visit(SimpleAssignmentStatement s, StringBuilder param) {
        System.out.println("Visiting simple assignment statement validation.");
        String checkName = s.getName().accept(this, param);
        String checkExp = s.getValue().accept(this, param);
        if (!Objects.equals(checkName + checkExp, "")){
            return checkName + checkExp;
        }

        String name = s.getName().getVarStr();
        if (functionTable.containsKey(name)) {
            return "Error: variable name has already been used as a function name. \n";
        }
        assignmentTable.put(name, s.getValue());
        return "";
    }

    @Override
    public String visit(ShapeAssignmentStatement s, StringBuilder param) {
        System.out.println("Visiting shape assignment statement validation.");

        StringBuilder totalErrors = new StringBuilder();
        String checkName = s.getName().accept(this, param);
        if (!Objects.equals(checkName, "")){
            totalErrors.append(checkName);
        }

        String name = s.getName().getVarStr();
        if (functionTable.containsKey(name)) {
            totalErrors.append("Error: variable name has already been used as a function name. \n");
        }

        checkShapeRows(param, totalErrors, s.getRows());

        assignmentTable.put(name, null);
        return totalErrors.toString();
    }

    @Override
    public String visit(CallStatement c, StringBuilder param) {
        System.out.println("Visiting call statement validation.");
        if (!functionTable.containsKey(c.getName().getVarStr())) {
            return "Error: attempting to call function that was not defined. \n";
        }
        return "";
    }

    @Override
    public String visit(DefineStatement d, StringBuilder param) {
        System.out.println("Visiting define statement validation.");

        String checkName = d.getName().accept(this, param);
        String checkArgs = d.getArgs().accept(this, param);
        StringBuilder totalErrors = new StringBuilder();
        List<InFunctionStatement> statements = d.getStatements();

        if (!Objects.equals(checkName + checkArgs, "")){
            totalErrors.append(checkName);
            totalErrors.append(checkArgs);
        }

        for (InFunctionStatement statement: statements) {
            if (statement != null) {
                String error = statement.accept(this, param);
                if (!Objects.equals(error, "")) {
                    totalErrors.append(error);
                }
            } else {
                totalErrors.append("Syntax error in in function statement, please double check. \n");
            }
        }

        String name = d.getName().getVarStr();
        if (assignmentTable.containsKey(name)) {
            totalErrors.append("Error: function name has already been used as a variable name. \n");
        }

        functionTable.put(name, statements);
        return totalErrors.toString();
    }

    @Override
    public String visit(InFunctionStatement s, StringBuilder param) {
        System.out.println("Visiting in-function statement validation.");
        Node statement = s.getStatement();
        return statement.accept(this, param);
    }

    @Override
    public String visit(BlockStatement b, StringBuilder param) {
        System.out.println("Visiting block statement validation.");
        String errors = b.getName().accept(this, param);

        if (b.getStart() != null) {
            errors += b.getStart().accept(this, param);
        }
        if (b.getShape() != null) {
            errors += b.getShape().accept(this, param);
        }
        return errors;
    }

    @Override
    public String visit(BlockStartStatement b, StringBuilder param) {
        System.out.println("Visiting block start statement validation.");
        return b.getX().accept(this, param) + b.getY().accept(this, param);
    }

    @Override
    public String visit(BlockShapeStatement b, StringBuilder param) {
        System.out.println("Visiting block shape statement validation.");

        StringBuilder totalErrors = new StringBuilder();
        if (b.getVar() != null) {
            String checkVar = b.getVar().accept(this, param);
            if (!Objects.equals(checkVar, "")) {
                totalErrors.append(checkVar);
            }
        }
        if (b.getRows() != null) {
            checkShapeRows(param, totalErrors, b.getRows());
        }

        return totalErrors.toString();
    }

    @Override
    public String visit(LoopStatement l, StringBuilder param) {
        System.out.println("Visiting loop statement validation.");

        String checkVar = l.getVar().accept(this, param);
        StringBuilder totalErrors = new StringBuilder();
        String start = l.getStart().getValueStr();
        String end = l.getEnd().getValueStr();
        boolean isStartInt = start.matches("-?\\d+");
        boolean isEndInt = end.matches("-?\\d+");
        if (isStartInt && isEndInt) {
            if (Integer.parseInt(end) <= Integer.parseInt(start)) {
                totalErrors.append("Error: loop end value must be greater than loop start value. \n");
            }
        }

        if (!Objects.equals(checkVar, "")) {
            totalErrors.append(checkVar);
        }

        for (InLoopStatement statement: l.getStatements()) {
            if (statement != null) {
                String currError = statement.accept(this, param);
                if (!Objects.equals(currError, "")) {
                    totalErrors.append(currError);
                }
            } else {
                totalErrors.append("Syntax error in in-loop statement, please double check. \n");
            }
        }

        return totalErrors.toString();
    }

    @Override
    public String visit(InLoopStatement s, StringBuilder param) {
        System.out.println("Visiting in-loop statement validation.");
        Node statement = s.getStatement();
        return statement.accept(this, param);
    }

    @Override
    public String visit(IfStatement i, StringBuilder param) {
        System.out.println("Visiting if statement validation.");

        StringBuilder totalErrors = new StringBuilder();

        // If statement will either have condition or linkedCondition
        if (i.getCond() != null) {
            totalErrors.append(i.getCond().accept(this, param));
        } else if (i.getLinkedCond() != null){
            totalErrors.append(i.getLinkedCond().accept(this, param));
        }

        String currError;
        for (InIfStatement statement: i.getStatements()) {
            if (statement != null) {
                currError = statement.accept(this, param);
                if (!Objects.equals(currError, "")) {
                    totalErrors.append(currError);
                }
            } else {
                totalErrors.append("Syntax error in in if statement, please double check. \n");
            }
        }

        return totalErrors.toString();
    }

    @Override
    public String visit(ElseStatement e, StringBuilder param) {
        System.out.println("Visiting else statement validation.");
        StringBuilder totalErrors = new StringBuilder();
        String currError;
        for (InIfStatement statement: e.getStatements()) {
            if (statement != null) {
                currError = statement.accept(this, param);
                if (!Objects.equals(currError, "")) {
                    totalErrors.append(currError);
                }
            } else {
                totalErrors.append("Syntax error in in if statement, please double check. \n");
            }
        }
        return totalErrors.toString();
    }

    @Override
    public String visit(InIfStatement s, StringBuilder param) {
        System.out.println("Visiting in/if statement validation.");
        Node statement = s.getStatement();
        return statement.accept(this, param);
    }

    @Override
    public String visit(LinkedCondition c, StringBuilder param) {
        System.out.println("Visiting linked condition statement validation.");

        List<Condition> conditions = c.getConditions();
        List<LogicOperator> operators = c.getOperators();
        StringBuilder totalErrors = new StringBuilder();

        if (conditions.size() != operators.size() + 1) {
            totalErrors.append("Error: number of conditions in linked condition statement must be exactly 1 more than " +
                    "the number of logical operators (&&, ||). \n");
        }

        String currError;
        for (Condition cond: conditions) {
            currError = cond.accept(this, param);
            if (!Objects.equals(currError, "")) {
                totalErrors.append(currError);
            }
        }

        for (LogicOperator lo: operators) {
            currError = lo.accept(this, param);
            if (!Objects.equals(currError, "")) {
                totalErrors.append(currError);
            }
        }

        return totalErrors.toString();
    }

    @Override
    public String visit(Condition c, StringBuilder param) {
        System.out.println("Visiting condition statement validation.");
        if (c.getExpressions().size() != 2) {
            return "Error in condition definition, you must compare 2 items. \n";
        }
        return c.getExpressions().get(0).accept(this, param) + c.getExpressions().get(1).accept(this, param);
    }

    @Override
    public String visit(Expression e, StringBuilder param) {
        System.out.println("Visiting expression validation.");
        if (e.getValues().isEmpty() || e.getValues().get(0) == null) {
            return "Missing value for expression, you must provide at least one integer. \n";
        } else if (e.getValues().size() != e.getOperators().size() + 1 || e.getValues().contains(null)) {
            return "Number of values for expressions must be exactly 1 greater than the number of operators. \n";
        } else if (e.getOperators().size() != 0 && e.getValues().get(1) == null) {
            return "Must have 2 values for expressions with an operator. \n";
        }

        if (e.getOperators().size() != 0) {
            return e.getValues().get(0).accept(this, param) +
                    e.getOperators().get(0).accept(this, param) +
                    e.getValues().get(1).accept(this, param);
        } else {
            return e.getValues().get(0).accept(this, param);
        }
    }

    @Override
    public String visit(Args a, StringBuilder param) {
        return "";
    }

    @Override
    public String visit(ShapeRow s, StringBuilder param) {
        System.out.println("Visiting shape row validation.");

        String row = s.getShaperow();
        if (!row.matches("\\d+")) {
            return "Error: shape row must only contain digits. \n";
        }

        return "";
    }

    @Override
    public String visit(Variable v, StringBuilder param) {
        System.out.println("Visiting variable validation.");
        String name = v.getVarStr();
        if (illegalNames.contains(name)) {
            return "Error: variable name cannot be one of the predefined keywords: " + illegalNames + ". \n";
        }
        return "";
    }

    @Override
    public String visit(Value v, StringBuilder param) {
        return "";
    }

    @Override
    public String visit(Comparator c, StringBuilder param) {
        return "";
    }

    @Override
    public String visit(Operator o, StringBuilder param) {
        System.out.println("Visiting operator validation.");
        List<String> operators = Arrays.asList("+", "-", "*", "/", "%");
        if (!operators.contains(o.getOp())) {
            return "Error, operator is not supported. \n";
        }
        return "";
    }

    @Override
    public String visit(LogicOperator o, StringBuilder param) {
        System.out.println("Visiting logic operator validation.");
        List<String> operators = Arrays.asList("&&", "||");
        if (!operators.contains(o.getOp())) {
            return "Error, logic operator is not supported. \n";
        }
        return "";
    }

    private void checkShapeRows(StringBuilder param, StringBuilder totalErrors, List<ShapeRow> rows) {
        String currError;
        for (ShapeRow row: rows) {
            currError = row.accept(this, param);
            if (!Objects.equals(currError, "")) {
                totalErrors.append(currError);
            }
        }
    }
}

