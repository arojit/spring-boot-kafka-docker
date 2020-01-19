package com.example.techmantra.repository;

import com.example.techmantra.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
