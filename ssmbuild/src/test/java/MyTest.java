import com.codefriday.pojo.Books;
import com.codefriday.service.BooksService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void Test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BooksService serviceImpl = context.getBean("BooksServiceImpl", BooksService.class);
//        serviceImpl.addBook(new Books(4,"数据库",2,"数据库原理"));
//        serviceImpl.deleteBook(4);
//        serviceImpl.updateBook(new Books(3,"数据库",22,"数据库原理"));
//        //System.out.println(serviceImpl.getBooksById(1));
//        List<Books> list = serviceImpl.getBooksList();
//        for (Books books : list) {
//            System.out.println(books);
//        }
        List<Books> my = serviceImpl.getBooksByName("MySQL");
        for (Books books : my) {
            System.out.println(books);
        }
    }
}
