package com.interview.problem.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Feedback {

	//TODO: add pattern matching here for refund to make sure that feedback does not contain "refund"
	@Size(min = 0, max = 250, message = "Feedback is limited to 250 characters.")
	@NotNull
	private String satisfied;
	
	@Size(min = 0, max = 250, message = "Feedback is limited to 250 characters.")
	@NotNull
	private String notSatisfied;
	
	@Size(min = 0, max = 250, message = "Feedback is limited to 250 characters.")
	@NotNull
	private String improvements;

	public String getSatisfied() {
		return satisfied;
	}

	public void setSatisfied(String satisfiedIn) {
		satisfied = satisfiedIn;
	}

	public String getNotSatisfied() {
		return notSatisfied;
	}

	public void setNotSatisfied(String notSatisfiedIn) {
		notSatisfied = notSatisfiedIn;
	}

	public String getImprovements() {
		return improvements;
	}

	public void setImprovements(String improvementsIn) {
		improvements = improvementsIn;
	}

}
