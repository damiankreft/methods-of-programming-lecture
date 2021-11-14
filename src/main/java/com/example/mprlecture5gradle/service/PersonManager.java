package com.example.mprlecture5gradle.service;

import com.example.mprlecture5gradle.domain.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class PersonManager {
    // ToDo replace with Map<String, Person> db = new HashMap<>();
    private final List<Person> db = new ArrayList<>();

    public Person addPerson(Person person) {
        // Todo Read about UUID.
        String id = UUID.randomUUID().toString();
        Person personToAdd = new Person(id, person.getFirstName(), person.getYob());
        db.add(personToAdd);

        return personToAdd;
    }

    public List<Person> getAll() {
        return db;
    }

    public boolean deletePerson(String id) {
        // TODO: implement.
        db.stream().findFirst().stream().dropWhile(p -> p.getId() == id);

        // Todo return valid operation status.
        return false;
    }
}
