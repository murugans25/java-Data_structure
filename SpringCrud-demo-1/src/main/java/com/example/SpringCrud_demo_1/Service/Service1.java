package com.example.SpringCrud_demo_1.Service;

import com.example.SpringCrud_demo_1.Model.Entity1;
import com.example.SpringCrud_demo_1.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Service1 {

    private final UserRepository repository;

    @Autowired
    public Service1(UserRepository repository) { // Constructor Injection
        this.repository = repository;
    }

    public List<Entity1> getAllUsers() {
        return repository.findAll();  // Now correctly references JpaRepository
    }

    public Optional<Entity1> getUserById(Long id) {
        return repository.findById(id);  //  Now correctly references JpaRepository
    }
    public List<Entity1> createUser(List<Entity1> users) {
        return repository.saveAll(users);
    }


    public Entity1 updateUser(Long id, Entity1 entity1Details) {
        return repository.findById(id).map(user -> {
            user.setName(entity1Details.getName());  // Now correctly finds method
            user.setEmail(entity1Details.getEmail());  // Now correctly finds method
            return repository.save(user);  // Now correctly references JpaRepository
        }).orElseThrow(() -> new RuntimeException("User not found with id " + id));
    }

    public void deleteUser(Long id) {
        repository.deleteById(id);  // Now correctly references JpaRepository
    }
}
