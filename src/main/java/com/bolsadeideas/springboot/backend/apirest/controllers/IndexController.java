package com.bolsadeideas.springboot.backend.apirest.controllers;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Factura;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = { "http://localhost:4200", "*" })
@Controller
public class IndexController {
    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody String index() {
        return "Hello World";
    }
}
