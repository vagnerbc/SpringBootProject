package com.local.crudprod.service;

import com.local.crudprod.model.Product;
import com.local.crudprod.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product add(Product product) {
        return productRepository.save(product);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Optional<Product> findById(long id) {
        return productRepository.findById(id);
    }

    public void remove(long id) {
        productRepository.deleteById(id);
    }

    public Product update(Product product, long id) {
        Optional<Product> productSaved = productRepository.findById(id);

        if (productSaved.isPresent()) {
            return productRepository.save(product);
        } else {
            throw new NoResultException();
        }

    }
}
