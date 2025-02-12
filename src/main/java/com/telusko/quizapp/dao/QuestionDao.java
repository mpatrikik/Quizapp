package com.telusko.quizapp.dao;

import com.telusko.quizapp.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionDao extends JpaRepository<Question, Integer> {
}
