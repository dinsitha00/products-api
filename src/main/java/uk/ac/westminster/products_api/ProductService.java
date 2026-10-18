package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Optional;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();
    private long nextId = 1L;

    public List<Product> getAllProducts(){
        return products;
    }

    public Product addProduct(Product product){
        product.setId(nextId++);
        products.add(product);
        return product;

    }

    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    public List<Product> findByName(String name) {
        return products.stream()
                .filter(p -> p.getName().contains(name))
                .toList();
    }


    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }


}

