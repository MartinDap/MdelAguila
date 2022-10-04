/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.delaguila.demo.Controller;

import com.delaguila.demo.Service.ProductoService;
import com.delaguila.demo.entity.producto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Martín Del Águila
 */
@RestController
@RequestMapping("/producto")
@Api(value = "Producto", description ="Producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @ApiOperation(value="Lista de producto")
    @GetMapping("/all")
    public List<producto> findAll() {
        return productoService.findAll();
    }

    @ApiOperation(value="Obten datos de un producto")
    @GetMapping("/{id}")
    public ResponseEntity<producto> findById(@PathVariable Long id) {
        producto producto = productoService.findById(id);
        return ResponseEntity.ok(producto);
    }

    @ApiOperation(value="Elimina producto")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        productoService.deleteById(id);
    }

    @ApiOperation(value="Crea producto")
    @PostMapping("/save")
    public producto save(@RequestBody producto producto) {
        return productoService.save(producto);
    }

    @ApiOperation(value="Modifica producto")
    @PutMapping("/update")
    public producto update(@RequestBody producto producto) {
        return productoService.save(producto);
    }
}
