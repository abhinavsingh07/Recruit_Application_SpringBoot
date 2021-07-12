package com.abhiwork.model;

import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.abhiwork.util.ApplicationStatus;
import com.abhiwork.util.LocalDateDeserializer;
import com.abhiwork.util.LocalDateSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


public class JobApplication {
	//made transient to not to include in json body in junit test
	@JsonProperty(value = "job_app_id")
	private transient int jobAppId;


	@Min(value =1, message = "{jobapp.relatedOffer.invalid}")
	@NotNull(message = "{jobapp.relatedOffer.empty}")
	@JsonProperty(value = "job_offer_id")
	private int realtedOffer;


	@NotEmpty(message = "{jobapp.candidateEmail.empty}")
	@JsonProperty(value = "candidate_email")
	private String candidateEmail;
	

	@JsonProperty(value = "resume_text")
	private String resumeText;
	

	@JsonProperty(value = "job_application_status")
	private ApplicationStatus applicationStatus;
	
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonProperty(value = "job_applied_date")
	private LocalDate appliedDate;

	public JobApplication(int realtedOffer, String candidateEmail, String resumeText,
			ApplicationStatus applicationStatus) {
		super();
		this.realtedOffer = realtedOffer;
		this.candidateEmail = candidateEmail;
		this.resumeText = resumeText;
		this.applicationStatus = applicationStatus;
	}

	public JobApplication() {
		// TODO Auto-generated constructor stub
	}

	public int getRealtedOffer() {
		return realtedOffer;
	}

	public void setRealtedOffer(int realtedOffer) {
		this.realtedOffer = realtedOffer;
	}

	public String getResumeText() {
		return resumeText;
	}

	public void setResumeText(String resumeText) {
		this.resumeText = resumeText;
	}

	public ApplicationStatus getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(ApplicationStatus applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public LocalDate getAppliedDate() {
		return appliedDate;
	}

	public void setAppliedDate(LocalDate appliedDate) {
		this.appliedDate = appliedDate;
	}

	public int getJobAppId() {
		return jobAppId;
	}

	public void setJobAppId(int jobAppId) {
		this.jobAppId = jobAppId;
	}

	public String getCandidateEmail() {
		return candidateEmail;
	}

	public void setCandidateEmail(String candidateEmail) {
		this.candidateEmail = candidateEmail;
	}

	@Override
	public String toString() {
		return "JobApplication [realtedOffer=" + realtedOffer + ", candItateEmail=" + candidateEmail + ", resumeText="
				+ resumeText + ", applicationStatus=" + applicationStatus + "]";
	}

}
