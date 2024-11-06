package com.example.git_study;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {
    @PostMapping("/git")
    public String post(){
        return "post";
    }

    @PatchMapping("/git")
    public String patch(){
        return "patch";
    }

}
