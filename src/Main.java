import java.util.HashMap;
import java.util.Map;

public class Main {

    @Override
    public String toString() {
        return "Main{}";
    }

    public static void main(String[] args){
        Person person1 = new Person("Петров В.В.", 33);
        Person person2 = new Person("Иванов А.И.", 34);
        Person person3 = new Person("Сидоров И.И.", 35);
        Person[] persons = {person1, person2, person3};

        Acount acount1 = new Acount(111);
        Acount acount2 = new Acount(112);
        Acount acount3 = new Acount(113);
        Acount acount4 = new Acount(114);
        Acount acount5 = new Acount(115);
        Acount acount6 = new Acount(116);
        Acount[] acounts = {acount1, acount2, acount3, acount4, acount5, acount6};
        Acount[] acountsPetrov = {acount1};
        Acount[] acountIvanov = {acount2, acount3};
        Acount[] acountsSidorov = {acount4,acount5, acount6};
          printPerson(persons);
          printAcount(acounts);
//          printAcounts(acounts);

        HashMap <Person, Acount[]> client = new HashMap<>();
        client.put(person1,acountsPetrov);
        client.put(person2,acountIvanov);
        client.put(person3,acountsSidorov);
//        System.out.println(client.equals(persons));

        String findName = "Иванов А.И.";
        boolean billFound = client.containsKey(persons);
        client.forEach((key, key2) -> {
            if (key.getName().equals(findName)){
                for (int i = 0; i < key.getName().length() ; i++) {
                    System.out.println(key.getName()+ " " + key2[i]);
                }

            }
        });


        int findBill = 116;
//        Boolean nameFound = client.containsKey(acounts);
//        client.forEach((key, key2) -> {
//            if (key.getName(findBill)){
//                System.out.println(key.getAge()+ "000 " + key2.toString());
//            }
//        });


    }
    private static void printPerson (Person[] persons){
        System.out.println("Список клиентов: ");
        for (Person person : persons) {
            System.out.println(person.toString());
        }
        System.out.println();
    }
    private static void printAcount (Acount[] acounts){
        System.out.println("Список счетов:");
        for (Acount acount : acounts){
            System.out.print(acount.toString()+ "; ");
        }
        System.out.println();
    }

}
