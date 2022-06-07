import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class Main {

    @Override
    public String toString() {
        return "Main{}";
    }

    public static void main(String[] args){
        Person person1 = new Person("Петров В.В.", 33);
        Person person2 = new Person("Иванов А.И.", 34);
        Person person3 = new Person("Сидоров И.И.", 35);
        Person[] persons = {person1, person2, person3};// не нужны массивы
//


//        HashMap <String,Object> client = new HashMap<String,Object>();
//

//        HashMap<String,Object> map= new HashMap<String, Object>();
//        Set<Map.Entry<String,Object>> entrySet=map.entrySet();
//
//        Object desiredObject=new Object();//что хотим найти
//        for (Map.Entry<String,Object> pair : entrySet) {
//            if (desiredObject.equals(pair.getValue())) {
//                return pair.getKey();// нашли наше значение и возвращаем  ключ
//            }
//        }




        Acount acount1 = new Acount(111, person1);
        Acount acount2 = new Acount(112, person2);
        Acount acount3 = new Acount(113, person2);
        Acount acount4 = new Acount(114, person3);
        Acount acount5 = new Acount(115, person3);
        Acount acount6 = new Acount(116, person3);


        HashMap <Object, Object> client = new HashMap<Object, Object>();
        client.put(acount1, person1);
        client.put(acount2, person2);
        client.put(acount3, person2);
        client.put(acount4, person3);
        client.put(acount5, person3);
        client.put(acount6, person3);

        // Перераспределяем Equals и HashCode в классах.
        // Ищем клиента по счету. Создаем новую переменную (с помощью ALT + Enter) и по клиенту с помощью get ищем персону
        // Обязательно создаем новый аккаунт, а не цифры т.к. в противном случае ХэшКод будет разный
        Object findPerson = client.get(new Acount(111, null));
        System.out.println(findPerson);




        Object findName = client.get("Сидоров И.И.");
        System.out.println(findName.equals(person1));

//        boolean billFound = client.contansKey(persons);
//        client.forEach((key, key2) -> {
//            if (key.getName().equals(findName)){
//                for (int i = 0; i < client.size() ; i++) {
//                    System.out.println(key.getName()+ " " + key2[i]);
//                }
//
//            }
//        });


//        Object findBill = client.get(new Acount(null, person1));
//


//        for(Map.Entry<Object, Object> entry : client.entrySet()){
////            Class<Person> temp = entry.getValue().getClass();
////
////            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue());
//        }
        Collection<Object> collection = client.keySet();
        Object desiredPerson = new Person("Петров В.В.", 33);
        for (Object key : collection){
            Object obj = client.get(key);
            if (client.containsKey(persons)) {
                if (desiredPerson.equals(obj)){
                    System.out.println(desiredPerson.hashCode());
                    return;
                }
                System.out.println(desiredPerson);
            }
            System.out.println(desiredPerson.hashCode());
        }




    }



//        Acount[] acounts = {acount1, acount2, acount3, acount4, acount5, acount6};
//        Acount[] acountsPetrov = {acount1};
//        Acount[] acountIvanov = {acount2, acount3};
//        Acount[] acountsSidorov = {acount4,acount5, acount6};
//          printPerson(persons);
//          printAcount(acounts);
//          printAcounts(acounts);

//        HashMap <Person, Acount[]> client = new HashMap<>();
//        client.put(person1,acountsPetrov);
//        client.put(person2,acountIvanov);
//        client.put(person3,acountsSidorov);
//        System.out.println(client.equals(persons));




//        String findName = "Сидоров И.И.";
//        boolean billFound = client.containsKey(persons);
//        client.forEach((key, key2) -> {
//            if (key.getName().equals(findName)){
//                for (int i = 0; i < client.size() ; i++) {
////                    System.out.println(key.getName()+ " " + key2[i]);
//                }
//
//            }
//        });


//        int findBill = 116;
//        Boolean nameFound = client.containsKey(acounts);
//        client.forEach((key, key2) -> {
//            if (key.getName(findBill)){
//                System.out.println(key.getAge()+ "000 " + key2.toString());
//            }
//        });


//    }
//    private static void printPerson (Person[] persons){
//        System.out.println("Список клиентов: ");
//        for (Person person : persons) {
//            System.out.println(person.toString());
//        }
//        System.out.println();
//    }
//    private static void printAcount (Acount[] acounts){
//        System.out.println("Список счетов:");
//        for (Acount acount : acounts){
//            System.out.print(acount.toString()+ "; ");
//        }
//        System.out.println();
//    }

}
