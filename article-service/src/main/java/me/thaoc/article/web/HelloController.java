package me.thaoc.article.web;

import me.thaoc.article.config.BlogProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
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
