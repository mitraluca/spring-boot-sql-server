package com.okcopy.spring.mssql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.okcopy.spring.mssql.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
  List<Tutorial> findByPublished(boolean published);
  List<Tutorial> findByTitleContaining(String title);
}
