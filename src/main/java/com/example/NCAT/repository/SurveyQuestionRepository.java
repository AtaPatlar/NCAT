package com.example.NCAT.repository;

import com.example.NCAT.entitiy.SurveyQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SurveyQuestionRepository extends JpaRepository<SurveyQuestion, UUID> {
}
