package com.example.blog.service;

import com.example.blog.entities.User;
import com.example.blog.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    public void save(User user){
        user.setPassword(user.getPassword());
        userRepository.save(user);
    }
//    @Configuration(proxyBeanMethods = false)
//    class TestConfiguration {
//        @Bean
//        public FirstBean firstBean() {
//            return new FirstBean();
//        }
//
//        @Bean
//        public SecondBean secondBean(FirstBean someBean) { // -> correct injected instance
//            return new SecondBean(someBean);
//        }
//    }
    public User getUser(String username){
        return userRepository.findByUsername(username);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}