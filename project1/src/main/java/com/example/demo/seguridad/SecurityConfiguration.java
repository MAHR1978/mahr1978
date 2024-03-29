package com.example.demo.seguridad;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
	public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

		@Override
		protected void configure (HttpSecurity httpsecurity) throws Exception {
			
	httpsecurity.authorizeRequests().antMatchers("/").permitAll().and().authorizeRequests().antMatchers("/console/**").permitAll();
			
		httpsecurity.csrf().disable();
		httpsecurity.headers().frameOptions().disable();
		
			
		}
	}
