package schoo.form;

import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * ユーザ用Form
 */
//Formクラスはあくまでも画面から受け取る情報の管理をしているだけ。
@Data
public class UserForm {
	@NotNull
	private String userName;
	@NotNull
	private Integer age;
}