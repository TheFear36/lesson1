package lesson12;


/**
 * Необходимо написать два метода, которые делают следующее:
 * 1) Создают одномерный длинный массив, например:
 * static final int SIZE = 10 000 000;
 * static final int HALF = size / 2;
 * float[] arr = new float[size].
 *
 * 2) Заполняют этот массив единицами.
 * 3) Засекают время выполнения: long a = System.currentTimeMillis().
 * 4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
 *
 * arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
 *
 *
 * 5) Проверяется время окончания метода System.currentTimeMillis().
 * 6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a).
 *
 * Отличие первого метода от второго:
 * Первый просто бежит по массиву и вычисляет значения.
 * Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и потом склеивает эти массивы обратно в один.
 *
 * Пример деления одного массива на два:
 * System.arraycopy(arr, 0, a1, 0, h);
 * System.arraycopy(arr, h, a2, 0, h).
 *
 * Пример обратной склейки:
 * System.arraycopy(a1, 0, arr, 0, h);
 * System.arraycopy(a2, 0, arr, h, h).
 *
 * Примечание:
 * System.arraycopy() — копирует данные из одного массива в другой:
 * System.arraycopy(массив-источник, откуда начинаем брать данные из массива-источника, массив-назначение, откуда начинаем записывать данные в массив-назначение, сколько ячеек копируем)
 * По замерам времени:
 * Для первого метода надо считать время только на цикл расчета:
 * for (int i = 0; i < size; i++) {
 *    arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
 * }
 *
 *
 * Для второго метода замеряете время разбивки массива на 2, просчета каждого из двух массивов и склейки.
 */

public class HomeWork12 {

    static final int SIZE = 10000000;


    public static void main(String[] args) {

        firstMethod();
        secondMethod();

    }

    public static void firstMethod() {
        float[] arr = new float[SIZE];
        fillingUno(arr);

        long time = System.currentTimeMillis();

        formula(arr);

        System.out.print("Linear counting: ");
        System.out.println(System.currentTimeMillis() - time);

    }

    public static void secondMethod() {

        final int HALF = SIZE / 2;

        float[] arr = new float[SIZE];
        fillingUno(arr);

        float[] firstHalfArr = new float[HALF];
        float[] secondHalfArr = new float[HALF];

        long time = System.currentTimeMillis();

        System.arraycopy(arr, 0 , firstHalfArr, 0 , HALF);
        System.arraycopy(arr, HALF , secondHalfArr, 0 , HALF);

        MyThread threadOne = new MyThread(firstHalfArr);
        MyThread threadTwo = new MyThread(secondHalfArr);

        threadOne.start();
        threadTwo.start();

        try {
            threadOne.join();
            threadTwo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(firstHalfArr, 0 , arr, 0, HALF);
        System.arraycopy(secondHalfArr, 0 , arr, HALF, HALF);

        System.out.print("Multi counting: ");
        System.out.println(System.currentTimeMillis() - time);

    }

    static class MyThread extends Thread {

        private final float[] arr;

        public MyThread(float[] arr) {
            this.arr = arr;
        }

        @Override
        public void run() {
           formula(arr);
        }

    }
    static float[] fillingUno(float[] arr) {

        for (float item : arr) {
            item = 1;
        } return arr;

    }

    static float[] formula(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        } return arr;
    }

}
