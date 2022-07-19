package com.EmpWage;

public class CompanyEmpWage {
    public String company;
    private int MAX_WORKING_HOURS;
    private int NUM_OF_WORKING_DAYS;
    private int EMP_WAGE_PER_HOUR;
    public int total_empl_wage;
    public CompanyEmpWage() {
    }

    public CompanyEmpWage(String company, int MAX_WORKING_HOURS, int NUM_OF_WORKING_DAYS, int EMP_WAGE_PER_HOUR) {
        this.company = company;
        this.MAX_WORKING_HOURS = MAX_WORKING_HOURS;
        this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
        this.EMP_WAGE_PER_HOUR = EMP_WAGE_PER_HOUR;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getMAX_WORKING_HOURS() {
        return MAX_WORKING_HOURS;
    }

    public void setMAX_WORKING_HOURS(int MAX_WORKING_HOURS) {
        this.MAX_WORKING_HOURS = MAX_WORKING_HOURS;
    }

    public int getNUM_OF_WORKING_DAYS() {
        return NUM_OF_WORKING_DAYS;
    }

    public void setNUM_OF_WORKING_DAYS(int NUM_OF_WORKING_DAYS) {
        this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
    }

    public int getEMP_WAGE_PER_HOUR() {
        return EMP_WAGE_PER_HOUR;
    }

    public void setEMP_WAGE_PER_HOUR(int EMP_WAGE_PER_HOUR) {
        this.EMP_WAGE_PER_HOUR = EMP_WAGE_PER_HOUR;
    }

    public int getTotal_empl_wage() {
        return total_empl_wage;
    }

    public void setTotal_empl_wage(int total_empl_wage) {
        this.total_empl_wage = total_empl_wage;
    }
    @Override
    public String toString(){
        return "Total emp wage for company "+company+" is "+total_empl_wage;
    }
}

