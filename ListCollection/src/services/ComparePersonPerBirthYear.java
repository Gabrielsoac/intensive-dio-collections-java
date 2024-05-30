package services;

import entities.Person;

import java.util.Comparator;

public class ComparePersonPerBirthYear implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getBirthYear(), o2.getBirthYear());
    }
}
