package com.hanlin.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hanlin.mapper.StuMapper;
import com.hanlin.pojo.Stu;
import com.hanlin.service.StuService;
@Service
@Transactional
public class StuServiceImp implements StuService {
	
	@Autowired
	private StuMapper stuMapper;

	@Override
	public List<Stu> getStuList() {
		return stuMapper.getStuList();
	}

	@Override
	public int addStu(Stu stu) {
		return stuMapper.insertSelective(stu);
	}

	@Override
	public Stu getStuBySid(Integer sid) {
		return stuMapper.getStuBySid(sid);
	}

	@Override
	public int updateStuStatus(Integer sid) {
		return stuMapper.updateStuStatus(sid);
	}

	
	

}
