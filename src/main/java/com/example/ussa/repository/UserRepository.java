package com.example.ussa.repository;


import com.example.ussa.Model.Course;
import com.example.ussa.Model.User;
import org.hibernate.sql.Update;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);

    Optional<User> findByUsernameOrEmail(String username, String email);

    @Query


    List<User> findByIdIn(List<Long> userIds);

    Optional<User> findByUsername(String username);


    @Override
    User getOne(Long UserID);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);


}