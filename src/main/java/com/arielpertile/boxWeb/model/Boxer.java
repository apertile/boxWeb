package com.arielpertile.boxWeb.model;

import java.sql.Date;

import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.CascadeType.MERGE;
import static javax.persistence.CascadeType.REFRESH;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "boxer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Boxer {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
	
	@Column(name = "FirstName")
	private String firstName;
	
	@Column(name = "MiddleNames")
	private String middleNames;
	
	@Column(name = "Surname")
	private String surname;
	
	@Column(name = "BirthDate")
	private Date birthDate;
	
	@Column(name = "TurnedPro")
	private int turnedPro;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = {PERSIST, REFRESH, MERGE})
	@JoinColumn(name = "BirthCity", nullable = true, unique = false)
	private City birthCity;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = {PERSIST, REFRESH, MERGE})
	@JoinColumn(name = "BirthState", nullable = true, unique = false)
	private State birthState;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = {PERSIST, REFRESH, MERGE})
	@JoinColumn(name = "BirthCountry", nullable = true, unique = false)
	private Country birthCountry;
	
	@Column(name = "Wins")
	private int wins;
	
	@Column(name = "Draws")
	private int draws;
	
	@Column(name = "Losses")
	private int losses;
	
	@Column(name = "NoContests")
	private int noContests;
	
	@Column(name = "Disqualifications")
	private int disqualifications;
	
	@Column(name = "Retired")
	private int retired;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = {PERSIST, REFRESH, MERGE})
	@JoinColumn(name = "ResidenceCity", nullable = true, unique = false)
	private City residenceCity;
	
	@Column(name = "Death")
	private Date death;

}
