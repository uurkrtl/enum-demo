package net.ugurkartal;

import java.util.List;
import java.util.Optional;

import static java.util.Optional.ofNullable;

public class PersonRepository {
    List<Person> people;

    //Write a method in the class PersonRepository that searches for and returns a person based on their id from the list/map. The method should return an Optional.
    public Optional<Person> findById(long id) {
        Optional<Person> findPerson = Optional.empty();
        for (Person person : people) {
            if (person.id() == id) {
                findPerson = ofNullable(person);
                return findPerson;
            }
        }
        return findPerson;
    }
}