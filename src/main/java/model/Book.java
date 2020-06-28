package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;



//// @Inheritance(strategy=InheritanceType.JOINED)
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="Column_disinguish")
//@DiscriminatorValue("value_for_books")
//@Id simple primary key
//@IdClass @EmbeddedId composite key


@Entity
@Table(name="books")
public class Book {
	
@Id 
@GeneratedValue (strategy=GenerationType.IDENTITY)
private Long id;

@Column(name="title")
private String title;

@ManyToOne( fetch = FetchType.LAZY )
@JoinColumn(name = "fk_author")
@JsonBackReference
private Author author;


public Book() {
super();
}
public Book(String title) {
super();
this.title = title;
}
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}
public Long getId() {
return id;
}
public void setId(Long id) {
this.id = id;
}
public String getTitle() {
return title;
}
public void setTitle(String title) {
this.title = title;
}

@Override
	public String toString() {
		return "id = " +this.id+ ", title = " + this.title;
	}

@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Book )) return false;
    return id != null && id.equals(((Book) o).getId());
}

@Override
public int hashCode() {
    return 31;
}

}
