package schoo.service;

import schoo.entity.UserEntity;
import schoo.form.UserForm;

public interface UserService {
	public UserEntity createUser(UserForm userForm);
}