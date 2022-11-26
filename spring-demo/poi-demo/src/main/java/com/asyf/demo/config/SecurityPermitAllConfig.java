package com.asyf.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Author yjz
 * @Date 2022/1/16 11:06
 */
@Configuration
public class SecurityPermitAllConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/", "/hello").permitAll()
                .antMatchers("/actuator/**").permitAll()
                .antMatchers("/instances").permitAll()
                .anyRequest().permitAll()
                .and().csrf().disable();
    }

}
