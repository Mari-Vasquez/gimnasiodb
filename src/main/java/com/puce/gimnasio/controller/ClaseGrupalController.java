package com.puce.gimnasio.controller;

import com.puce.gimnasio.model.ClaseGrupal;
import com.puce.gimnasio.model.Socio;
import com.puce.gimnasio.service.ClaseGrupalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ClaseGrupal")
public class ClaseGrupalController {

    private ClaseGrupalService claseGrupalService;

    public ClaseGrupalController( ClaseGrupalService claseGrupalService){
        this.claseGrupalService = claseGrupalService;
    }

    @GetMapping
    public List<ClaseGrupal> verTodos(){
        return claseGrupalService.traertodos();
    }

    //TRAER UNO
    @GetMapping("/{id}")
    public ResponseEntity<ClaseGrupal> traerUno(@PathVariable int id){
        return claseGrupalService.traerUno(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    //GUARDAR
    @PostMapping
    public ResponseEntity<ClaseGrupal> guardar(@RequestBody  ClaseGrupal claseGrupal){
        ClaseGrupal nuevoClaseGrupal = claseGrupalService.guardar(claseGrupal);
        return new ResponseEntity<>(nuevoClaseGrupal, HttpStatus.CREATED);
    }

}
