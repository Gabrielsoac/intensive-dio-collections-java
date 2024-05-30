package entities;

public class Person implements Comparable<Person> {

    private String name;
    private Integer age;
    private Integer birthYear;

    public Person(String name, Integer age, Integer birthYear) {
        this.name = name;
        this.age = age;
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthYear=" + birthYear +
                '}';
    }

    @Override
    public int compareTo(Person p) {
        return Integer.compare(age, p.getAge());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }
}
