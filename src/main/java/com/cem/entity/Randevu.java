package com.cem.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="tbl_randevu")
public class Randevu {
    @Transient
    public static List<Randevu> instances = new ArrayList<>();
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.DATE)
    LocalDate randevuTarihi;
    @ManyToOne
    private Doktor doktor;
    @ManyToOne
    private Hasta hasta;


    {
            instances.add(this);
    }


    public static void setInstances(List<Randevu> instances) {
        Randevu.instances = instances;
    }

}
