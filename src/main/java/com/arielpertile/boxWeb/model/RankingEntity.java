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
@Table(name = "rankingentity")
public class RankingEntity{

	@Id
	@Column(name = "RankingEntityID")
	private Integer rankingEntityId;
	
	@Column(name = "Name")
	private String name;
	
	@OneToMany(mappedBy="rankingEntity")
	private Set<BoxerRanking> boxerrankings;

}
