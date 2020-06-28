package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IAuthorDao;
import model.Author;

@Service(value="author-service")
public class AuthorServiceImpl implements IAuthorService{
	
	@Autowired
	IAuthorDao daoA;

	@Override
	public void insert(Author a) {
		daoA.insert(a);
	}

	@Override
	public Author update(Author b) {
	return 	daoA.update(b);		
	}

	@Override
	public void delete(Author b) {
		daoA.delete(b);
	}

	@Override
	public List<Author> selectAll() {
		return daoA.selectAll();
	}

	@Override
	public Author findById(Long id) {
		return daoA.selectById(id);
	}

}
