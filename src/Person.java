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
        return null;
    }

    @Override
    public String toString() {
        return "Фамилия ИО - " + name + '\'' +
                ", возраст " + age +
                ", Счета: " + acounts
                ;
    }
    //    public Set<Acount> getAcounts() {
//        return acounts;
//    }

    //    public List<Acount> setAcounts(Set<Acount> acounts) {// Добавилась автоматически
//        this.acounts = acounts;
//        return null;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
