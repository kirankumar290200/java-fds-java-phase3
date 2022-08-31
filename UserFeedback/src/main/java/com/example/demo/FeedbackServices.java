package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Feedback;
import com.example.demo.repositories.*;

@Service
public class FeedbackServices {
	
	@Autowired
	private FeedbackRepository feedbackRepository;
	
	public Iterable<Feedback> GetAllFeedback() {
		return feedbackRepository.findAll();
	}
	

}
