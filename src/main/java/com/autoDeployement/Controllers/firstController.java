package com.autoDeployement.Controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstController {

    @GetMapping("/view")
    public ResponseEntity<String> view(){
        return ResponseEntity.ok("I am View Page this is second message");
    }
}
