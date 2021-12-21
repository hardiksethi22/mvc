package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	@RequestMapping("/one")
	public RedirectView one() {
		
		System.out.println("this is one");
		//return "redirect:/two";
		RedirectView redirect = new RedirectView();
		redirect.setUrl("two");
		return redirect;
	}
	
	@RequestMapping("/two")
	public String two () {
		
		System.out.println("this is two");
		return "";
	}
 }
