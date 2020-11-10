package com.company;

public class Subtract extends ExpressionNode{

    public Subtract(ExpressionNode left, ExpressionNode right) {
        super(left, right);
    }

    @Override
    public int evaluate(int x) {
        return left.evaluate(x) - right.evaluate(x);
    }

}
