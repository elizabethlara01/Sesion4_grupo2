package Sesion4.core.domain;

public class Book {
	private Long id;
	private String name;
	// constructors //getters and setters

	public Book(Long id2, String name2) {
		this.id = id2;
		this.name = name2;
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
