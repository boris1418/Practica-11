package com.company;

public abstract class ExpressionNode {

    protected ExpressionNode left;
    protected ExpressionNode right;

    public ExpressionNode(ExpressionNode left, ExpressionNode right) {
        this.left = left;
        this.right = right;
    }

    public abstract int evaluate(int x);

}
