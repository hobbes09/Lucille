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

	
	// Builder
	public static class Builder{
		
		// Required parameters
		private final String email;
		private final String title;
		private final String firstName;
		private final String lastName;
		private final String fullName;
		private final String password;
		private final String memberType;
		private final String streetAddress;
		private final String state;
		private final String city;
		private final Date dateOfBirth;
		private final String bankState;
		private final Long mobileContact;
		private final Long zipCode;
		
		
		// Optional parameters
		private boolean hasAgreed = false;
		private String personalEmail = null;
		private String bankBranch = null;
		private String bankIfsc = null;
		private String bankName = null;
		private String bankCity = null;
		private String bankAccountNumber = null;
		private String bankAccountType = null;
		private int landlineStdCode = -1;
		private Long landlineContact = null;
		private Long alternateMobileContact = -1L;
		private String otherComments = null;
		private boolean isStaff = false;
		private boolean isActive = false;
		private String referralCode = null;
		private Date created_at = new Date();
		private Date updated_at = new Date();
		
		public Profile build() {
			return new Profile(this);
		}
		
		public Builder(String email, String title, String firstName, String lastName, String fullName, String password,
				String memberType, String streetAddress, String state, String city, Date dateOfBirth, String bankState,
				Long mobileContact, Long zipCode) {
			this.email = email;
			this.title = title;
			this.firstName = firstName;
			this.lastName = lastName;
			this.fullName = fullName;
			this.password = password;
			this.memberType = memberType;
			this.streetAddress = streetAddress;
			this.state = state;
			this.city = city;
			this.dateOfBirth = dateOfBirth;
			this.bankState = bankState;
			this.mobileContact = mobileContact;
			this.zipCode = zipCode;
		}

		public Builder setHasAgreed(boolean hasAgreed) {
			this.hasAgreed = hasAgreed;
			return this;
		}

		public Builder setPersonalEmail(String personalEmail) {
			this.personalEmail = personalEmail;
			return this;
		}

		public Builder setBankBranch(String bankBranch) {
			this.bankBranch = bankBranch;
			return this;
		}

		public Builder setBankIfsc(String bankIfsc) {
			this.bankIfsc = bankIfsc;
			return this;
		}

		public Builder setBankName(String bankName) {
			this.bankName = bankName;
			return this;
		}

		public Builder setBankCity(String bankCity) {
			this.bankCity = bankCity;
			return this;
		}

		public Builder setBankAccountNumber(String bankAccountNumber) {
			this.bankAccountNumber = bankAccountNumber;
			return this;
		}

		public Builder setBankAccountType(String bankAccountType) {
			this.bankAccountType = bankAccountType;
			return this;
		}

		public Builder setLandlineStdCode(int landlineStdCode) {
			this.landlineStdCode = landlineStdCode;
			return this;
		}

		public Builder setLandlineContact(Long landlineContact) {
			this.landlineContact = landlineContact;
			return this;
		}

		public Builder setAlternateMobileContact(Long alternateMobileContact) {
			this.alternateMobileContact = alternateMobileContact;
			return this;
		}

		public Builder setOtherComments(String otherComments) {
			this.otherComments = otherComments;
			return this;
		}

		public Builder setStaff(boolean isStaff) {
			this.isStaff = isStaff;
			return this;
		}

		public Builder setActive(boolean isActive) {
			this.isActive = isActive;
			return this;
		}

		public Builder setReferralCode(String referralCode) {
			this.referralCode = referralCode;
			return this;
		}

		public Builder setCreated_at(Date created_at) {
			this.created_at = created_at;
			return this;
		}

		public Builder setUpdated_at(Date updated_at) {
			this.updated_at = updated_at;
			return this;
		}
		
	}

	public Profile(Builder builder){
		this.email = builder.email;
		this.title = builder.title;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.fullName = builder.fullName;
		this.password = builder.password;
		this.hasAgreed = builder.hasAgreed;
		this.memberType = builder.memberType;
		this.streetAddress = builder.streetAddress;
		this.state = builder.state;
		this.city = builder.city;
		this.dateOfBirth = builder.dateOfBirth;
		this.personalEmail = builder.personalEmail;
		this.bankState = builder.bankState;
		this.bankBranch = builder.bankBranch;
		this.bankIfsc = builder.bankIfsc;
		this.bankName = builder.bankName;
		this.bankCity = builder.bankCity;
		this.bankAccountNumber = builder.bankAccountNumber;
		this.bankAccountType = builder.bankAccountType;
		this.landlineStdCode = builder.landlineStdCode;
		this.landlineContact = builder.landlineContact;
		this.mobileContact = builder.mobileContact;
		this.alternateMobileContact = builder.alternateMobileContact;
		this.zipCode = builder.zipCode;
		this.otherComments = builder.otherComments;
		this.isStaff = builder.isStaff;
		this.isActive = builder.isActive;
		this.referralCode = builder.referralCode;
		this.created_at = builder.created_at;
		this.updated_at = builder.updated_at;
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

	public Long getId() {
		return id;
	}	
	
}

