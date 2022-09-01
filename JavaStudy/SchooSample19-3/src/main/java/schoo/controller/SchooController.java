package schoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import schoo.form.UserForm;

/**
 * Springで作成する簡単な情報入力のサンプルクラスです.
 */
@Controller
public class SchooController {
	
	@ModelAttribute
	public UserForm setUpForm() {
		return new UserForm();
	}
	
	/**
	 * トップページへのリクエスト
	 * @return user.htmlのパス
	 */
	@GetMapping("/")
	public String index() {
		System.out.println("user.htmlのパスを返却しました");
		// user.htmlのパスを返却する
		return "user";
	}
	
	/**
	 * 入力処理リクエスト
	 * @param 	userForm ユーザ情報
	 * @param	bindingResult ユーザ情報の入力チェック結果
	 * @param 	model 画面に受け渡しをする情報
	 * @return 入力画面のパス
	 */
	@PostMapping("input")
	public String input(@Validated UserForm userForm,
						BindingResult bindingResult,
						Model model) {
		// 入力チェック結果のメッセージ
		String message;

		if(bindingResult.hasErrors()) {
			// 入力に誤りがある場合
			message = "入力内容に誤りがあります。";
			System.out.println(message);
			
		} else {
			// 入力が正しい場合
			message = "正しく入力できました。";
			System.out.println(message);
		}
		System.out.println("-------------------------------------------");

		// 入力チェック結果をModelにセット
		model.addAttribute("message", message);

		return "user";
	}
}