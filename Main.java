// welcome to employee wage computation program
package com.company;

public class Main {

    public static void main(String[] args) {
        int PER_HOUR_WAGE = 20;
        int WORKING_HOURS = 0;
        final int IS_FULL_TIME_EMP = 1;
        final int IS_PART_TIME_EMP = 2;
        int monthly_hours = 0;
        int total_working_days = 1;

        while (monthly_hours <=100 || total_working_days <=20){
            int random = (int) Math.floor(Math.random() * 10) % 3;
            switch (random) {

                case IS_FULL_TIME_EMP:
                    WORKING_HOURS = 8;
                    System.out.println("Full time employee is present");
                    total_working_days++;
                    break;
                case IS_PART_TIME_EMP:
                    WORKING_HOURS = 8;
                    System.out.println("Part time employee is present");
                    total_working_days++;
                    break;
                default:
                    WORKING_HOURS = 0;
                    System.out.println("Employee is absent");
            }
            monthly_hours = monthly_hours + WORKING_HOURS;
        }
        int monthly_wage = PER_HOUR_WAGE * monthly_hours;
        System.out.println("monthly wage is: " + monthly_wage);

    }
}