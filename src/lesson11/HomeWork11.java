package lesson11;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
 * Написать метод, который преобразует массив в ArrayList;
 * Задача:
 * Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
 * Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 * Для хранения фруктов внутри коробки можно использовать ArrayList;
 * Сделать метод getWeight(), который высчитывает вес коробки,
 * зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
 * Внутри класса Box сделать метод compare(),
 * который позволяет сравнить текущую коробку с той,
 * которую подадут в compare() в качестве параметра. true – если их массы равны,
 * false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
 * Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
 * Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
 * Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
 * Не забываем про метод добавления фрукта в коробку.
 */

public class HomeWork11 {

    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5, 6};
        String[] arr2 = {"Hello " , "World " , "People " , "Negative "};
        doTask1(arr1, 0, 3);

        doTask2(arr2);
        test(doTask2(arr2));
        System.out.println(Arrays.toString(arr1));

        test(doTask2(arr1));

        System.out.println();
        System.out.println("=======================================");
        System.out.println();

        Fruit apple = new Apple();
        Fruit apple2 = new Apple();
        Fruit apple3 = new Apple();
        Fruit apple4 = new Apple();
        Fruit apple5 = new Apple();
        Fruit apple6 = new Apple();
        Orange[] orangeArr = {new Orange(), new Orange(), new Orange(), new Orange()};
        Box<Apple> box1 = new Box<>();
        Box<Orange> box2 = new Box<>();
        Box<Orange> box3 = new Box<>();
        Box<Fruit> box4 = new Box<>();
        Box<Apple> box5 = new Box<>();
        box1.put(apple);
        box1.put(apple2);
        box1.put(apple3);
        box1.put(apple4);
        box2.put(orangeArr);

        System.out.println("Вес первой коробки яблок: ");
        System.out.println(box1.getWeight());
        System.out.println("Вес второй коробки апельсинов: ");
        System.out.println(box2.getWeight());
        System.out.println("Сравниваем вес первой коробки яблок и второй коробки апельсинов: ");
        System.out.println(box1.compare(box2));
        box1.put(apple5);
        box1.put(apple6);
        System.out.println("Добавили ещё два яблока в первую коробку яблок: ");
        System.out.println("Вес первой коробки яблок: ");
        System.out.println(box1.getWeight());
        System.out.println("Вес второй коробки апельсинов: ");
        System.out.println(box2.getWeight());
        System.out.println("Сравниваем вес первой коробки яблок и второй коробки апельсинов: ");
        System.out.println(box1.compare(box2));

        box3.addFruit(new Orange(), 3);
        System.out.println(box3.getWeight());
        System.out.println(box4.getWeight());
        box3.pourToAnotherBox(box4);
        System.out.println(box3.getWeight());
        System.out.println(box4.getWeight());

        box3.compare(box1);

        box5.addFruit(new Apple(), 5);

        box1.compare(box5);


    }

    public static <A> A[] doTask1 (A[] arr, int changeableIndex, int modifiedIndex) {
        System.out.println("Source array: " + Arrays.toString(arr));
        A temp = arr[changeableIndex];
        arr[changeableIndex] = arr[modifiedIndex];
        arr[modifiedIndex] = temp;
        System.out.println("Converted array: " + Arrays.toString(arr));
        return arr;
    }

    public static <E> ArrayList<E> doTask2(E[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }

    public static void test(ArrayList arrayList){

    }



}
