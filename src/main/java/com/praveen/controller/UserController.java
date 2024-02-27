package com.praveen.controller;


import com.praveen.entity.User;
import com.praveen.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/oneToOne")
public class UserController {

    @Autowired
    private UserServiceImp userServiceImp;

    @PostMapping("/save")
    public User saveUser(@RequestBody User user)
    {
        return userServiceImp.saveUser(user);
    }


    @GetMapping("/fetchAll")
    public List<User> fetchAllUsers()
    {
        return userServiceImp.fetchAll();
    }

    @GetMapping("/fetch/{id}")
    public User fetchById(@PathVariable Long id)
    {
        return userServiceImp.fetchById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id)
    {
         userServiceImp.deleteById(id);
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User updatedUser) {
        User user = userServiceImp.updateUser(id, updatedUser);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }










}
