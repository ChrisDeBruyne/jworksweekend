package com.example.moviedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Mono;

@RestController("movie")
public class MovieController {

    private String apiKey = "3c5dc7cf33e70ad798ec4337a7a14605";

    @GetMapping
    public Mono<Movie> getMovie(@RequestParam String id){
        RestTemplate restTemplate = new RestTemplate();
        return Mono.just(restTemplate.getForObject("https://api.themoviedb.org/3/movie/"+ id + "?api_key=" + apiKey, Movie.class));
    }
}
