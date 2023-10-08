package org.example.dto;

import lombok.Data;

import java.util.List;
@Data
public class Client extends Person{

    private  String code;
    private String adresse;

    private List<Account> accountList;
}
