package com.constat.pfe.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.constat.pfe.entities.Utilisateur;
@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {
	Optional<Utilisateur>	findBymotDepaasse(String motDePasse) ;
	Optional<Utilisateur>	findBynomUtilisateur(String nomUtilisateur) ;


}
