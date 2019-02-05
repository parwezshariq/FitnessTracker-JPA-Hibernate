package com.shariqparwez.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shariqparwez.model.Exercise;

@Repository("exerciseRepository")
public interface ExerciseRepository extends JpaRepository<Exercise, Long> {

}
