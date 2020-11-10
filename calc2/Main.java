package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expr = sc.nextLine();

        try {
            TripleExpression triple = new ExpressionParser().parse(expr);
            for (int i = 0; i <= 10; ++i) {
                try {
                    System.out.println(triple.evaluate(i, i, i));
                } catch (DivisionZeroException e) {
                    System.out.println("division by zero");
                } catch (Exception e) {
                    System.out.println("overflow");
                }

            }
        } catch (UnclosedBracesException | UndefinedVariableException e) {
            e.printStackTrace();
        }


    }
}
