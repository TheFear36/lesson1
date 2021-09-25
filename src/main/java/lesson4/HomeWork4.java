package lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {

    public static void main(String[] args) {
        char[][] field = new char[3][3]; // Создаю массив
        createField(field);  // Превращаю массив в поле
        do { // Цикл игры
            turnUser(field); // Ход игрока
            drawField(field); // Рисую поле
            if (isDraw(field)) { // Если ничья
                System.out.println("This a Draw!");
                break; // Выхожу из цикла игры
            }
            if (isWin(field, 'X')) { // Если выполняется условие победы с символом Х, то победа игрока
                System.out.println("You are winner! =)");
                break; // Выхожу из цикла игры
            }
            turnAI(field); // Ход компьютера
            drawField(field); // Рисую поле
            if (isDraw(field)) { // Если ничья
                System.out.println("This a Draw!");
                break; // Выхожу из цикла игры
            }
            if (isWin(field, 'O')) { // Если выполняется условие победы с символом О, то победа компьютера
                System.out.println("You are looser! =(");
                break; // Выхожу из цикла игры
            }

        } while (true); // Выполняю цикл игры до тех пор пока не выполнится условие победы или ничьей

    }

    static void createField(char[][] field) { // Метод заполнения массива символами -
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = '-';
            }
        }
    }


    static void drawField(char[][] field) { // Метод который выводит текущее состояние поля в консоль
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    static void turnUser(char[][] field) { // Метод описывающий ход игрока
        int line, columns; // Создаю переменные которые отвечают за выбор линии и столбика
        do { // Делать ....
            line = getCoordinate(field, "line " , field.length); // Присваиваю переменной линии координату, получение которой указано в методе получения координаты
            columns = getCoordinate(field, "columns  ", field.length); // --\\--
        } while (isNotFreeCell(field, line, columns)); // Пока выбранные координаты не попадут на пустую клетку повторяю тело цикла
        field[line][columns] = 'X'; // Присваиваю в введеные координаты символ
    }


    static void turnAI(char[][] field) { // Ход компьютера
        Random random = new Random(); // Ввожу класс рандома
        int line, columns; // Создаю две переменные которые отвечают за координаты
        do { // Делать ....
            line = random.nextInt(field.length); // В координату линии присваиваю рандомное число в пределах максимальной длины массива
            columns = random.nextInt(field.length); // В координату столбика присваиваю рандомное число в пределах максимальной длинны массива
        }while (isNotFreeCell(field, line, columns)); // Пока сгенереированные координаты не попадут на пустую клетку повторять тело цикла
        field[line][columns] = 'O'; // Присвоение в сгенерированные координаты символ
    }


    static boolean isFreeCell(char[][] field , int line, int columns) { // Метод который проверяет свободная ли ячейка
        return field[line][columns] == '-';  // Если в координатах стоит символ, значит, считаем эту ячейку свободной
    }


    static boolean isNotFreeCell (char[][] field , int line, int columns) { //Метод который проверяет занятость ячейки
        return !isFreeCell(field, line, columns); // Если ячейка не свободна, значит выводим тру =)
    }


    static int getCoordinate(char[][] field, String coordName, int lenghtField) { // Метод создания координаты, указываем поле, имя координаты и длину поля
        int coord; // Ввожу переменную которой буду исключать значения за доступные пределы
        Scanner scanner = new Scanner(System.in); // Ввожу класс сканер для считывания информации с консоля
        do { // Делать ....
            System.out.printf("Turn to %s (1-%s)%n", coordName, lenghtField); // Выводу строку с флажками, в которые устанавливаю название координаты и длины поля
            coord = scanner.nextByte() - 1; // Присваиваю переменной считанное значение и вычитаю из неё единичку
        } while (coord < 0 || coord > field.length); // Выполнять до тех пор, пока не будут удовлетворены условия
        return coord; // Вернуть координату
    }


    static boolean isWin(char[][] field, char symbol) { // Метод условия победы
        boolean leftDiagonal = true; // Ввожу булеву переменную которая будет проверять левую диагональ и присваиваю ей значение тру, чтобы использовать двоичкную логику сложения
        boolean rightDiagonal = true; // --//-- правую диагональ --\\--
        boolean lines; // Ввожу булеву переменную которая будет проверять условия линий
        boolean columns; // ввожу булеву переменную которая будет проверять условия столбиков

        for (int i = 0; i < field.length; i++) { // Создаю итерациию
            leftDiagonal &= field[i][i] == symbol; // В которой проверяю все ли значения левой диагонали будут тру
        }
        if (leftDiagonal){ // Если да
            return true; // Возвращаю тру
        }

        for (int i = 0; i < field.length; i++) { // Создаю итерацию
            rightDiagonal &= field[i][field.length - i - 1] == symbol; // В которой проверяю значения в правой диагонали
        }
        if (rightDiagonal) { // Если да
            return true; // Возвращаю тру
        }

        for (int i = 0; i < field.length; i++) { // Создаю итерацию
            lines = true; // Присваиваю переменной линии значение тру для начала каждой следующей итерации линии для всех линий
            columns = true; // --//-- для всех столбиков
            for (int j = 0; j < field.length; j++) { // Создаю итерацию
                lines &= field[i][j] == symbol; // Проверяю линию
                columns &= field[j][i] == symbol; // Проверяю столбик
            }
            if (lines || columns) { // Если хотябы одна из линий или хотя бы один из столбиков будет тру
                return true; // Возвращаю тру
            }
        }
        return false; // Если ни одно условие не сработало вывожу фолс
    }


    static boolean isDraw(char[][] field) { // Проверка на ничью
        for (int i = 0; i < field.length; i++) { // Создаю итерацию
            for (int j = 0; j < field.length; j++) { // Которая пробегает по каждому элементу всего массива
                if (isFreeCell(field, i, j))   { // Если есть хоть одна свободная ячейкка
                    return false; // То вывожу фолс
                }
            }
        }
        return true; // Если свободных ячеек нет, то вывожу тру.
    }



}