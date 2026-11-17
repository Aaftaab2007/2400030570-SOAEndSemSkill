
package com.example.rbac.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    // Admin Dashboard
    @GetMapping("/dashboard")
    public String adminDashboard() {

        return "Welcome Admin! You have access to Admin Dashboard.";
    }

    // Manage Users
    @GetMapping("/manage-users")
    public String manageUsers() {

        return "Admin can manage all users.";
    }

    // View Reports
    @GetMapping("/reports")
    public String reports() {

        return "Admin can access all reports.";
    }
}
