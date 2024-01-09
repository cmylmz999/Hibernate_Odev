package com.cem.entity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldNameConstants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="tbl_brans")
public class Brans {

    @Transient
    public static List<Brans> instances = new ArrayList<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String bransAdi;

    @OneToMany(mappedBy = "brans", cascade = CascadeType.ALL)
    private List<Doktor> doktorList = new ArrayList<>();

    {
            instances.add(this);
    }



    public static void setInstances(List<Brans> instances) {
        Brans.instances = instances;
    }

}
