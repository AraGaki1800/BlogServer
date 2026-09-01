package me.thaoc.user.web;

import me.thaoc.user.config.BlogProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class HelloController {
    private final BlogProperties configProperties;

    public HelloController(BlogProperties configProperties) {
        this.configProperties = configProperties;
    }

    @GetMapping("/hello")
    public String hello() {
        return configProperties.getGreeting();
    }
}
