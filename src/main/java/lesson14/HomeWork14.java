package lesson14;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class HomeWork14 {

    private static final Logger log = LogManager.getLogger(HomeWork14.class);

    public static void main(String[] args) {
        System.out.println(log);
        log.info("Start...");

        int[] arr = {1, 2, 3, 4, 2, 4, 4, 1, 7};
        int[] arr2 = {1, 1, 1, 4, 4, 4};
        log.info("Do task 1!");
        try {
            System.out.println(Arrays.toString(doTask1(arr2)));
        } catch (RuntimeException e) {
            log.warn("В массиве нет 4ок.", e);
        }
        log.info("Do task 2!");
        System.out.println(doTask2(arr));
        log.info("END");
    }

    public static int[] doTask1(int[] arr) {
        int lastIndexOf4 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                lastIndexOf4 = i + 1;
            }
        }
        if (lastIndexOf4 == 0) {
            throw new RuntimeException("Исключение для таски. Нет четверок");
        }

        return Arrays.copyOfRange(arr, lastIndexOf4, arr.length);
    }

    public static boolean doTask2(int[] arr) {
        int count1 = 0, count4 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count1++;
            } else if (arr[i] == 4) {
                count4++;
            } else return false;
        }
        return (count1 > 0 && count4 > 0);
    }

}