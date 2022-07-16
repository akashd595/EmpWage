package com.EmpWage;
import java.util.Random;

public class EmpWage implements EmpWageBuilder{
    private static final int ABSENT_DAY_HOUR = 0;
    private static final int FULL_DAY_HOUR = 8;
    private static final int HALF_DAY_HOUR = 4;
    static final int IS_FULL_DAY = 1;
    static final int IS_HALF_DAY = 2;
    private int numOfCompany = 0;
    private CompanyEmpWage[] companyEmpWageArray;

    public EmpWage(){
        companyEmpWageArray = new CompanyEmpWage[5];

    }

    private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth){
        companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
        numOfCompany++;
    }
    private void computeEmpWage(){
        for (int i=0; i<numOfCompany; i++){
            companyEmpWageArray[i].setTotal_empl_wage(this.computeEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }

    public int total_empl_hours;

    public int computeEmpWage(CompanyEmpWage companyEmpWage){
        Random random = new Random();
        int attendance;
        int total_working_days=0;

        while ( total_empl_hours <= companyEmpWage.MAX_WORKING_HOURS && total_working_days < companyEmpWage.NUM_OF_WORKING_DAYS) {
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
        return total_empl_hours*companyEmpWage.EMP_WAGE_PER_HOUR;

    }

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        EmpWage empWage = new EmpWage();
        empWage.addCompanyEmpWage("DMart", 20, 2, 10);
        empWage.addCompanyEmpWage("TATA", 40, 4, 20);

        empWage.computeEmpWage();
    }
}
