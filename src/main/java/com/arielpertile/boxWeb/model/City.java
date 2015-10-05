package com.arielpertile.boxWeb.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "city")
public class City{

	@Id
	@Column(name = "CityID")
	private Integer cityId;
	
	@Column(name = "StateID")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "stateId")
	private State state;	
	
	@Column(name = "Name")
	private String name;
	
	@OneToMany(mappedBy="birthCity")
	private Set<Boxer> boxersForBirthCity;
	
	@OneToMany(mappedBy="residenceCity")
	private Set<Boxer> boxersForResidenceCityId;
	
	@OneToMany(mappedBy="city")
	private Set<Fight> fights;
	

}
