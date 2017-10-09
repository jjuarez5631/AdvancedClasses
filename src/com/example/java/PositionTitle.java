package com.example.java;

public enum PositionTitle {
    //each holds the string of the position title.
        ADMINISTRATION("Administration"), PRODUCTION("Production"), SALES("Sales"), MAINTENANCE("Maintenance"), TECHNICAL("Technical"), SECRETARIAL("Technical");

        //string conversion to display lower case string values.
    private String name;

    PositionTitle(String name) {
        this.name = name;
    }
        //used
    @Override
    public String toString() {
        return name;
    }
}
