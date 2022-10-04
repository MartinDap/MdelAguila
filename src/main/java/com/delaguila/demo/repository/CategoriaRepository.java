/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.delaguila.demo.repository;

import com.delaguila.demo.entity.categoria;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Martín Del Águila
 */

public interface CategoriaRepository extends CrudRepository<categoria, Long>{
    
}
