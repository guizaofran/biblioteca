package com.projeto.biblioteca.repositorys;

import com.projeto.biblioteca.entities.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<LivroEntity,Long> {
}
