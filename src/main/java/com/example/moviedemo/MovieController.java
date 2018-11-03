package com.example.moviedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("movie")
public class MovieController {

    @GetMapping
    public String getMovie(){
        return "bla";
    }
}
