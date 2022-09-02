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
}