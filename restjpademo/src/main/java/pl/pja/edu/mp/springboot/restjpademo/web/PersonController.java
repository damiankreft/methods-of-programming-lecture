package pl.pja.edu.mp.springboot.restjpademo.web;

import org.springframework.web.bind.annotation.*;
import pl.pja.edu.mp.springboot.restjpademo.domain.Person;
import pl.pja.edu.mp.springboot.restjpademo.service.PersonManager;

import java.util.List;

@RestController
public class PersonController {

    private final PersonManager personManager;

    public PersonController(PersonManager personManager) {
        this.personManager = personManager;
    }

    @PostMapping("api/person")
    Person addPerson(@RequestBody Person person) {
        return personManager.addPerson(person);
    }

    @GetMapping("api/person")
    List<Person> getAll() {
        return personManager.getAllPersons();
    }

    @DeleteMapping("api/person/{id}")
    void deletePerson(@PathVariable("id") String id) {
        personManager.deletePerson(id);
    }

    @GetMapping("api/hello")
    String hello() {
        return "Hello!";
    }
}
