package com.example221.hospital.repositories;


import com.example221.hospital.models.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedecinRepositories extends JpaRepository<Medecin, Long> {
}
