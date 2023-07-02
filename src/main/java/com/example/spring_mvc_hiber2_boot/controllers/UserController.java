package com.example.spring_mvc_hiber2_boot.controllers;

import com.example.spring_mvc_hiber2_boot.models.User;
import com.example.spring_mvc_hiber2_boot.services.UserService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    private final UserService userService;

    //@Autowired
    public UserController(UserService usersService) {
        this.userService = usersService;
    }

    @GetMapping("/")
    public String users(@ModelAttribute("user") User user, Model model, Long id) {
        model.addAttribute("users", userService.findAll());
        model.addAttribute("user", new User());
        return "users";
    }

    @PostMapping
    public String addUser(@ModelAttribute("user") @Valid User user) {
        userService.save(user);
        return "redirect:/";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id) {
        userService.delete(id);
        return "redirect:/";
    }

    @PatchMapping("/update/{id}")
    public String updateUser(@PathVariable("id") long id, User user) {
        userService.update(id, user);
        return "redirect:/";
    }
}
