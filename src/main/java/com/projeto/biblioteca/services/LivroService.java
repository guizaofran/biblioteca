package com.projeto.biblioteca.services;

import com.projeto.biblioteca.entities.AutorEntity;
import com.projeto.biblioteca.entities.LivroEntity;
import com.projeto.biblioteca.repositorys.AutorRepository;
import com.projeto.biblioteca.repositorys.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;
    @Autowired
    private AutorRepository autorRepository;

    public List<LivroEntity> listarTodos(){
        return livroRepository.findAll();
    }

    public LivroEntity listarPorID(Long id){
        return livroRepository.findById(id).orElseThrow();
    }

    public LivroEntity criarLivro(LivroEntity novoLivro, Long autorID){
        AutorEntity autor = autorRepository.findById(autorID).orElseThrow();
        novoLivro.setAutor(autor);
        return livroRepository.save(novoLivro);
    }
}
