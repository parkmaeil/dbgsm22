package com.example.webapp.controller;

import com.example.webapp.entity.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WebController {
    // GET http://localhost:8080/list : Rest Open API -------> Client(React.Vue~~)
    @GetMapping("/list")
    public List<Book> list(){
        List<Book> lst=new ArrayList<>();
        Book b1=new Book(1,"인공지능","제이펍","박매일",35000,"ISBN12345","2026-03-26");
        Book b2=new Book(2,"자바","이지스페블리싱","홍길동",31000,"ISBN54321","2026-03-25");
        lst.add(b1);
        lst.add(b2);
        return lst;
    }
}
