package com.mallik.chat.application.api;

import com.mallik.chat.application.service.user.UserService;
import com.mallik.chat.application.service.user.dto.User;
import com.mallik.chat.application.service.user.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/user/")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long userId) {
        log.info("calling user with id");
        return userService.findUser(userId);
    }

    @PostMapping("")
    public User createUser(@RequestBody UserDto userDto) {
        return userService.addUser(userDto);
    }

    @DeleteMapping("/{userId}")
    public User deleteUser(@PathVariable("userId") Long userId) {
        return userService.deleteIUser(userId);
    }

    @GetMapping("/count")
    public long sayHello() {
        log.info("calling user with id");
        return userService.getUserCount();
    }

}
