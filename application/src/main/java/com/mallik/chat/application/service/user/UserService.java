package com.mallik.chat.application.service.user;


import com.mallik.chat.application.service.user.dto.User;
import com.mallik.chat.application.service.user.dto.UserDto;
import com.mallik.chat.application.service.user.repo.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepo repo;

    public User addUser(UserDto dto){
        User u = dto.toUser();
        u.setDeleted(false);
        u.setCreatedTime(System.currentTimeMillis());
        return repo.save(u);
    }

    public User findUser(Long id){
        Optional<User> u = repo.findUser(id);
        return u.orElse(null);
    }

    public User deleteIUser(Long id){
        Optional<User> x = repo.findUser(id);
        User u = x.orElse(null);
        if(u == null){
            throw new RuntimeException("user not found");
        }
        u.setDeleted(true);

        return repo.save(u);
    }

    public long getUserCount(){
        return repo.count();
    }

    public User registerUser(UserDto userDto){
        return null;
    };
}
