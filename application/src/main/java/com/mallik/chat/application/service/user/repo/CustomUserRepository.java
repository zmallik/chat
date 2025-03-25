package com.mallik.chat.application.service.user.repo;

import com.mallik.chat.application.service.user.dto.User;

import java.util.Optional;

public interface CustomUserRepository {
    Optional<User> findUser(Long id); // Your custom version

}
