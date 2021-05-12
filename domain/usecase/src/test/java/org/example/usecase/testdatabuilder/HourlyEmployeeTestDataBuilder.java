package org.example.usecase.testdatabuilder;

import org.example.entities.ContractType;
import org.example.entities.Employee;
import org.example.entities.EmployeeHourly;

public class HourlyEmployeeTestDataBuilder {
    private Integer id;
    private String name;
    private ContractType contractTypeName;
    private Integer roleId;
    private String roleName;
    private String roleDescription;
    private Long hourlySalary;
    private Long monthlySalary;
    private Long totalSalary;

    public HourlyEmployeeTestDataBuilder() {
        this.id = 1;
        this.name = "Berta";
        this.contractTypeName = ContractType.HourlySalaryEmployee;
        this.roleId = 1;
        this.roleName = "Contractor";
        this.roleDescription = "roleDescription";
        this.hourlySalary = 10000L;
        this.monthlySalary = 50000L;
        this.totalSalary = 0L;
    }

    public HourlyEmployeeTestDataBuilder conId(Integer id) {
        this.id = id;
        return this;
    }

    public HourlyEmployeeTestDataBuilder conName(String name) {
        this.name = name;
        return this;
    }

    public HourlyEmployeeTestDataBuilder conContractTypeName(ContractType contractTypeName) {
        this.contractTypeName = contractTypeName;
        return this;
    }

    public HourlyEmployeeTestDataBuilder conRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    public HourlyEmployeeTestDataBuilder conRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    public HourlyEmployeeTestDataBuilder conRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
        return this;
    }

    public HourlyEmployeeTestDataBuilder conHourlySalary(Long hourlySalary) {
        this.hourlySalary = hourlySalary;
        return this;
    }

    public HourlyEmployeeTestDataBuilder conMonthlySalary(Long monthlySalary) {
        this.monthlySalary = monthlySalary;
        return this;
    }

    public HourlyEmployeeTestDataBuilder conTotalSalary(Long totalSalary) {
        this.totalSalary = totalSalary;
        return this;
    }

    public Employee build() {
        Employee employee = new EmployeeHourly();
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
