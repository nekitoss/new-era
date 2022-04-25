package com.jappware.ms2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class Controller {
    @GetMapping("/ms2/hello")
    public String hello(HttpServletRequest request) {
        return ("Hello from MS2! \n\r" + request.getRequestURL().toString());
    }
}
