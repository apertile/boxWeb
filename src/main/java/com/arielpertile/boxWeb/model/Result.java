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
@Table(name = "result")
public class Result{

	@Id
	@Column(name = "ResultID")
	private Integer resultId;
	
	@Column(name = "")
	private String accronym;
	
	@Column(name = "")
	private String fullName;
	
	@OneToMany(mappedBy="result")
	private Set<Fight> fights;

}
