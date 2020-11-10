package com.company;

public class Divide extends TripleExpression {

    public Divide(TripleExpression left, TripleExpression right) {
        super(left, right);
    }

    @Override
    public int evaluate(int x, int y, int z) throws DivisionZeroException {
        int tx = left.evaluate(x, y, z);
        int ty = right.evaluate(x, y, z);
        if (ty == 0) {
            throw new DivisionZeroException("Division by zero");
        }
        return tx / ty;
    }

}
