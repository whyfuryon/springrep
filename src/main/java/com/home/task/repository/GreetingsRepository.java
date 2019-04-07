package com.home.task.repository;

import com.home.task.model.Greetings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingsRepository extends JpaRepository<Greetings,Long> {
}
