package com.zinute.lucille.data.models;
import java.io.Serializable;
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
@Table(name= "profile")  
public class Profile implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="email", nullable=false, columnDefinition="char(255)")
	private String email;
	
	@Column(name="title", nullable=false)
	private String title;
	
	@Column(name="first_name", nullable=false, columnDefinition="char(255)")
	private String firstName;
	
	@Column(name="last_name", nullable=false, columnDefinition="char(255)")
	private String lastName;
	
	@Column(name="full_name", nullable=false, columnDefinition="char(255)")
	private String fullName;
	
	@Column(name="password", nullable=false, columnDefinition="char(255)")
	private String password;
	
	@Column(name="has_agreed", nullable=false, columnDefinition="boolean default false")
	private boolean hasAgreed;
	
	@Column(name="member_type", nullable=false)
	private String memberType;
	
	@Column(name="street_address", nullable=false, columnDefinition="text")
	private String streetAddress;
	
	@Column(name="state", nullable=false)
	private String state;
	
	@Column(name="city", nullable=false, columnDefinition="char(255)")
	private String city;
	
	@Column(name="date_of_birth", nullable=false, columnDefinition="date")
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	
	@Column(name="personal_email", nullable=true, columnDefinition="char(255)")
	private String personalEmail;
	
	@Column(name="bank_state", nullable=false)
	private String bankState;
	
	@Column(name="bank_branch", nullable=true, columnDefinition="char(255)")
	private String bankBranch;
	
	@Column(name="bank_ifsc", nullable=true, columnDefinition="char(255)")
	private String bankIfsc;
	
	@Column(name="bank_name", nullable=true, columnDefinition="char(255)")
	private String bankName;
	
	@Column(name="bank_city", nullable=true, columnDefinition="char(255)")
	private String bankCity;
	
	@Column(name="bank_account_number", nullable=true, columnDefinition="char(255)")
	private String bankAccountNumber;
	
	@Column(name="bank_account_type", nullable=true)
	private String bankAccountType;
	
	@Column(name="landline_std_code", nullable=true, columnDefinition="integer")
	private int landlineStdCode;
	
	@Column(name="landline_contact", nullable=true, columnDefinition="bigint")
	private Long landlineContact;
	
	@Column(name="mobile_contact", nullable=false, columnDefinition="bigint")
	private Long mobileContact;
	
	@Column(name="alternate_mobile_contact", nullable=true, columnDefinition="bigint")
	private Long alternateMobileContact;
	
	@Column(name="zip_code", nullable=false, columnDefinition="integer")
	private Long zipCode;
	
	@Column(name="other_comments", nullable=true, columnDefinition="text")
	private String otherComments;
	
	@Column(name="is_staff", nullable=false, columnDefinition="boolean default false")
	private boolean isStaff;
	
	@Column(name="is_active", nullable=false, columnDefinition="boolean default false")
	private boolean isActive;
	
	@Column(name="referral_code", nullable=true, columnDefinition="char(255)")
	private String referralCode;
	
	@Column(name="created_at", nullable=false, columnDefinition="timestamp with time zone default now()")
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_at;
	
	@Column(name="updated_at", nullable=false, columnDefinition="timestamp with time zone default now()")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updated_at;

	public Profile(String email, String title, String firstName, String lastName, String fullName,
			String password, boolean hasAgreed, String memberType, String streetAddress, String state, String city,
			Date dateOfBirth, String personalEmail, String bankState, String bankBranch, String bankIfsc,
			String bankName, String bankCity, String bankAccountNumber, String bankAccountType, int landlineStdCode,
			Long landlineContact, Long mobileContact, Long alternateMobileContact, Long zipCode, String otherComments,
			boolean isStaff, boolean isActive, String referralCode, Date created_at, Date updated_at) {
		super();
		this.email = email;
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = fullName;
		this.password = password;
		this.hasAgreed = hasAgreed;
		this.memberType = memberType;
		this.streetAddress = streetAddress;
		this.state = state;
		this.city = city;
		this.dateOfBirth = dateOfBirth;
		this.personalEmail = personalEmail;
		this.bankState = bankState;
		this.bankBranch = bankBranch;
		this.bankIfsc = bankIfsc;
		this.bankName = bankName;
		this.bankCity = bankCity;
		this.bankAccountNumber = bankAccountNumber;
		this.bankAccountType = bankAccountType;
		this.landlineStdCode = landlineStdCode;
		this.landlineContact = landlineContact;
		this.mobileContact = mobileContact;
		this.alternateMobileContact = alternateMobileContact;
		this.zipCode = zipCode;
		this.otherComments = otherComments;
		this.isStaff = isStaff;
		this.isActive = isActive;
		this.referralCode = referralCode;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isHasAgreed() {
		return hasAgreed;
	}

	public void setHasAgreed(boolean hasAgreed) {
		this.hasAgreed = hasAgreed;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPersonalEmail() {
		return personalEmail;
	}

	public void setPersonalEmail(String personalEmail) {
		this.personalEmail = personalEmail;
	}

	public String getBankState() {
		return bankState;
	}

	public void setBankState(String bankState) {
		this.bankState = bankState;
	}

	public String getBankBranch() {
		return bankBranch;
	}

	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}

	public String getBankIfsc() {
		return bankIfsc;
	}

	public void setBankIfsc(String bankIfsc) {
		this.bankIfsc = bankIfsc;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankCity() {
		return bankCity;
	}

	public void setBankCity(String bankCity) {
		this.bankCity = bankCity;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getBankAccountType() {
		return bankAccountType;
	}

	public void setBankAccountType(String bankAccountType) {
		this.bankAccountType = bankAccountType;
	}

	public int getLandlineStdCode() {
		return landlineStdCode;
	}

	public void setLandlineStdCode(int landlineStdCode) {
		this.landlineStdCode = landlineStdCode;
	}

	public Long getLandlineContact() {
		return landlineContact;
	}

	public void setLandlineContact(Long landlineContact) {
		this.landlineContact = landlineContact;
	}

	public Long getMobileContact() {
		return mobileContact;
	}

	public void setMobileContact(Long mobileContact) {
		this.mobileContact = mobileContact;
	}

	public Long getAlternateMobileContact() {
		return alternateMobileContact;
	}

	public void setAlternateMobileContact(Long alternateMobileContact) {
		this.alternateMobileContact = alternateMobileContact;
	}

	public Long getZipCode() {
		return zipCode;
	}

	public void setZipCode(Long zipCode) {
		this.zipCode = zipCode;
	}

	public String getOtherComments() {
		return otherComments;
	}

	public void setOtherComments(String otherComments) {
		this.otherComments = otherComments;
	}

	public boolean isStaff() {
		return isStaff;
	}

	public void setStaff(boolean isStaff) {
		this.isStaff = isStaff;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getReferralCode() {
		return referralCode;
	}

	public void setReferralCode(String referralCode) {
		this.referralCode = referralCode;
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

