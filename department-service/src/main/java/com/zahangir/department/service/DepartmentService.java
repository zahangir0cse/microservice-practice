package com.zahangir.department.service;

import com.zahangir.department.model.Department;

public interface DepartmentService {
    Department save(Department department);
    Department get(Long id);
}
