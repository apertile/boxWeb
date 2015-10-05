package com.arielpertile.boxWeb.model;
// Generated Oct 2, 2015 1:41:22 AM by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "boxer")
public class Boxer {

	@Id
	@Column(name = "boxerID")
	private Integer boxerId;
	
	@Column(name = "BirthCity")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CityId")
	private City birthCity;
	
	@Column(name = "ResidenceCityID")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cityId")
	private City residenceCity;
	
	@Column(name = "FirstName")
	private String firstName;
	
	@Column(name = "MiddleName")
	private String middleName;
	
	@Column(name = "Surname")
	private String surname;
	
	@Column(name = "BirthDate")
	private Date birthDate;
	
	@Column(name = "Debut")
	private Date debut;
	
	@Column(name = "Fights")
	private Integer fights;
	
	@Column(name = "Wins")
	private Integer wins;
	
	@Column(name = "Losses")
	private Integer losses;
	
	@Column(name = "Draws")
	private Integer draws;
	
	@Column(name = "NoContests")
	private Integer noContests;
	
	@Column(name = "Disqualifications")
	private Integer disqualifications;
	
	@Column(name = "Retired")
	private Date retired;
	
	@Column(name = "Stance")
	private String stance;
	
	@Column(name = "Height")
	private Integer height;
	
	@Column(name = "Reach")
	private Integer reach;

	@OneToMany(mappedBy="boxerId1")
	private Set<Fight> fightsForBoxerId1;
	
	@OneToMany(mappedBy="boxerId2")
	private Set<Fight> fightsForBoxerId2;	
	
	@OneToMany(mappedBy="winnerId")
	private Set<Fight> fightsForWinnerId;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "nationality", joinColumns = { 
			@JoinColumn(name = "boxerId", updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "countryId", updatable = false) })
	private Set<Country> nationalities;
	
	@OneToMany(mappedBy="boxer")
	private Set<BoxerRanking> boxerrankings;
	
	@OneToMany(mappedBy="boxer")
	private Set<Nickname> nicknames;
	
	public static final String GET_BOXER_BY_SURNAME_AND_FIRSTNAME = "FROM Boxer b "
			+ "WHERE b.surname = :surname "
			+ "AND b.firstName = :firstName";
	
	public static final String GET_BOXER = "GET_BOXER";
}
