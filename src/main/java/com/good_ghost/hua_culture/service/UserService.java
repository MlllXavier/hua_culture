package com.good_ghost.hua_culture.service;

import com.good_ghost.hua_culture.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    List<User> getAll();

}
