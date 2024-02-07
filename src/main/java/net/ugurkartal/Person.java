package net.ugurkartal;

public record Person(
        long id,
        String name,
        DaysOfWeek favouriteDay
) {
}
