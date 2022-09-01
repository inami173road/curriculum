package schoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Springで作成する簡単な情報入力のサンプルクラスです.
 */
//@マーク「アノテーション」で示すことで役割をSpringに教えている。
@Controller
public class SchooController {
	/**
	 * トップページへのリクエスト
	 * @return input.htmlのパス
	 */
	@GetMapping("/")
	public String index() {
		System.out.println("ーーーーーーーーーーーーーーーーーーーーーー");
		System.out.println("indexメソッドが処理されました。");
		System.out.println("ーーーーーーーーーーーーーーーーーーーーーー");
		return "input";
	}
	/**
	 * 入力処理リクエスト
	 * @param 	入力メッセージ
	 * @return 結果画面のパス
	 */
	@PostMapping("input")
	public String input(@RequestParam String message,
						Model model) {
		System.out.println("ーーーーーーーーーーーーーーーーーーーーーー");
		System.out.println("メッセージが表示されました："+"「"+message+"」");
		System.out.println("ーーーーーーーーーーーーーーーーーーーーーー");
		// input画面で入力されたメッセージをModelにセット
		model.addAttribute("message", message);
		return "output";
	}
}