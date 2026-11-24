package com.puce.gimnasio.service;

import com.puce.gimnasio.model.Socio;
import com.puce.gimnasio.repository.SocioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SocioService {

    private SocioRepository socioRepository;

    public SocioService(SocioRepository socioRepository){
        this.socioRepository = socioRepository;
    }

    //TRAER TODOS
    public List<Socio> traerTodos(){
        return socioRepository.findAll();
    }

    //TRAER UNO
    public Optional<Socio> traerUno(int id){
        return socioRepository.findById(id);
    }

    //GUARDAR
    public Socio  guardar (Socio socio){
        return socioRepository.save(socio);
    }

}
