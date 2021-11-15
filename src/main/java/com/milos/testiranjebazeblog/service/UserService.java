package com.milos.testiranjebazeblog.service;

import com.milos.testiranjebazeblog.entity.User;
import com.milos.testiranjebazeblog.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> listOfUsers() {
      return userRepository.findAll();
    }

    public User getUserById(Long id) {
       return userRepository.findById(id).get();
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public void deleteById(Long id){
        userRepository.deleteById(id);
    }

}
