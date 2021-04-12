package com.good_ghost.hua_culture.mapper;

import com.good_ghost.hua_culture.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getAll();
}
