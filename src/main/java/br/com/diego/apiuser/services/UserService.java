package br.com.diego.apiuser.services;

import br.com.diego.apiuser.domain.User;

import java.util.List;

public interface UserService {

    User findById(Long id);
    List<User> findAll();
}
