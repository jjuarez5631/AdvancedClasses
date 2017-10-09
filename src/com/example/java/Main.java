package com.example.java;

public class Main {

    public static void main(String[] args) {


        Employee emp1 = new Employee("John Doe", PositionTitle.ADMINISTRATION, true, 27.00, 1, "3/6/2015");
        Employee emp2 = new Employee("John Smith",PositionTitle.MAINTENANCE, false, 21.00, 3, "11/12/2005");
        Employee emp3 = new Employee("Larry Jackson",PositionTitle.PRODUCTION, false, 22.00, 2, "11/12/2005");

        //call the classes to print all the information of an employee
        emp1.printAll();
        //call the calculate method in the employees class
        emp1.calculate(45);
        emp2.printAll();
        emp2.calculate(35);
        emp3.printAll();
        emp3.calculate(50);
    }
}
