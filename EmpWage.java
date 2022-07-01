package com.EmpWage;
import java.util.Random;

public class EmpWage {
    static int IS_FULL_DAY = 1;
    static int IS_ABSENT_TODAY = 0;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        Random random = new Random();
        int attendance = random.nextInt(2);


        if (attendance == IS_ABSENT_TODAY) {
            System.out.println("Employee is absent today");
        } else {
            System.out.println("Employee is Present today");
        }
    }
}
