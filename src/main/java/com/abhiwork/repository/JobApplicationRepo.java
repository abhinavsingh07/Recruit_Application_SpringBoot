package com.abhiwork.repository;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;

import com.abhiwork.exceptionHandler.ResourceNotFoundException;
import com.abhiwork.model.JobApplication;
import com.abhiwork.util.ApplicationStatus;


/**
 * Respository class for database related operations.For Now using Hashmap to
 * store data temporarily.
 * 
 * @author Abhinav Singh
 *
 */
@Repository
public class JobApplicationRepo implements ObjectRepository<JobApplication> {
	static Map<Integer, JobApplication> jobAppRepo;
	private Integer jobAppId = new Integer(1);

	static {
		jobAppRepo = new HashMap<>();
	}

	JobApplicationRepo() {
	}

	/**
	 * Create a job application by passing object containing fields to persist.
	 */
	public Integer create(JobApplication ja) throws Exception {
		try {
			if (!jobAppRepo.isEmpty()) {
				// auto generated id
				jobAppId = jobAppRepo.entrySet().stream()
						.max((entry1, entry2) -> entry1.getKey() > entry1.getKey() ? 1 : -1).get().getKey() + 1;
			}
			if (JobOfferRepo.jobOfferRepo.get(ja.getRealtedOffer()) == null)
				throw new ResourceNotFoundException("Corresponding Job Offer Not Created Yet");
			ja.setJobAppId(jobAppId);
			// auto generated start date
			ja.setAppliedDate(LocalDate.now());
			ja.setApplicationStatus(ApplicationStatus.APPLIED);
			jobAppRepo.put(jobAppId, ja);
			
			if(new Random().nextBoolean())
				Thread.sleep(1500);
			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return jobAppId;

	}

	/**
	 * Get Job application by id
	 */
	public JobApplication getById(int id) throws Exception {
		JobApplication ja = jobAppRepo.get(id);
		try {
			ja = jobAppRepo.get(id);
			if (ja == null)
				throw new ResourceNotFoundException("Job Application Not Found");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return ja;
	}

	/**
	 * Get all job applications
	 */
	public List<JobApplication> getAll() {
		if(new Random().nextBoolean())
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return jobAppRepo.values().stream().collect(Collectors.toList());
	}

	/**
	 * Update Job application by id
	 */
	public void updateById(JobApplication ja, int id) throws Exception {
		try {
			JobApplication jaNew = jobAppRepo.get(id);
			jaNew.setApplicationStatus(ja.getApplicationStatus());
			jaNew.setCandidateEmail(ja.getCandidateEmail());
			jaNew.setResumeText(ja.getResumeText());
			jobAppRepo.replace(id, jaNew);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
}
