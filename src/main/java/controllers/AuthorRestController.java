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

import model.Author;
import service.IAuthorService;

@RestController
@RequestMapping("/authors")
public class AuthorRestController {
	
	@Autowired
	IAuthorService service;

	@PostMapping(path="/add" , consumes = MediaType.APPLICATION_JSON_VALUE)
	public void add(@RequestBody Author b) {
		if(b.getId() != null)
			b.setId(null);
	    service.insert(b);
	}

	@GetMapping(path="/{id}")
	public Author searchById(@PathVariable("id")Long id) {
	return service.findById(id);
	}

	@GetMapping(path="")
	public List<Author> getall() {
	return service.selectAll();
	}

	@PutMapping(path="/{id}")
	public Author updateAuthor(@PathVariable("id")Long id,@RequestBody Author b) {
		Author aa = service.findById(id);
		if(aa != null) {
			aa.setName(b.getName());
			return  service.update(aa);
		}
		return  null;
	}

	@DeleteMapping(path="/{id}")
	public String deleteAuthor(@PathVariable("id")Long id) {
		Author a = service.findById(id);
		if(a != null) {
	    service.delete(a);
	return "l'author a ete supprimer";
		}
		return null;
	}



	}



