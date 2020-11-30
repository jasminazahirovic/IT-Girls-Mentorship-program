package com.example.demo.domain;

import java.util.Objects;

public class UserCreation {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String birthDay;
    private String maritalStatus;

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserCreation that = (UserCreation) o;
        return Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(email, that.email) &&
                Objects.equals(password, that.password) &&
                Objects.equals(birthDay, that.birthDay) &&
                Objects.equals(maritalStatus, that.maritalStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash( firstName, lastName, email, password, birthDay, maritalStatus);
    }

    @Override
    public String toString() {
        return "UserCreation{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", birthDay='" + birthDay + '\'' +
                "maritalStatus='" + maritalStatus + '\'' +
                '}';
    }

}
