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

            while ((line = reader.readLine()) !=null) {
                String[] tokens = line.split("\\|");
                int employeeId = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);



            }
        } catch (IOException e) {

        }



    }
}
