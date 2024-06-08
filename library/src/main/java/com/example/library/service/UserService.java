// src/main/java/com/example/library/service/UserService.java
package com.example.library.service;

import com.example.library.entity.User;

import java.util.Set;
import java.util.UUID;

public interface UserService {

    Set<User> findAll();

    User save(User user);

    void delete(Set<UUID> ids);

    User get(UUID id);

}
