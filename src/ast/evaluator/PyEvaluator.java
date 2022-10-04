package ast.evaluator;

import ast.*;
import libs.*;
import java.io.PrintWriter;
import java.util.List;

public class PyEvaluator implements BloqVisitor<PrintWriter, Integer>{
    private int IndentLevel;




    private final String Start = """
from PIL import Image
import os
block_size = 10
width = 100
height = 100
def _generate_blocks():
    try:
        os.mkdir("./assets/")
    except:
        pass
    Image.new("RGB", (block_size, block_size), (139, 69, 19)).save("./assets/land.png")
    Image.new("RGB", (block_size, block_size), (0, 0, 255)).save("./assets/water.png")
    Image.new("RGB", (block_size, block_size), (255, 0, 0)).save("./assets/lava.png")
    Image.new("RGB", (block_size, block_size), (0, 0, 0)).save("./assets/enemy.png")
def _block(blocks, x=0, y=0, shape=["1"], canvas=Image.new("RGB", (width * block_size, height * block_size))):
    global block_size
    block_lst = []
    for b in blocks:
        block_lst.append(Image.open(b))
    for row in range(len(shape)):
        for col in range(len(shape[row])):
            if int(shape[row][col]) == 0:
                continue
            curx = (x + col) * block_size
            cury = (y + row) * block_size
            canvas.paste(block_lst[int(shape[row][col]) - 1], (curx, cury))
land = "./assets/land.png"
water = "./assets/water.png"
lava = "./assets/lava.png"
enemy = "./assets/enemy.png"
_generate_blocks()
canvas = Image.new("RGB", (width * block_size, height * block_size), (255, 255, 255)) 
           
            """;

    private String End = """
canvas.save("./output.png")
""";

    private final Boolean log = true;

    private void AddIndent(int level, PrintWriter printWriter) {
        for (int i = 0; i < level; i++) {
            printWriter.write("    "); // 4 space indent
        }
    }



    @Override
    public Integer visit(Program p, PrintWriter printWriter) {
        if (log) {
            System.out.println("Visited program");
        }
        this.IndentLevel = 0;

        printWriter.write(this.Start);

        for (Node statement: p.getStatements()) {
            statement.accept(this, printWriter);
        }

        printWriter.write(this.End);

        return 0;
    }

    // Is this neccessary? TODO
    @Override
    public Integer visit(Statement s, PrintWriter printWriter) {
        if (log) {
            System.out.println("Visited statement");
        }
        Node statement = s.getStatement();

        statement.accept(this, printWriter);
        return 0;
    }

    @Override
    public Integer visit(CanvasStatement c, PrintWriter printWriter) {
        String out = String.format("canvas = Image.new(\"RGB\", ( %d * block_size, %d * block_size), (255, 255, 255))", c.getWidth(), c.getHeight());
        AddIndent(this.IndentLevel, printWriter);
        printWriter.println(out);
        return 0;
    }

    @Override
    public Integer visit(SimpleAssignmentStatement s, PrintWriter printWriter) {
        AddIndent(this.IndentLevel, printWriter);

        s.getName().accept(this, printWriter);
        printWriter.write(" = ");
        s.getValue().accept(this, printWriter);
        printWriter.println();

        return 0;
    }

    @Override
    public Integer visit(ShapeAssignmentStatement s, PrintWriter printWriter) {
        AddIndent(this.IndentLevel, printWriter);

        s.getName().accept(this, printWriter);
        printWriter.write(" = [");
        for (ShapeRow r: s.getRows()) {
            r.accept(this, printWriter); // remember to make row strings
            printWriter.write(", "); // its actually ok to have an extra , at the end of the this in python
        }
        printWriter.write("]");
        printWriter.println();

        return 0;
    }

    @Override
    public Integer visit(CallStatement c, PrintWriter printWriter) {
        AddIndent(this.IndentLevel, printWriter);

        c.getName().accept(this, printWriter); // no space after variable
        printWriter.write("(");
        c.getArgs().accept(this, printWriter);
        printWriter.write(")");
        printWriter.println();

        return 0;
    }

    @Override
    public Integer visit(DefineStatement d, PrintWriter printWriter) {
        // I think define cannot be within any other statements so im not checking indent here

        printWriter.write("def ");
        d.getName().accept(this, printWriter);
        printWriter.write("(");
        d.getArgs().accept(this, printWriter);
        printWriter.write("):");
        printWriter.println();

        this.IndentLevel = this.IndentLevel + 1;

        for (InFunctionStatement statement: d.getStatements()) {
            statement.accept(this, printWriter);
        }

        this.IndentLevel = this.IndentLevel - 1;

        return 0;
    }

    @Override
    public Integer visit(InFunctionStatement s, PrintWriter printWriter) {
        Node statement = s.getStatement();

        statement.accept(this, printWriter);

        return 0;
    }

    @Override
    public Integer visit(BlockStatement b, PrintWriter printWriter) {
        AddIndent(this.IndentLevel, printWriter);

        // prewritten function name: _block

        printWriter.write("_block([");
        b.getName().accept(this, printWriter);
        printWriter.write("], ");

        if (b.getStart() != null) {
            b.getStart().accept(this, printWriter);
        }

        if (b.getShape() != null) {
            b.getShape().accept(this, printWriter);
        }

        printWriter.write("canvas=canvas)");
        printWriter.println();

        return 0;
    }

    @Override
    public Integer visit(BlockStartStatement b, PrintWriter printWriter) {
        printWriter.write("x=");
        b.getX().accept(this, printWriter);
        printWriter.write(", y=");
        b.getY().accept(this, printWriter);
        printWriter.write(",");
        return 0;
    }

