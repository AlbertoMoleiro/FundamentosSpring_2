package com.softtek.fundamentosspring_2.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Paciente {
    private int idPaciente;
    private String nombre;
    private int edad;
}
