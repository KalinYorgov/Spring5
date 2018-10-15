import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Author{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstname; 
	private String lastname;
	
	@ManyToMany
	private Set <Book> books = new HashSet<>();
	
	public Author(){
		
	};
	
	public Author(String firstname, String lastname){
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public Author(String firstname, String lastname, Set<Book> books){
		this.firstname = firstname;
		this.lastname = lastname;
		this.books = books;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Set<Book> getBooks() {
		return books;
	}
	public void setBooks(Set<Book> books) {
		this.books = books;
	}
}