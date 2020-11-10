package com.company;

public class Variable extends  TripleExpression {

    String name;

    public Variable(String name) {
        super(null, null);
        this.name = name;
    }

    @Override
    public int evaluate(int x, int y, int z) throws DivisionZeroException {
        switch (name) {
            case "x":
                return x;
            case "y":
                return y;
            case "z":
                return z;
        }
        return -1;
    }

}
