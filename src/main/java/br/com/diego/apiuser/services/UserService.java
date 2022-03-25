package br.com.diego.apiuser.services;

import br.com.diego.apiuser.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    User findByid(long id);
     List<User> findAll();
}
