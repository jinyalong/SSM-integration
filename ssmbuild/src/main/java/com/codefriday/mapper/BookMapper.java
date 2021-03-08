package com.codefriday.mapper;

import com.codefriday.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //增加
    public int addBook(Books books);
    //删除
    public int deleteBook(@Param("bookID") int id);
    //修改
    public int updateBook(Books books);
    //查询一个
    public Books getBooksById(@Param("bookID") int id);
    //查询全部
    public List<Books> getBooksList();
    //
    public List<Books> getBooksByName(@Param("bookName") String bookName);
}
