package dao;

import java.util.List;
import model.Author;


public interface IAuthorDao {
	
	void insert(Author a);
	Author update(Author b);
	void delete(Author b);
	List<Author> selectAll();
	Author selectById(Long id);

}
