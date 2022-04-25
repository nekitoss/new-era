package com.jappware.ms1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class Controller {
    @GetMapping("/ms1/hello")
    public String hello(HttpServletRequest request) {
        return ("Hello from MS1! \n\r" + request.getRequestURL().toString());
    }
}
