package com.LB.TaskTracker.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LB.TaskTracker.Model.Task;

public interface TaskRepository extends JpaRepository<Task, Integer>{

}
