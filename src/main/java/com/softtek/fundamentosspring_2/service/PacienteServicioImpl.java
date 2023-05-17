package com.softtek.fundamentosspring_2.service;

import com.softtek.fundamentosspring_2.model.Paciente;
import com.softtek.fundamentosspring_2.repository.IPacienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class PacienteServicioImpl implements IPacienteServicio{
@Autowired
    IPacienteRepo repo;
    @Override
    public String obtenerUno(Paciente p1) {
        return repo.obtenerUno(p1);
    }
}
