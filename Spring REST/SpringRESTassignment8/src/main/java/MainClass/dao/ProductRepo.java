package MainClass.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import MainClass.model.Product;

@Repository
public interface ProductRepo extends MongoRepository<Product, Integer> {
    public Product findById(int id);

    public Product findByName(String name);
}
