package com.cliente.escola.gradecurricular.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/materia")
public class MateriaController {

    @GetMapping("/")
    public ResponseEntity<String>helloWordRest(){
        return ResponseEntity.status(HttpStatus.OK).body("Ola mundo Rest");
    }
}
