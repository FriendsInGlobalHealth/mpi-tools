package com.mpi.tools.api.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "mpi_matched_record")
public class MatchedRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
    @NotNull
    @Column(updatable = false)
    private Date dateCreated;
    
	@Column(nullable = false, unique = false)
	private String opencr_cruid;

	@NotNull
	@Column(unique = false)
	private String cruid;
	
	@JoinColumn(name="match_issue_id", nullable=false)
	@ManyToOne(optional=false)
	private MatchIssue matchIssue;

	private String givenName;
	private String familyName;
	private String tarvNid;
	private String gender;
	private String birthDate;
	private Boolean transferedTo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public String getOpencr_cruid() {
		return opencr_cruid;
	}
	public void setOpencr_cruid(String opencr_cruid) {
		this.opencr_cruid = opencr_cruid;
	}
	public String getCruid() {
		return cruid;
	}
	public void setCruid(String cruid) {
		this.cruid = cruid;
	}
	public MatchIssue getMatchIssue() {
		return matchIssue;
	}
	public void setMatchIssue(MatchIssue matchIssue) {
		this.matchIssue = matchIssue;
	}
	public String getGivenName() {
		return givenName;
	}
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getTarvNid() {
		return tarvNid;
	}
	public void setTarvNid(String tarvNid) {
		this.tarvNid = tarvNid;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public Boolean getTransferedTo() {
		return transferedTo;
	}
	public void setTransferedTo(Boolean transferedTo) {
		this.transferedTo = transferedTo;
	}
}
