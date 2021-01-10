package com.project.orange.repository;

import com.project.orange.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa,Integer> {
    Pessoa findByName(String name);
}

