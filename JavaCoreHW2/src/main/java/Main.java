

/**
 * <img src="doc-files/img.png" alt="JavaCore"/>
 * @author SergeyIstomin
 * @version 1.1
 * HW2 to seminer JavaCore
 * Java Core (семинары)
 * Урок 2. Данные и функции
 * 1. Написать метод, возвращающий количество чётных элементов массива.
 * countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
 * 2. Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.
 * 3. Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
 */

public class Main {
    /**
     * Точка входа Main Class, проверка и запуск методов описанных в программе
     */
    public static void main(String[] args) {

        int[] arr1 = {2, 1, 2, 3, 4};
        int[] arr2 = {2, 2, 0};
        int[] arr3 = {1, 3, 5};
        int[] arr4 = {2, 0, 1, 2, 0, 0, 5};


        //region вывод задания 1
        System.out.println("Колличество четных элиментов в первом массиве: " + getEvenElements(arr1));
        System.out.println("Колличество четных элиментов во втором массиве: " + getEvenElements(arr2));
        System.out.println("Колличество четных элиментов в третьем массиве: " + getEvenElements(arr3));
        //endregion

        //region вывод задания 2
        System.out.println("Разница между самым большим и самым маленьким элементами: " + differenceMaxMin(arr1));
        System.out.println("Разница между самым большим и самым маленьким элементами: " + differenceMaxMin(arr2));
        System.out.println("Разница между самым большим и самым маленьким элементами: " + differenceMaxMin(arr3));
        //endregion

        //region вывод задания 3
        System.out.println("Соседи равны нулю: " + neighborsZero(arr1));
        System.out.println("Соседи равны нулю: " + neighborsZero(arr2));
        System.out.println("Соседи равны нулю: " + neighborsZero(arr3));
        System.out.println("Соседи равны нулю: " + neighborsZero(arr4));
        //endregion

    }

    //region Task1
    /**
     * Mетод, возвращающий количество чётных элементов массива
     * @param arr на вход массив
     * @return колличество четных элиментов
     */
    public static int getEvenElements(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 ==0)
                count++;
        }

        return count;
    }
//endregion
    //region Task2

    /**
     * Функция, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива
     * @param arr передаваемый массив
     * @return раздница
     */
    public static int differenceMaxMin(int[] arr){
        int min = arr[0];
        int max = arr[0];
        int difference = 0;
        for (int item: arr) {
            if(item < min) min = item;
            if(item > max) max = item;
        }
        difference = max - min;
        return difference;
    }
    //endregion
    //region Task3

    /**
     * Функция, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
     * @param arr передаваемый массив
     * @return возращаем правду или лож
     */
    public static boolean neighborsZero(int[] arr){
        /*boolean neighbors = false;
        for (int item: arr) {
            if(item == 0 && (item + 1) == 0) neighbors = true;

        }
        return neighbors;

         */
        boolean neighbors = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == 0) neighbors = true;
                }
            }
        }
        return neighbors;
    }
    //endregion

}
