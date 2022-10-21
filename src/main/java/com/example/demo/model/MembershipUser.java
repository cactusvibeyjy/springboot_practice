package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="membership_user")
public class MembershipUser {
	@Id
	private String email;
	private String name;
	private Date createdDate;
	@OneToOne(mappedBy="owner")
	private MembershipCard card;
	
}
