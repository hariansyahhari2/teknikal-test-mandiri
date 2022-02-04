package com.hariansyah.teknikalpos.repositories;

import com.hariansyah.teknikalpos.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
