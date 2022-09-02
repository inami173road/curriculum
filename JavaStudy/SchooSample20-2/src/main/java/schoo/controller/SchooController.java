package schoo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import schoo.entity.UserList;
import schoo.service.UserListService;

/**
 * Springで作成する簡単なDB出力のサンプルクラスです.
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
		// DB検索
		List<UserList> users = userListService.findAll();
		List<UserList> usersDesc = userListService.findAllDesc();
		UserList userOne = userListService.findByUserOne();
		// 検索結果を表示
		model.addAttribute("users", users);
		model.addAttribute("usersDesc", usersDesc);
		model.addAttribute("userOne", userOne);
		return "output";
	}
}