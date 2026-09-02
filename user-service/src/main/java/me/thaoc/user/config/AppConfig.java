package me.thaoc.user.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "blog")
@RefreshScope
@Getter
@Setter
public class AppConfig {
    private String greeting = "default";

    private Integer pageSize = 1;
}
