package com.spring.vault;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties("hashicorpvault")
public class Credential {

    private String username;
    public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String password;
}
