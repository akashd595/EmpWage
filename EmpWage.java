package com.EmpWage;
import java.util.Random;

public class EmpWage {
    private static final int ABSENT_DAY_HOUR = 0;
    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOUR = 8;
    private static final int HALF_DAY_HOUR = 4;
    static final int IS_FULL_DAY = 1;
    static final int IS_ABSENT_TODAY = 0;
    static final int IS_HALF_DAY = 2;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        Random random = new Random();
        int attendance = random.nextInt(3);


        int total_empl_hours=0;
        int total_empl_wage=0;
        switch (attendance) {
            case IS_FULL_DAY :
                total_empl_hours = FULL_DAY_HOUR;
                break;
            case IS_HALF_DAY :
                total_empl_hours = HALF_DAY_HOUR;
                break;
            case IS_ABSENT_TODAY :
                total_empl_hours = ABSENT_DAY_HOUR;
                break;
            default:
                total_empl_hours = ABSENT_DAY_HOUR;
        }
        total_empl_wage += WAGE_PER_HOUR*total_empl_hours;
        System.out.println("Total wage:- "+total_empl_wage);
    }
}
