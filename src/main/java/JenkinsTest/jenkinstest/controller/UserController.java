package JenkinsTest.jenkinstest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/getUser")
    public String getUser()
    {
        return "This is main page";
    }
}
