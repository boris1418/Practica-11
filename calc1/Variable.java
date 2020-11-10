package com.company;

public class Variable extends  ExpressionNode {

    String x;

    public Variable(String name) {
        super(null, null);

    }

    @Override
    public int evaluate(int x) {
        return x;
    }

}
