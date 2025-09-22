package org.hrassociation.hrwebapp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix="org.hrassociation.hrwebapp")
public class CustomProperties {

    private String apiUrl;

}