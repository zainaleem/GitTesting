package controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    public String getWelcome() {
        System.out.println("Yes it is ");
        System.out.println("No it is not ");
        System.out.println("learning git ");
        return "HelloWorld";
    }
}
