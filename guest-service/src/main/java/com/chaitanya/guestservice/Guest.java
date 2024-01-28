package com.chaitanya.guestservice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="GUEST")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Guest {
	@Id
	@Column(name="GUEST_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="EMAIL_ADDRESS")
	private String emailAddress;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="COUNTRY")
	private String country;
	@Column(name="STATE")
	private String state;
	@Column(name="PHONE_NUMBER")
	private String phoneNumber;
}
