package com.example221.hospital.models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
//@Table(name = "service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 50)
    private String libelle;
   /* @OneToMany(mappedBy = "service")
    List<Medecin> medecins ;*/
    @OneToMany(mappedBy = "service")
   List<Specialite> specialites;

}
