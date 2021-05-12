package org.example.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.entities.ContractType;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
    private Integer id;
    private String name;
    private ContractType contractTypeName;
    private Integer roleId;
    private String roleName;
    private String roleDescription;
    private Long hourlySalary;
    private Long monthlySalary;
}
