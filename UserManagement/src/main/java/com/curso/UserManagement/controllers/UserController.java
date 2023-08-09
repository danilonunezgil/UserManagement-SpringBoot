package com.curso.UserManagement.controllers;

import com.curso.UserManagement.models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping(value="usuario/{id}")
    public User getUsuario(@PathVariable long id){
        User user = new User();
        user.setId(id);
        user.setName("Danilo");
        user.setLastName("Núñez");
        user.setEmail("dano@unillanos.edu.co");
        user.setPhoneNumber("31234565");
        return user;
    }
}
