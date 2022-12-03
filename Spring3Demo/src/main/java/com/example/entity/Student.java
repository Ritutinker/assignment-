package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;//spring boot 3 only 
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "myid")
	private int id;
	@Column(name = "myname", length = 20)
	private String name;
	@Column(name = "myemail", length = 25, unique = true)
	private String email;

}