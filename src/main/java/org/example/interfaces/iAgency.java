package org.example.interfaces;

import org.example.dto.Agency;

import java.util.Map;
import java.util.Optional;

public interface iAgency {
    Optional<Agency> Add(Agency agency);
    int Delete(String code);
    Optional<Agency> Update(Agency agency);
    Optional<Agency> SearchByCode(String code);

    Optional<Agency> SearchByAdresse(String adresse);

    Map<String,Object> ShowContact();
}
