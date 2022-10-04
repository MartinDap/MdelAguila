/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.delaguila.demo.Service;

import com.delaguila.demo.entity.producto;
import java.util.List;

/**
 *
 * @author Martín Del Águila
 */
public interface ProductoService {
    
    public List<producto> findAll();

    public producto findById(Long id);

    public producto save(producto producto);

    public void delete(producto producto);

    public void deleteById(Long id);
}
