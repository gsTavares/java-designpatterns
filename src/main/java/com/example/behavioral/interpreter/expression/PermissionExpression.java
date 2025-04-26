package com.example.behavioral.interpreter.expression;

import com.example.behavioral.interpreter.User;

public interface PermissionExpression {
    
    boolean interpret(User user);

}
