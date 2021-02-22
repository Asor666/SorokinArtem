package com.sorokinartem.anderson.firsttask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstTask {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        int number = Integer.parseInt(reader.readLine());
        if (number>7) {
            System.out.println("Привет");
            
        }

    }
}
