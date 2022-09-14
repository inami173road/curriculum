package project.form;

import javax.validation.constraints.NotBlank;

import lombok.Data;
/**
 * ユーザ情報のFormクラスです
 */
@Data
public class UserAccountForm {
	@NotBlank
	private String loginUsername;
	@NotBlank
	private String loginId;
	@NotBlank
	private String loginPassword;
}