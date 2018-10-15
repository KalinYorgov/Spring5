import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Book{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String publisher;
	private String isbn;
	
	@ManyToMany
	private Set <Author> authors = new HashSet<>();
	
	public Book() {
	}
	
	public Book(String title, String publisher, String isbn){
		this.title = title;
		this.publisher = publisher;
		this.isbn = isbn;
	}
 	
	public Book(String title, String publisher, String isbn, Set<Author> authors){
		this.title = title;
		this.publisher = publisher;
		this.isbn = isbn;
		this.authors = authors;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}
	public Set<Author> getAuthors() {
		return authors;
	}
}