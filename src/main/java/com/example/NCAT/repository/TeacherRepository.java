package com.example.NCAT.repository;

import com.example.NCAT.entitiy.Manager;
import com.example.NCAT.entitiy.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, UUID> {

    Optional<Teacher> findOptionalByEmailAndPassword(String email,String password);
    boolean existsByEmail(String email);
    Optional<Manager> findOptionalByEmail(String email);
}
