package com.constat.pfe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.constat.pfe.entities.Indemnisation;




@Repository
public interface IndemnisationRepository extends JpaRepository<Indemnisation, Long> {

}
