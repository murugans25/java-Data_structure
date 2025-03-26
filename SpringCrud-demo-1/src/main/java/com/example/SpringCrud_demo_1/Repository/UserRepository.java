package com.example.SpringCrud_demo_1.Repository;

import com.example.SpringCrud_demo_1.Model.Entity1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<Entity1,Long> {
    Optional<Entity1> findByEmail(String email);
}
// this interface is uses in table create in import ,and jpa import
