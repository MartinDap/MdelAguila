/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.delaguila.demo.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Martín Del Águila
 */
@Data
@Entity
@Table(name = "producto")
public class producto {
// 6
    @Id
    @Column(name = "prod_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prodId;

    @Column(name = "prod_nombre")
    private String prodNombre;

    @Column(name = "prod_descripcion")
    private String prodDescripcion;

    @Column(name = "prod_fecha_vencimiento")
    private String prodFechaVencimiento;

    @Column(name = "prod_precio")
    private String prodPrecio;

    @Column(name = "prod_cantidad")
    private String prodCantidad;

    @ManyToOne //De muchos a uno
    @JoinColumn(name = "cate_id")
    private categoria categoria;
}



