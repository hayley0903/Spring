package egovframework.com.main.web;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import egovframework.com.main.service.MainService;

@Controller
public class MainController {

	
	//controller에 MainService를 연결
	@Resource(name="MainService")
	private MainService mainService;
	
//	@RequestMapping("/main.do")
//	public String main() {
//		return "main";
//	}
//
//	
//	
//	@RequestMapping("main/student.do")
//	public ModelAndView student() {
//		
//		ModelAndView mv = new ModelAndView("main/student");
//		
//		List<HashMap<String, Object>> list = mainService.selectStudentInfo();
//		mv.addObject("list", list);
//
//		return mv;
//		}
//	
//	//jsp연결
//	@RequestMapping("main/score.do")
//	public ModelAndView score() {
//		
//		ModelAndView mv = new ModelAndView("main/score");
//		
//		List<HashMap<String, Object>> list = mainService.selectScoreInfo();
//		
//		mv.addObject("list", list);
//		return mv;
//	}
	
	
}
