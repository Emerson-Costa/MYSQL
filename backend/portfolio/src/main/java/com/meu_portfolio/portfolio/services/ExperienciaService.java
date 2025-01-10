package com.meu_portfolio.portfolio.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meu_portfolio.portfolio.domain.Experiencia;
import com.meu_portfolio.portfolio.repositories.ExperienciaRepository;
import com.meu_portfolio.portfolio.services.exceptions.ObjectNotFoundException;

@Service
public class ExperienciaService {

    @Autowired
    private ExperienciaRepository experienciaRepository;

    public Experiencia find(Integer id) {
        Optional<Experiencia> obj = experienciaRepository.findById(id);
        return obj.orElseThrow(
                () -> new ObjectNotFoundException(
                        "Objeto não encontrado! Id:" + id + ", Tipo: " + Experiencia.class.getName()));
    }
}
