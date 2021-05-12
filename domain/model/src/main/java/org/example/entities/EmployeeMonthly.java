package org.example.entities;

public class EmployeeMonthly extends Employee{
    private static final Integer AMOUNT_MONTHS = 12;

    @Override
    public void calculateTotalSalary() {
        this.setTotalSalary(this.getMonthlySalary() * AMOUNT_MONTHS);
    }
}
