package com.suraj.vishnu.Todo.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Todo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String userName;
	private String title;
	private String description;
	
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date startDate;
	@JsonFormat(pattern="dd-MM-yyyy")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date endDate;
	private boolean done;
	

}
