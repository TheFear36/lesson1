package lesson9;


import lesson9.MyExceprion.NonNumericValueException;
import lesson9.MyExceprion.MyArrayDataException;
import lesson9.MyExceprion.MyArraySizeException;

/**
 * Закомментированно интерактивное исправление ошибки вызванное неккоректным введением данных в массив
 * с непосредственной обработкой в мейне.
 * Сделано из собвственного интереса.
 */


 public class HomeWork9 {

     /*public static int x;
     public static int y;*/

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException, NonNumericValueException {
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"5", "f", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"},
        };

        //try {
            stringToIntArr4x4(arr);
        /*} catch (MyArrayDataException ex) {
            searchError(arr);
            stringToIntArr4x4(arr);
        }*/


    }

    public static void stringToIntArr4x4 (String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int[][] numArr = new int[4][4];
        int sumArr = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr.length != 4 || arr[i].length != 4) {
                    throw new MyArraySizeException("Out of the allowed range 4х4 : y = " + arr.length + "  x = " + arr[i].length);
                }
                try {
                    numArr[i][j] = Integer.parseInt(arr[i][j]);
                    sumArr += numArr[i][j];
                } catch (NumberFormatException e) {
                   /* x = i;
                    y = j;*/
                    throw new MyArrayDataException("Conversion is not possible : i = " + i + " j = " + j + ". There is a : " + arr[i][j]);
                }
            }
        }
        System.out.println(sumArr);
    }

    /*public static void searchError(String [][] arr) throws NonNumericValueException {
        System.err.println("A non-correct value is entered.");
        System.out.println("Enter a new value : ");
        Scanner scan = new Scanner(System.in);
        try {
            arr[x][y] = scan.nextLine();;
            try {
                Integer.parseInt(arr[x][y]);
            } catch (NumberFormatException e) {
                throw new NonNumericValueException("Non-numeric value!");
            }
        } catch (NonNumericValueException ex) {
            searchError(arr);
        }
    }*/


}
