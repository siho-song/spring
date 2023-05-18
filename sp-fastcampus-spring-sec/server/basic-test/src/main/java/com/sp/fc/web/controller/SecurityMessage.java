package com.sp.fc.web.controller;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.Authentication;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SecurityMessage {

    private Authentication auth;
    private String message;
}
