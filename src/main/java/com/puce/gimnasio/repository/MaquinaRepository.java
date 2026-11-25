package com.puce.gimnasio.repository;

import com.puce.gimnasio.model.Maquina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaquinaRepository extends JpaRepository<Maquina, Integer> {
}
