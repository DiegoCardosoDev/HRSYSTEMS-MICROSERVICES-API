package br.com.diego.userapi.repo;

import br.com.diego.userapi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
