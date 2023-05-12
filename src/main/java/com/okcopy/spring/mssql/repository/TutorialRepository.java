package com.okcopy.spring.mssql.repository;

import com.okcopy.spring.mssql.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface TutorialRepository extends JpaRepository<Tutorial, Long>, JpaSpecificationExecutor<Tutorial> {
    List<Tutorial> findByPublished(boolean published);

    List<Tutorial> findByTitleContaining(String title);
}
