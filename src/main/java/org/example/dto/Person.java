package org.example.dto;

import lombok.Data;

import java.time.LocalDate;
@Data
public abstract class Person {
    protected  String firstName;
    protected  String lastName;
    protected LocalDate dateBirth;
    protected String nbPhone;
}
