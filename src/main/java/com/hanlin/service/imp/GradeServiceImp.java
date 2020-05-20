package com.hanlin.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hanlin.mapper.GradeMapper;
import com.hanlin.pojo.Grade;
import com.hanlin.service.GradeService;
@Service
@Transactional
public class GradeServiceImp implements GradeService {
	@Autowired
	private GradeMapper gradeMapper;

	@Override
	public List<Grade> getGradeList() {
		return gradeMapper.getGradeList();
	}

}
