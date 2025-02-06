package com.example.travelpet.api.controller;

import com.example.travelpet.api.dto.update.UserDtoUpdate;
import com.example.travelpet.api.service.UserService;
import com.example.travelpet.model.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getById(id);
    }

    @PutMapping("/updateUser")
    public boolean updateUser(@RequestBody UserDtoUpdate userDU) {
        return userService.updateSelf(userDU);

    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);

    }


}
