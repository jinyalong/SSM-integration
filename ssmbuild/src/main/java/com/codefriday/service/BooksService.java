package com.codefriday.service;

import com.codefriday.pojo.Books;
import org.springframework.stereotype.Service;


import java.util.List;
public interface BooksService {
    //增加
    public int addBook(Books books);
    //删除
    public int deleteBook(int id);
    //修改
    public int updateBook(Books books);
    //查询一个
    public Books getBooksById(int id);
    //查询全部
    public List<Books> getBooksList();
    //通过名字查询
    public List<Books> getBooksByName(String bookName);
}
