import java.util.*;

public class Main {

    @Override
    public String toString() {
        return "Main{}";
    }

    public static void main(String[] args) {
        Person person1 = new Person("Петров В.В.", 33);
        Person person2 = new Person("Иванов А.И.", 34);
        Person person3 = new Person("Сидоров И.И.", 35);
        Person[] persons = {person1, person2, person3};// не нужны массивы

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
        Person findPerson = client.get(new Acount(116, null));
        System.out.println(findPerson);




        ArrayList<Acount> acountsByClient1 = new ArrayList<>(Arrays.asList(acount1));
        ArrayList<Acount> acountsByClient2 = new ArrayList<>(Arrays.asList(acount2, acount3));
        ArrayList<Acount> acountsByClient3 = new ArrayList<>(Arrays.asList(acount4, acount5, acount6));

        HashMap<Person, List<Acount>> bills = new HashMap<>();
//        bills.put(person1, person1.getAcounts(acountsByClient1));// Collections bkb Arrays
//        bills.put(person2, person2.getAcounts(new ArrayList<>(Arrays.asList(acount2, acount3)));
//        bills.put(person3, person3.setAcounts((Set<Acount>) acountsByClient3);
//        bills.put(person1, person1.setAcounts(Set<Acount> acountsByClient1);
        Set<Acount> ArrayList;
        bills.put(person1, person1.setAcounts(acountsByClient1));
        bills.put(person2, person2.setAcounts(acountsByClient2));
        bills.put(person3, person3.setAcounts(acountsByClient3));

        // Варианты поиска по имени:

        Person findName = (Person) bills.get(person2);
        Person searchBill = new Person("Иванов А.И.", 34);

        System.out.println(searchBill);
        System.out.println(person2);
        System.out.println(searchBill.hashCode() == person2.hashCode());

        System.out.println(findPerson);
        System.out.println(bills.get(person2));
        System.out.println(findName);

//
//        System.out.println(findName.equals(person3.getName()));
//         System.out.println(person2.hashCode());
//         System.out.println(new Person("Иванов А.И.", 34).hashCode());
 //       System.out.println(person3.getName().hashCode());




//        Map<Integer, String> client = new HashMap<Integer, String>();
//        client.put(42561, "Иванов Василий");
//        client.put(42562, "Василий Иванов");
//        client.put(49654, "Смирнов Николай");
//        client.put(78953, "Сидоров Роман");
//        System.out.println(client.get(42561));
//        client.replace(49654,"Смирнов Николай Васильевич");
//        System.out.println(client.get(49654));
//        System.out.println(client.values());
//        System.out.println(client.keySet());
//        for (Map.Entry<Integer,String> temp:client.entrySet()) {
//            System.out.println("Код: " + temp.getKey()+ " Имя: " + temp.getValue());
//        }

    }



//    private static Map<Acount,Person> getAccountClient() {
//        Person client1 = new Client("Сидоров", 1999);
//        Client client2 = new Client("Петров", 1985);
//        Client client3 = new Client("Михайлов", 1990);
//
//        Map<Acount, Person> accountClient = new HashMap<>();
//        accountClient.put(new Acount(12345), client1);
//        accountClient.put(new Account(87654), client1);
//        accountClient.put(new Account(54324), client1);
//        accountClient.put(new Account(32324), client2);
//        accountClient.put(new Account(32162), client3);
//        return accountClient; }



}
