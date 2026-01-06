package com.biashara.pos.repository;

import com.biashara.pos.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // We now have built-in methods:
    // .save(product)
    // .findAll()
    // .findById(id)
    // .deleteById(id)
}
