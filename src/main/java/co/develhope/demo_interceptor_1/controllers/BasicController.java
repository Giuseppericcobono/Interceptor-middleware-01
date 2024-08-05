package co.develhope.demo_interceptor_1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/time")
public class BasicController {

    @GetMapping("/now")
    public String getLocalDateTime() {
        return LocalDateTime.now().toString();
    }
}
