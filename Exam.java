package com.apjsfa.hibernate;

public class Exam {

	private Integer examId;
	private String examName;
	private Integer totalscore;
public Exam() {
		
	}
	public Exam(Integer examId, String examName, Integer totalscore) {
		super();
		this.examId = examId;
		this.examName = examName;
		this.totalscore = totalscore;
	}
	public Integer getExamId() {
		return examId;
	}
	public void setExamId(Integer examId) {
		this.examId = examId;
	}
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public Integer getTotalscore() {
		return totalscore;
	}
	public void setTotalscore(Integer totalscore) {
		this.totalscore = totalscore;
	}
	public void setMarks(int i) {
		// TODO Auto-generated method stub
		
	}
	

}
