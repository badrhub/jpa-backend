package service;




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import model.Book;



public class Test {

public static void main(String[] args) {
ApplicationContext ap= new ClassPathXmlApplicationContext("spring.xml");

//IBookService service= (IBookService)ap.getBean("bookServiceImpl");


IBookService book_service= (IBookService) ap.getBean("book-service");
//IAuthorService author_service=(IAuthorService)ap.getBean("author-service");

Book book = book_service.findById(1L);
System.out.println(book);


}
}


