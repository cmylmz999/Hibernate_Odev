package com.cem.repository;

import com.cem.entity.Randevu;

public class RandevuRepository extends RepositoryManager<Randevu, Long> {

    public RandevuRepository() {
        super(new Randevu());
    }
}
