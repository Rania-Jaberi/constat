package com.constat.pfe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.constat.pfe.entities.TestConstat;

@Repository
public interface TestConstatReposotory extends JpaRepository<TestConstat, Long> {

}
