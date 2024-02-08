package org.example.springbootpostgressecurity.controller;

import org.example.springbootpostgressecurity.entity.User;
import org.example.springbootpostgressecurity.service.UserService;
import org.example.springbootpostgressecurity.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> users() {
        return userService.allUsers();
    }

    @GetMapping("/current-user")
    public String currentUser(Principal principal) {
        return principal.getName();
    }

    @PostMapping("/create-user")
    public User createUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @PostMapping("/update-user")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/delete-user/{id}")
    public void deleteUser(@PathVariable Long id) {
         userService.deleteUser(id);
    }
}
