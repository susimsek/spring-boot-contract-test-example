package io.github.susimsek.consumer.client;

import io.github.susimsek.consumer.model.EventOddDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "evenOdd", url = "${evenOdd.service.url:http://localhost:8090}")
public interface EvenOddClient {

    @GetMapping("/validate/prime-number")
    EventOddDTO isNumberPrime(@RequestParam("number") Integer number);
}