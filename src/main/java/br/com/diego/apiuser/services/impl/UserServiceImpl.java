package br.com.diego.apiuser.services.impl;

import br.com.diego.apiuser.domain.User;
import br.com.diego.apiuser.repositories.UserRepo;
import br.com.diego.apiuser.services.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final  UserRepo userRepo;



    @Override
    public User findByid(long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
