package com.constat.pfe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.constat.pfe.entities.ChefAssurance;





@Repository
public interface ChefAssuranceRepository extends JpaRepository<ChefAssurance, Long> {

}
