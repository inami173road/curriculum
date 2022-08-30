package schoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Springで作成する簡単なログインのサンプルクラスです.
 */
@Controller
public class SchooController {
	/**
	 * トップページへのリクエスト
	 * @return index.htmlのパス
	 */
	@GetMapping("/")
	public String index() {
		// index.htmlのパスを返却する
		// 以下の場合、templates内のindex.htmlを表示する指示
		return "index";
	}
	/**
	 * ログイン処理リクエスト
	 * @param loginId	ログイン
	 * @param loginPassword	パスワード
	 * @return ログイン結果画面のパス
	 */
	@PostMapping("login")
	public String login(@RequestParam("loginId") String loginId,
						@RequestParam("loginPassword") String loginPassword) {
		// ログインチェック
		// 今回はDB等を使用せずにリクエストパラメータと文字列の比較でチェックします
		if ("schoo".equals(loginId) && "pass".equals(loginPassword)) {
			// ログイン成功
			return "login-ok";
		} else {
			// ログイン失敗
			return "login-ng";
		}
	}
}