package com.korea.domain;

import org.junit.Test;

import lombok.NoArgsConstructor;

public class DTOTest {
	
	@Test
	public void test() {
//		TestDTO dto =new TestDTO("P Look","29","남산 앞에");
//		dto.setAddr("평양");
		
		
		TestDTO dto = TestDTO.builder()
				.age("55")
				.name("피루")
				.addr("주소")
				.build();
				System.out.println(dto);
	}

}
