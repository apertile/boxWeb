package com.arielpertile.boxWeb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "boxing.boxer")
@NamedQueries({
	@NamedQuery(name = Boxer.GET_BOXER, query = Boxer.GET_BOXER_BY_SURNAME_AND_FIRSTNAME)})
public class Boxer {
	
	@Id
	@Column(name = "BoxerID")
	private int boxerId;
	
	@Column(name = "FirstName")
	private String firstName;
	
	public static final String GET_BOXER_BY_SURNAME_AND_FIRSTNAME = "FROM Boxer b "
			+ "WHERE b.surname = :surname "
			+ "AND b.firstName = :firstName";
	
	public static final String GET_BOXER = "GET_BOXER";

}
