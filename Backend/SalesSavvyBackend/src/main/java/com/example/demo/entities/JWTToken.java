package com.example.demo.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="jwt_tokens")
public class JWTToken {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer tokenId;
	
	@ManyToOne
	@JoinColumn(name="user_id", nullable = false)
	User user;
	
	@Column(nullable = false)
	private String token;
	
	@Override
	public String toString() {
		return "JWTToken [tokenId=" + tokenId + ", user=" + user + ", token=" + token + ", expireAt=" + expireAt + "]";
	}
	
	@Column(name = "expires_at")
	private LocalDateTime expireAt;
	
	public JWTToken() {
		// TODO Auto-generated constructor stub
	}

	public Integer getTokenId() {
		return tokenId;
	}

	public void setTokenId(Integer tokenId) {
		this.tokenId = tokenId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public LocalDateTime getExpireAt() {
		return expireAt;
	}

	public void setExpireAt(LocalDateTime expireAt) {
		this.expireAt = expireAt;
	}

	public JWTToken(User user, String token, LocalDateTime expireAt) {
		super();
		this.user = user;
		this.token = token;
		this.expireAt = expireAt;
	}

	public JWTToken(Integer tokenId, User user, String token, LocalDateTime expireAt) {
		super();
		this.tokenId = tokenId;
		this.user = user;
		this.token = token;
		this.expireAt = expireAt;
	}
}
