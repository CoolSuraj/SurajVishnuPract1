package com.suraj.vishnu.Todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.suraj.vishnu.Todo.pojo.Todo;
import com.suraj.vishnu.Todo.repo.TodoRepo;

@RestController("/")
public class TodoController {
	
	@Autowired //DI -IOC 
	private TodoRepo repo;
	
	@PostMapping("/add-todo")
	public ResponseEntity<Todo> createTodo(@RequestBody Todo todo) {
		return new ResponseEntity<Todo>(repo.save(todo),HttpStatus.CREATED);


	}

}
