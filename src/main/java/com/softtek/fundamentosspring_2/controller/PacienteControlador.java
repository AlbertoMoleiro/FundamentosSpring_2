package com.softtek.fundamentosspring_2.controller;

import com.softtek.fundamentosspring_2.model.Paciente;
import com.softtek.fundamentosspring_2.service.IPacienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacienteControlador {
    @Autowired
    IPacienteServicio servicio;

    @GetMapping("/obtenerUno")
    public String ObtenerUno(Paciente p1){
        Paciente paciente=new Paciente(1,"Juan",27);
        return servicio.obtenerUno(paciente);
    }
}
