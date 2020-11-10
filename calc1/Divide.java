package com.company;

public class Divide extends ExpressionNode {

    public Divide(ExpressionNode left, ExpressionNode right) {
        super(left, right);
    }

    @Override
    public int evaluate(int x) {
        return left.evaluate(x) / right.evaluate(x);
    }

}
