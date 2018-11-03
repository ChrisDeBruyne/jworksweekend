package com.example.moviedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("movie")
public class MovieController {

    @Autowired
    private RestClient

    @GetMapping
    public String getMovie(){

        return "bla";
    }
}
