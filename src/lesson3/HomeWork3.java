package lesson3;

/*Написать программу, которая загадывает случайное число от 0 до 9
 и пользователю дается 3 попытки угадать это число.
  При каждой попытке компьютер должен сообщить,
   больше ли указанное пользователем число, чем загаданное, или меньше.
    После победы или проигрыша выводится запрос –
    «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {

       // guesWord();

        gameGuesNumber();

    }

    static void gameGuesNumber() {
        Scanner scan = new Scanner(System.in);
        game();
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        reStart();

    }

    static void game() {
        Random random = new Random(); // Выделяю память под класс рандом
        Scanner scan = new Scanner(System.in); // Выделяю память под класс сканер
        int lifePoint = 3; // Ввёл переменную, которая будет считать жизни(циклы)
        int guesNam = random.nextInt(10); // Создаю переменную в которую присваиваю значение от нуля до девяти
        System.out.println("Комьютер загадал случайно число от 0 до 9ти, попробуй угадать что это за число. У вас есть " + lifePoint + " попыток");
        int guessedNam = scan.nextInt(); // Создаю переменную в которой сохранится число которое ввел пользователь через консоль

        while (lifePoint > 0) {

            if (lifePoint == 0) {
                break;
            }

            if (guessedNam == guesNam) {
                System.out.println("Верно! Загаданное число " + guesNam);
                lifePoint = 0;
            } else if (guessedNam < guesNam) {
                System.out.println(guessedNam + " меньше загаданного числа!");
                lifePoint--;
                if (lifePoint == 0) {
                    break;
                }
                System.out.println("Количество попыток " + lifePoint);
                guessedNam = scan.nextInt();
            } else if (guessedNam > guesNam) {
                System.out.println(guessedNam + " больше загаданного числа!");
                lifePoint--;
                if (lifePoint == 0) {
                    break;
                }
                System.out.println("Количество попыток " + lifePoint);
                guessedNam = scan.nextInt();
            } else if (guessedNam < 0 || guessedNam > 9) {
                System.out.println("Ваше число вне значений игры");
                lifePoint--;
                if (lifePoint == 0) {
                    break;
                }
                System.out.println("Количество попыток " + lifePoint);
                guessedNam = scan.nextInt();
            }
        }
    }

    static void reStart() {
        Scanner scan = new Scanner(System.in);

        int reStart = scan.nextInt();
        while (reStart == 1) {
            if (reStart == 1) {
                game();
            } else if (reStart == 0) {
                System.out.println("Спасибо за игру!");
            } else {
                System.out.println("Введено некорректное значение");
                reStart = scan.nextInt();
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            reStart = scan.nextInt();
        }
    }

    /*Создать массив из слов:
String[] words =
{"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
При запуске программы компьютер загадывает слово,
 запрашивает ответ у пользователя,
 сравнивает его с загаданным словом
  и сообщает, правильно ли ответил пользователь.
   Если слово не угадано, компьютер показывает буквы,
    которые стоят на своих местах.
apple – загаданное
apricot - ответ игрока
ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
Для сравнения двух слов посимвольно можно пользоваться:
String str = "apple";
char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
Играем до тех пор, пока игрок не отгадает слово.
Используем только маленькие буквы.
     */


    static void guesWord() {
        Random rand = new Random(); // Создаю класс рандомизации
        Scanner scan = new Scanner(System.in); // Создаю класс считывания введеных данных в консоль
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println(Arrays.toString(words)); // Вывожу массив слов среди которых будет выбирать компьютер
        String guessedWord; // Добавляю переменную в которую буду присваивать значение введеное пользоваталем
        int iGuesWord = rand.nextInt(words.length); // Добавляю индекс загаданного слова
        System.out.println("Компьютер загадал слово");
        System.out.println(words[iGuesWord]);  // Вывожу загаданное слово для удобства работы и работы над ошибками
        char[] arrayGuesWord = words[iGuesWord].toCharArray(); // Преобразовываю слово в массив символов для дальнейшего сравнения
        char[] fieldGuessedWord = new char[15]; // Создаю массив который будет отображать угаданные символы
        for (int i = 0; i < fieldGuessedWord.length; i++) { // И присваиваю ему изначальные значения в виде #
            fieldGuessedWord[i] = '#';
        }

        while (true) { // Создаю цикл игры
            System.out.println("Введите слово");
            guessedWord = scan.nextLine(); // Считываю слово введеное пользователем
            char[] arrayGuessedWord = guessedWord.toCharArray(); // Преобразовываю его в массив чаров для дальнейшего сравнения
            if (guessedWord.equals(words[iGuesWord])) { // Если загаданное слово и введеное одинаковы(еквивалентны)
                System.out.println("Вы угадали!");
                break; // То выхожу из игры
            } else { // В противном случае
                System.out.println("Вы не угадали!");
                for (int i = 0; i < arrayGuesWord.length; i++) { // Бежим по всем элементам загаданного слова
                    if (i >= arrayGuessedWord.length) { // Если выходим за рамки,
                        break; // То сбрасываем во избежание ошибок индексации
                    }
                    if (arrayGuessedWord[i] == arrayGuesWord[i]) { // Если n-ный элемент введеного слова пользователя равен n-ному элементу загаданного слова
                        fieldGuessedWord[i] = arrayGuessedWord[i]; // То выводим это на показываемое поле
                    }
                }
                System.out.println(fieldGuessedWord); // Выводим показываемое поле
            }
        }
    }
}

