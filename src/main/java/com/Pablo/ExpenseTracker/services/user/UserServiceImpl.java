package com.Pablo.ExpenseTracker.services.user;

import com.Pablo.ExpenseTracker.entity.AppUser;
import com.Pablo.ExpenseTracker.repository.UserRepository;
import com.Pablo.ExpenseTracker.services.Email.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository, EmailService emailService) {
        this.userRepository = userRepository;
    }

    public List<AppUser> allUsers(){
        List<AppUser> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }
}
