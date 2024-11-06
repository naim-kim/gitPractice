package com.pard.server.git.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {
    @PostMapping("/git")
    public String post() {
        return "post";
    }
}
