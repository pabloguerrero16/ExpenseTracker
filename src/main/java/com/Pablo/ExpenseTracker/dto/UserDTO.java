package com.Pablo.ExpenseTracker.dto;

import lombok.Data;

import java.util.Set;

@Data
public class UserDTO {

    private Long id;

    private String firstName;

    private String lastName;

    private String userName;

    private String email;

    private Set<ExpenseDTO> expenses;
}
