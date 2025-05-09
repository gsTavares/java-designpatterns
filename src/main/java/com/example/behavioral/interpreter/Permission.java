package com.example.behavioral.interpreter;

import com.example.behavioral.interpreter.expression.PermissionExpression;

// Terminal expression
public class Permission implements PermissionExpression {

    private String permission;

    public Permission(String permission) {
        this.permission = permission.toLowerCase();
    }

    @Override
    public boolean interpret(User user) {
        return user.getPermissions().contains(permission);
    }

    @Override
    public String toString() {
        return permission;
    }

    
}
