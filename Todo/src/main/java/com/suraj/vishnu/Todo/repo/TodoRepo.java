package com.suraj.vishnu.Todo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suraj.vishnu.Todo.pojo.Todo;

public interface TodoRepo  extends JpaRepository<Todo, Integer>{
	
	

}
