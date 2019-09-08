
package com.onlinetutorial.udemi.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import com.onlinetutorial.udemi.serviceimpl.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsServiceImpl userDetailsService;

	@Autowired
	private DataSource dataSource;

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		return bCryptPasswordEncoder;
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());

	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/**");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable();

		http.authorizeRequests().antMatchers( "/login", 
				                              "/login?logout"
				                              ).permitAll();
		
		http
		  .httpBasic().and()
		  .authorizeRequests()
		    .antMatchers(HttpMethod.POST, "/forgetPasswordEnterEmail").permitAll()
		    .antMatchers(HttpMethod.POST, "/forgetPassword").permitAll()
	    .antMatchers(HttpMethod.GET, "/forgetPasswordEnterEmail").permitAll()
	    .antMatchers(HttpMethod.GET, "/forgetPassword").permitAll()
	    .antMatchers(HttpMethod.GET, "/regenerateOtp*").permitAll();
		
		
		
		http.authorizeRequests()
		.antMatchers("/welcome" ,
				     "/signup" ,
				     "/savequestion" ,
				     "/getexcel" ,
				     "/addPassword");

		http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403");

		
		http.authorizeRequests().anyRequest().authenticated().and().formLogin()//
				
				.loginProcessingUrl("/login") // Thid URL from jsp
				.loginPage("/login")          //This url hit by here
				.defaultSuccessUrl("/welcome")
				.failureUrl("/login?error=true")
				.usernameParameter("username")
				.passwordParameter("password") 
				.and().logout().logoutUrl("/login?logout").logoutSuccessUrl("/logoutSuccessful")
		 .and()
         .logout().deleteCookies("JSESSIONID")
          
         .and()
         .rememberMe().key("uniqueAndSecret")
         ;
	
		
		
		 http.authorizeRequests().and() 
		  .rememberMe().tokenRepository(this.persistentTokenRepository()) 
		  .tokenValiditySeconds(1 * 24 * 60 * 60); // 24h
		 
		
	}
   
	@Bean
	public PersistentTokenRepository persistentTokenRepository() {
		JdbcTokenRepositoryImpl db = new JdbcTokenRepositoryImpl();
		db.setDataSource(dataSource);
		return db;
	}
}
