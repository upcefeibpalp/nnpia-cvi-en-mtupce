package cz.upce.fei.nnpiacv.controller;


import cz.upce.fei.nnpiacv.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService greetingService) {
        this.userService = greetingService;
    }

    @GetMapping()
    public String FindUser(@RequestParam Long id){
        return userService.FindUser(id);
    }

    @GetMapping("/users")
    public String findUsers(){
        return userService.findUsers().toString();
    }
}
