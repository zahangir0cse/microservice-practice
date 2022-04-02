package com.zahangir.users.service;

import com.zahangir.users.dto.ResponseTemplateDto;
import com.zahangir.users.model.Users;

public interface UsersService {
    Users save(Users users);
    ResponseTemplateDto get(Long id);
}
