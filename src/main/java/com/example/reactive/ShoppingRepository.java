package com.example.reactive;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingRepository extends ReactiveMongoRepository<Shopping, String> {
}
