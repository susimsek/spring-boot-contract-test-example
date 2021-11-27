package io.github.susimsek.consumer.controller;

import io.github.susimsek.consumer.client.EvenOddClient;
import io.github.susimsek.consumer.model.EventOddDTO;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class BasicMathController {

    final EvenOddClient evenOddClient;

    @GetMapping("/calculate")
    public EventOddDTO checkOddAndEven(@RequestParam("number") Integer number) {
        return evenOddClient.isNumberPrime(number);
    }
}