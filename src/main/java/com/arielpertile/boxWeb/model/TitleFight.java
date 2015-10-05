package com.arielpertile.boxWeb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "titlefight")
public class TitleFight{

	@Id
	private Integer id;
	
	@Column(name = "OrgTitleID")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "orgTitleId")
	private OrganizationTitle organizationtitle;
	
	@Column(name = "DivisionID")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "divisionId")
	private Division division;
	
	@Column(name = "FightID")
	@OneToOne(mappedBy="fightId")
	private Fight fight;


}
