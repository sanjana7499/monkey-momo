package com.project.omkar.repository;

import com.project.omkar.entity.CustomerData;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerData, ObjectId>
{

}
