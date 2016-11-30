package com.zinute.lucille.data.models;

import java.math.BigDecimal;
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
@Table(name= "loan_details") 
public class LoanDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="loan_id", nullable=false, unique=true, columnDefinition="bigint")
	private Long loanId;
	
	@Column(name="profile_id", nullable=false, columnDefinition="bigint")
	private Long profileId;
	
	@Column(name="loan_role", nullable=false, columnDefinition="char(255)")
	private String loanRole;
	
	@Column(name="installment", nullable=true, columnDefinition="integer")
	private int installment;
	
	@Column(name="rate", nullable=true, columnDefinition="decimal")
	private BigDecimal rate;
	
	@Column(name="created_at", nullable=false, columnDefinition="timestamp with time zone default now()")
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_at;
	
	@Column(name="updated_at", nullable=false, columnDefinition="timestamp with time zone default now()")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updated_at;

	public LoanDetails(Long loanId, Long profileId, String loanRole, int installment, BigDecimal rate, Date created_at,
			Date updated_at) {
		super();
		this.loanId = loanId;
		this.profileId = profileId;
		this.loanRole = loanRole;
		this.installment = installment;
		this.rate = rate;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getLoanId() {
		return loanId;
	}

	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}

	public Long getProfileId() {
		return profileId;
	}

	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}

	public String getLoanRole() {
		return loanRole;
	}

	public void setLoanRole(String loanRole) {
		this.loanRole = loanRole;
	}

	public int getInstallment() {
		return installment;
	}

	public void setInstallment(int installment) {
		this.installment = installment;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

}
