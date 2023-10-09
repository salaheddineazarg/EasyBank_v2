package org.example.interfaces;


import org.example.dto.AffectationM;

import java.util.Map;
import java.util.Optional;

public interface iAffectationM {

    Optional<AffectationM> AddAffictation(AffectationM affictation);
    int DeleteAffictation(int id);

    Map<String,Object> HistoricAffictation();
    AffectationM StatisticAffictation();

    Optional<AffectationM> FindOne(String code);
}
