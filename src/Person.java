import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private ArrayList<Acount> acounts;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(){
        }

    public List<Acount> setAcounts(ArrayList<Acount> acounts) {
        this.acounts = acounts;
        return acounts;
    }

    @Override
    public String toString() {
        return "Фамилия ИО - " + name + '\'' +
                ", возраст - " + age +
                ", Счета: " + acounts
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

}
