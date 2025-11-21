package com.karthikProject.cacheImpl_DepartmentService.Models;

import jakarta.persistence.Column;
import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class DepartmentDTO {
    private int id;
    private String name;
    private ArrayList<Integer> empId;
}
