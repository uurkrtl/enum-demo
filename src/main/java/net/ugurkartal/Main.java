package net.ugurkartal;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        PersonRepository personRepository = new PersonRepository();
        Person ugur = new Person(1, "Ugur", DaysOfWeek.MONDAY, Gender.MALE);
        Person steven = new Person(2, "Steven", DaysOfWeek.SATURDAY, Gender.MALE);
        Person siqi = new Person(3, "Siqi", DaysOfWeek.FRIDAY, Gender.FEMALE);

        personRepository.people = List.of(steven, siqi);

        //In your main method, check if the person exists. If they do, print the name and favorite day of the week to the console.
        System.out.print("findPersonById-1: ");
        if (personRepository.findPersonById(ugur.id()).isPresent()) {
            System.out.println(personRepository.findPersonById(ugur.id()).get().name() + " " + DaysOfWeek.isWeekday(personRepository.findPersonById(ugur.id()).get().favouriteDay()));
        }else {
            System.out.println("Person not found");
        }

        System.out.print("findPersonById-2: ");
        if (personRepository.findPersonById(steven.id()).isPresent()) {
            System.out.println(personRepository.findPersonById(steven.id()).get().name() + " " + DaysOfWeek.isWeekday(personRepository.findPersonById(steven.id()).get().favouriteDay()));
        }else {
            System.out.println("Person not found");
        }

        System.out.print("findPersonById-3: ");
        if (personRepository.findPersonById(siqi.id()).isPresent()) {
            System.out.println(personRepository.findPersonById(siqi.id()).get().name() + " " + DaysOfWeek.isWeekday(personRepository.findPersonById(siqi.id()).get().favouriteDay()));
        }else {
            System.out.println("Person not found");
        }

        System.out.println("\nNumber of people by gender: " + personRepository.countGenders());

        System.out.println("\nfindPersonByName-Ugur: " + personRepository.findPersonByName("Ugur"));
        System.out.println("findPersonByName-Steven: " + personRepository.findPersonByName("Steven"));
        System.out.println("findPersonByName-Siqi: " + personRepository.findPersonByName("Siqi"));

        System.out.println("\nPeople whose favorite day is Friday: " + personRepository.findPersonByFavouriteDay(DaysOfWeek.FRIDAY));
    }
}