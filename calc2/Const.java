package com.company;

public class Const extends TripleExpression {

    private final int x;

    public Const(int x) {
        super(null, null);
        this.x = x;
    }

    @Override
    public int evaluate(int x, int y, int z) throws DivisionZeroException {
        return this.x;
    }
}
