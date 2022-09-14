package demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Hello2Controller {
	@GetMapping("/")
	public String page(){
		return "hello";
	}
	@GetMapping("addname")
	public String sayHelllo(@RequestParam("name") String name,
			Model model){
		model.addAttribute("name", name);
		return "redirect:/";
	}
}
