package schoo.form;

import lombok.Data;
/**
 * ユーザ情報のFormクラスです
 */
@Data
public class UserListForm {
	private String name;
	private Integer age;
}