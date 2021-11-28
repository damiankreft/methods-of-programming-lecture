package pl.pja.edu.mp.springboot.restjpademo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
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

    @GetMapping("api/hello")
    String hello() {
        return "Hello!";
    }
}
