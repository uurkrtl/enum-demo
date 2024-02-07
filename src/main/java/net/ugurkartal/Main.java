package net.ugurkartal;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        PersonRepository personRepository = new PersonRepository();
        Person ugur = new Person(1, "Ugur", DaysOfWeek.MONDAY);
        Person steven = new Person(2, "Steven", DaysOfWeek.SATURDAY);
        Person siqi = new Person(3, "Siqi", DaysOfWeek.FRIDAY);

        personRepository.people = List.of(steven, siqi);

        //In your main method, check if the person exists. If they do, print the name and favorite day of the week to the console.
        if (personRepository.findById(ugur.id()).isPresent()) {
            System.out.println(personRepository.findById(ugur.id()).get().name() + " " + DaysOfWeek.isWeekday(personRepository.findById(ugur.id()).get().favouriteDay()));
        }

        if (personRepository.findById(steven.id()).isPresent()) {
            System.out.println(personRepository.findById(steven.id()).get().name() + " " + DaysOfWeek.isWeekday(personRepository.findById(steven.id()).get().favouriteDay()));
        }

        if (personRepository.findById(siqi.id()).isPresent()) {
            System.out.println(personRepository.findById(siqi.id()).get().name() + " " + DaysOfWeek.isWeekday(personRepository.findById(siqi.id()).get().favouriteDay()));
        }
    }
}