//package com.example.testH2.service;
//
//import com.example.testH2.entity.User;
//import com.example.testH2.repository.UserRepository;
//import lombok.RequiredArgsConstructor;
//
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class UserServiceImpl implements UserService {
//    private final UserRepository userRepository;
//
//    @Override
//    public User getById(Long id) {
//        return userRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("В базе отсутствует id: " + id));
//    }
//
//    @Override
//    public List<User> findAll() {
//        return (List<User>) userRepository.findAll();
//    }
//
//    @Override
//    public User save(User user) {
//        return userRepository.save(user);
//    }
//
//    @Override
//    public User update(User user) {
//        return userRepository.save(user);
//    }
//
//    @Override
//    public void deleteById(Long id) {
//        userRepository.deleteById(id);
//        System.out.println("Пользователь с id " + id+" удален.");
//    }
//
//
//}