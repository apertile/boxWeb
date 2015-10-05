package com.arielpertile.boxWeb.model;
// default package
// Generated Oct 2, 2015 1:41:22 AM by Hibernate Tools 4.0.0

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
@Table(name = "boxerranking")
public class BoxerRanking{

	@Id
	@Column(name = "BoxerRankingID")
	private Integer boxerRankingId;
	
	@Column(name = "BoxerID")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "boxerId")
	private Boxer boxer;
	
	@Column(name = "RankingEntityID")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "rankingEntityId")
	private RankingEntity rankingentity;
	
	@Column(name = "DivisionID")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "divisionId")
	private Division division;	
	
	@Column(name = "RankingDate")
	private Date rankingDate;
	
	@Column(name = "Ranking")
	private Integer ranking;

}
