package com.springproject.firstspringproject.dao;

import com.springproject.firstspringproject.entities.Book;

import org.springframework.data.repository.CrudRepository;

//Repositories are used to handle Database data

public interface BookRepository extends CrudRepository<Book, Integer>{

    public Book findById(int id);
    
}
