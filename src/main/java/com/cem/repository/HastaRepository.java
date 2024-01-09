package com.cem.repository;

import com.cem.entity.Hasta;
import com.cem.utils.RandevuManager;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.util.Optional;

public class HastaRepository extends RepositoryManager<Hasta, Long> {

    public HastaRepository() {
        super(new Hasta());
    }

}


