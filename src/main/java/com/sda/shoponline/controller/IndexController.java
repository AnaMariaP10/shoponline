package com.sda.shoponline.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
    public static final String HOMEPAGE = "homepage";

    @RequestMapping("/homepage")
    public String showIndex() {
        logger.info("This is the homepage of the application!");
        return HOMEPAGE;
    }
}
