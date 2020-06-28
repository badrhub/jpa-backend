package model;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Author {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
@OneToMany(cascade = CascadeType.ALL, mappedBy = "author" ,orphanRemoval = true )
@JsonManagedReference
private Set<Book> books;

public Author() {
	super();
}

public void addBook(Book b) {
	books.add(b);
	b.setAuthor(this);
}

public void deleteBook(Book b) {
	books.remove(b);
	b.setAuthor(null);
}

public Set<Book> getBooks() {
	return books;
}
public void setBooks(Set<Book> books) {
	this.books = books;
}
@Override
public String toString() {
return "Author [id=" + id + ", name=" + name + "]";
}
public Author(String name) {
super();
this.name = name;
}
public Long getId() {
return id;
}
public void setId(Long id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
}
