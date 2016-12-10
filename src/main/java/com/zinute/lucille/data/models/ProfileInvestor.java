package com.zinute.lucille.data.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity  
@Table(name= "profile_investor") 
public class ProfileInvestor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="profile_id", nullable=false, unique=true, columnDefinition="bigint")
	private Long profileId;
	
	@Column(name="pan", nullable=false, columnDefinition="char(255)")
	private String pan;
	
	@Column(name="nominee_first_name", nullable=true, columnDefinition="char(255)")
	private String nomineeFirstName;
	
	@Column(name="nominee_last_name", nullable=true, columnDefinition="char(255)")
	private String nomineeLastName;
	
	@Column(name="nominee_title", nullable=true, columnDefinition="char(255)")
	private String nomineeTitle;
	
	@Column(name="nominee_relation", nullable=true, columnDefinition="char(255)")
	private String nomineeRelation;
	
	@Column(name="nominee_dob", nullable=true, columnDefinition="date")
	@Temporal(TemporalType.DATE)
	private Date nomineeDob;
	
	
	public static class Builder{
		
		// Required fields
		private final Long profileId;
		private final String pan;
		
		// Optional fields
		private String nomineeFirstName = null;
		private String nomineeLastName = null;
		private String nomineeTitle = null;
		private String nomineeRelation = null;
		private Date nomineeDob = null;
		
		public Builder(Long profileId, String pan) {
			super();
			this.profileId = profileId;
			this.pan = pan;
		}

		public Builder setNomineeFirstName(String nomineeFirstName) {
			this.nomineeFirstName = nomineeFirstName;
			return this;
		}

		public Builder setNomineeLastName(String nomineeLastName) {
			this.nomineeLastName = nomineeLastName;
			return this;
		}

		public Builder setNomineeTitle(String nomineeTitle) {
			this.nomineeTitle = nomineeTitle;
			return this;
		}

		public Builder setNomineeRelation(String nomineeRelation) {
			this.nomineeRelation = nomineeRelation;
			return this;
		}

		public Builder setNomineeDob(Date nomineeDob) {
			this.nomineeDob = nomineeDob;
			return this;
		}
		
	}
	

	public ProfileInvestor(Builder builder) {
		this.profileId = builder.profileId;
		this.pan = builder.pan;
		this.nomineeFirstName = builder.nomineeFirstName;
		this.nomineeLastName = builder.nomineeLastName;
		this.nomineeTitle = builder.nomineeTitle;
		this.nomineeRelation = builder.nomineeRelation;
		this.nomineeDob = builder.nomineeDob;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProfileId() {
		return profileId;
	}

	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getNomineeFirstName() {
		return nomineeFirstName;
	}

	public void setNomineeFirstName(String nomineeFirstName) {
		this.nomineeFirstName = nomineeFirstName;
	}

	public String getNomineeLastName() {
		return nomineeLastName;
	}

	public void setNomineeLastName(String nomineeLastName) {
		this.nomineeLastName = nomineeLastName;
	}

	public String getNomineeTitle() {
		return nomineeTitle;
	}

	public void setNomineeTitle(String nomineeTitle) {
		this.nomineeTitle = nomineeTitle;
	}

	public String getNomineeRelation() {
		return nomineeRelation;
	}

	public void setNomineeRelation(String nomineeRelation) {
		this.nomineeRelation = nomineeRelation;
	}

	public Date getNomineeDob() {
		return nomineeDob;
	}

	public void setNomineeDob(Date nomineeDob) {
		this.nomineeDob = nomineeDob;
	}
	

}
