package com.example.serverless.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@Slf4j
public class HelloWorld {

  @Value("${TARGET:default}")
  private String target;

  @GetMapping("/target")
  public ResponseEntity<String> helloTarget() {
    log.info("hello {}", target);
    return new ResponseEntity<>(target, HttpStatus.OK);
  }

}
