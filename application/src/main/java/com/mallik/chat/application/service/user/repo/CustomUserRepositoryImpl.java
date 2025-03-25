package com.mallik.chat.application.service.user.repo;

import com.mallik.chat.application.service.user.dto.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.Objects;
import java.util.Optional;

@Slf4j
@Repository
public class CustomUserRepositoryImpl implements CustomUserRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Optional<User> findUser(Long id) {
        log.info("in custom repo");
        User user = entityManager.find(User.class, id);

        // For example, add logging, filtering, soft delete logic, etc.
        if (user != null && Objects.nonNull(user.getDeleted()) &&  user.getDeleted()) {
            return Optional.empty();
        }

        return Optional.of(user);
    }
}
