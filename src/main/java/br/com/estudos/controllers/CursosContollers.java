package br.com.estudos.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursosContollers {

    @GetMapping
    public ResponseEntity findAll(){
        return ResponseEntity.noContent().build();
    }

}
