package com.project.orange.controller;

import com.project.orange.entity.Pessoa;

import com.project.orange.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
public class PessoaController {

    @Autowired
    private PessoaService service;

    @PostMapping("/addPessoa")
    public Pessoa addPessoa (@RequestBody @Valid Pessoa pessoa) {
        return service.savePessoa(pessoa);
    }

    @GetMapping("/pessoa")
    public List<Pessoa> findAllPessoa() {
        return service.getPessoa();
    }
    
    @GetMapping("/pessoa/{name}")
    public Pessoa findPessoaByName(@PathVariable String name) {
        return service.getPessoatByName(name);
    }
}
