package com.example.creational.builder.user.dto.builder.impl;

import java.time.LocalDate;
import java.time.Period;

import com.example.creational.builder.user.dto.UserDTO;
import com.example.creational.builder.user.dto.builder.UserDTOBuilder;
import com.example.creational.builder.user.dto.impl.UserDTOImpl;
import com.example.creational.builder.user.model.Address;

public class UserDTOBuilderImpl implements UserDTOBuilder {

    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserDTO dto;

    @Override
    public UserDTOBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate birthday) {
        Period ageInYears = Period.between(birthday, LocalDate.now());
        this.age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber() + ", " + address.getStreet()
            + "\n" + address.getCity() + "\n" + address.getState() + " "
            + address.getZipcode();
        return this;
    }

    @Override
    public UserDTO build() {
        this.dto = new UserDTOImpl(firstName + " " + lastName, address, age);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
    
}
