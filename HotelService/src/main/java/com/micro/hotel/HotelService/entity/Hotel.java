package com.micro.hotel.HotelService.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "micro_hotel")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Hotel {

	@Id
	@Column(name = "ID")
	private String id;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Location")
	private String location;
	
	@Column(name = "About")
	private String about;
	
	
	
}
