package com.example.behavioral.interpreter.expression;

import com.example.behavioral.interpreter.User;

// Non-terminal expression
public class AndExpression implements PermissionExpression {

    private PermissionExpression expr1;
    private PermissionExpression expr2;

    public AndExpression(PermissionExpression expr1, PermissionExpression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(User user) {
        return expr1.interpret(user) && expr2.interpret(user);
    }

    @Override
    public String toString() {
        return expr1 + "AND" + expr2;
    }
    
}
