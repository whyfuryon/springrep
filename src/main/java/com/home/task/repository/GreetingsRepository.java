package com.home.task.repository;

import com.home.task.model.Greetings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GreetingsRepository extends JpaRepository<Greetings,Long> {
    Optional<Greetings> findById(Long id);
}
