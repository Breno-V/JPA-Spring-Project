package com.exemplo.api_produtos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.exemplo.api_produtos.model.Habit;

public interface HabitRepository extends JpaRepository<Habit, Long> {
    List<Habit> findByName(String name);
    List<Habit> findByNameContaining(String PartOfName);
}
