package com.group1.parking_management.dto.request;

import java.time.LocalDate;

import com.group1.parking_management.constant.Gender;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StaffCreationRequest {
    @NotBlank
    @Size(min = 4, message = "USERNAME_INVALID")
    private String username;

    @NotBlank
    @Size(min = 8, message = "PASSWORD_INVALID")
    private String password;

    private String identification;

    private String name;

    private LocalDate dob;

    private Gender gender;

    private String phoneNumber;

    private String address;

    private String email;
}
