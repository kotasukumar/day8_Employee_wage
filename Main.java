// welcome to employee wage computation program
package com.company;

public class Main {

        public static void main(String[] args) {
            int PER_HOUR_WAGE = 20;
            int WORKING_HOURS = 0;
            int IS_FULL_TIME_EMP = 1;
            int IS_PART_TIME_EMP = 2;
            double random = Math.floor(Math.random() * 10) % 3;
            if(random == IS_FULL_TIME_EMP){
                WORKING_HOURS = 8;
                System.out.println("full time Employee is present");
            }
            else if(random == IS_PART_TIME_EMP) {
                WORKING_HOURS = 8;
                System.out.println("Part time employee is present");
            }
            else{
                WORKING_HOURS = 0;
                System.out.println("Employee is absent");
            }
            int daily_wage = PER_HOUR_WAGE * WORKING_HOURS;
            System.out.println("today wage is : " + daily_wage);
    }
}
