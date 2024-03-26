package com.ohgiraffers.docker.dockerController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerController {

    @GetMapping
    public ResponseEntity test(){
        return ResponseEntity.ok("hello docker");
    }
}
