/*package com.openclassrooms.climbing.security;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private DataSource dataSource;
	
	//ressayer le tout avec keyword ctrl-space

	protected void configure (AuthenticationManagerBuilder auth) throws Exception {
		//specifier ou sont les utilisateurs et leurs rôles, c'est la strategie. est-ce que les utilisateurs sont stockés dans une bdd,fichier text, memoire, annuaire ldap etc .
		
		//BCryptPasswordEncoder bcpe = new BCryptPasswordEncoder();
		System.out.println();
		super.configure(auth);
		
		//Pour le cas ou les utilisateurs sont stockés dans une base, la même base de données del'application
		auth.jdbcAuthentication()
		.dataSource(dataSource) // Data source de l'application
		.usersByUsernameQuery("select email as principal, password as credentials, active "
				+ "from web_user where email=?") //Requête SQL pour chercher si l'utilisateur existe
		.authoritiesByUsernameQuery("select email as principal, role as role "
				+ "from web_user_role where email=?") // Reqête SQL pour connaître les rôles de l'utilisateurs
		.rolePrefix("ROLE_") // Prefixe ajouté au Rôle par EX ROLE_ADMIN
		.passwordEncoder(new BCryptPasswordEncoder());

	}

	protected void configure(HttpSecurity http) throws Exception {

		super.configure(http);
	}

}
*/