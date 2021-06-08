package com.constat.pfe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.constat.pfe.entities.Demande;
@Repository
public interface DemandeRepository extends JpaRepository<Demande, Long> {
	
	

}
