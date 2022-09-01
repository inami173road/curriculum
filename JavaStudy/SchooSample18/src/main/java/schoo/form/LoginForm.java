package schoo.form;

import javax.validation.constraints.NotNull;
/**
 * ログイン用Form
 */
public class LoginForm {
	@NotNull
	private String loginId;
	@NotNull
	private String loginPassword;
	/**
	 * @return loginId
	 */
	public String getLoginId() {
		System.out.println("ーーーーーーーーーーーーーーーーーーーーーー");
		System.out.println("getLoginIdをゲットしたお："+loginId);
		return loginId;
	}
	/**
	 * @param loginId セットする loginId
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
		System.out.println("getLoginIdをセットしたお："+this.loginId);
	}
	/**
	 * @return loginPassword
	 */
	public String getLoginPassword() {
		System.out.println("getLoginPasswordをゲットしたお："+loginPassword);
		return loginPassword;
	}
	/**
	 * @param loginPassword セットする loginPassword
	 */
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
		System.out.println("setLoginPasswordをセットしたお："+this.loginPassword);
	}
}