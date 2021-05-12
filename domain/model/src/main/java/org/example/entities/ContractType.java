package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public enum ContractType {
    HourlySalaryEmployee("HourlySalaryEmployee"),
    MonthlySalaryEmployee("MonthlySalaryEmployee");

    private String contractType;

    @Override
    public String toString() {
        return contractType;
    }
}
