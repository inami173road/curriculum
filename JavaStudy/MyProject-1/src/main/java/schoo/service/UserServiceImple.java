package schoo.service;

import org.springframework.stereotype.Service;

import schoo.entity.UserEntity;
import schoo.form.UserForm;
/**
 * ユーザ用処理Serviceクラス
 */
@Service
public class UserServiceImple implements UserService {

	public UserEntity createUser(UserForm userForm) {
		// ユーザ情報
		// Entityクラスは本来DBなどに格納する用途（今回はDB使用無しなのでここまで）
		UserEntity userEntity = new UserEntity();
		// ユーザIDを更新（IDも本来はDBなどで管理する）
		userEntity.setLoginId(userForm.getLoginId());
		userEntity.setLoginPassword(userForm.getLoginPassword());
		userEntity.setLoginUsername(userForm.getLoginUsername());
		return userEntity;
	}
}