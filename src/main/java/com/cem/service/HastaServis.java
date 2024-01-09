package com.cem.service;

import com.cem.entity.Hasta;
import com.cem.entity.Randevu;
import com.cem.repository.BransRepository;
import com.cem.repository.DoktorRepository;
import com.cem.repository.HastaRepository;
import com.cem.repository.RandevuRepository;
import com.cem.utils.DemoImpl;
import jakarta.persistence.NoResultException;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.util.List;
import java.util.Optional;

import static com.cem.utils.DemoImpl.hastaRepository;
import static com.cem.utils.DemoImpl.randevuRepository;



public class HastaServis {

    int i = 0;

    public void hastaBilgisi(String hastaAdi) {
        List<Hasta> hastalar = hastaRepository.findByName(hastaAdi);
            hastalar.forEach(hasta ->{

            hasta.getRandevuList().forEach(randevu -> {
                if(i==0){
                    System.out.print("******HASTA ADI*******\t\t");
                }
                if (i == 0) {
                    System.out.println("******RANDEVU TARIHI*******");
                    ++i;
                }
                System.out.print("\t     "+randevu.getHasta().getHastaAdi()+"\t");
                System.out.print(randevu.getHasta().getHastaSoyadi()+"\t\t");
                System.out.print(randevu.getRandevuTarihi()+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                System.out.println();

        });
                System.out.print("\n");
    });
    }


}
