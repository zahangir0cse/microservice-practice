package com.zahangir.department.controller;

import com.zahangir.department.annotations.ApiController;
import com.zahangir.department.model.Department;
import com.zahangir.department.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

@ApiController
@RequestMapping("/departments")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/create")
    public Department create(@RequestBody Department department){
        return departmentService.save(department);
    }

    @GetMapping("/{id}")
    public Department get(@PathVariable("id") Long id){
        return departmentService.get(id);
    }


}
