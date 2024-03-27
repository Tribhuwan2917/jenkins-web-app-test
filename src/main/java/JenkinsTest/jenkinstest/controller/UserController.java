package JenkinsTest.jenkinstest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/getUser")
    public String getUser()
    {
        System.out.println("Hi I am New +++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        return "This is main page";
    }
}
//
//C:\Users\tribhuvan pal\Desktop\jenkins-test\target\jenkins-test-0.0.1-SNAPSHOT.war