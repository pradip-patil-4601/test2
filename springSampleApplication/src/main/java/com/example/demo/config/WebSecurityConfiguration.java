package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter{
	/*
	@Autowired
	UserDetailsService userDetailsService;
	
	@Bean
	AuthenticationProvider authenticationProvider() {
		
		DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
		
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(new BCryptPasswordEncoder());
		
		return provider;
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
		.antMatchers("/customer/**")
		.hasAuthority("ADMIN")
		.antMatchers("/cutomer")
		.hasAuthority("USER")
		.anyRequest()
		.authenticated()
		.and().httpBasic();
	}
*/
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
         .anyRequest().authenticated()
         .and()
         .oauth2Login();
    }
}