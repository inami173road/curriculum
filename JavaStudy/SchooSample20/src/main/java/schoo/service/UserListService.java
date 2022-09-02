package schoo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import schoo.entity.UserList;
import schoo.repository.UserListRepository;

/**
 * user_list関連のServiceを提供するクラスです
 */
@Service
public class UserListService {

	@Autowired
	UserListRepository userListRepository;

	/**
	 * user_listテーブル内のレコードを全件検索して返却します
	 * @return	user_listテーブル内の全情報
	 */
	public List<UserList> findAll() {
		return userListRepository.findAll();
	}
	/**
	 * user_listテーブルへの登録処理です
	 * @param name
	 * @param age
	 * @return	user_listに登録する名前と年齢
	 */
	public void save(String name, Integer age) {
		UserList userList = new UserList();
		userList.setName(name);
		userList.setAge(age);
		userListRepository.save(userList);
	}
	/**
	 * user_listテーブルから指定されたIDのユーザ情報を削除します
	 * @param id
	 * @return	user_listに登録する名前と年齢
	 */
	public void delete(Integer id) {
		userListRepository.deleteById(id);
	}
}