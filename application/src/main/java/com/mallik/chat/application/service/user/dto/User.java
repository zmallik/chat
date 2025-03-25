package com.mallik.chat.application.service.user.dto;

import com.mallik.chat.application.service.common.dto.SqlBean;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User extends SqlBean {
    private String name;
    private String gender;
    private long dateBirth;
    private long lastLoggedIn;
    private boolean online;
}
