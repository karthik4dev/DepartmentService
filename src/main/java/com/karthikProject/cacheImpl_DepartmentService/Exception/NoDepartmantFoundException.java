package com.karthikProject.cacheImpl_DepartmentService.Exception;


public class NoDepartmantFoundException extends RuntimeException{
    public NoDepartmantFoundException(String message){
        super(message);
    }
}
