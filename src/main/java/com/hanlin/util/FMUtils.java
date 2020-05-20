package com.hanlin.util;

import java.io.File;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.output.FileWriterWithEncoding;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import freemarker.template.Template;

public class FMUtils {
	
	public static void createHtml(FreeMarkerConfigurer cf,HttpServletRequest req,String ftlName,String htmlName,Map<String, Object> map) throws Exception {
		//创建freemarker配置对象
		//Configuration cf = new Configuration(Configuration.VERSION_2_3_23);
		//cf.setDefaultEncoding("UTF-8");
		//加载模板路径
		ServletContext context = req.getSession().getServletContext();
		//cf.setTemplateLoaderPath(context.getRealPath("/WEB-INF/ftl"));
		//cf.setDirectoryForTemplateLoading(new File(context.getRealPath("/WEB-INF/ftl")));
		//获取指定路径下面的模板文件
		Template tl = cf.getConfiguration().getTemplate("/ftl/"+ftlName+".ftl");
		//Template tl = cf.getTemplate(ftlName+".ftl");
		//文件输出流		
		FileWriterWithEncoding w = new FileWriterWithEncoding(new File(context.getRealPath("html/"+htmlName+".html")),"UTF-8");
		//OutputStreamWriter w = new OutputStreamWriter(new FileOutputStream(context.getRealPath("html/"+htmlName+".html")), "UTF-8");
		String path = req.getContextPath();
		String basePath = req.getScheme()+"://"+req.getServerName()+":"+req.getServerPort()+path+"/";		
		//2.将数据放入数据模型
		map.put("basePath", basePath);
		//3.获取模板生成html
		tl.process(map, w);
		w.flush();
		w.close();
	}
}
