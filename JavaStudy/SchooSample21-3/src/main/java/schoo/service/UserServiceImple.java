package schoo.service;

import org.springframework.stereotype.Service;

import schoo.entity.UserEntity;
import schoo.form.UserForm;

/**
 * ユーザ用処理Serviceクラス
 */
@Service
public class UserServiceImple implements UserService {
	/**
	 * ユーザFormの内容をEntityに変換して返します.
	 * @param userForm ユーザForm情報
	 * @return ユーザEntityクラス
	 */
	public UserEntity createUser(UserForm userForm) {
		System.out.println("UserServiceImpl");
		// FormクラスからEntityクラスに情報を詰め替え
		UserEntity userEntity = new UserEntity();
		userEntity.setUserName(userForm.getUserName());
		userEntity.setAge(userForm.getAge());
		return userEntity;
	}
}