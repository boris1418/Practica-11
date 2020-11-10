package com.company;

public class Multiply extends TripleExpression {

    public Multiply(TripleExpression left, TripleExpression right) {
        super(left, right);
    }

    @Override
    public int evaluate(int x, int y, int z) throws DivisionZeroException {
        return Math.multiplyExact(left.evaluate(x, y, z), right.evaluate(x, y, z));
    }

}
