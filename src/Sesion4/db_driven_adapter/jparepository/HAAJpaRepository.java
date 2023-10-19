package Sesion4.db_driven_adapter.jparepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import Sesion4.db_driven_adapter.domain.BookEntity;

public interface HAAJpaRepository extends JpaRepository<BookEntity, Long>{

	Optional<BookEntity> findById(Long id);

}
