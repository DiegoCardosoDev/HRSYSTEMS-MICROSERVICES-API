package br.com.diego.userapi.services;

import br.com.diego.userapi.domain.User;

import java.util.List;

public interface UserService {

    User findById(Long id);
    List<User> findAll();
}
