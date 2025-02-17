package cz.upce.fei.nnpiacv.service;

import cz.upce.fei.nnpiacv.domain.User;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    private Map<Long, User> users = new HashMap<>();

    @PostConstruct
    public void init(){

        User user1 = new User(0L, "cool@email.cz", "heslo");
        User user2 = new User(1L, "GRA@email.cz", "pass");

        users.put(user1.getId(),user1);
        users.put(user2.getId(),user2);
    }


    public String FindUser(Long id){


        logger.debug("USER REQUESTED: "+ users.get(id).toString());

        return users.get(id).toString();
    }

    public Collection<User> findUsers(){
        return users.values();
    }

}
