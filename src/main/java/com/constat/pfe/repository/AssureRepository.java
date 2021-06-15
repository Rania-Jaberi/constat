package com.constat.pfe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.constat.pfe.entities.Assure;




@Repository
public interface AssureRepository extends JpaRepository<Assure, Long> {

}
