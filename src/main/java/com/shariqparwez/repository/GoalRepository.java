package com.shariqparwez.repository;

import java.util.List;

import com.shariqparwez.model.Goal;

public interface GoalRepository {
	
	Goal save(Goal goal);

	List<Goal> loadAll();

}
