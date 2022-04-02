package com.zahangir.users.dto;

import com.zahangir.users.model.Users;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateDto {
    private Users users;
    private Department department;
}
