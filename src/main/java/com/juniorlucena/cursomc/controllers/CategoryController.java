package com.juniorlucena.cursomc.controllers;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juniorlucena.cursomc.models.Category;
import com.juniorlucena.cursomc.services.CategoryService;
import com.juniorlucena.cursomc.services.exceptions.ObjectNotFoundException;

@RestController
@RequestMapping(value="/categories")
public class CategoryController {
	
	@Autowired
	CategoryService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id) throws ObjectNotFoundException {
		Optional<Category> obj = this.service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	@GetMapping
	public ResponseEntity<?> getAll() {
		return ResponseEntity.ok().body(service.getAll());
	}
}
