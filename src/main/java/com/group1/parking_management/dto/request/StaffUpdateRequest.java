package com.group1.parking_management.dto.request;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.group1.parking_management.constant.Gender;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class  StaffUpdateRequest {

    private String username;

    private String password;

    private String identification;

    private String name;

    private LocalDate dob;

    private Gender gender;

    private String phoneNumber;

    private String address;

    private String email;

    private Boolean isActive;
}
