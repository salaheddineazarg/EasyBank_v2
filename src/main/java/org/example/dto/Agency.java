package org.example.dto;

import lombok.Data;

import java.util.List;


@Data
public class Agency {

    private String code;
    private  String name;
    private String adresse;
    private String phone;
    private List<Account> accounts;
    private List<Employe> employeList;
}
