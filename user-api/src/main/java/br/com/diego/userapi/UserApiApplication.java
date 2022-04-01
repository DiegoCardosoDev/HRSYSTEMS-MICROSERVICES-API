package br.com.diego.userapi;

import br.com.diego.userapi.domain.User;
import br.com.diego.userapi.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


import java.util.List;
@EnableEurekaClient
@SpringBootApplication
public class UserApiApplication implements CommandLineRunner {

    @Autowired
    private UserRepo userRepo;

    public static void main(String[] args) {
        SpringApplication.run(UserApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepo.saveAll(List.of(

                new User(null, "Diego Cardoso", "diegocardososacramento.com", "12345", 40.0)

        ));

    }
}