    @Override
    public Integer visit(BlockShapeStatement b, PrintWriter printWriter) {
        if (b.getVar() != null) {
            printWriter.write("shape=");
            b.getVar().accept(this, printWriter);
            printWriter.write(",");
        } else {
            // assert rows is not null
            printWriter.write("shape=[");
            for (ShapeRow r: b.getRows()) {
                r.accept(this, printWriter);
                printWriter.write(", ");
            }
            printWriter.write("],");
        }

        return 0;
    }

    @Override
    public Integer visit(LoopStatement l, PrintWriter printWriter) {
        AddIndent(this.IndentLevel, printWriter);

        printWriter.write("for ");
        l.getVar().accept(this, printWriter);
        printWriter.write(" in range(");
        l.getStart().accept(this, printWriter);
        printWriter.write(", ");
        l.getEnd().accept(this, printWriter);
        printWriter.write("+1):");
        printWriter.println();

        this.IndentLevel = this.IndentLevel + 1;

        for (InLoopStatement statement: l.getStatements()) {
            statement.accept(this, printWriter);
        }

        this.IndentLevel = this.IndentLevel - 1;

        return 0;
    }

    @Override
    public Integer visit(InLoopStatement s, PrintWriter printWriter) {
        Node statement = s.getStatement();

        statement.accept(this, printWriter);

        return 0;
    }

    @Override
    public Integer visit(IfStatement i, PrintWriter printWriter) {
        AddIndent(this.IndentLevel, printWriter);

        printWriter.write("if ");
        if (i.getCond() != null) {
            i.getCond().accept(this, printWriter);
        } else if (i.getLinkedCond() != null) {
            i.getLinkedCond().accept(this, printWriter);
        } else {
            // TODO handle this? Dont this its possible
        }
        printWriter.write(":");
        printWriter.println();

        this.IndentLevel = this.IndentLevel + 1;

        for (InIfStatement statement: i.getStatements()) {
            statement.accept(this, printWriter);
        }

        this.IndentLevel = this.IndentLevel - 1;

        if (i.getElse() != null) {
            i.getElse().accept(this, printWriter);
        }

        return 0;
    }

    @Override
    public Integer visit(ElseStatement e, PrintWriter printWriter) {
        AddIndent(this.IndentLevel, printWriter);

        printWriter.write("else: ");
        printWriter.println();

        this.IndentLevel = this.IndentLevel + 1;

        for (InIfStatement statement: e.getStatements()) {
            statement.accept(this, printWriter);
        }

        this.IndentLevel = this.IndentLevel - 1;

        return 0;
    }

    @Override
    public Integer visit(InIfStatement s, PrintWriter printWriter) {
        Node statement = s.getStatement();

        statement.accept(this, printWriter);

        return 0;
    }


    @Override
    public Integer visit(LinkedCondition c, PrintWriter printWriter) {
        List<Condition> conditions = c.getConditions();
        List<LogicOperator> operators = c.getOperators();

        conditions.get(0).accept(this, printWriter);
        for (int i = 0; i < operators.size(); i++) {
            operators.get(i).accept(this, printWriter);
            conditions.get(i+1).accept(this, printWriter);
        }

        return 0;
    }

    @Override
    public Integer visit(Condition c, PrintWriter printWriter) {
        if (c.isNegated()) {
            printWriter.write("not ");
        }
        c.getExpressions().get(0).accept(this,printWriter);
        c.getComp().accept(this, printWriter);
        c.getExpressions().get(1).accept(this,printWriter);
        return 0;
    }

    @Override
    public Integer visit(Expression e, PrintWriter printWriter) {
        // gets the first value first
        List<Value> values = e.getValues();
        List<Operator> operators = e.getOperators();

        values.get(0).accept(this, printWriter);
        for (int i = 0; i < operators.size(); i++) {
            operators.get(i).accept(this, printWriter);
            values.get(i+1).accept(this, printWriter);
        }

        return 0;
    }

    @Override
    public Integer visit(Args a, PrintWriter printWriter) {
        for (int i = 0; i < a.getArguments().size(); i++) {
            if (i > 0) {
                printWriter.write(", ");
            }
            a.getArguments().get(i).accept(this, printWriter);
        }
        return 0;
    }

    @Override
    public Integer visit(ShapeRow s, PrintWriter printWriter) {
        printWriter.write("\"" + s.getShaperow() + "\"");
        return 0;
    }

    @Override
    public Integer visit(Variable v, PrintWriter printWriter) {
        printWriter.write(v.getVarStr());
        return 0;
    }

    @Override
    public Integer visit(Value v, PrintWriter printWriter) {
        printWriter.write(v.getValueStr()); // TODO: check for (int/str)
        return 0;
    }

    @Override
    public Integer visit(Comparator c, PrintWriter printWriter) {
        printWriter.write(c.getComp());
        return 0;
    }

    @Override
    public Integer visit(Operator o, PrintWriter printWriter) {
        printWriter.write(o.getOp());
        return 0;
    }

    @Override
    public Integer visit(LogicOperator o, PrintWriter printWriter) {
        String op = o.getOp();
        String pythonop;

        switch (op) {
            case ("&&"):
                pythonop = " and ";
                break;
            case ("||"):
                pythonop = " or ";
                break;
            default:
                pythonop = " "; // TODO Handle this
        }

        printWriter.write(pythonop);

        return 0;
    }
}
