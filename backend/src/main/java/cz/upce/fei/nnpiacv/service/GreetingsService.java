package cz.upce.fei.nnpiacv.service;

import cz.upce.fei.nnpiacv.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class GreetingsService {
    private Logger logger = LoggerFactory.getLogger(GreetingsService.class);


    public String sayGreeting(){

        User user = new User( 0L, "cool@email.cz", "heslo");
        logger.info("USER CREATED: "+ user);

        return user.toString();
    }

}
