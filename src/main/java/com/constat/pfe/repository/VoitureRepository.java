package com.constat.pfe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.constat.pfe.entities.Voiture;





@Repository
public interface VoitureRepository extends JpaRepository<Voiture, Long> {

}
