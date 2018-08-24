package com.greenfoxacademy.groot.controller;

import com.greenfoxacademy.groot.models.ErrorMessage;
import com.greenfoxacademy.groot.models.Groot;
import com.greenfoxacademy.groot.models.RestResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {
    @GetMapping("/groot")
    public ResponseEntity<RestResponse> getGrootMessage(@RequestParam(value = "message", required = false) String received) {
        if (received != null) {
            return new ResponseEntity(new Groot(received, "I am Groot!"), HttpStatus.OK);
        } else {
            return new ResponseEntity(new ErrorMessage("I am Groot!"), HttpStatus.BAD_REQUEST);
        }
    }
}
