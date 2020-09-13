package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("thats Home url");
		model.addAttribute("name","Rafi");
		model.addAttribute("id",1234);
		return "home";
	}
}
