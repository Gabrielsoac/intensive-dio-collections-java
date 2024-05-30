package program;

import entities.Person;
import entities.PersonList;
import services.ComparePersonPerBirthYear;

import java.util.Collections;
import java.util.Comparator;

public class Application {

    public static void main(String[] args) {

        PersonList personList = new PersonList();

        Person person1 = new Person("teste1", 14, 1999);
        Person person2 = new Person("teste2", 35, 1998);
        Person person3 = new Person("teste3", 26, 1997);

        personList.addPerson(person1);
        personList.addPerson(person2);
        personList.addPerson(person3);

        Collections.sort(personList.getPersonList());

        for (Person person : personList.getPersonList()) {
            System.out.println(person);
        }

        Collections.sort(personList.getPersonList(), new ComparePersonPerBirthYear());

        for (Person person : personList.getPersonList()) {
            System.out.println(person);
        }

    }
}
