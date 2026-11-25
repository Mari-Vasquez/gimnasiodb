package com.puce.gimnasio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ClaseGrupal {

    @Id
    private int id;
    private String nombre;
    private String instructor;
    private String horario;
    private int cupos;
}
