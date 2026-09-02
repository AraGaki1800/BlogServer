package me.thaoc.common.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "common")
@RefreshScope
@Getter
@Setter
public class CommConfig {
    private Integer timeout = 10;
}
