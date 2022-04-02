package com.zahangir.department.service.impl;

import com.zahangir.department.model.Department;
import com.zahangir.department.repository.DepartmentRepository;
import com.zahangir.department.service.DepartmentService;
import org.springframework.stereotype.Service;

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Department save(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department get(Long id) {
        return departmentRepository.findById(id).orElse(null);
    }
}
