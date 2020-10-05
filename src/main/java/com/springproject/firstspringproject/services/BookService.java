package com.springproject.firstspringproject.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.springproject.firstspringproject.dao.BookRepository;
import com.springproject.firstspringproject.entities.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookService {

    //We use service as a Fake Database
    // private static List<Book> list = new ArrayList<>();
    // static{
    //     list.add(new Book(1, "Java", "Deepanshu"));
    //     list.add(new Book(2, "Python", "Ayush"));
    //     list.add(new Book(3, "Django", "Karan"));
    // }

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks(){
        
       // return list;
       return (List<Book>)this.bookRepository.findAll();
    }

    public Book getSingleBook(int id){
        Book book = null;
        try{
           // book = list.stream().filter(e->e.getId()==id).findFirst().get();
           book = this.bookRepository.findById(id);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return book;
    }

    public Book addBook(Book b)
    {
        // list.add(b);
        b = this.bookRepository.save(b);
        return b;
    }

    public void deleteBook(int b)
    {
        // list = list.stream().filter(
        //     book->book.getId()!=b)            
        // .collect(Collectors.toList());

        this.bookRepository.deleteById(b);
    }

    public Book updateBook(Book book, int id)
    {
        // list = list.stream().map(b->{
        //     if(b.getId()==id)
        //     {
        //         b.setTitle(book.getTitle());
        //         b.setAuthor(book.getAuthor());
        //     }
        //     return b;
        // }).collect(Collectors.toList());
        book.setId(id);
        this.bookRepository.save(book);
        return book;
    }
}
