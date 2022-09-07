package schoo.form;

import javax.validation.constraints.NotNull;

import lombok.Data;
/**
 * ログイン用Form
 */
@Data
public class LoginForm {
	@NotNull
	private String loginId;
	@NotNull
	private String loginPassword;
}