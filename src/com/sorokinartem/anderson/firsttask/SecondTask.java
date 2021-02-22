package com.sorokinartem.anderson.firsttask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondTask {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите имя");

        String name = reader.readLine();
        String data = name.equals("Вячеслав") ? "Привет, " + name : "Нет такого имени";
        System.out.println(data);
    }
}
