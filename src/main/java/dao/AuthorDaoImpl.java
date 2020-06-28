package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import model.Author;



@Repository
public class AuthorDaoImpl implements IAuthorDao{
	
	@PersistenceContext
	EntityManager em;

	@Transactional
	@Override
	public void insert(Author a) {
	 em.persist(a);
	}

	@Transactional
	@Override
	public Author update(Author b) {
		Author a = em.find(Author.class, b.getId());
		a.setName(b.getName());
		a.setBooks(b.getBooks());
		return a;
	}

	@Transactional
	@Override
	public void delete(Author b) {
		Author a = em.getReference(Author.class, b.getId());
		em.remove(a);
	}

	@Override
	public List<Author> selectAll() {
			return em.createQuery("select a from Author a", Author.class).getResultList();
	}

	@Override
	public Author selectById(Long id) {
		return em.find(Author.class, id);
	}
	
	

}
