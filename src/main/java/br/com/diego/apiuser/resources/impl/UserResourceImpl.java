package br.com.diego.apiuser.resources.impl;

import br.com.diego.apiuser.domain.User;
import br.com.diego.apiuser.resources.UserResource;
import br.com.diego.apiuser.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserResourceImpl implements UserResource {

    private final UserService userService;


    @Override
    public ResponseEntity<User> findById(Long id) {
        return ResponseEntity.ok().body(userService.findByid(id));
    }

    @Override
    public ResponseEntity<List<User>> findAll() {
        return null;
    }
}
