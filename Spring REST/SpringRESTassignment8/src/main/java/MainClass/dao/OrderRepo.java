package MainClass.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import MainClass.model.Order;

@Repository
public interface OrderRepo extends MongoRepository<Order, Integer> {

}