import java.util.*;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Петров В.В.", 33);
        Person person2 = new Person("Иванов А.И.", 34);
        Person person3 = new Person("Сидоров И.И.", 35);

        Acount acount1 = new Acount(111, person1);
        Acount acount2 = new Acount(112, person2);
        Acount acount3 = new Acount(113, person2);
        Acount acount4 = new Acount(114, person3);
        Acount acount5 = new Acount(115, person3);
        Acount acount6 = new Acount(116, person3);


        HashMap<Acount, Person> client = new HashMap<Acount, Person>();
        client.put(acount1, person1);
        client.put(acount2, person2);
        client.put(acount3, person2);
        client.put(acount4, person3);
        client.put(acount5, person3);
        client.put(acount6, person3);

        // Перераспределяем Equals и HashCode в классах.
        // Ищем клиента по счету. Создаем новую переменную (с помощью ALT + Enter) и по клиенту с помощью get ищем персону
        // Обязательно создаем новый аккаунт, а не цифры т.к. в противном случае ХэшКод будет разный
        //Вариант поиска по счету:
        Person findPerson = client.get(new Acount(115, null));
        System.out.println(findPerson);

        ArrayList<Acount> acountsByClient1 = new ArrayList<>(Arrays.asList(acount1));
        ArrayList<Acount> acountsByClient2 = new ArrayList<>(Arrays.asList(acount2, acount3));
        ArrayList<Acount> acountsByClient3 = new ArrayList<>(Arrays.asList(acount4, acount5, acount6));

        HashMap<Person, List<Acount>> bills = new HashMap<>();

        Set<Acount> ArrayList;
        bills.put(person1, person1.setAcounts(acountsByClient1));
        bills.put(person2, person2.setAcounts(acountsByClient2));
        bills.put(person3, person3.setAcounts(acountsByClient3));

        // Варианты поиска по имени:
        Person searchBill = new Person("Сидоров И.И.", 35);
        List<Acount> acounts = bills.get(searchBill);
        System.out.println(acounts);
    }
}
