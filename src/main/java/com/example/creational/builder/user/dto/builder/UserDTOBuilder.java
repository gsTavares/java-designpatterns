package com.example.creational.builder.user.dto.builder;

import java.time.LocalDate;

import com.example.creational.builder.user.dto.UserDTO;
import com.example.creational.builder.user.model.Address;

/**
 * The first 3 methods builds "parts" of a UserDTO at time
 * 
 * build() method "assemble" a UserDTO to memory
 * 
 * getUserDTO() fetchs the already built object. This method is optional
 */

public interface UserDTOBuilder {
    
    UserDTOBuilder withFirstName(String firstName);

    UserDTOBuilder withLastName(String lastName);

    UserDTOBuilder withBirthday(LocalDate birthday);

    UserDTOBuilder withAddress(Address address);

    UserDTO build();

    UserDTO getUserDTO();

}
