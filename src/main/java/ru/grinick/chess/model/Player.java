package ru.grinick.chess.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PLAYER")
public class Player {
	@Id
	@SequenceGenerator(name="PLAYER_GEN", sequenceName="GEN_PLAYER_ID", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="PLAYER_GEN")	
	@Column(name = "ID")
	private Integer id;

	@Column(name = "FIDE_ID")
	private Integer fideId;
	
	@Column(name = "RUSSIAN_ID")
	private Integer russianId;
	
	@Column(name = "FIDE_RATING")
	private Integer fideRating;
	
	@Column(name = "RUSSIAN_RATING")
	private Integer russianRating;
	
	@Column(name = "INTERNAL_RATING")
	private Integer internalRating;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "PERSON_ID")
    private Person person;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getFideId() {
		return fideId;
	}

	public void setFideId(Integer fideId) {
		this.fideId = fideId;
	}

	public Integer getRussianId() {
		return russianId;
	}

	public void setRussianId(Integer russianId) {
		this.russianId = russianId;
	}

	public Integer getFideRating() {
		return fideRating;
	}

	public void setFideRating(Integer fideRating) {
		this.fideRating = fideRating;
	}

	public Integer getRussianRating() {
		return russianRating;
	}

	public void setRussianRating(Integer russianRating) {
		this.russianRating = russianRating;
	}

	public Integer getInternalRating() {
		return internalRating;
	}

	public void setInternalRating(Integer internalRating) {
		this.internalRating = internalRating;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
