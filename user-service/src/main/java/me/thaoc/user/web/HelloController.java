package me.thaoc.user.web;

import jakarta.annotation.Resource;
import me.thaoc.common.config.CommConfig;
import me.thaoc.user.config.AppConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Resource
    private final AppConfig appConfig;
    @Resource
    private final CommConfig commConfig;

    public HelloController(AppConfig appConfig, CommConfig commConfig) {
        this.appConfig = appConfig;
        this.commConfig = commConfig;
    }

    @GetMapping("/hello")
    public String hello() {
        return appConfig.getGreeting();
    }

    @GetMapping("/page-size")
    public Integer pageSize() {
        return appConfig.getPageSize();
    }

    @GetMapping("/timeout")
    public Integer timeout() {
        return commConfig.getTimeout();
    }
}
