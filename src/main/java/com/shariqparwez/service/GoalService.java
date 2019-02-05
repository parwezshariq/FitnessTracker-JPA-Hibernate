package com.shariqparwez.service;

import java.util.List;

import com.shariqparwez.model.Goal;

public interface GoalService {

	Goal save(Goal goal);

	List<Goal> findAllGoals();
	
}
