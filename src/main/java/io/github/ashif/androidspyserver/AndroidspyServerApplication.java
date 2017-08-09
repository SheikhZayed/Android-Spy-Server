package io.github.ashif.androidspyserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AndroidspyServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AndroidspyServerApplication.class, args);
    }

    @GetMapping(path = "/")
    public String sayHello() {
        return "Hay,How are you ?";
    }
}
