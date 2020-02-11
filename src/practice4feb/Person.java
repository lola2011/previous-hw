package practice4feb;

import java.util.Objects;

public class Person {
    private Integer age;
    private String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }
    public Person(){

    }

    @Override
    public String toString() {
        return "Person name=" + name + "]" +'\'';
    }

    @Override
    public boolean equals(Object o) {
  Person person=(Person)o;
  return this.age==((Person) o).age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
