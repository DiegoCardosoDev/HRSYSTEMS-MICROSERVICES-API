package br.com.diego.userapi.services;

import br.com.diego.userapi.domain.User;
import br.com.diego.userapi.exeptions.ObjectNotFoundxExeption;
import br.com.diego.userapi.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{

    private final UserRepo userRepo;
    private final Environment env;

    @Override
    public User findById(Long id) {
        log.info("USER_SERVICE ::: Get Request on " + env.getProperty("local.server.port ") + "port");
        return userRepo.findById(id).orElseThrow(()
                -> new ObjectNotFoundxExeption("object not found"));
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
