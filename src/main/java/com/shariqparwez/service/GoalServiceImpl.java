package com.shariqparwez.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shariqparwez.model.Goal;
import com.shariqparwez.repository.GoalRepository;

@Service("goalService")
public class GoalServiceImpl implements GoalService {

	@Autowired
	private GoalRepository goalRepository;
	
	@Transactional
	public Goal save(Goal goal) {
		return goalRepository.save(goal);
	}

	@Override
	public List<Goal> findAllGoals() {
		return goalRepository.loadAll();
	}

}
