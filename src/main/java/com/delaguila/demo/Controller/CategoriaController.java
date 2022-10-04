/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.delaguila.demo.Controller;

import com.delaguila.demo.Service.CategoriaService;
import com.delaguila.demo.entity.categoria;
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
@RequestMapping("/categoria")
@Api(value = "Categoria", description ="Categoria")
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;

    @ApiOperation(value="Lista de categorias")
    @GetMapping("/all")
    public List<categoria> findAll() {
        return categoriaService.findAll();
    }

    @ApiOperation(value="Elimina categoria")
    @GetMapping("/{id}")
    public ResponseEntity<categoria> findById(@PathVariable Long id) {
        categoria categoria = categoriaService.findById(id);
        return ResponseEntity.ok(categoria);
    }

    @ApiOperation(value="Crea categoria")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        categoriaService.deleteById(id);
    }

    @ApiOperation(value="Crea categoria")
    @PostMapping("/save")
    public categoria save(@RequestBody categoria categoria) {
        return categoriaService.save(categoria);
    }

    @ApiOperation(value="Modifica categoria")
    @PutMapping("/update")
    public categoria update(@RequestBody categoria categoria) {
        return categoriaService.save(categoria);
    }
}

