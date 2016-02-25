package io.pivotal.boot.demo.services;

import io.pivotal.boot.demo.domain.Product;


public interface ProductService {
    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);
}