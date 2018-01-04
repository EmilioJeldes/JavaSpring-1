package team.springframework.spring5webapp.model.repositories;

import org.springframework.data.repository.CrudRepository;
import team.springframework.spring5webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
