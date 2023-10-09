package org.example.dto;

import jdk.jfr.DataAmount;
import lombok.Data;

import java.time.LocalDate;
@Data
public abstract class Operation {
    protected   int nbOperation;
    protected LocalDate date;
    protected double price;
    protected Employe Employe;
}
