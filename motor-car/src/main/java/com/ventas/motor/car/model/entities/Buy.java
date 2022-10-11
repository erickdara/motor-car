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
@Table(name = "buy")
public class Buy {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@NotBlank(message = "Nombre del vendedor")
    @Column(name = "nameseller")
    private String nameseller;
	
	@NotBlank(message = "ID comprador")
    @Column(name = "iduser")
    private Long iduser;
	
	@NotBlank(message = "Nombre del comprador")
    @Column(name = "namespurchaser")
    private String namespurchaser;
	
	@NotBlank(message = "Identificacion del comprador")
    @Column(name = "idnames")
    private String idnames;
	
	@NotBlank(message = "Fecha compra")
    @Column(name = "date")
    private String date;
	
	@NotBlank(message = "Medio Pago")
    @Column(name = "paying")
    private String paying;
	
	@NotBlank(message = "Nombre del vehiculo son Requeridos")
    @Column(name = "names")
    private String names;
	
	@NotBlank(message = "cantidad")
    @Column(name = "quantity")
    private String quantity;
	
	@NotBlank(message = "descripcion")
    @Column(name = "description")
    private String description;
	
	@NotBlank(message = "valor del vehiculo son Requeridos")
    @Column(name = "price")
    private String price;
	
	
	
	
}