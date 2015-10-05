package com.arielpertile.boxWeb.model;

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
@Table(name = "nickname")
public class Nickname{

	@Id
	@Column(name = "NicknameID")
	private Integer nicknameId;
	
	@Column(name = "BoxerID")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "boxerId")
	private Boxer boxer;
	
	@Column(name = "Nickname")
	private String nickname;
	
	@Column(name = "IsPrincipal")
	private Boolean isPrincipal;
}
