package schoo.form;

import lombok.Data;

/**
 * ユーザ用Form
 */
@Data
public class UserForm {
	private String loginId;
	private String loginPassword;
}