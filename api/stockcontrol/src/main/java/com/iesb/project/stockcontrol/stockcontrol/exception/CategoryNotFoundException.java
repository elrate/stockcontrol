package com.iesb.project.stockcontrol.stockcontrol.exception;

public class CategoryNotFoundException extends Throwable{
    public CategoryNotFoundException(Long id) {
        super("Product not found with ID " + id);
    }
    public CategoryNotFoundException(String str){
        super("Product not found with "+ str);
    }
}
