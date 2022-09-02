package schoo.service;

import schoo.entity.UserEntity;
import schoo.form.UserForm;
/**
 * ユーザ用処理Serviceクラス
 */
public interface UserService {
	public UserEntity createUser(UserForm userForm);
}
