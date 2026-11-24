package com.puce.gimnasio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Socio {

    @Id
    private int id;
    private String nombre;
    private String plan;
    private double mensualidad;
    private boolean activo;

}
