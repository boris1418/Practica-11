package com.company;

public class Subtract extends TripleExpression{

    public Subtract(TripleExpression left, TripleExpression right) {
        super(left, right);
    }

    @Override
    public int evaluate(int x, int y, int z) throws DivisionZeroException {
        return Math.subtractExact(left.evaluate(x, y, z), right.evaluate(x, y, z));
    }

}
