package service;

import java.util.List;
import model.Author;


public interface IAuthorService {
	void insert(Author a);
	Author update(Author b);
	void delete(Author b);
	List<Author> selectAll();
	Author findById(Long id);
	

}
