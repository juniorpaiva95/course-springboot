package com.juniorlucena.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juniorlucena.cursomc.models.Category;
import com.juniorlucena.cursomc.repositories.CategoryRepository;
import com.juniorlucena.cursomc.services.exceptions.ObjectNotFoundException;


@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public Optional<Category> find(Integer id) throws ObjectNotFoundException {
		Optional<Category> obj = this.repository.findById(id);
		if(!obj.isPresent()) {
			throw new ObjectNotFoundException("Objeto não encontrado!");
		}
		return obj;
	}
	
	public List<Category> getAll() {
		return this.repository.findAll();
	}
}
