package com.example.moviedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("freddy")
public class FreddyController {

  
    @GetMapping("/lookatme")
    public String getMovie(){

        return "look at me, im doing microservices for movies amagawd";
    }
}

