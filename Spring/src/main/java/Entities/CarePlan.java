package Entities;

import java.time.LocalDate;

public class CarePlan {
	
	private Patient patient;
	private LocalDate createDate;
	private LocalDate updateDate;
	private String physician;
	private String homeHealthAide;
	private boolean ptEval;
	private String ptEvalDate;
	private boolean gaitTraining;
	private boolean prostheticTraining;
	private boolean cardioTreatment;
	private boolean muscleReeducation;
	private boolean transferTraining;
	private boolean ultraSound;
	private boolean evalofPcp;
	private boolean homeExerciseProgram;
	private boolean electroTreatement;
	private String notes;
	
	public CarePlan(Patient patient) {
		this.patient = patient;
		LocalDate now = LocalDate.now();
		this.createDate = now;
		this.setUpdateDate(now);
	}

	public String getPhysician() {
		return physician;
	}

	public void setPhysician(String physician) {
		this.physician = physician;
		this.setUpdateDate(LocalDate.now());
	}

	public String getHomeHealthAide() {
		return homeHealthAide;
	}

	public void setHomeHealthAide(String homeHealthAide) {
		this.homeHealthAide = homeHealthAide;
		this.setUpdateDate(LocalDate.now());
	}

	public boolean isPtEval() {
		return ptEval;
	}

	public void setPtEval(boolean ptEval) {
		this.ptEval = ptEval;
		this.setUpdateDate(LocalDate.now());
	}

	public String getPtEvalDate() {
		return ptEvalDate;
	}

	public void setPtEvalDate(String ptEvalDate) {
		this.ptEvalDate = ptEvalDate;
		this.setUpdateDate(LocalDate.now());
	}

	public boolean isGaitTraining() {
		return gaitTraining;
	}

	public void setGaitTraining(boolean gaitTraining) {
		this.gaitTraining = gaitTraining;
		this.setUpdateDate(LocalDate.now());
	}

	public boolean isProstheticTraining() {
		return prostheticTraining;
	}

	public void setProstheticTraining(boolean prostheticTraining) {
		this.prostheticTraining = prostheticTraining;
		this.setUpdateDate(LocalDate.now());
	}

	public boolean isCardioTreatment() {
		return cardioTreatment;
	}

	public void setCardioTreatment(boolean cardioTreatment) {
		this.cardioTreatment = cardioTreatment;
		this.setUpdateDate(LocalDate.now());
	}

	public boolean isMuscleReeducation() {
		return muscleReeducation;
	}

	public void setMuscleReeducation(boolean muscleReeducation) {
		this.muscleReeducation = muscleReeducation;
		this.setUpdateDate(LocalDate.now());
	}

	public boolean isTransferTraining() {
		return transferTraining;
	}

	public void setTransferTraining(boolean transferTraining) {
		this.transferTraining = transferTraining;
		this.setUpdateDate(LocalDate.now());
	}

	public boolean isUltraSound() {
		return ultraSound;
	}

	public void setUltraSound(boolean ultraSound) {
		this.ultraSound = ultraSound;
		this.setUpdateDate(LocalDate.now());
	}

	public boolean isEvalofPcp() {
		return evalofPcp;
	}

	public void setEvalofPcp(boolean evalofPcp) {
		this.evalofPcp = evalofPcp;
		this.setUpdateDate(LocalDate.now());
	}

	public boolean isHomeExerciseProgram() {
		return homeExerciseProgram;
	}

	public void setHomeExerciseProgram(boolean homeExerciseProgram) {
		this.homeExerciseProgram = homeExerciseProgram;
		this.setUpdateDate(LocalDate.now());
	}

	public boolean isElectroTreatement() {
		return electroTreatement;
	}

	public void setElectroTreatement(boolean electroTreatement) {
		this.electroTreatement = electroTreatement;
		this.setUpdateDate(LocalDate.now());
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
		this.setUpdateDate(LocalDate.now());
	}

	public Patient getPatient() {
		return patient;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	private void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}
}
