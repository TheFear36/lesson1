package lesson8;

/**
 * СОЗДАТЬ КЛАССЫ, КОТОРЫЕ НЕ НАСЛЕДУЮТСЯ ОТ ОДНОГО КЛАССА
 * МММ, ВКУСНО.
 * ЗДРАВСТВУЙТЕ ТРИ ОДИНАКОВЫХ КЛАССА С ОТЛИЧИЕМ ЛИШЬ В КОНСТРУКТОРЕ.
 */

public class HomeWork8 {

    public static void main(String[] args) {


        Participant[] participants = {
                new Cat("Chivos", 50, 2),
                new Human("Rick", 500, 1),
                new Robot("Bender", 1000, 10)
        };

        Challenge[] challenge = {
                new Wall(1),
                new Track(40),
                new Wall(3),
                new Wall(2),
                new Track(100),
                new Track(520)
        };

        /*for (Participant item : participants) {
            for (Challenge value : challenge) {
                value.start(item);
            }
        }*/

        for (Participant participant : participants) {
            System.out.println("Наш участник: " + participant);
            for (Challenge value : challenge) {
                System.out.println(value);
                if (value.startTest(participant)) {
                    System.out.println(participant + " преодолел испытание");
                } else {
                    System.out.println(participant + " не справился с испытанием и выбывает из состязания");
                    break;
                }
            }
            System.out.println();
        }

    }


}
