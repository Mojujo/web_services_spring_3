package se.mojujo.web_services_spring_3.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;

import static org.junit.jupiter.api.Assertions.*;

@WebFluxTest(controllers = UserController.class)
class UserControllerTest {

    @Test
    void getOk() {
    }

    @Test
    void getBadRequest() {
    }

    @Test
    void getInternalServerError() {
    }

    @Test
    void getNotFound() {
    }
}