package schoo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import schoo.entity.UserList;

/**
 * user_listテーブルを操作するためのRepositoryクラスです
 */
//　このクラスでDBと接続してSQLと接続している。s
public interface UserListRepository extends JpaRepository<UserList, Integer> {
}