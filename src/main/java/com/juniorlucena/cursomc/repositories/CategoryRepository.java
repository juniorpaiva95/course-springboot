package com.juniorlucena.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.juniorlucena.cursomc.models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
