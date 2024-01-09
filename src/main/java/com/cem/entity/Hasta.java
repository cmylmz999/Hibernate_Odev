package com.cem.entity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tbl_hasta")
public class Hasta {
    @Transient
    public static List<Hasta> instances = new ArrayList<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String hastaAdi;

    String hastaSoyadi;

    @OneToMany(mappedBy = "hasta", cascade = CascadeType.ALL)
    List<Randevu> randevuList = new ArrayList<>();


    {
            instances.add(this);
    }


    public static void setInstances(List<Hasta> instances) {
        Hasta.instances = instances;
    }

}
