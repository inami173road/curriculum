package project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.entity.UserAccuontEntiy;
import project.repository.UserAccuontRepository;

/**
 * user_list関連のServiceを提供するクラスです
 */
@Service
public class UserAccuontService {

	@Autowired
	UserAccuontRepository userAccuontRepository;

	/**
	 * user_accountテーブル内のレコードを全件検索
	 * @return	user_accountテーブル内の全情報
	 */
	public List<UserAccuontEntiy> findAll() {
		return userAccuontRepository.findAll();
	}

	/**
	 * user_accountテーブルへの登録処理
	 * @param loginUsername
	 * @param loginId
	 * @param loginPassword
	 * @return	user_accountに登録する名前,ID,パスワード
	 */
	public void save(
			String loginUsername, 
			String loginId,
			String loginPassword) {
		UserAccuontEntiy userAccuontEntiy = new UserAccuontEntiy();
		userAccuontEntiy.setLoginUsername(loginUsername);
		userAccuontEntiy.setLoginId(loginId);
		userAccuontEntiy.setLoginPassword(loginPassword);
		System.out.println("----------------------------------------------------");
		System.out.println("ユーザー名："+loginUsername);
		System.out.println("ユーザID："+loginId);
		System.out.println("パスワード："+loginPassword);
		System.out.println("----------------------------------------------------");
		userAccuontRepository.save(userAccuontEntiy);
	}
	/**
	 * user_accountテーブルから指定されたIDのユーザ情報を削除
	 * @param id
	 * @return　user_accountに登録する名前と年齢
	 */
	public void delete(Integer id) {
		userAccuontRepository.deleteById(id);
	}
	
	public void serch(Integer id) {
		userAccuontRepository.findById(id);
	}
}