package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="tbl_order")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long orderid;
	private String note;
	private String ordername;
	private int price;
	@JoinColumn(name="user_id")
	@ManyToOne(fetch=FetchType.LAZY)//lazy지연전략? 나중에 포린키랑 연결시키겠다
	private User user;
	
}
