package com.example.gradleproject.service;

import com.example.gradleproject.repository.EmployeeEntity;
import com.example.gradleproject.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUsernameById(Long id) {
        EmployeeEntity employee = userRepository.getFirstById(id);
        return employee.getName();
    }
}