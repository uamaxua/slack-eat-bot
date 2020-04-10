package com.catware.eatapp.slack.config;

import com.catware.eatapp.slack.handler.HelloCommandHandler;
import com.slack.api.bolt.App;
import com.slack.api.bolt.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    private final HelloCommandHandler helloCommandHandler;

    @Value("${slack.signingSecret}")
    private String signingSecret;

    @Value("${slack.botToken}")
    private String botToken;

    public Config(HelloCommandHandler helloCommandHandler) {
        this.helloCommandHandler = helloCommandHandler;
    }

    @Bean
    public AppConfig appConfig() {
        AppConfig appConfig = new AppConfig();
        appConfig.setSigningSecret(signingSecret);
        appConfig.setSingleTeamBotToken(botToken);
        return appConfig;
    }

    @Bean
    public App app(@Autowired AppConfig appConfig) {
        App app = new App(appConfig);
        app.command("/hello", helloCommandHandler);
        return app;
    }
}