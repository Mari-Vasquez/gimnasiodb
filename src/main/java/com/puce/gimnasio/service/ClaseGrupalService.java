package com.puce.gimnasio.service;

import com.puce.gimnasio.model.ClaseGrupal;
import com.puce.gimnasio.model.Socio;
import com.puce.gimnasio.repository.ClaseGrupalRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClaseGrupalService {

    private ClaseGrupalRepository claseGrupalRepository;

    public ClaseGrupalService(ClaseGrupalRepository claseGrupalRepository){
        this.claseGrupalRepository = claseGrupalRepository;
    }

    //TRAER TODOS
    public List<ClaseGrupal> traertodos(){
        return claseGrupalRepository.findAll();
    }

    //TRAER UNO
    public Optional<ClaseGrupal> traerUno(int id){
        return claseGrupalRepository.findById(id);
    }

    //GUARDAR
    public ClaseGrupal  guardar (ClaseGrupal claseGrupal){
        return claseGrupalRepository.save(claseGrupal);
    }
}
