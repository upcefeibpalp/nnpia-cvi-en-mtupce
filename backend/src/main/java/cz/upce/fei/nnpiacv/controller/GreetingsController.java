package cz.upce.fei.nnpiacv.controller;


import cz.upce.fei.nnpiacv.service.GreetingsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    private GreetingsService greetingService = new GreetingsService();

    @GetMapping("/")
    public String sayGreeting(){
    return greetingService.sayGreeting();
    }
}
