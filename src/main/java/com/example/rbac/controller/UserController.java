
package com.example.rbac.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    // User Profile
    @GetMapping("/profile")
    public String userProfile() {

        return "Welcome User! This is your profile.";
    }

    // User Dashboard
    @GetMapping("/dashboard")
    public String userDashboard() {

        return "Welcome to User Dashboard.";
    }

    // User Details
    @GetMapping("/details")
    public String userDetails() {

        return "You can view your personal details here.";
    }
}
