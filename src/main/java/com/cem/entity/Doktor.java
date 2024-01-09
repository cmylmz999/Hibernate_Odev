package com.cem.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="tbl_doktor")
public class Doktor {

    @Transient
    public static List<Doktor> instances = new ArrayList<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String doktorAdi;

    @ManyToOne
    private Brans brans;


    @OneToMany(mappedBy = "doktor", cascade = CascadeType.ALL)
    private List<Randevu> randevuList = new ArrayList<>();

    {
            instances.add(this);
    }



    public static void setInstances(List<Doktor> instances) {
        Doktor.instances = instances;
    }


}
