package com.company;

public class Add extends TripleExpression {

    public Add(TripleExpression left, TripleExpression right) {
        super(left, right);
    }

    @Override
    public int evaluate(int x, int y, int z) throws DivisionZeroException {
        return Math.addExact(left.evaluate(x, y, z), right.evaluate(x, y, z));
    }

}
