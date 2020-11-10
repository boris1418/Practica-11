package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        ExpressionNode expr =
                new Add(
                    new Subtract(
                    new Multiply(
                        new Variable("x"),
                        new Variable("x")
                    ),
                    new Multiply(
                        new Const(2),
                        new Variable("x")
                    )),
                    new Const(1)
                );
        System.out.println(expr.evaluate(x));
    }
}
