package org.tutorials.springbootkeycloak.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

    @GetMapping("/user")
    @PreAuthorize("hasRole('user')")
    public String hello() {
        return "Hello from Spring Boot & Keycloak - USER";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasAnyRole('admin', 'user')")
    public String hello2() {
        return "Hello from Spring Boot & Keycloak - ADMIN";
    }
}