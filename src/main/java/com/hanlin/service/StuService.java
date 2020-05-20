package com.hanlin.service;

import java.util.List;

import com.hanlin.pojo.Stu;

public interface StuService {

	List<Stu> getStuList();

	int addStu(Stu stu);

	Stu getStuBySid(Integer sid);

	int updateStuStatus(Integer sid);

}
