package TwoLesson2;

import java.util.Arrays;

public class TryCatch {

    public static void main(String[] args) {

        String[][] goodarray = {
                {"3", "2", "3", "4"},
                {"4", "6", "3", "7"},
                {"1", "1", "32", "3"},
                {"44", "22", "11", "0"}

        };
        String[][] threerray = {
                {"1", "2", "3"},
                {"4", "6", "3"},
                {"1", "1", "32"},
                {"44", "22", "11"}

        };
        String[][] symbolarray = {
                {"1", "4", "3", "4"},
                {"шш", "6", "3", "7"},
                {"1", "ee", "32", "3"},
                {"44", "22", "11", "]"}

        };


        try {
             ArraySizeException (symbolarray);
        } catch (МуArrayStoreException e){
            System.out.println("Массив не того размера");

        }
            try {
                System.out.println("Сумма элементов равна " + ArrayDataException(symbolarray));
            } catch (MyArrayDataException e) {
                System.out.printf("ошибка ячейки %s %s \n", e.i, e.t);
            }

        info();
    }


    public static void ArraySizeException(String[][] arr) throws МуArrayStoreException {
        int a = arr.length;
        int b = arr[0].length;
        if (a != 4 || b !=4) {
            throw new МуArrayStoreException("Массив не того размера");
        }

    }
    public static int ArrayDataException (String [][] arr2) throws MyArrayDataException {
       int f=0;

        for (int i = 0; i < arr2.length; i++) {
            for (int t = 0; t < arr2.length; t++) {
                try {
                    f += Integer.parseInt(arr2[i][t]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка данных в ячейке", i, t);
                }
            }
        }
        return f;

    }
    public static void info() {
        System.out.println("End");
    }
}

