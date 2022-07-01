package com.EmpWage;
import java.util.Random;

public class EmpWage {
    private static final int ABSENT_DAY_HOUR = 0;
    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOUR = 8;
    static int IS_ABSENT_TODAY = 0;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        Random random = new Random();
        int attendance = random.nextInt(2);

        int total_empl_wage=0;
        if (attendance == IS_ABSENT_TODAY) {
            System.out.println("Employee is absent today");
            total_empl_wage += WAGE_PER_HOUR*ABSENT_DAY_HOUR;
        } else {
            System.out.println("Employee is Present today");
            total_empl_wage += WAGE_PER_HOUR*FULL_DAY_HOUR;
        }
        System.out.println("Total wage:- "+total_empl_wage);
    }
}
