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

import schoo.entity.UserEntity;
import schoo.form.LoginForm;
import schoo.form.UserForm;
import schoo.service.UserService;

/**
 * ログイン機能クラス.
 */
@Controller
public class SchooController {

	@Autowired
	HttpSession session;

	@Autowired
	UserService userService;

	@ModelAttribute
	public LoginForm setUpForm() {
		return new LoginForm();
	}

	@GetMapping("/")
	public String index(@Validated UserEntity userEntity,
			BindingResult bindingResult,
			Model model) {
		// ログイン状態のチェック
		String login = (String)session.getAttribute("login");
		System.out.println("indexメソッド  現在のセッション状態：" + login);
		if ("on".equals(login)) {
			model.addAttribute("loginUsername", userEntity);
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
	public String login(@Validated UserEntity userEntity,
			@Validated LoginForm loginForm,
			BindingResult bindingResult,
			Model model) {
		// 入力チェック
		if (bindingResult.hasErrors()) {
			return "index";
			// IDとパスワードのチェック
		}if ("schoo".equals(loginForm.getLoginId()) &&
				"pass".equals(loginForm.getLoginPassword())) {
			session.setAttribute("login", "on");
			model.addAttribute("loginUsername", "ミスター");
			return "login";	
		} else {
			model.addAttribute("message", "IDまたはパスが違います。ログインできません。");
			System.out.println("IDまたはパスが違います。ログインできません。");
			return "index";
		}
	}

	//新規登録ページで入力した値を表示する
	@PostMapping("user-input")
	public String create(@Validated UserEntity userEntity,
			@Validated LoginForm loginForm,
			BindingResult bindingResult,
			Model model) {
		String aaa=userEntity.getLoginUsername();
		// 入力チェック
		if (bindingResult.hasErrors()) {
			return "create_account";
		// 新規登録
		}if ((userEntity.getLoginId()).equals(loginForm.getLoginId()) &&
				(userEntity.getLoginPassword()).equals(loginForm.getLoginPassword())) {
			model.addAttribute("loginUsername", userEntity);
			System.out.println("userEntity.getLoginUsernameの中身："+"「"+aaa+"」");
			return "confirmation";
		}else {
			model.addAttribute("message", "IDまたはパスが違います。ログインできません。");
			System.out.println("IDまたはパスが違います。ログインできません。");
			return "redirect:/";
			}
		}

	@PostMapping("add")
	public String add(@Validated UserEntity userEntity,
			@Validated UserForm userForm,
			BindingResult bindingResult,
			Model model){
		if (bindingResult.hasErrors()) {
			return "create_account";
			// 新規登録
		}else {
			session.setAttribute("login", "on");
			userEntity = userService.createUser(userForm);
			model.addAttribute("loginUsername", userEntity);
			return "login";
		}
	}


		// 新規登録へ	
		@GetMapping("change")
		public String changeToaccount() {
			return "create_account";
		}

		//page01 → logout
		@GetMapping("page01")
		public String changeTologout(@Validated UserEntity userEntity,
				Model model) {
			String login = (String)session.getAttribute("login");
			model.addAttribute("userMan",userEntity.getLoginUsername());
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