package com.example.mascota.repositories;

import com.example.mascota.entities.Mascot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MascotRepository extends JpaRepository<Mascot, Long> {

}