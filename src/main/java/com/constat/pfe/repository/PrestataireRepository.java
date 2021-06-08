package com.constat.pfe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.constat.pfe.entities.Prestataire;





@Repository
public interface PrestataireRepository extends JpaRepository<Prestataire, Long> {

}
