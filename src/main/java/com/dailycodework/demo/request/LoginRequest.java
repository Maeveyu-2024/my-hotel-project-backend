package com.dailycodework.demo.request;


import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author Miao Yu
 */
@Data
public class LoginRequest {
    @NotBlank
    private String email;
    @NotBlank
    private String password;
}
