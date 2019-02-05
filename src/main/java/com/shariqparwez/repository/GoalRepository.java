package com.shariqparwez.repository;

import java.util.List;

import com.shariqparwez.model.Goal;
import com.shariqparwez.model.GoalReport;

public interface GoalRepository {
	
	Goal save(Goal goal);

	List<Goal> loadAll();

	List<GoalReport> findAllGoalReports();

}
