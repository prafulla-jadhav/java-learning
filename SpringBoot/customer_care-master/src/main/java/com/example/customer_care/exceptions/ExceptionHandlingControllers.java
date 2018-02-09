package com.example.customer_care.exceptions;

import com.example.customer_care.utils.ValidationUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlingControllers {


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ExceptionResponse> invalidInput(MethodArgumentNotValidException ex) {
        BindingResult result = ex.getBindingResult();
        ExceptionResponse response = new ExceptionResponse();
        response.setErrorCode("Validation Error");
        response.setErrorMessage("Invalid inputs.");
        response.setErrors(ValidationUtil.fromBindingErrors(result));
        return new ResponseEntity<ExceptionResponse>(response, HttpStatus.BAD_REQUEST);
    }

   /* @ExceptionHandler(NewResourceNotAllowedInPutException.class)
    public ResponseEntity<ExceptionResponse> invalidInput(NewResourceNotAllowedInPutException ex) {

        ExceptionResponse response = new ExceptionResponse();
        response.setErrorCode("Method not Allowed.");
        response.setErrorMessage("Existing resource is not allowed in Put Request. Please use POST method instead.");

        return new ResponseEntity<ExceptionResponse>(response, HttpStatus.METHOD_NOT_ALLOWED);
    }*/


}