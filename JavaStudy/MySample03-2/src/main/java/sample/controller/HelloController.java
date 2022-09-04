package sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	// サーバに繋いだ瞬間に返すメソッド
	@GetMapping("/")
	public String getHello(){
		System.out.println("Helloを返す");
		return "hello";
	}
		
	// とある処置をしたら返すメソッド
	@PostMapping("hello")
	public String hello(@RequestParam String message,
								Model model) {
		model.addAttribute("message",message);
		//「templates」以降の相対パスで記述する
		return "aaa/response";
	}
}
