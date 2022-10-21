package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="membership_card")
public class MembershipCard {
	@Id
	@Column(name="card_number")
	private String cardNumber;
	private Date expiryDate;
	private boolean enabled;
	@OneToOne //즉시전력? vs.지연전력?
	@JoinColumn(name="user_email")
	private MembershipUser owner;
}
