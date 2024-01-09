package com.cem.repository;

import com.cem.entity.Doktor;

public class DoktorRepository extends RepositoryManager<Doktor, Long> {

    public DoktorRepository() {
        super(new Doktor());
    }
}
