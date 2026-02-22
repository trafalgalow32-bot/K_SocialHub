package com.social.main;

import com.social.model.SocialIssue;

public class Main {

	public static void main(String[] args) {
		// 1. 객체 생성
		SocialIssue Electric = new SocialIssue(
			"에너지",
			"전력수급",
			"AI 데이터센터 증설에 따른 전략 인프라 확충 문제",
			3
		);
		
		// 2. 출력 확인
		System.out.println("분야: " + Electric.getCatogory());
		System.out.println("문제: " + Electric.getIssueName());
	}

}
