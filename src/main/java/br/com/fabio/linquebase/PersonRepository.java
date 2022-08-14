package br.com.fabio.linquebase;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person,Integer> {

    @Query("SELECT name FROM Person p WHERE p.name LIKE %:personName%")
    String findByName(String personName);
}
