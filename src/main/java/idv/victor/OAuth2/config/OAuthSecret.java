package idv.victor.OAuth2.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ConfigurationProperties(prefix = "line.oauth")
@Data
public class OAuthSecret {
    private String channelID;
    private String channelSecret;
}
