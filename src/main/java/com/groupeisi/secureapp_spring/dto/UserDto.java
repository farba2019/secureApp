package com.groupeisi.secureapp_spring.dto;

import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String username;
    private String email;
    private String password;
    private boolean state;

}
