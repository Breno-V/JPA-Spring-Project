package com.exemplo.api_produtos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.exemplo.api_produtos.model.Produto;

public interface HabitRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByName(String name);
    List<Produto> findByNameContaining(String PartOfName);
}
