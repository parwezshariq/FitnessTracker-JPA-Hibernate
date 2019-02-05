package com.shariqparwez.service;

import java.util.List;

import com.shariqparwez.model.Goal;
import com.shariqparwez.model.GoalReport;

public interface GoalService {

	Goal save(Goal goal);

	List<Goal> findAllGoals();

	List<GoalReport> findAllGoalReports();
	
}
