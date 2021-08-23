package lesson6;

/*
Создать классы Собака и Кот с наследованием от класса Животное.
        Все животные могут бежать и плыть.
         В качестве параметра каждому методу передается длина препятствия.
         Результатом выполнения действия будет печать в консоль.
         (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
        У каждого животного есть ограничения на действия
        (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
        * Добавить подсчет созданных котов, собак и животных.
*/

public class HomeWork6 {
    public static void main(String[] args) {
        Animals[] animals = {
                new Dog("Бобик"),
                new Dog("Чарли"),
                new Cat("Чивос"),
                new Cat("Барсик")
        };

        System.out.println("Сегодня у нас выступают: ");


        for (Animals animal : animals) {
            animal.getCountInteractive();
        }
        System.out.println();

        for (Animals animal : animals) {
            animal.run(150);
        }
        System.out.println();

        for (Animals animal : animals) {
            animal.run(450);
        }
        System.out.println();

        for (Animals animal : animals) {
            animal.swim(7);

        }

       /* Animals dogBob = new Dog("Бобик");
        Animals dogChar = new Dog("Чарли");
        Animals catChiv = new Dog("Чивос");
        Animals catBars = new Dog("Барсик");

        System.out.println("Сегодня у нас выступают: ");
        dogBob.getCountInteractive();
        dogChar.getCountInteractive();
        catChiv.getCountInteractive();
        catBars.getCountInteractive();

        dogBob.run(150);
        dogChar.run(150);
        catChiv.run(150);
        catBars.run(150);*/

    }
}
