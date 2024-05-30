package entities;

import java.util.ArrayList;
import java.util.List;

public class PersonList {

    List<Person> personList;

    public PersonList() {
        personList = new ArrayList<>();
    }

    public void addPerson(Person person) {
        personList.add(person);
    }

    public void removePerson(Person person) {
        personList.remove(person);
    }

    public List<Person> getPersonList() {
        return personList;
    }
}
