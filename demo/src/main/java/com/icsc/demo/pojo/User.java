package com.icsc.demo.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user") //������Ʈw���W��
public class User {
	
	private Integer id;
	private String firstname;
	private String email;
	private String age;
}
