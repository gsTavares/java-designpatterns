package com.example.creational.builder2.dto;

import java.time.LocalDate;
import java.time.Period;

import com.example.creational.builder.user.model.Address;

public class UserDTO {

    private String name;
    private String address;
    private String age;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    private void setAge(String age) {
        this.age = age;
    }

    // Builder instance
    public static UserDTOBuilder getUserDTOBuilder() {
        return new UserDTOBuilder();
    }

    // Builder
    public static class UserDTOBuilder {

        private String firstName;
        private String lastName;
        private String age;
        private String address;
        private UserDTO dto;

        public UserDTOBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserDTOBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserDTOBuilder withBirthday(LocalDate birthday) {
            Period ageInYears = Period.between(birthday, LocalDate.now());
            this.age = Integer.toString(ageInYears.getYears());
            return this;
        }

        public UserDTOBuilder withAddress(Address address) {
            this.address = address.getHouseNumber() + ", " + address.getStreet()
                    + "\n" + address.getCity() + "\n" + address.getState() + " "
                    + address.getZipcode();
            return this;
        }

        public UserDTO build() {
            this.dto = new UserDTO();
            this.dto.setName(firstName + " " + lastName);
            this.dto.setAge(age);
            this.dto.setAddress(address);
            return dto;
        }

        public UserDTO getUserDTO() {
            return dto;
        }

    }

    @Override
    public String toString() {
        return "UserDTO [name=" + name + ", address=" + address + ", age=" + age + "]";
    }

}
