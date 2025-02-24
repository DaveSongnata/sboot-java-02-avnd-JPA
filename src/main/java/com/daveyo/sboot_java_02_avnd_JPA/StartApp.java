package com.daveyo.sboot_java_02_avnd_JPA;


import com.daveyo.sboot_java_02_avnd_JPA.model.User;
import com.daveyo.sboot_java_02_avnd_JPA.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception{
        User user = new User();
        user.setName("Daves");
        user.setUsername("Crypta");
        user.setPassword("Esfinge#wpa2");

        repository.save(user);



        for(User u: repository.findAll()){
                System.out.println(u);
        }

    }

}
