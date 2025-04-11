package com.example.creational.builder.user.dto.impl;

import com.example.creational.builder.user.dto.UserDTO;

public class UserDTOImpl implements UserDTO {

    private String name;
    private String address;
    private String age;

    public UserDTOImpl(String name, String address, String age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "UserDTOImpl [name=" + name + ", address=" + address + ", age=" + age + "]";
    }

}
