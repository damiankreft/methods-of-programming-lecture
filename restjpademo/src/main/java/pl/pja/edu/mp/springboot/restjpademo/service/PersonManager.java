package pl.pja.edu.mp.springboot.restjpademo.service;

import pl.pja.edu.mp.springboot.restjpademo.domain.Person;

import java.util.List;

public interface PersonManager {
    Person addPerson(Person person);
    List<Person> getAllPersons();
    boolean deletePerson(String id);
    Person findById(String id);

    // TODO Add updatePerson() business method
}
