package com.arielpertile.boxWeb.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "division")
public class Division{

	@Id
	@Column(name = "DivisionID")
	private Integer divisionId;
	
	@Column(name = "Name")
	private String name;
	
	@OneToMany(mappedBy="division")
	private Set<TitleFight> titlefights;
	
	@OneToMany(mappedBy="division")
	private Set<BoxerRanking> boxerrankings;
	
	@OneToMany(mappedBy="division")
	private Set<Fight> fights;

}
