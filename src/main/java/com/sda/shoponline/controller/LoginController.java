package com.sda.shoponline.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

 private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
 public static final String LOGIN = "login";


 @RequestMapping("/login")
 public String showLogin() {
  logger.info("This is the login page of the application!");
  return LOGIN;
 }
}

