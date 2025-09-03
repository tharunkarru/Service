package com.tharun.StudentService.Vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}