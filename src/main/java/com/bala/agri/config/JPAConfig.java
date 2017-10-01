package com.bala.agri.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by balaji on 1/10/2017.
 */
@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories(value = "com.bala.agri.dao")

public class JPAConfig {

}
