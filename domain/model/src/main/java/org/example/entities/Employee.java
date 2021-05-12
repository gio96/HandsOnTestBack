package org.example.entities;

import lombok.Data;

@Data
public abstract class Employee {
    private Integer id;
    private String name;
    private ContractType contractTypeName;
    private Integer roleId;
    private String roleName;
    private String roleDescription;
    private Long hourlySalary;
    private Long monthlySalary;
    private Long totalSalary;

    public abstract void calculateTotalSalary();
}
