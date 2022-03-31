package br.com.diego.apiuser.services;

import br.com.diego.apiuser.domain.User;
import br.com.diego.apiuser.repositories.UserRepo;
import br.com.diego.apiuser.services.exeptions.ObjectNotFoundxExeption;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceimpl implements UserService{

    private final UserRepo userRepo;

    @Override
    public User findById(Long id) {
        return userRepo.findById(id).orElseThrow(()
                -> new ObjectNotFoundxExeption("object not found"));
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
