package cz.upce.fei.nnpiacv.controller;


import cz.upce.fei.nnpiacv.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService greetingService) {
        this.userService = greetingService;
    }

    @GetMapping("/user")
    public String FindUser(){
        return userService.FindUser();
    }

    @GetMapping("/users")
    public String findUsers(){
        return userService.findUsers().toString();
    }
}
