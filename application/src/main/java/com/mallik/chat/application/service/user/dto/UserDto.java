package com.mallik.chat.application.service.user.dto;

import com.mallik.chat.application.service.user.enums.Gender;

public class UserDto {
    private String name;
    private Gender gender;
    private long dateBirth;
    private long lastLoggedIn;
    private boolean online;
}
