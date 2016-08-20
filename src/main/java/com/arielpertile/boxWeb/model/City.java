package com.arielpertile.boxWeb.model;

import static javax.persistence.CascadeType.MERGE;
import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.CascadeType.REFRESH;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "city")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = {PERSIST, REFRESH, MERGE})
	@JoinColumn(name = "stateId", nullable = false, unique = false)
	private State state;
	
	@Column(name = "name")
	private String name;

}
