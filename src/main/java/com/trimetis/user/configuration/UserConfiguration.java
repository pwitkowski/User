package com.trimetis.user.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;

@Configuration
public class UserConfiguration {

    @Bean
    public ShaPasswordEncoder encoder() {
        return new ShaPasswordEncoder(256);
    }

}
