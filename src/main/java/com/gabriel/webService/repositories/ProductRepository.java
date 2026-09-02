package com.gabriel.webService.repositories;

import com.gabriel.webService.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
