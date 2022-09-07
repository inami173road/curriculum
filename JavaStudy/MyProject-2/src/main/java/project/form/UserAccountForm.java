package project.form;

import lombok.Data;
/**
 * ユーザ情報のFormクラスです
 */
@Data
public class UserAccountForm {
	private String loginUsername;
	private String loginId;
	private String loginPassword;
}