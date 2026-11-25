package com.puce.gimnasio.controller;

import com.puce.gimnasio.model.Socio;
import com.puce.gimnasio.service.SocioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/socio")
public class SocioController {

    private SocioService socioService;

    public SocioController( SocioService socioService){
        this.socioService = socioService;
    }

    @GetMapping
    public List<Socio> verTodos(){
        return socioService.traerTodos();
    }

    //TRAER UNO
    @GetMapping("/{id}")
    public ResponseEntity<Socio> traerUno(@PathVariable int id){
        return socioService.traerUno(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    //GUARDAR
    @PostMapping
    public ResponseEntity<Socio> guardar(@RequestBody  Socio socio){
        Socio nuevoSocio = socioService.guardar(socio);
        return new ResponseEntity<>(nuevoSocio, HttpStatus.CREATED);
    }

}
