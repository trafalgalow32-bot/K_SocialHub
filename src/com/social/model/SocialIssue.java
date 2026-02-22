package com.social.model;

/*
 사회문제해결 R&D 소개를 위한 데이터 모델 클래스
 10대 분야 43개 사회문제 중 "전력 수급" 분야 데이터를 기반으로 설계 
  */

public class SocialIssue {
	// 1. 속성 (Fields)
	private String catogory; // 10대 분야
	private String issueName; // 43개 세부 문제
	private String description; // 문제 정의 및 현황
	private int priority; // 중요도 또는 우선 순위
	
	// 2. 생성자 (Constructor)
	public SocialIssue(String catogory, String issueName, String description, int priority) {
		this.catogory = catogory;
		this.issueName = issueName;
		this.description = description;
		this.priority = 3; // 기본값 설정
	}
	
	// 3. 기능 (Methods) - Getter/Setter
	public String getCatogory() {
		return catogory;
	}

	public void setCatogory(String catogory) {
		this.catogory = catogory;
	}

	public String getIssueName() {
		return issueName;
	}

	public void setIssueName(String issueName) {
		this.issueName = issueName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
	

	
	
	
}
