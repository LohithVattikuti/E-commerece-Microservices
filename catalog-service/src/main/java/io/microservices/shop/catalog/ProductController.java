package io.microservices.shop.catalog;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductRepository repo;
    public ProductController(ProductRepository repo){ this.repo = repo; }

    @GetMapping public List<Product> all(){ return repo.findAll(); }
    @PostMapping public Product create(@RequestBody Product p){ return repo.save(p); }
    @GetMapping("/{id}") public Product one(@PathVariable Long id){ return repo.findById(id).orElseThrow(); }
    @PutMapping("/{id}") public Product update(@PathVariable Long id, @RequestBody Product p){
        p.setId(id); return repo.save(p);
    }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id){ repo.deleteById(id); }
}
