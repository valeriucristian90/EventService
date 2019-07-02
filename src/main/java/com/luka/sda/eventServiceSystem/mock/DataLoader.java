package com.luka.sda.eventServiceSystem.mock;

import com.luka.sda.eventServiceSystem.model.User;
import com.luka.sda.eventServiceSystem.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(DataLoader.class);

    private UserRepository repository;

    @Autowired
    public DataLoader(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        logger.info("Loading data...");
        List<User> users = createUsers();
        System.out.println("TOTO");
        // TODO: ignore this im production
        repository.saveAll(users);
    }

    private List<User> createUsers() {
        User user1 = new User();
        user1.setFirstName("test");
        return Arrays.asList(user1);
    }

}
