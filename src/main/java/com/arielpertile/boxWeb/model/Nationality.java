package com.arielpertile.boxWeb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "nationality")
public class Nationality{

	@Id
	private Integer id;
	
	@Column(name = "BoxerID")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "boxerId")
	private Boxer boxer;
	
	@Column(name = "CountryID")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "countryId")
	private Country country;
	
	@Column(name = "UpTo")
	private Date upTo;

}
