package com.andrea.WebApp.Service;

import com.andrea.WebApp.Entity.Product;
import com.andrea.WebApp.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    public List<Product> getAllProducts(){
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(null);
    }

    public void addProduct(List<Product> product) {
        repo.saveAll(product);
    }

    public void updateProduct(Product product){
        repo.save(product);
    }

    public void deleteProduct(int prodId){
        System.out.println(prodId);
        repo.deleteById(prodId);
    }

}
