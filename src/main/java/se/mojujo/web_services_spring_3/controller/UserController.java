package se.mojujo.web_services_spring_3.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    @GetMapping("/ok")
    public ResponseEntity<String> getOk() {

        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/br")
    public ResponseEntity<String> getBadRequest() {

        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/ise")
    public ResponseEntity<String> getInternalServerError() {

        return ResponseEntity.internalServerError().build();
    }

    @GetMapping("/nf")
    public ResponseEntity<String> getNotFound() {

        return ResponseEntity.notFound().build();
    }
}
