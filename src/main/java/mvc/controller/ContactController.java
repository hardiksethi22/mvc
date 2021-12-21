package mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import mvc.model.User;
import mvc.service.userService;

@Controller
public class ContactController {
	
	@Autowired
	private userService userservice;
	
	@ModelAttribute
	public void common(Model model) {
		model.addAttribute("head", "This is contact page");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model model) {
		System.out.println("contact us page");
		
		return "contact";
	}
	@PostMapping("/processform")
	public String handleform(@ModelAttribute User user, Model model) {
		
		if(user.getUsername().isEmpty()) {
			System.out.println("name was empty");
			return "redirect:/contact";
		}
		System.out.println(user);
		int createUser = this.userservice.createUser(user);
		//model.addAttribute("user",user);
		model.addAttribute("msg", "user created with id"+createUser);
		return "success";
	}
	
	/*
	 * @PostMapping("/processform") //@RequestMapping(path= "/processform", method =
	 * RequestMethod.POST) public String handleForm(@RequestParam("email") String
	 * email,
	 * 
	 * @RequestParam("username") String username,
	 * 
	 * @RequestParam("password") String password, Model model) { //
	 * System.out.println((String)request.getParameter("email")); //old way of doing
	 * 
	 * User user = new User(); user.setEmail(email); user.setUsername(username);
	 * user.setPassword(password); System.out.println(user);
	 * model.addAttribute("user", user); return "success"; }
	 */
}
