package com.micro.user.service.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "micro_users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

	@Id
	@Column(name = "ID")
	public String userId;
	
	@Column(name = "Name")
	public String name;
	
	@Column(name = "Email")
	public String email;
	
	@Column(name = "About")
	public String about;
	
	@Transient
    ArrayList<Rating> rating = new ArrayList<Rating>();
	
	
}
