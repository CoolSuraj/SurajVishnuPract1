package com.suraj.vishnu.Todo.ExceptionHandler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException.BadRequest;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class CustomExceptionHandler {
	
	
	 @ExceptionHandler(BadRequest.class)
	    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
	    public ErrorMessage resourceNotFoundException(BadRequest ex, WebRequest request) {
	        ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND.value(), new Date(), ex.getMessage(), request.getDescription(false));
	        return message;
	    }

	    @ExceptionHandler(Exception.class)
	    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	    public ErrorMessage globalExceptionHandler(Exception ex, WebRequest request) {
	        ErrorMessage message = new ErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR.value(), new Date(), ex.getMessage(), request.getDescription(false));
	        return message;
	    }

}
