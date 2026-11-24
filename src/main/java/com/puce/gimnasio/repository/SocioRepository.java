package com.puce.gimnasio.repository;

import com.puce.gimnasio.model.Socio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocioRepository extends JpaRepository<Socio, Integer> {
}
