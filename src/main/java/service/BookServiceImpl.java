package service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import dao.IBookDao;
import model.Book;

@Service(value="book-service")
public class BookServiceImpl implements IBookService {
	
@Autowired
IBookDao daoB;

@Transactional
@Override
public void add(Book b) {
	daoB.insert(b);
}


@Transactional
@Override
public Book modifier(Book b) {
	return daoB.update(b);
}

@Transactional
@Override
public void supprimer(Long b) {
	daoB.delete(b);	
}

@Override
public List<Book> chercherAll() {
	return daoB.selectAll();
}

@Override
public Book findById(Long id) {
	return daoB.selectById(id);
}

}
