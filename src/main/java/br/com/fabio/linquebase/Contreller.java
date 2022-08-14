package br.com.fabio.linquebase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("person")
public class Contreller {
    @Autowired
    private  PersonRepository personRepository;
    @PostMapping("person")
    public String createPerson(@RequestParam String name){
        Person p = new Person(name,"9.9");
        personRepository.save(p);
        return  personRepository.findByName(name)+" Salvo com sucesso";
    }
    @GetMapping("person")
    public List<Person> getAll(){
        return (List<Person>) personRepository.findAll();
    }

}
