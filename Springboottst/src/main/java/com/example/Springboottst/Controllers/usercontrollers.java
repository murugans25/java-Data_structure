package com.example.Springboottst.Controllers;

import com.example.Springboottst.Entity.Userentity;
import com.example.Springboottst.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController  // Fixed: Removed @Controller, keeping @RestController
@RequestMapping("/api/users")
public class usercontrollers { // Fixed: Class name should follow PascalCase

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/all")
    public List<Userentity> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/add")
    public Userentity addUser(@RequestBody Userentity user) {
        return userRepository.save(user);
    }

    @PutMapping("/{id}")
    public Userentity updateUser(@PathVariable int id, @RequestBody Userentity userDetails) {
        Optional<Userentity> optionalUser = userRepository.findById(id);

        if (optionalUser.isPresent()) {
            Userentity existingUser = optionalUser.get();
            existingUser.setName(userDetails.getName());
            existingUser.setEmail(userDetails.getEmail());
            existingUser.setRollno(userDetails.getRollno());
            existingUser.setMobileno(userDetails.getMobileno());
            return userRepository.save(existingUser);
        } else {
            throw new RuntimeException("User not found with id: " + id);
        }
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return "User deleted successfully";
        } else {
            return "User not found with id: " + id;
        }
    }
}
