package com.projeto.biblioteca.services;

import com.projeto.biblioteca.entities.AutorEntity;
import com.projeto.biblioteca.repositorys.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public List<AutorEntity> listarTodos(){
        return autorRepository.findAll();
    }

    public AutorEntity listarPorID(Long id){
        return autorRepository.findById(id).orElseThrow();
    }

    public AutorEntity criarAutor(AutorEntity novoAutor){
        return autorRepository.save(novoAutor);
    }

    public void deletarAutor(Long id){
        autorRepository.deleteById(id);
    }
}
