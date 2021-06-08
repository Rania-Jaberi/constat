package com.constat.pfe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.constat.pfe.entities.TestConstat;
import com.constat.pfe.repository.TestConstatReposotory;

@RestController
@RequestMapping("/test")
public class TestConstatController {
	@Autowired
	private TestConstatReposotory constatReposotory;

	@GetMapping("/constats")
	public List<TestConstat> getAllConstas() {
		return constatReposotory.findAll();
	}
}
