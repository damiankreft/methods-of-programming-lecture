package pl.pja.edu.mp.springboot.restjpademo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @GetMapping("api/hello")
    String hello() {
        return "Hello!";
    }
}
