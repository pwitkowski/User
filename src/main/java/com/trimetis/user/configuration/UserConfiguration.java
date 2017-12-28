package com.trimetis.user.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

public class UserConfiguration extends WebMvcConfigurerAdapter {

    public UserConfiguration() {
        super();
    }

    @Bean
    public ShaPasswordEncoder encoder() {
        return new ShaPasswordEncoder(256);
    }

}
