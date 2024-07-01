package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {


    @PostMapping(value = "/test-postapi", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public ResponseEntity testPostApi(@RequestParam Map<String, String> params) {
        System.out.println("test post api params " + params);
        return ResponseEntity.status(HttpStatus.OK).body(params);
    }
}
