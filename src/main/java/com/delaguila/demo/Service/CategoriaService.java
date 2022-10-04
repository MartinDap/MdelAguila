/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.delaguila.demo.Service;

import com.delaguila.demo.entity.categoria;
import java.util.List;

/**
 *
 * @author Martín Del Águila
 */
public interface CategoriaService {
    
    public List<categoria> findAll();

    public categoria findById(Long id);

    public categoria save(categoria categoria);

    public void delete(categoria categoria);

    public void deleteById(Long id);
}
