package com.softtek.fundamentosspring_2.repository;

import com.softtek.fundamentosspring_2.model.Paciente;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

@NoArgsConstructor
@Repository
public class PacienteRepoImpl implements IPacienteRepo{
    @Override
    public String obtenerUno(Paciente p1) {
        return p1.toString();
    }
}
