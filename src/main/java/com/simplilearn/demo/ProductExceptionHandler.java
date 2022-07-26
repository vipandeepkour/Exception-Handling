package com.simplilearn.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice// handles application level exception
public class ProductExceptionHandler {
	
@ExceptionHandler(value=ProductNotFoundException.class) //handles exception at method within the same controller.this handler handles the exception whenever any class(here refer to ProductNotFound class)throws exception
		public ResponseEntity<Object> handleException(ProductNotFoundException e){
		 return new ResponseEntity<Object>("Not Found"+e.getMessage(),HttpStatus.NOT_FOUND);	//return new ResponseEntity<Object>("Not Found",HttpStatus.NOT_FOUND);
		}
	}
 
