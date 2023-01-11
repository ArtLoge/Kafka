package com.promad.Kafka.controller;

import com.promad.Kafka.helper.ProductorKafka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessageController {

    @Autowired
    private ProductorKafka productor;

    @GetMapping("/{mensaje}")
    public String enviarMensaje(@PathVariable String mensaje) {
        String respuesta = "Envio exitoso";
        try {
            productor.sendMessage(mensaje);

        } catch (Exception e) {
            respuesta = "Envio fallido";
        }
        return respuesta;
    }
}
