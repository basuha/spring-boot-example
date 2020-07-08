package com.example.servingwebcontent.repos;

import com.example.servingwebcontent.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findById(long id);

    User findByActivationCode(String code);
}
