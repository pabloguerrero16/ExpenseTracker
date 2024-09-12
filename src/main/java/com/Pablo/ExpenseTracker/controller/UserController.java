package com.Pablo.ExpenseTracker.controller;

import com.Pablo.ExpenseTracker.entity.AppUser;
import com.Pablo.ExpenseTracker.services.user.UserService;
import com.Pablo.ExpenseTracker.services.user.UserServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/users")
@RestController
public class UserController {
    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/me")
    public ResponseEntity<AppUser> authenticatedUser(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        AppUser currentUser = (AppUser) authentication.getPrincipal();
        return ResponseEntity.ok(currentUser);
    }

    @GetMapping("/")
    public ResponseEntity<List<AppUser>> allUsers(){
        List<AppUser> users = userService.allUsers();
        return ResponseEntity.ok(users);
    }
}
