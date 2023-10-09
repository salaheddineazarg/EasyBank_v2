package org.example.interfaces;

import dto.Client;

import java.util.Map;
import java.util.Optional;

public interface iClient extends iPerson<Client> {

    Optional<Client> SearchByCode(String code);
    Map<String, Object> GetAll();
    Map<String,Object> Search(String attributeName,String value);
}
