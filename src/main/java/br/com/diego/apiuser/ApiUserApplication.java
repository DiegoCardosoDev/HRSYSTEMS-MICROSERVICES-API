package br.com.diego.apiuser;

import br.com.diego.apiuser.domain.User;
import br.com.diego.apiuser.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ApiUserApplication implements CommandLineRunner {

    @Autowired
    private UserRepo userRepo;

    public static void main(String[] args) {
        SpringApplication.run(ApiUserApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepo.saveAll(List.of(

                new User(null, "DiegoCardoso", "diegocardososacramento.com", "12345", 20.0)

        ));

    }
}
