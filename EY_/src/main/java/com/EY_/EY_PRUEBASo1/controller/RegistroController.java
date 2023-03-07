package com.EY_.EY_PRUEBASo1.controller;



import com.EY_.EY_PRUEBASo1.dto.RegistroDto;
import com.EY_.EY_PRUEBASo1.dto.RegistroDtoResp;
import com.EY_.EY_PRUEBASo1.service.RegistroService;
import jakarta.validation.Valid;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/registro")
public class RegistroController {
    @Autowired
    private RegistroService registroService;

    public RegistroController(RegistroService registroService) {
        this.registroService = registroService;
    }


    @PostMapping
    public ResponseEntity<RegistroDtoResp> crearRegistro(@Valid @RequestBody RegistroDto registroDto) throws ServiceException {
        return new ResponseEntity<>(registroService.crearRegistro(registroDto), HttpStatus.CREATED);

    }
}