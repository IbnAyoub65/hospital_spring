package com.example221.hospital.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Specialite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 50)
    private String libelle;
    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service service;
    @ManyToMany(mappedBy = "specialites")//eager
    List<Medecin> medecins;

}
