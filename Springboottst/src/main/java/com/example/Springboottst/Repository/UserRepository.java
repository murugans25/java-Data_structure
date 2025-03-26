package com.example.Springboottst.Repository;

import com.example.Springboottst.Entity.Userentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Userentity,Integer>{

}
