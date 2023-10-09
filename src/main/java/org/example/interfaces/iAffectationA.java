package org.example.interfaces;

import org.example.dto.AffectationA;

import java.util.Optional;

public interface iAffectationA {

    Optional<AffectationA> Add(AffectationA affectationA);
    int Delete(AffectationA affectationA);
}
