// welcome to employee wage computation program
package com.company;

public class Main {

        public static void main(String[] args) {
            int PER_HOUR_WAGE = 20;
            int WORKING_HOURS = 0;
            final int IS_FULL_TIME_EMP = 1;
            final int IS_PART_TIME_EMP = 2;
            int random = (int) Math.floor(Math.random() * 10) % 3;
            switch (random) {

                case IS_FULL_TIME_EMP:
                    WORKING_HOURS = 8;
                    System.out.println("Full time employee is present");
                    break;
                case IS_PART_TIME_EMP:
                    WORKING_HOURS = 8;
                    System.out.println("Part time employee is present");
                    break;
                default:
                    WORKING_HOURS = 0;
                    System.out.println("Employee is absent");
            }
            int daily_wage = PER_HOUR_WAGE * WORKING_HOURS;
            System.out.println("today wage is : " + daily_wage);
    }
}
