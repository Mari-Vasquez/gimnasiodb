package com.puce.gimnasio.service;

import com.puce.gimnasio.model.Maquina;
import com.puce.gimnasio.model.Socio;
import com.puce.gimnasio.repository.MaquinaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaquinaService {

    private MaquinaRepository maquinaRepository;

    public MaquinaService(MaquinaRepository maquinaRepository){
        this.maquinaRepository = maquinaRepository;
    }

    //TRAER TODOS
    public List<Maquina> traerTodos(){
        return maquinaRepository.findAll();
    }

    //TRAER UNO
    public Optional<Maquina> traerUno(int id){
        return maquinaRepository.findById(id);
    }

    //GUARDAR
    public Maquina  guardar (Maquina maquina){
        return maquinaRepository.save(maquina);
    }

}
