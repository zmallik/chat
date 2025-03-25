package com.mallik.chat.application.service.user.dto;

import com.mallik.chat.application.service.user.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String name;
    private Gender gender;
    private String email;
    private long dateBirth;

    public User toUser(){
        User u = new User();
        u.setName(this.getName());
        u.setEmail(this.getEmail());
        u.setGender(this.getGender().name());
        u.setDateBirth(this.getDateBirth());
        return u;
    }
}
