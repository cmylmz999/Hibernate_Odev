package com.cem.repository;

import com.cem.entity.Brans;

public class BransRepository extends RepositoryManager<Brans, Long> {

    public BransRepository() {
        super(new Brans());
    }
}
