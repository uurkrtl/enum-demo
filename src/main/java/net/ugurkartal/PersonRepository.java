package net.ugurkartal;

import java.util.*;

import static java.util.Optional.ofNullable;

public class PersonRepository {
    List<Person> people;

    //Write a method in the class PersonRepository that searches for and returns a person based on their id from the list/map. The method should return an Optional.
    public Optional<Person> findPersonById(long id) {
        Optional<Person> findPerson = Optional.empty();
        for (Person person : people) {
            if (person.id() == id) {
                findPerson = ofNullable(person);
                return findPerson;
            }
        }
        return findPerson;
    }

    //Write a method in the PersonRepository that counts the number of persons by gender and outputs the results.
    public Map<Gender,Integer> countGenders() {
        Map<Gender,Integer> result = new HashMap<>();
        for (Person person : people) {
            result.put(person.gender(), result.containsKey(person.gender()) ? result.get(person.gender()) + 1 : 1);
        }
        return result;
    }

    //Add a method in the PersonRepository that searches and returns a person by their name. The method should return an Optional.
    public Optional<Person> findPersonByName(String name) {
        Optional<Person> findPerson = Optional.empty();
        for (Person person : people) {
            if (person.name() == name) {
                findPerson = ofNullable(person);
                return findPerson;
            }
        }
        return findPerson;
    }

    //Write a method in the PersonRepository that searches and returns all persons by their favorite weekday. The method should return a list.
    public List<Person> findPersonByFavouriteDay(DaysOfWeek day) {
        List<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (person.favouriteDay() == day) {
                result.add(person);
            }
        }
        return result;
    }

}