package org.example.entities;

public class EmployeeHourly extends Employee {
    private static final Integer AMOUNT_HOURLY_SALARY = 120;
    private static final Integer AMOUNT_MONTHS = 12;

    @Override
    public void calculateTotalSalary() {
        this.setTotalSalary(AMOUNT_HOURLY_SALARY * this.getHourlySalary() * AMOUNT_MONTHS);
    }
}
