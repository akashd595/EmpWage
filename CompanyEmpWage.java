package com.EmpWage;

public class CompanyEmpWage {
    public String company;
    public final int MAX_WORKING_HOURS;
    public final int NUM_OF_WORKING_DAYS;
    public final int EMP_WAGE_PER_HOUR;
    public int total_empl_wage;
    public CompanyEmpWage(String company, int maxWorkingHours, int numOfWorkingDays, int empWagePerHour) {
        this.company = company;
        this.MAX_WORKING_HOURS = maxWorkingHours;
        this.NUM_OF_WORKING_DAYS = numOfWorkingDays;
        this.EMP_WAGE_PER_HOUR = empWagePerHour;
    }

    public void setTotal_empl_wage(int total_empl_wage) {
        this.total_empl_wage = total_empl_wage;
    }
    @Override
    public String toString(){
        return "Total emp wage for company "+company+" is "+total_empl_wage;
    }
}

