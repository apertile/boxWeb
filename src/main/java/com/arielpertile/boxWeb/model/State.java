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
@Table(name = "state")
public class State {

	@Id
	@Column(name = "StateID")
	private int stateId;
	
	@Column(name = "CountryID")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "countryId")
	private Country country;
	
	@Column(name = "Name")
	private String name;
	
	@OneToMany(mappedBy="cityId")
	private Set<City> cities;

}
