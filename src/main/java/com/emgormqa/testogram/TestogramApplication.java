package com.emgormqa.testogram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/api/v1")
public class TestogramApplication {

    public static void main(String[] args) { SpringApplication.run(TestogramApplication.class, args);}

    @GetMapping("/date")
    public String date(){
        String date = String.valueOf(LocalDateTime.now());
        return(date);
    }
}
