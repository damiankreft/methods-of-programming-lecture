package com.example.mprlecture5gradle.api;

import com.example.mprlecture5gradle.domain.Person;
import com.example.mprlecture5gradle.service.PersonManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    private final PersonManager personManagerService;

    public PersonController(PersonManager personManagerService) {

        this.personManagerService = personManagerService;
    }

    @PostMapping("/api/person")
    public Person addPerson(Person person) {
        return personManagerService.addPerson(person);
    }

    @GetMapping("/api/person")
    public List<Person> getAll() {
        return personManagerService.getAll();
    }
}
