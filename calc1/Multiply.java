package com.company;

public class Multiply extends ExpressionNode {

    public Multiply(ExpressionNode left, ExpressionNode right) {
        super(left, right);
    }

    @Override
    public int evaluate(int x) {
        return left.evaluate(x) * right.evaluate(x);
    }

}
