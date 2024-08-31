package com.groupeisi.secureapp_spring.mapper;

import com.groupeisi.secureapp_spring.dto.UserDto;
import com.groupeisi.secureapp_spring.entities.AccountUserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDto toDto(AccountUserEntity user) {
        UserDto dto = new UserDto();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setEmail(user.getEmail());
        dto.setPassword(user.getPassword());
        dto.setState(user.isState());
        return dto;
    }

    public AccountUserEntity toEntity(UserDto dto) {
        AccountUserEntity user = new AccountUserEntity();
        user.setId(dto.getId());
        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        user.setState(dto.isState());
        return user;
    }
}