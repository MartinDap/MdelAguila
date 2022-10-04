/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.delaguila.demo.Service.Impl;

import com.delaguila.demo.Service.CategoriaService;
import com.delaguila.demo.entity.categoria;
import com.delaguila.demo.repository.CategoriaRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Martín Del Águila
 */
@Service
public class CategoriaServiceImpl implements CategoriaService{
    
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Transactional
    @Override
    public List<categoria> findAll() {
        return (List<categoria>) categoriaRepository.findAll();
    }

    @Override
    public categoria findById(Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    @Override
    public categoria save(categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public void delete(categoria categoria) {
        categoriaRepository.delete(categoria);
    }

    @Override
    public void deleteById(Long id) {
        categoriaRepository.deleteById(id);
    }
}

