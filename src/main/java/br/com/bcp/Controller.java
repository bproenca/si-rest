package br.com.bcp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/upper/{value}")
    public String upper(@PathVariable String value) {
        return value.toUpperCase();
    }
}