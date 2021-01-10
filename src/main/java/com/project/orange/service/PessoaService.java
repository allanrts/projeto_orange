package com.project.orange.service;

import com.project.orange.entity.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.project.orange.repository.PessoaRepository;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository repository;

    public Pessoa savePessoa(Pessoa pessoa) {
        return repository.save(pessoa);
    }

    public List<Pessoa> getPessoa() {
        return repository.findAll();
    }

    public Pessoa getPessoatByName(String name) {
        return repository.findByName(name);
    }

}
