package org.example.usecase.testdatabuilder;

import org.example.entities.ContractType;
import org.example.entities.Employee;
import org.example.entities.EmployeeHourly;
import org.example.entities.EmployeeMonthly;

public class MontlyEmployeeTestDataBuilder {
    private Integer id;
    private String name;
    private ContractType contractTypeName;
    private Integer roleId;
    private String roleName;
    private String roleDescription;
    private Long hourlySalary;
    private Long monthlySalary;
    private Long totalSalary;

    public MontlyEmployeeTestDataBuilder() {
        this.id = 2;
        this.name = "Juan";
        this.contractTypeName = ContractType.MonthlySalaryEmployee;
        this.roleId = 2;
        this.roleName = "Contractor";
        this.roleDescription = "roleDescription";
        this.hourlySalary = 10000L;
        this.monthlySalary = 50000L;
        this.totalSalary = 0L;
    }

    public MontlyEmployeeTestDataBuilder conId(Integer id) {
        this.id = id;
        return this;
    }

    public MontlyEmployeeTestDataBuilder conName(String name) {
        this.name = name;
        return this;
    }

    public MontlyEmployeeTestDataBuilder conContractTypeName(ContractType contractTypeName) {
        this.contractTypeName = contractTypeName;
        return this;
    }

    public MontlyEmployeeTestDataBuilder conRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    public MontlyEmployeeTestDataBuilder conRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    public MontlyEmployeeTestDataBuilder conRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
        return this;
    }

    public MontlyEmployeeTestDataBuilder conHourlySalary(Long hourlySalary) {
        this.hourlySalary = hourlySalary;
        return this;
    }

    public MontlyEmployeeTestDataBuilder conMonthlySalary(Long monthlySalary) {
        this.monthlySalary = monthlySalary;
        return this;
    }

    public MontlyEmployeeTestDataBuilder conTotalSalary(Long totalSalary) {
        this.totalSalary = totalSalary;
        return this;
    }

    public Employee build() {
        Employee employee = new EmployeeMonthly();
        employee.setId(this.id);
        employee.setName(this.name);
        employee.setContractTypeName(this.contractTypeName);
        employee.setRoleId(this.roleId);
        employee.setRoleName(this.roleName);
        employee.setRoleDescription(this.roleDescription);
        employee.setHourlySalary(this.hourlySalary);
        employee.setMonthlySalary(this.monthlySalary);
        employee.setTotalSalary(this.totalSalary);
        return employee;
    }
}
