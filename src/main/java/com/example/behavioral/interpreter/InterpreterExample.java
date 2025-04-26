package com.example.behavioral.interpreter;

import com.example.behavioral.interpreter.builder.ExpressionBuilder;
import com.example.behavioral.interpreter.expression.PermissionExpression;

public class InterpreterExample {
    public static void main(String[] args) {
        Report report = new Report("Cashflow report", "FINANCE_ADMIN OR ADMIN");
        ExpressionBuilder builder = new ExpressionBuilder();

        PermissionExpression exp = builder.build(report);
        System.out.println(exp);

        User user = new User("Dave", "USER");
        
        System.out.println("User access to report: " + exp.interpret(user));
    }
}
