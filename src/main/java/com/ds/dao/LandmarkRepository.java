package com.ds.dao;

import com.ds.entity.Landmark;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LandmarkRepository extends MongoRepository<Landmark, String> {
}
