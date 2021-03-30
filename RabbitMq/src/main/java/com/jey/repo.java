package com.teja;

import org.springframework.data.mongodb.repository.MongoRepository;



public interface repo extends MongoRepository<customer, String> {

}
