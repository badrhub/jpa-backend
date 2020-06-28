package dao;
import java.util.List;

import model.Book;


public interface IBookDao {
	
void insert(Book b);
Book update(Book b);
void delete(Long b);
List<Book> selectAll();
Book selectById(Long id);

}
