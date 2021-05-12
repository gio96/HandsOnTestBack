package org.example.factory;

import org.example.entities.ContractType;
import org.example.entities.Employee;
import org.example.entities.EmployeeHourly;
import org.example.entities.EmployeeMonthly;

public class EmployeeFactory {

    public Employee getEmployeeInstance(ContractType contractType){
        switch (contractType){
            case HourlySalaryEmployee:
                return new EmployeeHourly();
            case MonthlySalaryEmployee:
                return new EmployeeMonthly();
            default:
                return null;
        }
    }

}
