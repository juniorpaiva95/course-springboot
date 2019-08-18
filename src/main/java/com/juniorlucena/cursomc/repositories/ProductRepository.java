package com.juniorlucena.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.juniorlucena.cursomc.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
