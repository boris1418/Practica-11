package com.company;

public class Add extends ExpressionNode {

    public Add(ExpressionNode left, ExpressionNode right) {
        super(left, right);
    }

    @Override
    public int evaluate(int x) {
        return left.evaluate(x) + right.evaluate(x);
    }

}
