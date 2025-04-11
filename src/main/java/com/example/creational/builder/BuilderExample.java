package com.example.creational.builder;

import java.time.LocalDate;

import com.example.creational.builder.user.dto.UserDTO;
import com.example.creational.builder.user.dto.builder.UserDTOBuilder;
import com.example.creational.builder.user.dto.builder.impl.UserDTOBuilderImpl;
import com.example.creational.builder.user.model.Address;
import com.example.creational.builder.user.model.User;

public class BuilderExample {
    public static void main(String[] args) {
        User user = createUser();
        UserDTOBuilder builder = new UserDTOBuilderImpl();
        UserDTO dto = directBuild(builder, user);
        System.out.println(dto);
    }

    // Director
    private static UserDTO directBuild(UserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName())
            .withLastName(user.getLastName())
            .withBirthday(user.getBirthday())
            .withAddress(user.getAddress())
            .build();
    }

    public static User createUser() {
        User user = new User();
        user.setBirthday(LocalDate.of(1960, 5, 6));
        user.setFirstName("John");
        user.setLastName("Doe");
        
        Address address = new Address();
        address.setCity("City 1");
        address.setHouseNumber("123");
        address.setState("State 2");
        address.setStreet("Street 22");
        address.setZipcode("156000");

        user.setAddress(address);

        return user;
    }
}
