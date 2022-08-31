package com.example.UserFeedback.demo;

import org.springframework.data.repository.CrudRepository;

import com.example.UserFeedback.entities.*;

public interface FeedbackRepository extends CrudRepository<Feedback, Integer>{

}
