package com.example.SpringCrud_demo_1.Controller;

import com.example.SpringCrud_demo_1.Model.Entity1;
import com.example.SpringCrud_demo_1.Service.Service1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@Controller
@RestController
@RequestMapping("/api/users")  // Base path for API endpoints
public class Controller1 {

    @Autowired // it  dependency injection
    private Service1 service;

    // Insert (Create) User
    @PostMapping("/add")
    public List<Entity1> createUser(@RequestBody List<Entity1> users) {
        return service.createUser(users);
    }


    // Get All Usersc
    @GetMapping("/all") // get all users
    public List<Entity1> getAllUsers() {
        return service.getAllUsers();
    }

    // Get User By ID
    @GetMapping("/{id}")
    public Optional<Entity1> getUserById(@PathVariable Long id) {
        return service.getUserById(id);
    }

    // Update User
    @PutMapping("/{id}")
    public Entity1 updateUser(@PathVariable Long id, @RequestBody Entity1 entity1Details) {
        return service.updateUser(id, entity1Details);
    }

    // Delete User
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        service.deleteUser(id);
        return "User deleted successfully!";
    }
}
