package Sesion4.core.driven_ports;

import Sesion4.core.domain.Book;

public interface BookRepository {
	Book findById(Long id);
}

