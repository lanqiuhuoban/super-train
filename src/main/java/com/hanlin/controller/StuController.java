package com.hanlin.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import com.hanlin.pojo.Grade;
import com.hanlin.pojo.Stu;
import com.hanlin.service.GradeService;
import com.hanlin.service.StuService;
import com.hanlin.util.FMUtils;

@Controller
@RequestMapping("/stu")
public class StuController {
	@Autowired
	private StuService stuService;
	@Autowired
	private GradeService gradeService;
	@Autowired
	private FreeMarkerConfigurer configuration;

	// toStuList
	@RequestMapping("/toStuList")
	public String toStuList(Model model) {
		List<Stu> slist = stuService.getStuList();
		model.addAttribute("slist", slist);
		return "stu_list";
	}

	// toAdd
	@RequestMapping("/toAdd")
	public String toAdd(Model model) {
		List<Grade> glist = gradeService.getGradeList();
		model.addAttribute("glist", glist);
		return "stu_add";
	}

	// addStu
	@RequestMapping("/addStu")
	@ResponseBody
	public Object addStu(Model model, Stu stu) {
		boolean b = false;
		stu.setStatus(0);
		int i = stuService.addStu(stu);
		b = i > 0 ? true : false;
		return b;
	}

	// creatHTML
	@RequestMapping("/creatHTML")
	@ResponseBody
	public Object creatHTML(Model model, Integer sid, HttpServletRequest request, Map<String, Object> map)
			throws Exception {
		boolean b = false;
		String path = request.getContextPath();
		String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path
				+ "/";
		Stu stu = stuService.getStuBySid(sid);
		map.put("basePath", basePath);
		map.put("stu", stu);
		FMUtils.createHtml(configuration, request, "stu", "stu" + sid, map);
		int i = stuService.updateStuStatus(sid);
		b = i > 0 ? true : false;
		return b;
	}
	// lookHTML

	@RequestMapping("/lookHTML")
	public void lookHTML(Integer sid, HttpServletRequest request, HttpServletResponse response) throws Exception {
		String path = request.getContextPath();
		String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path
				+ "/";
		response.sendRedirect(basePath + "html/stu" + sid + ".html");
	}

	/*
	 * @RequestMapping("/lookHTML") public String lookHTML(Integer
	 * sid,HttpServletRequest request,HttpServletResponse response) throws Exception
	 * { String path = request.getContextPath(); String basePath =
	 * request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()
	 * +path+"/"; return "redirect:"+basePath+"html/stu"+sid+".html"; }
	 */

}
