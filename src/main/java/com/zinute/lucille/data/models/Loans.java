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
@Table(name= "loans") 
public class Loans {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="status", nullable=false, columnDefinition="char(255)")
	private String status;
	
	@Column(name="description", nullable=true, columnDefinition="text")
	private String description;
	
	@Column(name="original_grade", nullable=true, columnDefinition="char(255)")
	private String originalGrade;
	
	@Column(name="original_sub_grade", nullable=true, columnDefinition="char(255)")
	private String originalSubGrade;
	
	@Column(name="current_grade", nullable=true, columnDefinition="char(255)")
	private String currentGrade;
	
	@Column(name="current_subgrade", nullable=true, columnDefinition="char(255)")
	private String currentSubGrade;
	
	@Column(name="purpose", nullable=true, columnDefinition="char(255)")
	private String purpose;
	
	@Column(name="loan_type", nullable=true, columnDefinition="char(255)")
	private String loanType;
	
	@Column(name="expiry_date", nullable=true, columnDefinition="timestamp with time zone")
	@Temporal(TemporalType.TIMESTAMP)
	private Date expiryDate;
	
	@Column(name="status_updated_at", nullable=true, columnDefinition="timestamp with time zone")
	@Temporal(TemporalType.TIMESTAMP)
	private Date statusUpdatedAt;
	
	@Column(name="whole_loan_end_date", nullable=true, columnDefinition="timestamp with time zone")
	@Temporal(TemporalType.TIMESTAMP)
	private Date wholeLoanEndDate;
	
	@Column(name="whole_loan_start_date", nullable=true, columnDefinition="timestamp with time zone")
	@Temporal(TemporalType.TIMESTAMP)
	private Date wholeLoanStartDate;
	
	@Column(name="rejection_reason", nullable=true, columnDefinition="text")
	private String rejectionReason;
	
	@Column(name="reapply_months", nullable=true, columnDefinition="integer")
	private int reapplyMonths;
	
	@Column(name="amount_approved", nullable=true, columnDefinition="integer")
	private int amountApproved;
	
	@Column(name="amount_requested", nullable=false, columnDefinition="integer")
	private int amountRequested;
	
	@Column(name="term_months", nullable=true, columnDefinition="integer")
	private int termMonths;
	
	@Column(name="issued_on", nullable=true, columnDefinition="timestamp with time zone")
	@Temporal(TemporalType.TIMESTAMP)
	private Date issuedOn;
	
	@Column(name="asset_status", nullable=true, columnDefinition="char(255)")
	private String assetStatus;
	
	@Column(name="asset_status_date", nullable=true, columnDefinition="timestamp with time zone")
	@Temporal(TemporalType.TIMESTAMP)
	private Date assetStatusDate;
	
	@Column(name="created_at", nullable=false, columnDefinition="timestamp with time zone default now()")
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_at;
	
	@Column(name="updated_at", nullable=false, columnDefinition="timestamp with time zone default now()")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updated_at;

	public Loans(String status, String description, String originalGrade, String originalSubGrade, String currentGrade,
			String currentSubGrade, String purpose, String loanType, Date expiryDate, Date statusUpdatedAt,
			Date wholeLoanEndDate, Date wholeLoanStartDate, String rejectionReason, int reapplyMonths,
			int amountApproved, int amountRequested, int termMonths, Date issuedOn, String assetStatus,
			Date assetStatusDate, Date created_at, Date updated_at) {
		super();
		this.status = status;
		this.description = description;
		this.originalGrade = originalGrade;
		this.originalSubGrade = originalSubGrade;
		this.currentGrade = currentGrade;
		this.currentSubGrade = currentSubGrade;
		this.purpose = purpose;
		this.loanType = loanType;
		this.expiryDate = expiryDate;
		this.statusUpdatedAt = statusUpdatedAt;
		this.wholeLoanEndDate = wholeLoanEndDate;
		this.wholeLoanStartDate = wholeLoanStartDate;
		this.rejectionReason = rejectionReason;
		this.reapplyMonths = reapplyMonths;
		this.amountApproved = amountApproved;
		this.amountRequested = amountRequested;
		this.termMonths = termMonths;
		this.issuedOn = issuedOn;
		this.assetStatus = assetStatus;
		this.assetStatusDate = assetStatusDate;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOriginalGrade() {
		return originalGrade;
	}

	public void setOriginalGrade(String originalGrade) {
		this.originalGrade = originalGrade;
	}

	public String getOriginalSubGrade() {
		return originalSubGrade;
	}

	public void setOriginalSubGrade(String originalSubGrade) {
		this.originalSubGrade = originalSubGrade;
	}

	public String getCurrentGrade() {
		return currentGrade;
	}

	public void setCurrentGrade(String currentGrade) {
		this.currentGrade = currentGrade;
	}

	public String getCurrentSubGrade() {
		return currentSubGrade;
	}

	public void setCurrentSubGrade(String currentSubGrade) {
		this.currentSubGrade = currentSubGrade;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Date getStatusUpdatedAt() {
		return statusUpdatedAt;
	}

	public void setStatusUpdatedAt(Date statusUpdatedAt) {
		this.statusUpdatedAt = statusUpdatedAt;
	}

	public Date getWholeLoanEndDate() {
		return wholeLoanEndDate;
	}

	public void setWholeLoanEndDate(Date wholeLoanEndDate) {
		this.wholeLoanEndDate = wholeLoanEndDate;
	}

	public Date getWholeLoanStartDate() {
		return wholeLoanStartDate;
	}

	public void setWholeLoanStartDate(Date wholeLoanStartDate) {
		this.wholeLoanStartDate = wholeLoanStartDate;
	}

	public String getRejectionReason() {
		return rejectionReason;
	}

	public void setRejectionReason(String rejectionReason) {
		this.rejectionReason = rejectionReason;
	}

	public int getReapplyMonths() {
		return reapplyMonths;
	}

	public void setReapplyMonths(int reapplyMonths) {
		this.reapplyMonths = reapplyMonths;
	}

	public int getAmountApproved() {
		return amountApproved;
	}

	public void setAmountApproved(int amountApproved) {
		this.amountApproved = amountApproved;
	}

	public int getAmountRequested() {
		return amountRequested;
	}

	public void setAmountRequested(int amountRequested) {
		this.amountRequested = amountRequested;
	}

	public int getTermMonths() {
		return termMonths;
	}

	public void setTermMonths(int termMonths) {
		this.termMonths = termMonths;
	}

	public Date getIssuedOn() {
		return issuedOn;
	}

	public void setIssuedOn(Date issuedOn) {
		this.issuedOn = issuedOn;
	}

	public String getAssetStatus() {
		return assetStatus;
	}

	public void setAssetStatus(String assetStatus) {
		this.assetStatus = assetStatus;
	}

	public Date getAssetStatusDate() {
		return assetStatusDate;
	}

	public void setAssetStatusDate(Date assetStatusDate) {
		this.assetStatusDate = assetStatusDate;
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
