package com.client.api.model;

import java.io.Serializable;
import java.time.LocalDate;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "users_id")
	private Long id;
	
	private String name;
	
	private String email;
	
	private String phone;
	
	private String cpf;
	
	@Column(name = "dt_subscription")
	private LocalDate dtSubscription = LocalDate.now();
	
	@Column(name = "dt_expiration")
	private LocalDate dtExpiration;
	
	@ManyToOne
	@JoinColumn(name = "user_type_id")
	private UserType type;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subscriptions_type_id")
	private SubscriptionType subscriptionType;
	
	public User() {
		
	}

	public User(Long id, String name, String email, String phone, String cpf, LocalDate dtSubscription,
			LocalDate dtExpiration, UserType type, SubscriptionType subscriptionType) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.cpf = cpf;
		this.dtSubscription = dtSubscription;
		this.dtExpiration = dtExpiration;
		this.type = type;
		this.subscriptionType = subscriptionType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDtSubscription() {
		return dtSubscription;
	}

	public void setDtSubscription(LocalDate dtSubscription) {
		this.dtSubscription = dtSubscription;
	}

	public LocalDate getDtExpiration() {
		return dtExpiration;
	}

	public void setDtExpiration(LocalDate dtExpiration) {
		this.dtExpiration = dtExpiration;
	}

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}

	public SubscriptionType getSubscriptionType() {
		return subscriptionType;
	}

	public void setSubscriptionType(SubscriptionType subscriptionType) {
		this.subscriptionType = subscriptionType;
	}
	
	
}
