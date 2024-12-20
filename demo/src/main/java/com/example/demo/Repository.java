package com.example.yourprojectname.repository;

import com.example.yourprojectname.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // Здесь можно добавить кастомные методы поиска, если понадобится
}
