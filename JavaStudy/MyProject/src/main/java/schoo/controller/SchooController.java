package schoo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import schoo.form.LoginForm;

/**
 * ログイン機能クラス.
 */
@Controller
public class SchooController {

	@Autowired
	HttpSession session;

	@ModelAttribute
	public LoginForm setUpForm() {
		return new LoginForm();
	}

	@GetMapping("/")
	public String index(Model model) {
		// ログイン状態のチェック
		String login = (String)session.getAttribute("login");
		System.out.println("indexメソッド  現在のセッション状態：" + login);
		if ("on".equals(login)) {
			
			return "page01";
		} else {
			System.out.println("現在のセッション状態：" + login);
			return "index";
		}
	}
	/**
	 * ログイン処理
	 * @param loginForm	ログインForm
	 * @param bindingResult	入力チェック結果
	 * @return	処理結果ページのパス
	 */
	@PostMapping("login")
	public String login(@Validated LoginForm loginForm,
						BindingResult bindingResult,
						Model model) {
		// 入力チェック
		if (bindingResult.hasErrors()) {
			return "index";
		}
		// IDとパスワードのチェック
		if ("schoo".equals(loginForm.getLoginId()) &&
			"pass".equals(loginForm.getLoginPassword())) {
			session.setAttribute("login", "on");
			model.addAttribute("userMan", "ミスター");
			return "login";
		} else {
			model.addAttribute("message", "IDまたはパスが違います。ログインできません。");
			System.out.println("IDまたはパスが違います。ログインできません。");
			return "index";
		}
	}
	
	//page01 → logout
	@GetMapping("page01")
	public String changeTologout(Model model) {
		model.addAttribute("userMan", "ミスター");
		String login = (String)session.getAttribute("login");
		System.out.println("changeTologout  現在のセッション状態：" + login);
		return "logout";
	}
	
	//ログアウト処理
	@GetMapping("logout")
	public String logout(Model model) {
		session.invalidate();//セッション破棄
		String login = (String)session.getAttribute("login");
		System.out.println("logoutメソッド  現在のセッション状態：" + login);
		return "index";
	}
}