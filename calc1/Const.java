package com.company;

public class Const extends ExpressionNode {

    private final int x;

    public Const(int x) {
        super(null, null);
        this.x = x;
    }

    @Override
    public int evaluate(int x) {
        return this.x;
    }
}
