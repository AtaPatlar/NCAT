package com.example.NCAT.repository;

import com.example.NCAT.entitiy.SurveyStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SurveyStudentRepository extends JpaRepository<SurveyStudent, UUID> {
}
