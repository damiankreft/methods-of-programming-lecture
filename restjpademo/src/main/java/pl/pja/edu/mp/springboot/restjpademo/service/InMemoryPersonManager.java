package pl.pja.edu.mp.springboot.restjpademo.service;

import org.springframework.stereotype.Service;
import pl.pja.edu.mp.springboot.restjpademo.domain.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class InMemoryPersonManager implements PersonManager{
    // temporary stub
    private List<Person> db = new ArrayList<>();

    @Override
    public Person addPerson(Person person) {
        var personToAdd = new Person(UUID.randomUUID().toString(), person.getFirstName(), person.getYob());
        db.add(personToAdd);
        return personToAdd;
    }

    @Override
    public List<Person> getAllPersons() {
        return db;
    }

    @Override
    public boolean deletePerson(String id) {
        Optional<Person> personToDelete = null;
        personToDelete = db.stream().findFirst().filter(p -> p.getId() == id);
        if (personToDelete.isPresent()) {
            db.remove(personToDelete);
            return true;
        }

        return false;
    }

    @Override
    public Person findById(String id) {
        return null;
    }
}
