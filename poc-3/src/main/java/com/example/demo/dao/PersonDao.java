package com.example.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Person;



public interface PersonDao extends MongoRepository<Person, Integer> {

}
