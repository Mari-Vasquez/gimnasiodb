package com.puce.gimnasio.controller;

import com.puce.gimnasio.model.Maquina;
import com.puce.gimnasio.model.Socio;
import com.puce.gimnasio.service.MaquinaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/maquina")
public class MaquinaController {

    private MaquinaService maquinaService;

    public MaquinaController( MaquinaService maquinaService){
        this.maquinaService = maquinaService;
    }

    @GetMapping
    public List<Maquina> verTodos(){
        return maquinaService.traerTodos();
    }

    //TRAER UNO
    @GetMapping("/{id}")
    public ResponseEntity<Maquina> traerUno(@PathVariable int id){
        return maquinaService.traerUno(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    //GUARDAR
    @PostMapping
    public ResponseEntity<Maquina> guardar(@RequestBody  Maquina maquina){
        Maquina nuevoMaquina = maquinaService.guardar(maquina);
        return new ResponseEntity<>(nuevoMaquina, HttpStatus.CREATED);
    }

}
