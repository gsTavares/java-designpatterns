package com.example.creational.builder2;

import java.time.LocalDate;

import com.example.creational.builder.user.model.Address;
import com.example.creational.builder.user.model.User;
import com.example.creational.builder2.dto.UserDTO;

public class Builder2Example {
    public static void main(String[] args) {
        User user = createUser();

        UserDTO dto = UserDTO.getUserDTOBuilder().withFirstName(user.getFirstName())
            .withLastName(user.getLastName())
            .withBirthday(user.getBirthday())
            .withAddress(user.getAddress())
            .build();

        System.out.println(dto);
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