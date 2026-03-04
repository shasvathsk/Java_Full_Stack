package com.example.happyapi;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeprofileController {
        @PostMapping("/profile")
        public WelcomeProfileModel get(@RequestBody WelcomeProfileModel profile){

            return profile;
        }
}
