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
@Table(name = "organizationtitle")
public class OrganizationTitle{

	@Id
	@Column(name = "OrgTitleID")
	private Integer orgTitleId;
	
	@Column(name = "OrgID")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "orgId")
	private Organization organization;
	
	@Column(name = "Name")
	private String name;	
	
	@OneToMany(mappedBy="organizationTitle")
	private Set<TitleFight> titlefights;

}
