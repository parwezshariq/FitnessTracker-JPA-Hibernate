package com.shariqparwez.service;

import java.util.List;

import com.shariqparwez.model.Activity;
import com.shariqparwez.model.Exercise;

public interface ExerciseService {

	List<Activity> findAllActivities();

	Exercise save(Exercise exercise);

}