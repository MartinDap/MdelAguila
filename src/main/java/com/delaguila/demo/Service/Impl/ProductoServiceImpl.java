/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.delaguila.demo.Service.Impl;

import com.delaguila.demo.Service.ProductoService;
import com.delaguila.demo.entity.producto;
import com.delaguila.demo.repository.ProductoRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Martín Del Águila
 */
@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoRepository productoRepository;

    @Transactional
    @Override
    public List<producto> findAll() {
        return (List<producto>) productoRepository.findAll();
    }

    @Override
    public producto findById(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public producto save(producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public void delete(producto producto) {
        productoRepository.delete(producto);
    }

    @Override
    public void deleteById(Long id) {
        productoRepository.deleteById(id);
    }
}

