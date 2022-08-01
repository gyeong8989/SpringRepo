package com.korea.mapper;

import org.apache.ibatis.annotations.Select;

public interface TestMapper {

	@Select("SElECT sysdate from dual")
	public String getTime();
}
