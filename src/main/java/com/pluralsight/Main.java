package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String fileName = "C:\\Users\\aria\\AppData\\Local\\Temp\\employees.csv";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line;
            reader.readLine();

            while ((line = reader.readLine()) !=null) {
                if (line.trim().isEmpty()) continue;

                String[] tokens = line.split("\\|");

                int employeeId = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employee employee = new Employee(employeeId, name, hoursWorked, payRate);

                System.out.printf("ID: %d | Name: %-20s | Gross Pay: $%,.2f%n",
                        employee.getEmployeeId(),
                        employee.getName(),
                        employee.getGrossPay());
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Could not find or read the file: " + e.getMessage());
        }
    }
}
