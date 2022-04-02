package com.zahangir.users.service.impl;

import com.zahangir.users.dto.Department;
import com.zahangir.users.dto.ResponseTemplateDto;
import com.zahangir.users.model.Users;
import com.zahangir.users.repository.UsersRepository;
import com.zahangir.users.service.UsersService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("usersService")
public class UsersServiceImpl implements UsersService {
    private final UsersRepository usersRepository;
    private final RestTemplate restTemplate;

    public UsersServiceImpl(UsersRepository usersRepository, RestTemplate restTemplate) {
        this.usersRepository = usersRepository;
        this.restTemplate = restTemplate;
    }

    @Override
    public Users save(Users users) {
        return usersRepository.save(users);
    }

    @Override
    public ResponseTemplateDto get(Long id) {
        Users users =  usersRepository.findById(id).orElse(null);
        ResponseTemplateDto responseTemplateDto = new ResponseTemplateDto();
        if(users != null){
            responseTemplateDto.setUsers(users);
            if(users.getDeptId() != null){
                Department department = restTemplate.getForObject("http://department-service/departments/" + users.getDeptId(), Department.class);
                if(department != null){
                    responseTemplateDto.setDepartment(department);
                }
            }
        }
        return responseTemplateDto;
    }
}
