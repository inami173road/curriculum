package schoo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import schoo.entity.UserList;
import schoo.form.UserListForm;
import schoo.service.UserListService;

/**
 * Springで作成するユーザ情報クラスです.
 */
@Controller
public class SchooController {

	@Autowired
	UserListService userListService;

	/**
	 * トップページへのリクエスト
	 * @return output.htmlのパス
	 */
	@GetMapping("/")
	public String index(Model model) {
		List<UserList> users = userListService.findAll();
		model.addAttribute("users", users);
		return "output";
	}
	/**
	 * ユーザ追加処理
	 * @param userListForm
	 * @return	output.htmlへのリダイレクト
	 */
	@PostMapping("add")
	public String addUser(@ModelAttribute UserListForm userListForm) {
		// フォームの中から名前と年齢を取得してデータベース登録処理へ
		userListService.save(userListForm.getName(), userListForm.getAge());
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
		userListService.delete(id);
		return "redirect:/";
	}
}