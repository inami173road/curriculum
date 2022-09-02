package schoo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import schoo.entity.UserList;

/**
 * user_listテーブルを操作するためのRepositoryクラスです
 */
public interface UserListRepository extends JpaRepository<UserList, Integer> {
}