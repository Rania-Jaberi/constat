package com.constat.pfe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.constat.pfe.entities.Compte;







@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {

}
