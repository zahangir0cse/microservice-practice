package com.zahangir.users.controller;

import com.zahangir.users.annotations.ApiController;
import com.zahangir.users.dto.ResponseTemplateDto;
import com.zahangir.users.model.Users;
import com.zahangir.users.service.UsersService;
import org.springframework.web.bind.annotation.*;

@ApiController
@RequestMapping("/users")
public class UsersController {
    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @PostMapping("/create")
    public Users create(@RequestBody Users users){
        return usersService.save(users);
    }

    @GetMapping("/{id}")
    public ResponseTemplateDto get(@PathVariable("id") Long id){
        return usersService.get(id);
    }
}
