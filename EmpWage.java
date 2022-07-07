package com.EmpWage;
import java.util.Random;

public class EmpWage {
    private static final int ABSENT_DAY_HOUR = 0;
    private static final int FULL_DAY_HOUR = 8;
    private static final int HALF_DAY_HOUR = 4;
    static final int IS_FULL_DAY = 1;
    static final int IS_HALF_DAY = 2;

    private String company;
    private final int MAX_WORKING_HOURS;
    private final int NUM_OF_WORKING_DAYS;
    private final int EMP_WAGE_PER_HOUR;
    public int total_empl_wage;
    public int total_empl_hours;

    public EmpWage(String company, int maxWorkingHours, int numOfWorkingDays, int empWagePerHour) {
        this.company = company;
        this.MAX_WORKING_HOURS = maxWorkingHours;
        this.NUM_OF_WORKING_DAYS = numOfWorkingDays;
        this.EMP_WAGE_PER_HOUR = empWagePerHour;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        EmpWage dMart = new EmpWage("DMart", 20, 5, 25);
        dMart.calculateEmpWage();
        System.out.println(dMart.toString());
        EmpWage tata = new EmpWage("TATA", 20, 4, 40);
        tata.calculateEmpWage();
        System.out.println(tata.toString());

    }
    public void calculateEmpWage(){
        Random random = new Random();
        int attendance;
        int total_working_days=0;

        while ( total_empl_hours <= MAX_WORKING_HOURS && total_working_days < NUM_OF_WORKING_DAYS) {
            attendance = random.nextInt(3);
            switch (attendance) {
                case IS_FULL_DAY:
                    total_empl_hours += FULL_DAY_HOUR;
                    total_working_days++;
                    break;
                case IS_HALF_DAY:
                    total_empl_hours += HALF_DAY_HOUR;
                    total_working_days++;
                    break;
                default:
                    total_empl_hours = ABSENT_DAY_HOUR;
            }
        }
        total_empl_wage += EMP_WAGE_PER_HOUR * total_empl_hours;
//        System.out.println("Total working days "+total_working_days);
//        System.out.println("Total working hours "+total_empl_hours);
//        System.out.println("Total wage for the month:- " + total_empl_wage);

    }

    @Override
    public String toString(){
        return "Total emp wage for company "+company+" is "+total_empl_wage;
    }
}

