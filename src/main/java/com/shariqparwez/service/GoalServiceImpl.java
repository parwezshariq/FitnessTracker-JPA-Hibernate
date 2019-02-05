package com.shariqparwez.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shariqparwez.model.Goal;
import com.shariqparwez.repository.GoalRepository;

@Service("goalService")
public class GoalServiceImpl implements GoalService {

	@Autowired
	private GoalRepository goalRepository;
	
	public Goal save(Goal goal) {
		return goalRepository.save(goal);
	}

}
