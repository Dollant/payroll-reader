package com.pluarlsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String fileName = "src/main/resources/employees.csv";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line;

            reader.readLine();
        } catch (IOException e) {

        }



    }
}
