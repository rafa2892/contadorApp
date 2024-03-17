package com.app.contador.controller;
import com.app.contador.DTO.ViajeDTO;
import com.app.contador.modelo.Conductor;
import com.app.contador.modelo.Viaje;
import com.app.contador.repositorio.ConductorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/v1/")
@CrossOrigin
public class ConductorControlador {

    @Autowired
    private ConductorRepositorio conductorRepositorio;

    @GetMapping("/conductores")
    public List<Conductor> listAll() {
        return conductorRepositorio.findAll();
    }

}