package com.projeto.biblioteca.controllers;


import com.projeto.biblioteca.entities.LivroEntity;
import com.projeto.biblioteca.services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public List<LivroEntity> listarTodos() {
        return livroService.listarTodos();
    }

    @GetMapping("/{id}")
    public LivroEntity listarPorID(@PathVariable Long id) {
        return livroService.listarPorID(id);
    }

    @PostMapping("/autores/{autorID}")
    public LivroEntity criarLivro(@RequestBody LivroEntity novoLivro, @PathVariable Long autorID){
        return livroService.criarLivro(novoLivro, autorID);
    }

    @DeleteMapping("/{id}")
    public void deletarLivro(@PathVariable Long id){
        livroService.deletarLivro(id);
    }
}
