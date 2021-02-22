package com.sorokinartem.anderson.firsttask;

public class ThirdTask {
    public static void main(String[] args) {
        int [] arr = new int[20]; /*создаем массив*/
        System.out.println("Массив случайных чисел:");
        for (int i = 0;i<arr.length;i++){  /*заполняем массив случайными числами*/
            arr[i] = (int) (Math.random()*100);
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nЧисла кратные числу 3:");
        for (int number:arr){ /*выводим числа массива кратные 3-ём*/
            if (number%3==0) System.out.print(number + " ");
        }

    }
}
