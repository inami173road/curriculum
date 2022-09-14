package project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import project.entity.UserAccuontEntiy;
import project.form.UserAccountForm;
import project.service.UserAccuontService;

//ログイン機能クラス.
@Controller
public class MyProjectController {
	@Autowired
	UserAccuontService userAccuontService;

	/**
	 * トップページへのリクエスト
	 * @return output.htmlのパス
	 */
	@GetMapping("/")
	public String index(Model model) {
		List<UserAccuontEntiy> users = userAccuontService.findAll();
		model.addAttribute("users", users);
		return "output";
	}
	/**
	 * ユーザ追加処理
	 * @param userListForm
	 * @return	output.htmlへのリダイレクト
	 */
	@PostMapping("add")
	public String addUser(@ModelAttribute UserAccountForm userAccountForm) {
		// フォームからログインID、パスワード、ユーザーネームを取得してDB登録処理
		userAccuontService.save(
				userAccountForm.getLoginUsername(),
				userAccountForm.getLoginId(),
				userAccountForm.getLoginPassword());
		return "redirect:/";
	}
	/**
	 * ユーザ削除処理
	 * @param id
	 * @return	output.htmlへのリダイレクト
	 */
	@GetMapping("delete")
	public String deleteUser(@RequestParam Integer id) {
		// 指定されたIDを引数に削除処理へ
		userAccuontService.delete(id);
		return "redirect:/";
	}
	
	@PostMapping("serch")
	public String serchUser(
			@RequestParam Integer id,
			Model model){
		List<UserAccuontEntiy> userid = userAccuontService.findAll();
		model.addAttribute("userid", userid.get(id));
		return "redirect:/";
	}
	
	
}