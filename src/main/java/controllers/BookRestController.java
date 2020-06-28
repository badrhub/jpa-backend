package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Book;
import service.IBookService;

@RestController
@RequestMapping("/books")
public class BookRestController{
	
@Autowired
IBookService service;

@PostMapping(path="/add" , consumes = MediaType.APPLICATION_JSON_VALUE)
public void add(@RequestBody Book b) {
	if(b.getId() != null)
		b.setId(null);
    service.add(b);
}

@GetMapping(path="/{id}")
public Book searchById(@PathVariable("id")Long id) {
return service.findById(id);
}

@GetMapping(path="")
public List<Book> getall() {
return service.chercherAll();
}

@PutMapping(path="")
public Book updateBook(@RequestBody Book b) {
	return  service.modifier(b);
}

@DeleteMapping(path="/{id}")
public String deleteBook(@PathVariable("id")Long id) {
service.supprimer(id);
return "le book a ete supprimer";
}



}
