package com.praveen.service;


import com.praveen.entity.User;
import com.praveen.repo.UserInfoRepo;
import com.praveen.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private UserInfoRepo userInfoRepo;


    public User saveUser(User user)
    {
        return userRepo.save(user);
    }


    public List<User> fetchAll()
    {
        return userRepo.findAll();
    }

    public User fetchById(Long id)
    {
        return userRepo.findById(id).orElse(null);
    }



    public void deleteById(Long id)
    {
        userRepo.deleteById(id);
    }

    public User updateUser(Long id, User updatedUser) {
        // Check if the user with the given id exists
        User existingUser = userRepo.findById(id).orElse(null);
        if (existingUser != null) {
            existingUser.setUserName(updatedUser.getUserName());
            existingUser.setEmail(updatedUser.getEmail());
            return userRepo.save(existingUser);
        }
        return null; // Or throw an exception indicating user not found
    }

}
