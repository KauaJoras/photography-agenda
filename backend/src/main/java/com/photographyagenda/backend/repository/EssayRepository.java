package com.photographyagenda.backend.repository;

import com.photographyagenda.backend.entity.Essay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EssayRepository extends JpaRepository<Essay, Integer> {
}
