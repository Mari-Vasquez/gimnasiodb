package com.puce.gimnasio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Maquina {

    @Id
    private int id;
    private String nombre;
    private String marca;
    private int anioCompra;
    private boolean enMantenimiento;
}
