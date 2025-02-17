package cz.upce.fei.nnpiacv.controller;


import cz.upce.fei.nnpiacv.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService greetingService) {
        this.userService = greetingService;
    }

    @GetMapping("/{id}")
    public String FindUser(@PathVariable Long id){
        return userService.FindUser(id);
    }

    @GetMapping()
    public String findUsers(){
        return userService.findUsers().toString();
    }
}
