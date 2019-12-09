package com.jangjur.template.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * testController
 */
@RestController
public class testController {

    @GetMapping("/")
    public int test() {
        return 1;
    }
}