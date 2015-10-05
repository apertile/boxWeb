package com.arielpertile.boxWeb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "champion")
public class Champion{

	@Column(name = "OrgID")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "orgId")
	private Organization organization;
	
	@Column(name = "DivisionID")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "divisionId")
	private Division division;
	
	@Column(name = "BoxerID")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "boxerId")
	private Boxer boxer;
	
	@Column(name = "StartDate")
	private Date startDate;
	
	@Column(name = "EndDate")
	private Date endDate;
	
	@Column(name = "WayOfWinning")
	private String wayOfWinning;
	
	@Column(name = "WayOfLosing")
	private String wayOfLosing;
	
	@Column(name = "CommentsOnWinning")
	private String commentsOnWinning;
	
	@Column(name = "CommentsOnLosing")
	private String commentsOnLosing;

}
