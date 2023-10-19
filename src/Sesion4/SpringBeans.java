package Sesion4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Sesion4.core.driven_ports.BookRepository;
import Sesion4.core.driver_ports.BookService;
import Sesion4.core.driver_ports.BookServiceImpl;

@Configuration
public class SpringBeans {
	@Bean
	BookService bookService(final BookRepository bookRepository) {
		return new BookServiceImpl(bookRepository);
	}
}
