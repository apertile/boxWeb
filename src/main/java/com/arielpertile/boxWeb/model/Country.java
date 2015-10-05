package com.arielpertile.boxWeb.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "country")
public class Country{

	@Id
	@Column(name = "CountryID")
	private Integer countryId;
	
	@Column(name = "Code")
	private String code;
	
	@Column(name = "Name")
	private String name;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "nationality", joinColumns = { 
			@JoinColumn(name = "countryId", updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "boxerId", updatable = false) })
	private Set<Boxer> nationalities;
	
	@OneToMany(mappedBy="stateId")
	private Set<State> states;

}
