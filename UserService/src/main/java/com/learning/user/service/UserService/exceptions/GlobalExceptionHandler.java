package com.learning.user.service.UserService.exceptions;

import com.learning.user.service.UserService.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundExceptions.class)
    public ResponseEntity<ApiResponse> handleResourceNotFoundException(ResourceNotFoundExceptions exceptions){
        String message = exceptions.getMessage();
        ApiResponse apiResponse = ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
//        ApiResponse apiResponse = ApiResponse.builder()
//                .message("Resource not found")
//                .success(false)
//                .status(HttpStatus.NOT_FOUND)
//                .build();

        return new ResponseEntity<>(apiResponse,HttpStatus.NOT_FOUND);

    }
}
