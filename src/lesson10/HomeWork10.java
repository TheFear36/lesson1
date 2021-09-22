package lesson10;

import java.util.*;

/**
 * Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
 * Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
 * Посчитать, сколько раз встречается каждое слово.
 *
 * Написать простой класс Телефонный Справочник
 * , который хранит в себе список фамилий и телефонных номеров.
 * В этот телефонный справочник с помощью метода add() можно добавлять записи,
 * а с помощью метода get() искать номер телефона по фамилии.
 * Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
 * тогда при запросе такой фамилии должны выводиться все телефоны.
 * Желательно не добавлять лишний функционал
 * (дополнительные поля (имя, отчество, адрес),
 * взаимодействие с пользователем через консоль и т.д).
 * Консоль использовать только для вывода результатов проверки телефонного справочника.
 */

public class HomeWork10 {

    public static void main(String[] args) {

        String[] arr = {"Hello", "Hello", "World", "People", "World", "Witcher", "People", "Garry",
                "People", "Animals", "Processor", "Work", "Jungle", "Back", "Hello"};

       /* doTask1(arr);
        doTask1_2(arr);*/
        doTask2();

    }

    static void doTask1(String[] arr) {
     Set<String> newSet = new HashSet<>(Arrays.asList(arr));
        System.out.println(newSet);
    }

    static void doTask1_2(String[] arr) {
        Map<String, Integer> newHashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (newHashMap.containsKey(arr[i]))
                newHashMap.put(arr[i], newHashMap.get(arr[i]) + 1);
            else
                newHashMap.put(arr[i], 1);
        }
        for (Map.Entry <String, Integer> item : newHashMap.entrySet()) {
            System.out.println("The word: " + item.getKey() + " - is repeated " + item.getValue() + " times");
        }
    }

    static void doTask2() {
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        phoneDirectory.add("Goodspeed", "89996351323");
        phoneDirectory.add("Jameson", "89038097718");
        phoneDirectory.add("Smith", "89955631658");
        phoneDirectory.add("Rodgers", "89036958974");
        phoneDirectory.add("Skywalker", "89966351525");
        phoneDirectory.add("Goodspeed", "89457893265");
        phoneDirectory.add("Smith", "89605687859");
        phoneDirectory.add("Skywalker", "8800553535");
        phoneDirectory.add("Smith", "89005055050");

        System.out.println(phoneDirectory.get("Goodspeed"));
        System.out.println(phoneDirectory.get("Smith"));
        System.out.println(phoneDirectory.get("Skywalker"));
        System.out.println(phoneDirectory.get("Rodgers"));
    }


}







