package mvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping(path="/home", method=RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("name", "sethi");
		System.out.println("index page");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView modelandview = new ModelAndView();
		modelandview.setViewName("/help");
		modelandview.addObject("name", "sethihardik");
		LocalDateTime now = LocalDateTime.now();
		modelandview.addObject("time",now );
		
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(24);
		marks.add(34);
		modelandview.addObject("marks",marks);
		System.out.println("help");
		return modelandview;
	}
	
 }
