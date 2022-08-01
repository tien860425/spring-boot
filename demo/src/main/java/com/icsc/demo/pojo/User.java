package com.icsc.demo.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user") //對應資料庫表的名稱
public class User {
	
	private Integer id;
	private String firstname;
	private String email;
	private String age;
}
