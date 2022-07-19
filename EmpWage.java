package com.EmpWage;
import java.util.ArrayList;
import java.util.Random;

public class EmpWage implements EmpWageBuilder{
    private static final int ABSENT_DAY_HOUR = 0;
    private static final int FULL_DAY_HOUR = 8;
    private static final int HALF_DAY_HOUR = 4;
    static final int IS_FULL_DAY = 1;
    static final int IS_HALF_DAY = 2;
    public int total_empl_hours;

    ArrayList<CompanyEmpWage> list = new ArrayList<>();
    static CompanyEmpWage companyEmpWage1 = new CompanyEmpWage();

    private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth){
        companyEmpWage1.setCompany(company);
        companyEmpWage1.setEMP_WAGE_PER_HOUR(empRatePerHour);
        companyEmpWage1.setMAX_WORKING_HOURS(maxHoursPerMonth);
        companyEmpWage1.setNUM_OF_WORKING_DAYS(numOfWorkingDays);
        list.add(companyEmpWage1);
        computeEmpWage(list);
    }


    public void computeEmpWage(ArrayList<CompanyEmpWage> companyEmpWages){
        Random random = new Random();
        int attendance;
        int total_working_days=0;

        while ( total_empl_hours <= companyEmpWage1.getMAX_WORKING_HOURS() && total_working_days < companyEmpWage1.getNUM_OF_WORKING_DAYS()) {
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
        companyEmpWage1.setTotal_empl_wage(total_empl_hours*companyEmpWage1.getEMP_WAGE_PER_HOUR());
    }
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        EmpWage empWage = new EmpWage();
        empWage.addCompanyEmpWage("DMart", 20, 2, 10);
        System.out.println(companyEmpWage1.toString());
        empWage.addCompanyEmpWage("TATA", 40, 4, 20);
        System.out.println(companyEmpWage1.toString());

    }
}
