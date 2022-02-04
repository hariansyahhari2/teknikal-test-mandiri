package com.hariansyah.teknikalpos.controller;

import com.hariansyah.teknikalpos.entities.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping
    public ResponseEntity<List<Product>> findAll () {
        return ResponseEntity.ok(null);
    }
}
