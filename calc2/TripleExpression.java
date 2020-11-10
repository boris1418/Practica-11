package com.company;

public abstract class TripleExpression {

    protected TripleExpression left;
    protected TripleExpression right;

    public TripleExpression(TripleExpression left, TripleExpression right) {
        this.left = left;
        this.right = right;
    }

    public abstract int evaluate(int x, int y, int z) throws DivisionZeroException;

}
