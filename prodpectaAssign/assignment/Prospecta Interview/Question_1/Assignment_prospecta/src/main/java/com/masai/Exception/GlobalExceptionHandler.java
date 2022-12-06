package com.masai.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.masai.Exception.MyErrorDetails;

@ControllerAdvice
public class GlobalExceptionHandler {
      
	@ExceptionHandler(ProductException.class)
    public ResponseEntity<MyErrorDetails> globalExceptionHandler(ProductException ve, WebRequest wr){
    	
    	        MyErrorDetails mrd= new MyErrorDetails();
    	        		
    	        mrd.setTimeStamp(LocalDateTime.now());
    	        mrd.setMessage(ve.getMessage());
    	        mrd.setDetails(wr.getDescription(false));
    	        
    	        return new ResponseEntity<MyErrorDetails>(mrd, HttpStatus.BAD_REQUEST);
    }
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> SendExceptionMessage(Exception e, WebRequest wr){
		
		    MyErrorDetails mrd= new MyErrorDetails();
		    
		    mrd.setTimeStamp(LocalDateTime.now());
		    mrd.setMessage(e.getMessage());
		    mrd.setDetails(wr.getDescription(false));
		    
		    return new ResponseEntity<MyErrorDetails>(mrd, HttpStatus.BAD_REQUEST);
		    
	}
	
	
}
