package com.codefriday.controller;

import com.codefriday.pojo.Books;
import com.codefriday.service.BooksService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("BooksServiceImpl")
    private BooksService booksService;
    //查询所有书籍
    @RequestMapping("/allBook")
    public String getAllBooks(Model model){
        List<Books> booksList = booksService.getBooksList();
        model.addAttribute("booksList",booksList);
        return "allBook";
    }

    //跳转到添加书籍
    @RequestMapping("/toAddBook")
    public String toAddBook(){
        return "addBook";
    }

    //添加书籍
    @RequestMapping("/addBook")
    public String addBook(Books books){
        booksService.addBook(books);
        return "redirect:/book/allBook";
    }

    //跳转到修改界面
    @RequestMapping("/toUpdate")
    public String toUpdate(int id,Model model){
        Books aBook = booksService.getBooksById(id);
        model.addAttribute("aBook",aBook);
        return "updateBook";
    }
    //修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        booksService.updateBook(books);
        return "redirect:/book/allBook";
    }

    //删除书籍
    @RequestMapping("deleteBook")
    public String deleteBookById(int id){
        booksService.deleteBook(id);
        return "redirect:/book/allBook";
    }

    //查询书籍
    @RequestMapping("/queryBookByName")
    public String queryBookByName(String bookName,Model model){
        List<Books> booksList = booksService.getBooksByName(bookName);
        if(booksList.size()>0){
            model.addAttribute("booksList",booksList);
        }else{
            model.addAttribute("errorMsg","未查询到");
        }
        return "allBook";
    }
}
