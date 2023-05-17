package com.softtek.fundamentosspring_2;

import com.softtek.fundamentosspring_2.controller.PacienteControlador;
import com.softtek.fundamentosspring_2.repository.IPacienteRepo;
import com.softtek.fundamentosspring_2.service.IPacienteServicio;
import org.springframework.beans.PropertyAccessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.softtek.fundamentosspring_2.model.Paciente;
@SpringBootApplication
public class FundamentosSpring2Application implements CommandLineRunner {
    @Autowired
    IPacienteServicio servicio;
    @Autowired
    IPacienteRepo repo;
    @Autowired
    PacienteControlador controlador;

    public static void main(String[] args) {
        SpringApplication.run(FundamentosSpring2Application.class, args);
    }

    public void run(String... args) throws Exception {
        Paciente p1 = new Paciente(1,"Juan", 27);


        System.out.println(controlador.ObtenerUno(p1));
    }

}
