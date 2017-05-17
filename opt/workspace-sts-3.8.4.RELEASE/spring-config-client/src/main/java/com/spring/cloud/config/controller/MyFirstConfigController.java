package com.spring.cloud.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstConfigController {
  @Value("${location}") String luckyWord;

  @RequestMapping("/location")
  public String showLuckyWord() {
    return "The lucky word is: " + luckyWord;
  }
}
