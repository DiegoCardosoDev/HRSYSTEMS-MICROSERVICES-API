package br.com.diego.userapi.services;

import br.com.diego.userapi.domain.User;
import br.com.diego.userapi.exeptions.ObjectNotFoundxExeption;
import br.com.diego.userapi.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{

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
