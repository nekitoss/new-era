package com.jappware.ms1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/ms1/hello")
    public String hello() {
        return "Hello from MS1";
    }
}
