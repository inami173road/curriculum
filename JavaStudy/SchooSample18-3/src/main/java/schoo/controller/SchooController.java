package schoo.controller;

import org.springframework.stereotype.Controller;
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
	/**
	 * トップページへのリクエスト
	 * @return user.htmlのパス
	 */
	@GetMapping("/")
	public String index() {
		// user.htmlのパスを返却する
		return "user";
	}
	/**
	 * 入力チェック処理リクエスト
	 * @param 	ユーザ情報
	 * @param	ユーザ情報の入力チェック結果
	 * @return 結果画面のパス
	 */
	@PostMapping("input")
	public String login(@Validated @ModelAttribute("user") UserForm userForm,
						BindingResult bindingResult) {

		System.out.println(userForm.getName());
		System.out.println(userForm.getAge());
		System.out.println(userForm.getMailAddress());

		// 入力チェック結果を確認
		if(bindingResult.hasErrors()) {
			return "input-ng";
		} else {
			return "input-ok";
		}
	}
}