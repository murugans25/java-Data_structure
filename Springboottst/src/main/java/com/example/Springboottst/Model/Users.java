package com.example.Springboottst.Model;

import com.example.Springboottst.Entity.Userentity;
import com.example.Springboottst.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Users {
    private final UserRepository repository;

    @Autowired
    public Users(UserRepository repository) {
        this.repository = repository;
    }

    public List<Userentity> getAllUsers() {
        return repository.findAll();
    }

    public Optional<Userentity> getUserById(Integer id) {
        return repository.findById(id); // Fixed: Added missing id argument
    }

    public List<Userentity> createUser(List<Userentity> users) {
        return repository.saveAll(users);
    }

    public Userentity updateUser(Integer id, Userentity userentity) {
        return repository.findById(id).map(users -> {
            users.setName(userentity.getName()); // Fixed: Corrected getter method calls
            users.setId(userentity.getId());
            users.setEmail(userentity.getEmail());
            users.setRollno(userentity.getRollno());
            users.setMobileno(userentity.getMobileno());
            return repository.save(users);
        }).orElseThrow(() -> new RuntimeException("User not found: " + id));
    }

    public void deleteUser(Integer id) { // Fixed: Changed Long to Integer
        repository.deleteById(id);
    }
}
