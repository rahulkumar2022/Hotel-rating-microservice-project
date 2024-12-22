package com.learning.user.service.UserService.exceptions;

public class ResourceNotFoundExceptions extends RuntimeException{
    public ResourceNotFoundExceptions(){
        super("Resource Not found.....");
    }
    public ResourceNotFoundExceptions(String message){
        super(message);
    }
}
