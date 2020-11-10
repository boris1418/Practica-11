package com.company;

public class ExpressionParser {

    boolean isNumber(String s) {
        return (int)s.charAt(pos) >= 48 && (int)s.charAt(pos) <= 57;
    }

    TripleExpression operand(String s) throws UnclosedBracesException, UndefinedVariableException {

        if (s.charAt(pos) == 'x' || s.charAt(pos) == 'y' || s.charAt(pos) == 'z') {
            return new Variable(String.valueOf(s.charAt(pos++)));
        }

        if (s.charAt(pos) == '(') {
            ++pos;
            TripleExpression res = parse(s, false);
            if (s.charAt(pos) != ')') {
                throw new UnclosedBracesException("Uncloded braces at " + pos);
            }
            ++pos;
            return res;
        }

        if (!isNumber(s) && s.charAt(pos) != '#') {
            throw new UndefinedVariableException("Undefined variable " + s.charAt(pos) + " at " + pos + "(x, y, z available");
        }
        int num = 0;

        while(isNumber(s)) {

            num *= 10;
            num += (int)s.charAt(pos) - 48;
            ++pos;

        }
        return new Const(num);
    }
    TripleExpression term(String s) throws UnclosedBracesException, UndefinedVariableException {
        TripleExpression res = operand(s);
        while (s.charAt(pos) == '*' || s.charAt(pos) == '/') {
            if (s.charAt(pos) == '*') {
                ++pos;
                res = new Multiply(res, operand(s));
            } else {
                ++pos;
                res = new Divide(res, operand(s));
            }
        }
        return res;
    }

    private TripleExpression parse(String s, boolean f) throws UnclosedBracesException, UndefinedVariableException {
        TripleExpression res = term(s);
        while (s.charAt(pos) == '+' || s.charAt(pos) == '-') {
            if (s.charAt(pos) == '+') {
                ++pos;
                res = new Add(res, term(s));
            } else {
                ++pos;
                res = new Subtract(res, term(s));
            }
        }
        return res;
    }
    public TripleExpression parse(String s) throws UnclosedBracesException, UndefinedVariableException {
        pos = 0;
        s = s + "#";
        return parse(s, false);
    }

    private int pos;
}
