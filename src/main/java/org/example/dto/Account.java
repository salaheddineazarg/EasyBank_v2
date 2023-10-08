package org.example.dto;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
@Data
public abstract class  Account {
    protected String nrAccount;
    protected double solde;
    protected LocalDate deteCreation;

    protected  Employe employe;
    protected Client client;

}
