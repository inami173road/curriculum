package schoo.service;

import org.springframework.stereotype.Service;

import schoo.entity.UserEntity;
import schoo.form.UserForm;

/**
 * ユーザ用処理Serviceクラス
 */
@Service
public interface UserService {
	public UserEntity createUser(UserForm userForm);
}