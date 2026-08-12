package me.codewithsanket.QueryOpsCloud.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/auth")
public class AuthController {
    @PostMapping("login")
    public String login(){
        return "login successfull";
    }
}
