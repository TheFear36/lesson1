package lesson1;

public class HomeWork {

    public static void main(String[] args) {
       /* byte var1 = 127;
        short var2 = 32767;
        int var3 = 2147483647;
        long var4 = 922337289;

        char varChar = 'Ø';

        float var5 = 123.12356f;
        double var6 = 98.123456789;

        boolean isTrue = true; */ // Первое задание

        System.out.println(arifmeticalResult(7, 2, 3, 4)); // Применение метода который арифмитических вычислений и вывод их в консоль

        System.out.println(summWithin(4, 7));
        System.out.println(summWithin(1, 3));

        positiveOrNegative(15);
        positiveOrNegative(-87);

        System.out.println( reversPositive(5));
        System.out.println(reversPositive(-5));

        helloUser("Глеб");

        highGradeYear(2021);
        highGradeYear(600);
        highGradeYear(2020);
        highGradeYear(2400);


    }
    static double arifmeticalResult(float a, float b, float c, float d) {// Метод, который возвращает результат арифмитических вычислений
        double result = a * (b + (c / d));
        return result;
    }
    static boolean summWithin (int summandOne, int summandTwo){ // Метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
        int sum = summandOne + summandTwo;
        return sum >= 10 && sum <=20;
    }
    static void positiveOrNegative(int value) {//Mетод, которому в качестве параметра передается целое число,и печатает в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
        if(value >= 0) {
            System.out.println("Value1 is positive");
        } else {
            System.out.println("Value is negative");
        }
    }
    static boolean reversPositive(int value) {//Метод, которому в качестве параметра передается целое число. Метод возвращает true, если число отрицательное, и возвращает false если положительное.
        if (value >= 0) {
            return false;
        } return true;
    }
    static void helloUser (String userName) {
        System.out.println("Привет, " + userName + "!");//Метод, которому в качестве параметра передается строка, обозначающая имя. Метод выводит в консоль сообщение «Привет, указанное_имя!».
    }
    static void highGradeYear (int year) {//Метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        int a = year%4;
        int b = year%100;
        int c = year%400;
        if (c == 0) {
            System.out.println("Year " + year + " = high-grade year");
        } else if (b == 0){
            System.out.println("Year " + year + " = is not high-grade year");
        } else if (a== 0) {
            System.out.println("Year " + year + " = high-grade year");
        } else {System.out.println("Year " + year + " = is not high-grade year");}
    }

}
