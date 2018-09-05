package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.model.Question;

public interface QuestionRepository extends MongoRepository <Question, String> {
}
