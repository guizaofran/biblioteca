package com.projeto.biblioteca.controllers;

import com.projeto.biblioteca.entities.AutorEntity;
import com.projeto.biblioteca.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping
    public List<AutorEntity> listarTodos() {
        return autorService.listarTodos();
    }
    @GetMapping("/{id}")
    public AutorEntity listarPorID(@PathVariable Long id) {
        return autorService.listarPorID(id);
    }

    @PostMapping
    public AutorEntity criarAutor(@RequestBody AutorEntity novoAutor){
        return autorService.criarAutor(novoAutor);
    }

    @DeleteMapping("/{id}")
    public void deletarPorID(@PathVariable Long id){
        autorService.deletarAutor(id);
    }

}
