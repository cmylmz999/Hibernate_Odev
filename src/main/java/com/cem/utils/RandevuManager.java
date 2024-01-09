package com.cem.utils;

import com.cem.entity.Doktor;
import com.cem.entity.Hasta;
import com.cem.entity.Randevu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandevuManager {

    public static void RandevuYarat() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {

            Randevu randevu = Randevu.builder()
                    .randevuTarihi(LocalDate.now().plusDays(random.nextInt(0,30)))
                    .doktor(Doktor.instances.get(random.nextInt(0, Doktor.instances.size())))
                    .hasta(Hasta.instances.get(random.nextInt(0, Hasta.instances.size())))
                    .build();
        }

    }

}
