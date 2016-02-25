package io.pivotal.boot.demo.repositories;

import io.pivotal.boot.demo.domain.Product;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer>{
}