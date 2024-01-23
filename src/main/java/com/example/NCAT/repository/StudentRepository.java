package com.example.NCAT.repository;

import com.example.NCAT.entitiy.Manager;
import com.example.NCAT.entitiy.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface StudentRepository extends JpaRepository<Student, UUID> {

    boolean existsByEmail(String email);
    Optional<Manager> findOptionalByEmail(String email);
}
