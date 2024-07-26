package com.ada.raylwag.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")  // Asegúrate de que este es el mapeo correcto
public class Namecontroller {

    @GetMapping
    public String getName() {
        return "katherin roca"; // Reemplaza "Tu Nombre" con tu nombre real
    }
}
