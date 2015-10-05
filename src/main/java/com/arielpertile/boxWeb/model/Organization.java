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
@Table(name = "organization")
public class Organization{

	@Id
	@Column(name = "OrgID")
	private Integer orgId;
	
	@Column(name = "Accronym")
	private String accronym;
	
	@Column(name = "FullName")
	private String fullName;
	
	@OneToMany(mappedBy="organization")
	private Set<OrganizationTitle> organizationtitles;
}
