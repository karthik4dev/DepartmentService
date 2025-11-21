package com.karthikProject.cacheImpl_DepartmentService.Exception;

public class NoDepartmantFoundException extends Exception{
    public NoDepartmantFoundException(){
        super();
    }

    public NoDepartmantFoundException(String message){
        super(message);
    }
}
