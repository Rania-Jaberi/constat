package com.constat.pfe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.constat.pfe.controller.UtilisateurController;
import com.constat.pfe.entities.Utilisateur;
import com.constat.pfe.repository.UtilisateurRepository;
import com.constat.pfe.service.UtilisateurImpl;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@ComponentScan(basePackageClasses  = { UtilisateurImpl.class })
@ComponentScan(basePackageClasses  = { UtilisateurController.class })
@EnableSwagger2


public class ConstatApplication implements CommandLineRunner {

	@Autowired
	UtilisateurRepository utilisateurRepository ;
	public static void main(String[] args) {
		SpringApplication.run(ConstatApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		List<Utilisateur> list = utilisateurRepository.findAll() ; 
		System.out.println(list);
		// TODO Auto-generated method stub
		
	}

}
