package com.productcateg.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role implements Serializable {
	
	@Id
	@GeneratedValue
	private long id;
	private String roleName;
	
	
	public Role(String roleName) {
		super();
		this.roleName = roleName;
	}
	
	

}
