package controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

public String getWelcome(){

    return "HelloWorld";
}

}
