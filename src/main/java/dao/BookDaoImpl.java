package dao;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import model.Book;


@Repository
public class BookDaoImpl implements IBookDao {

@PersistenceContext
EntityManager em;


@Override
public void insert(Book b) {
em.persist(b);
}

@Override
public Book update(Book b) {
	Book o = em.find(Book.class, b.getId());
	o.setTitle(b.getTitle());
	return o;
}

@Override
public void delete(Long b) {
Book bb = em.getReference(Book.class, b);
em.remove(bb);	
}

@Override
public List<Book> selectAll() {
		return em.createQuery("select b from Book b", Book.class).getResultList();
}

@Override
public Book selectById(Long id) {
	return em.find(Book.class, id);
}






}
