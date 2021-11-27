package io.github.susimsek.producer.controller;

import io.github.susimsek.producer.model.EventOddDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenOddController {

    @GetMapping("/validate/prime-number")
    public EventOddDTO isNumberPrime(@RequestParam("number") Integer number) {
        return EventOddDTO.builder()
                .result(number % 2 == 0 ? "Even" : "Odd")
                .build();
    }
}