package com.suraj.vishnu.Todo.ExceptionHandler;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorMessage {
	
	private int ErrorCode;
	private Date date;
	private String message;
	private String description;
	

}
