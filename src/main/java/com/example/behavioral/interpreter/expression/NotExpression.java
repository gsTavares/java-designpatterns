package com.example.behavioral.interpreter.expression;

import com.example.behavioral.interpreter.User;

// Non terminal expression
public class NotExpression implements PermissionExpression {

    private PermissionExpression expr;

    public NotExpression(PermissionExpression expr) {
        this.expr = expr;
    }

    @Override
    public boolean interpret(User user) {
        return !expr.interpret(user);
    }

    @Override
    public String toString() {
        return "NOT " + expr;
    }
    
}
