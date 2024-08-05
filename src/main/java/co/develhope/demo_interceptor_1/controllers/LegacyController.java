package co.develhope.demo_interceptor_1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/legacy")
public class LegacyController {

    @GetMapping("/oldcode")
    public String getMessage() {
        return "This is just old code";
    }
}
