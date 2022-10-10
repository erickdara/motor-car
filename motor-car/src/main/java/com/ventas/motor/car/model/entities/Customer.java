package com.ventas.motor.car.model.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Número de Identificación es Requerido")
    @Column(name = "identification")
    private String identification;

    @NotBlank(message = "Nombres son Requeridos")
    @Column(name = "names")
    private String names;

    @NotBlank(message = "Apellidos son Requeridos")
    @Column(name = "last_names")
    private String last_names;

    @NotBlank(message = "Dirección es Requerida")
    @Column(name = "address")
    private  String address;

    @NotBlank(message = "Teléfono es Requerido")
    @Column(name = "telephone")
    private String telephone;

    @NotBlank(message = "Celular es Requerido")
    @Column(name = "phoneNumber")
    private String phoneNumber;
}
