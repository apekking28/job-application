package com.ilham.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping
public class JobController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/jobs")
    public ResponseEntity<?> getJobList(String token) {
        ResponseEntity<String> response = restTemplate.getForEntity("http://dev3.dansmultipro.co.id/api/recruitment/positions.json", String.class);
        System.out.println("Data " + response.getBody());
        return ResponseEntity.ok(response.getBody());
    }

    @GetMapping("/jobs/{id}")
    public ResponseEntity<?> getJobDetail(@PathVariable String id) {
        ResponseEntity<String> response = restTemplate.getForEntity("http://dev3.dansmultipro.co.id/api/recruitment/positions/" + id, String.class);
        return ResponseEntity.ok(response.getBody());
    }
}
