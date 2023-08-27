package com.heroku.java;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    private static final int FACTOR = 10;

    @PostMapping("/get-calories")
    public ResponseEntity<Integer> calculateStaticNumber(@RequestBody String requestBody) {
        int length = requestBody.length();
        int staticNumber = length/FACTOR;
        return ResponseEntity.ok(staticNumber);
    }
}
