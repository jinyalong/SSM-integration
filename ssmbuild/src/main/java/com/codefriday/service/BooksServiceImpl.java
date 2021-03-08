package com.codefriday.service;

import com.codefriday.mapper.BookMapper;
import com.codefriday.pojo.Books;
import org.springframework.stereotype.Service;

import java.util.List;
public class BooksServiceImpl implements BooksService{
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBook(int id) {
        return bookMapper.deleteBook(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books getBooksById(int id) {
        return bookMapper.getBooksById(id);
    }

    @Override
    public List<Books> getBooksList() {
        return bookMapper.getBooksList();
    }

    @Override
    public List<Books> getBooksByName(String bookName) {
        return bookMapper.getBooksByName(bookName);
    }
}
