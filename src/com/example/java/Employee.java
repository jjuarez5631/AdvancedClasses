package com.example.java;

public class Employee {
    private PositionTitle positionName;


    //create variables for the employees
    private String name;
    private boolean salary;
    private double payRate;
    private int shift;
    private String startDate;
    private double totalPay;

        //constructor
    public Employee(String name, PositionTitle positionName, boolean salary, double payRate, int shift, String startDate) {
        this.name = name;
        this.positionName = positionName;
        this.salary = salary;
        this.payRate = payRate;
        this.shift = shift;
        this.startDate = startDate;
    }
        //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

        //enum class for PositionTitle
    public PositionTitle getPosition() {return positionName; }

    public void setPosition(PositionTitle position) { this.positionName = position;}


    public boolean getSalary() {
        return salary;
    }

    public void setSalary(boolean salary) {
        this.salary = salary;
    }


    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
        //prints all the information to the display
    public void printAll() {
        System.out.println("\n" + name + "\n" + positionName + " is salary: " + salary);
        System.out.println("Rate of pay is: $" + payRate + " per hour");
        System.out.println("Shift: " + shift);
    }
        //method for accepting the hours and calculation of pay.
    void calculate(double hours) {
        double updatePayRate = 0;
        double overtimeHours;
        double overtimePay = 0;

            //shift determines the type of pay for each employee depending on shift
        switch (shift) {
            case 1 :
                updatePayRate = payRate;
                break;
            case 2:
                updatePayRate = (payRate * .05) + payRate;
                break;
            case 3:
                updatePayRate = (payRate * .10) + payRate;
        }

            //salary employees dont get benefits of overtime
        if (salary == true){
            totalPay = updatePayRate * 40;
        }else {     //employees who aren't on salary may get overtime after 40 hours.
            if (hours <= 40){
                totalPay = updatePayRate * hours;
            }
            else {      //overtime is at normal pay so 2 or 3rd shift benefits are for the 40 standard hours.
                overtimeHours = hours - 40;
                totalPay = 40 * updatePayRate;
                overtimePay = payRate * overtimeHours;
                totalPay = overtimePay + totalPay;

            }
        }
            //will display the amount earned this week.
        System.out.println(name + " earned $" + totalPay + " this week.");
    }
}
