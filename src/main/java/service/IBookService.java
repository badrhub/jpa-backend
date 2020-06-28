package service;


import java.util.List;

import model.Book;


public interface IBookService {
void add(Book b);
Book modifier(Book b);
void supprimer(Long id);
List<Book> chercherAll();
Book findById(Long i);
}
