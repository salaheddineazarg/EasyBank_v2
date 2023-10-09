package org.example.dto;

import lombok.Data;

import java.time.LocalDate;
@Data
public class Simulation {
    private double Balance;
    private LocalDate During;
    private double MounthlyPayment;
}
