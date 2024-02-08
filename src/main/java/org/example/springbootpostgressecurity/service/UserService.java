package org.example.springbootpostgressecurity.service;

import org.example.springbootpostgressecurity.entity.User;
import org.example.springbootpostgressecurity.model.CustomUserDetails;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService {

    User addUser(User user);
    User updateUser(User user);
    void deleteUser(long id);
    List<User> allUsers();
    UserDetails loadUserByUsername(String username);
}
