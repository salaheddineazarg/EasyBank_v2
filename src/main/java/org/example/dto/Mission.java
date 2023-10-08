package org.example.dto;

import lombok.Data;

import java.util.List;

@Data
public class Mission {
    private String code;
    private String name;
    private String description;
    private List<Affectation> affectationList ;
}
