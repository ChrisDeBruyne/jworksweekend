package com.example.moviedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController("movie")
public class MovieController {

    private String apiKey = "3c5dc7cf33e70ad798ec4337a7a14605";

    @GetMapping
    public String getMovie(@RequestParam String id){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://api.themoviedb.org/4/list/"+ id + "?page=1&api_key=" + apiKey, String.class);
    }
}
